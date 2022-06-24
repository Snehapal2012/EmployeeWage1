package com.employeewage;

import java.util.Random;

public class UC8_WageForMultipleCompanies {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static void computeEmpWage(String company,int empPayPerHour,int noOfWorkingDay,int totalWorkingHours){
        int emptotalpay;
        int emphour;
        int totalEmployeeWage = 0;
        int totalWorkingDays = 0;
        int totalEmployeeHours = 0;
        Random r = new Random();
        while (totalEmployeeHours <= totalWorkingHours && totalWorkingDays <= noOfWorkingDay) {
            for (int day = 1; day <= noOfWorkingDay; day++) {
                int ec = r.nextInt(3);
                switch (ec) {
                    case IS_FULL_TIME:
                        emphour = 8;
                        break;
                    case IS_PART_TIME:
                        emphour = 4;
                        break;
                    default:
                        emphour = 0;
                }

                emptotalpay = emphour * empPayPerHour;
                totalEmployeeWage = totalEmployeeWage + emptotalpay;
                totalEmployeeHours = totalEmployeeHours + emphour;
            }
        }
            System.out.println("Employee total income: " + totalEmployeeWage);
            System.out.println("Employee total working hours: " + totalEmployeeHours);
    }
    public static void main(String[] args) {
        System.out.println("Calculating Employee wage for TCS company:----------------------  ");
        computeEmpWage ("TCS",50,22,100);
        System.out.println("Calculating Employee wage for Genpact company:------------------  ");
        computeEmpWage("Genpact",30,26,120);
        System.out.println("Calculating Employee wage for Infosys company:------------------  ");
        computeEmpWage("Infosys",70,21,200);
        System.out.println("Calculating Employee wage for Cognizant company:------------------  ");
        computeEmpWage("Cognizant",80,24,180);
        System.out.println("Calculating Employee wage for Capgemini company:------------------  ");
        computeEmpWage("Capgemini",90,20,150);
    }
}
