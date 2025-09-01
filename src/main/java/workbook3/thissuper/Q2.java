package main.java.workbook3.thissuper;

import java.util.Scanner;

class Box {
    int width, height, depth;
    Box() {

        // 이 클래스의 생성자를 불러옵니다.
        // 아무런 값이 입력되지 않았을 경우, 모든 값이 1로 초기화 됩니다.
        this(1,1,1);
    }
    Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        Box b1 = new Box();
        Box b2 = new Box(w, h, d);
        System.out.println(b1.width + " " + b1.height + " " + b1.depth);
        System.out.println(b2.width + " " + b2.height + " " + b2.depth);
    }
}