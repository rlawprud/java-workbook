package main.java.workbook3.varinit;

class InitDemo {
    int a = 10;
    int b;
    {
        b = 20;
    }
    InitDemo() {
        System.out.println(a+b);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new InitDemo();
    }
}
