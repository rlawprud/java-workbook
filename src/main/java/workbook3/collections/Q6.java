package main.java.workbook3.collections;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        HashSet<Integer> sumOfSet = new HashSet<>();
        // 합집합
        for (int i = 0; i < n; i++) {
            sumOfSet.add(list1.get(i));
            sumOfSet.add(list2.get(i));
        }

        // list1의 요소 중 list2가 가지고 있지 않은 요소를 제거함.
        list1.retainAll(list2);

        for (int i : sumOfSet) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : list1) {
            System.out.print(i+" ");
        }
    }
}