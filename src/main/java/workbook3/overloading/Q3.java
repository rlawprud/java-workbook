package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q3 {

    // 문자열을 붙여 return 하는 두 개의 오버로딩 된 메서드 concat 입니다.
    // 매개변수의 개수에 차이를 둬 오버로딩이 가능합니다.
    public static String concat(String s1, String s2){
        return s1 + s2;
    }
    public static String concat(String s1, String s2, String s3){
        return s1+s2+s3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        System.out.println(concat(s1,s2));
        System.out.println(concat(s1,s2,s3));
    }
}
