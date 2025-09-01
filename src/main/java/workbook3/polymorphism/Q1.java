package main.java.workbook3.polymorphism;

import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            animals[i] = t.equals("dog") ? new Dog() : new Cat();
        }
        for (Animal a : animals) {
            a.sound();
        }
    }
    // 부모 타입으로 객체를 저장할 때 :
    // 컴파일 시, 부모 클래스에서 선언된 필드나 메서드만 열람 가능합니다.
    // 런타임 중 동적 바인딩으로 오버라이딩, 오버로딘 된 경우 수정된 모습의 메서드가 호훌 됨.
    // 다만, 부모 클래스에 존재하지 않는 메서드 혹은 필드는 열람할 수 없음.
}
