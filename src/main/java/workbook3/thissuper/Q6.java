package main.java.workbook3.thissuper;

import java.util.Scanner;

abstract class Building {
    int floors;

    Building(int floors) {
        this.floors = floors;
    }

    abstract void showInfo();
}

class House extends Building {
    House(int floors) {
        super(floors);
    }

    void showInfo() {
        System.out.println(floors+" 주거");
    }
}

class Office extends Building {
    Office(int floors) {
        super(floors);
    }

    void showInfo() {
        System.out.println(floors+" 업무");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        int f1 = sc.nextInt();
        String type2 = sc.next();
        int f2 = sc.nextInt();

        Building b1 = type1.equals("house") ? new House(f1) : new Office(f1);
        Building b2 = type2.equals("house") ? new House(f2) : new Office(f2);
        b1.showInfo();
        b2.showInfo();

    }
}