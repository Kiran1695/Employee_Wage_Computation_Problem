package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_PER_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problem");
        int employeeCheck = (int) (Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_PER_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage => " + dailyWage);
    }
}
