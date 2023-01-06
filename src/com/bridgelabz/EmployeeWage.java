package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_PER_HOUR = 8;
    static final int PART_TIME_HOUR = 4;


    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problem");
        int employeeCheck = (int) (Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if (employeeCheck == 2) {
            System.out.println("Employee is Full Time");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_PER_HOUR;
        } else if (employeeCheck == 1) {
            System.out.println("Employee is Part Time");
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage => " + dailyWage);
    }
}
