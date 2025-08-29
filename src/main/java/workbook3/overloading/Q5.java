package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q5 {

    // format 메서드를 오버로딩하여 정수와 문자열을 받아 정수 : 값 또는
    // 문자열 : 형식으로 출력, 그리고 이름과 나이를 받아 이름(나이)형식 출력하는 메서드
    public static String format(int age) {
         return "정수 : "+age;
    }
    public static String format(String name) {
         return "문자열 : "+name;
    }
    public static String format(String name, int age) {
        return name+"("+age+")";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println(format(name));
        System.out.println(format(age));
        System.out.println(format(name, age));
    }
}