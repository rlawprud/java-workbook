package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q2 {

    // 매개변수의 개수가 다른 경우의 오버로딩
    public static int max(int x, int y) {
        return Math.max(x, y);
    }
    public static int max(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(max(a,b));
        System.out.println(max(a,b,c));
    }
}