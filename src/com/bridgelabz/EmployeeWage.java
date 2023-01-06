package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problem");
        int employeeCheck = (int) (Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
