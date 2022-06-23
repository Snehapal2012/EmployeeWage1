package com.employeewage;

import java.util.Random;

public class UC5_WageForMonth {
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int emppay=20;
    public static final int NO_WORKING_DAYS=20;
    public static void main(String[] args) {
        int emptotalpay;
        int emphour;
        int totalEmployeeWage=0;

        for(int day=1;day<=NO_WORKING_DAYS;day++){
            Random r=new Random();
            int ec = r.nextInt(3);
            switch (ec) {
                case IS_FULL_TIME:
                    System.out.println("Employee is present");
                    emphour = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is present");
                    emphour = 4;
                    break;
                default:
                    emphour = 0;
                    System.out.println("Employee is absent");
            }

            emptotalpay=emphour*emppay;
            totalEmployeeWage=totalEmployeeWage+emptotalpay;
            System.out.println("The Total earning of a employee: "+emptotalpay);
        }
        System.out.println("Employee total income: "+totalEmployeeWage);
    }
}
