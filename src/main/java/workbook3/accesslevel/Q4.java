package main.java.workbook3.accesslevel;

import java.util.Scanner;

class LibraryBook {

    private String title;
    private String author;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryBook[] books = new LibraryBook[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            String a = sc.next();
            books[i] = new LibraryBook(t, a);
        }
        for (LibraryBook b : books) {
            System.out.println(b.getTitle() + " " + b.getAuthor());
        }
    }
    // 생성자로 필드 초기화
    // 이후 getter를 사용해 값을 불러옴 (setter 부재, 읽기 전용.)
}
