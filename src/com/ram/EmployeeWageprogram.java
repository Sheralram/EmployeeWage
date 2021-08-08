package com.ram;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageprogram {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage program");
        int is_Fullpresent=1;
        int is_Parttime=2;
        int Wageperhour = 20;
        int Fulldayhour = 8;
        int Parttimehour = 4;
        Random random = new Random();
        int Empcheck = random.nextInt(3);
        System.out.println("A random int from 0 to 1: " +  Empcheck);
        if (Empcheck == is_Fullpresent) {
            System.out.println("Employee is Present");
            int DailyEmpWage=Wageperhour*Fulldayhour;
                    System.out.println("Employee Daily Wage is " +  DailyEmpWage);
        } else if(Empcheck == is_Parttime) {
            System.out.println("Employee is  Part time Present");
            int ParttimeEmpWage=Wageperhour*Parttimehour;
            System.out.println("Employee Parttime Wage is " + ParttimeEmpWage);
        }
        else{
            System.out.println("Employee is absent");
            System.out.println("Employee Daily Wage is Zero");
        }
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number between 0 and 2: ");
        int num = read.nextInt();
           switch (num){
       case 1: System.out.println("Employee is Present");
           int DailyEmpWage=Wageperhour*Fulldayhour;
           System.out.println("Employee Daily Wage is " +  DailyEmpWage);
           break;
       case 2: System.out.println("Employee is  Part time Present");
           int ParttimeEmpWage=Wageperhour*Parttimehour;
           System.out.println("Employee Parttime Wage is " + ParttimeEmpWage);
           break;
       default : System.out.println("Employee is absent");
           System.out.println("Employee Daily Wage is Zero");

   }
    }

}
