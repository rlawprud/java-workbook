package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

// 추상 클래스 : 인스턴스화 할 수 없습니다.
abstract class Employee {
    // 추상 메서드 getPay()
    abstract double getPay(); // 급여 반환
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    double getPay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate, hours;
    PartTimeEmployee(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    double getPay() {
        return hourlyRate * hours;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 직원
        String type1 = sc.next();
        Employee e1;
        if (type1.equals("full")) {
            double salary = sc.nextDouble();
            e1 = new FullTimeEmployee(salary);
        } else { // type1 == "part"
            double rate = sc.nextDouble();
            double h = sc.nextDouble();
            e1 = new PartTimeEmployee(rate, h);
        }

        // 두 번째 직원
        String type2 = sc.next();
        Employee e2;
        if (type2.equals("full")) {
            double salary = sc.nextDouble();
            e2 = new FullTimeEmployee(salary);
        } else {
            double rate = sc.nextDouble();
            double h = sc.nextDouble();
            e2 = new PartTimeEmployee(rate, h);
        }

        System.out.println(e1.getPay());
        System.out.println(e2.getPay());
    }
}
