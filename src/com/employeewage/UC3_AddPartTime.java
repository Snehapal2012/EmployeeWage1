package com.employeewage;

import java.util.Random;

public class UC3_AddPartTime {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1, emptotalpay;
        int emphour=0;
        int emppay=20;
        Random r=new Random();
        int ec = r.nextInt(2);
        if (ec == IS_FULL_TIME) {
            System.out.println("Employee is present");
            emphour=8;

        } else {System.out.println("Employee is absent");
            emphour=4;
        }
        emptotalpay=emphour*emppay;
        System.out.println("The Total earning of a employee: "+emptotalpay);
    }
}
