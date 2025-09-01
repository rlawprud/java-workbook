package main.java.workbook3.collections;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        for (String item : arr) {
            System.out.println(item);
        }
    }
}