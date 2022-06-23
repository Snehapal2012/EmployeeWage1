package com.employeewage;

import java.util.Random;

public class UC2_DailyEmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1, emptotalpay;
        int emppay=20;
        Random r=new Random();
        int ec = r.nextInt(2);
        if (ec == IS_FULL_TIME) {
            System.out.println("Employee is present");
            int emphour=8;
            emptotalpay=emphour*emppay;
            System.out.println("The Total earning of a employee: "+emptotalpay);

        } else {System.out.println("Employee is absent");
            System.out.println("As Employee is absent , earning of the employee is 0 ");
        }

    }
}
