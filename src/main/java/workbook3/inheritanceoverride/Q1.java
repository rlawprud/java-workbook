package main.java.workbook3.inheritanceoverride;

class Animal {
    String name;
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    // super 를 사용하여 부모 요소의 정의된 필드에 접근할 수 있습니다.
    public Dog() {
        super.name = "Dog"; // super 키워드 맛보기
    }
    void bark() {
        System.out.println("Barking...");
    }

}

public class Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog.name = " + dog.name);
        dog.eat();
        dog.bark();
    }
}
