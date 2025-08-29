package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {

    // 메서드 오버로딩
    // 오버로딩은 과다 적재라는 뜻으로, 같은 이름의 메서드를 다른 조건으로 사용 할 때 성립됩니다.
    // 자세한 메서드 오버로딩 성립 조건은 아래와 같습니다.
    // 1. 메서드의 이름이 같을 것
    // 2. 매개변수의 개수 또는 타입이 다를 것
    // ! 메서드의 매개변수 타입과 개수는 같으나, 리턴 타입이 다를 때는 성립하지 않습니다.

    // 매개변수의 타입이 다른 경우의 오버로딩
    public static void printValue(int x) {
        System.out.println(x);
    }
    public static void printValue(double x) {
        System.out.println(x);
    }
    public static void printValue(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();

        printValue(i);
        printValue(d);
        printValue(s);
    }
}
