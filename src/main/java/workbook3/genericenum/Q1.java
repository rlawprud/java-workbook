package main.java.workbook3.genericenum;

import java.util.Scanner;

class GenericBox<T> {
    T value;

    GenericBox(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        String s = sc.next();

        // 제네릭을 사용하여 원하는 타입으로 설정할 수 있습니다.
        // GenericBox 에서는 타입을 설정하기 위한 매개변수 T를 사용하고 있으며,
        // 이 T를 설정할 수 있습니다.
        GenericBox<Integer> box1 = new GenericBox<>(i);
        GenericBox<String> box2 = new GenericBox<>(s);

        System.out.println(box1.get());
        System.out.println(box2.get());
    }
}