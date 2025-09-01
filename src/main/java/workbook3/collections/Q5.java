package main.java.workbook3.collections;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        // 역정렬
        // Collections.sort(list,Collections.reverseOrder());

        for (int i : list) {
            System.out.print(i+" ");
        }
    }
}
