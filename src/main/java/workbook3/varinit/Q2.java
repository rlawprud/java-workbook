package main.java.workbook3.varinit;

public class Q2 {
    static int count;

    // static 초기화 블록
    // static 으로 선언된 필드를 초기화하는 블록입니다.
    // 클래스가 로딩될 때 한 번 실행됩니다.
    static {
        count = 5;
    }
    public static void main(String[] args) {
        System.out.println(count);
    }
}
