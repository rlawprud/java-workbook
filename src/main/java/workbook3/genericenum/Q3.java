package main.java.workbook3.genericenum;

import java.util.Scanner;

public class Q3 {
    // 상한 타입 파라미터
    // 제네릭 타입에 특정 상위 클래스나 인터페이스를 제한하여,
    // 해당 클래스 혹은 인터페이스를 상속 받거나 구현한 클래스여야 한다는 제한입니다.
    // 이 경우, T는 Number를 상속한 객체여야 합니다.
    static <T extends Number> double sumNumbers(T[] arr) {
        double sum = 0; // return 값은 double 입니다.
        for (T number : arr)
            sum += number.doubleValue(); // 무슨 값이 들어올지 모르니, 최종 값과 동일한 형태로 바꾸어 더해줍니다.
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] nums = new Number[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextDouble();
        }
        System.out.println(sumNumbers(nums));
    }
}
