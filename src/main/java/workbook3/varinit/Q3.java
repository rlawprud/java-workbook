package main.java.workbook3.varinit;

public class Q3 {
    static int s;
    int i;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    Q3() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("static variable");
        Q3 obj = new Q3();
        System.out.println("instance variable");
        // 순서를 관찰합니다.
    }
}
