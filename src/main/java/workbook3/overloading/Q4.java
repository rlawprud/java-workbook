package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {

    public static double area (double r) {
        return r*r*Math.PI;
    }

    public static double area (double w, double h){
        return w*h;
    }

    // 같은 매개 변수의 타입과 개수를 가진 메서드기 이미 존재하기 때문에,
    // 메소드 오버로딩이 불가합니다.
    // 따라서, 메소드의 이름을 바꿉니다.
    public static double triangleArea (double b, double h) {
        return b*h/2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type = sc.next();

        if (type.equals("circle")) {
            double r = sc.nextDouble();
            System.out.println(area(r));
        } else if (type.equals("rect")) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(area(w,h));
        } else {
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(triangleArea(b,h));
        }
    }
}