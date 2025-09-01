package main.java.workbook3.exception;

import java.util.Scanner;

class NegativeAgeException extends Exception {
    // 상속한 클래스의 생성자를 사용해 메세지를 전달할 수 있도록 설정합니다.
    // 자바의 예외는 Throwable을 상속합니다.
    // 따라서, 기본적으로 메세지를 넣어 전달할 수 있습니다.
    NegativeAgeException(String msg) {
        super(msg);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 0) {
                throw new NegativeAgeException("Invalid age");
            }
        } catch (NegativeAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}