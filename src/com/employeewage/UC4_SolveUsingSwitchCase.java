package com.employeewage;

import java.util.Random;

public class UC4_SolveUsingSwitchCase {
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int emppay=20;
    public static void main(String[] args) {
        int emptotalpay;
        int emphour;
        Random r=new Random();
        int ec = r.nextInt(3);
        switch (ec){
            case IS_FULL_TIME:
                System.out.println("Employee is present for full time");
                emphour=8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is present for part time");
                emphour=4;
                break;
            default:
                emphour=0;
                System.out.println("Employee is absent");
        }

        emptotalpay=emphour*emppay;
        System.out.println("The Total earning of a employee: "+emptotalpay);
    }
}
