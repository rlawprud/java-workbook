package main.java.workbook3.constructor;

import java.util.Scanner;

class Student {
    String name;
    Student() {
        // 기본 생성자
        // 생성자의 매개변수로 아무것도 들어오지 않았을 경우 실행됩니다.
        this.name = "Unknown";
    }
    Student(String name) {
        // 생성자
        // 생성자를 실행하며 받은 매개변수를 이 객체의 name 으로 초기화합니다.
        this.name = name;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Student s1 = new Student();
        Student s2 = new Student(name);

        // name 은 기본 접근제어자를 가집니다.
        // 따라서, 접근할 수 있습니다.
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
