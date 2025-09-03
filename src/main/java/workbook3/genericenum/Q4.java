package main.java.workbook3.genericenum;

import java.util.Scanner;

enum Level { LOW, MEDIUM, HIGH }

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        // 입력받은 값을 기준으로 enum 에서 동일한 값이 있는지 찾습니다.
        // 동일한 값이 존재한다면, 해당 값을 할당합니다.
        // 존재하지 않는 값을 입력했을 시,
        // IllegalArgumentException : No enum constant
        // 예외가 발생합니다.
        Level level = Level.valueOf(input);

        System.out.println(level);
    }
}