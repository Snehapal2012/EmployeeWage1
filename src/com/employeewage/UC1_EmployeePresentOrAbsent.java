package com.employeewage;

import java.util.Random;

public class UC1_EmployeePresentOrAbsent {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        Random r=new Random();
        int ec = r.nextInt(2);
        if (ec == IS_FULL_TIME) {
            System.out.println("Employee is Present!");
        } else {
            System.out.println("Employee is Absent!");
        }

    }

}
