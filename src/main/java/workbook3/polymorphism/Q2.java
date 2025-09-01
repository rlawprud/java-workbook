package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Language {
    abstract void displayInfo();
}

class JavaLanguage extends Language {
    void displayInfo() {
        System.out.println("This is Java language");
    }
}

class PythonLanguage extends Language {
    void displayInfo() {
        System.out.println("This is Python language");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Language[] arr = new Language[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            arr[i] = type.equals("java") ? new JavaLanguage() : new PythonLanguage();
        }
        for (Language lang : arr) {
            lang.displayInfo();
        }
    }
    // 동잏하게, 동적 바인딩 된 메서드가 출력되는 것을 알 수 있음.
}
