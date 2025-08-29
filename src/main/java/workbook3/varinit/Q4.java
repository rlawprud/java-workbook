package main.java.workbook3.varinit;

import java.util.Random;

class RandomInit {
    int[] arr = new int[5];
    {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(10);
        }
    }
    void printArray() {
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();
        obj.printArray();
    }
}
