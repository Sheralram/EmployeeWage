package com.ram;

import java.util.Random;

public class EmployeeWageprogram {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage program");
        int Wageperhour = 20;
        int Fulldayhour = 8;
        Random random = new Random();
        int Empcheck = random.nextInt(2);
        System.out.println("A random int from 0 to 1: " +  Empcheck);
        if (Empcheck == 1) {
            System.out.println("Employee is Present");
            int DailyEmpWage=Wageperhour*Fulldayhour;
                    System.out.println("Employee Daily Wage is " +  DailyEmpWage);
        } else {
            System.out.println("Employee is absent");
            System.out.println("Employee Daily Wage is Zero");
        }
    }
}
