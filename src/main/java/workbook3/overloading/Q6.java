package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q6 {

    // multiply 메서드를 오버로딩 하여 정수 배열을 받습니다.
    // 모든 요소의 곱을 구하는 버전, 두 개의 행렬 곱셈을 수행하는 버전을 구현합니다.
    public static int multiply(int[] arr) {
        int mul = 1;
        for (int i:arr) {
            mul *= i;
        }
        return mul;
    }
    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                result[i][j] =  arr1[i][j] * arr2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        if (type == 2) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(multiply(arr));
        } else {
            int[][] m1 = new int[2][2];
            int[][] m2 = new int[2][2];
            int[][] result = new int[m1.length][m1[0].length];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = sc.nextInt();
                }
                result = multiply(m1, m2);
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                   System.out.print(result[i][j] + (j==1?"":" "));
                }
                System.out.println();
            }
        }
    }
}