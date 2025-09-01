package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }

    /** 기본 입금: 수수료·이자 없음 */
    void deposit(int amount) {
        balance += amount;
    }

    /** 기본 인출: 수수료·이자 없음 */
    void withdraw(int amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int balance) {
        super(balance);
    }

    /** 입금 시 5 % 이자 포함 */
    @Override
    void deposit(int amount) {
        balance += (int)(amount * 1.05);
    }
}

class CheckingAccount extends Account {
    CheckingAccount(int balance) {
        super(balance);
    }

    /** 인출 시 1 % 수수료 차감 */
    @Override
    void withdraw(int amount) {
        balance -= (int) (amount * 1.01);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ---------- 계좌 생성 ---------- */
        String kind = sc.next(); // "saving" or "checking"
        int initBal = sc.nextInt();

        // 삼항 연산자 : 입렵값이 saving 이면 -> 입금용 계죄
        // 아닐 시, 출금용 계좌를 생성함.
        // 생성자로 받는 initBal :
        // -> 이후 부모 클래스의 생성자에 할당됨.
        // 따라서, 기본 잔액을 입력값으로 설정함.
        Account acc = kind.equals("saving")
                ? new SavingsAccount(initBal)
                : new CheckingAccount(initBal);


        /* ---------- 명령 반복 ---------- */
        while (sc.hasNext()) {
            String cmd = sc.next(); // deposit / withdraw
            int amount = sc.nextInt();

            if (cmd.equals("deposit")) {
                acc.deposit(amount);
            } else { // withdraw
                acc.withdraw(amount);
            }
            System.out.println(acc.balance);
        }
    }
}
