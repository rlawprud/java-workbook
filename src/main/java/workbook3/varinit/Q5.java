package main.java.workbook3.varinit;

import java.util.Scanner;

class InitPerson {
    static int counter = 0;
    static {
        System.out.println("class loaded");
    }
    String name;
    int id;
    {
        id = ++counter;
    }
    InitPerson(String name) {
        this.name = name;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        InitPerson p1 = new InitPerson(n1);
        InitPerson p2 = new InitPerson(n2);
        InitPerson p3 = new InitPerson(n3);
        System.out.println(p1.name + " " + p1.id);
        System.out.println(p2.name + " " + p2.id);
        System.out.println(p3.name + " " + p3.id);
    }
}