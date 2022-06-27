package com.employeewage;

import java.util.Random;

public class UC10_WageForMultipleCompaniesUsingOops {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;
    public UC10_WageForMultipleCompaniesUsingOops(){
        companyEmpWageArray=new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company,int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
        companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage(){
        for (int i=0;i<numOfCompany;i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage){
        int empHrs=0, totatlEmpHrs=0,totalWorkingDays=0;
        while (totatlEmpHrs<= companyEmpWage.maxHoursPerMonth && totalWorkingDays< companyEmpWage.numOfWorkingDays){
            totalWorkingDays++;
            Random r=new Random();
            int empCheck=r.nextInt(3);
            switch (empCheck){
                case IS_PART_TIME :
                    empHrs=4;
                    break;
                case IS_FULL_TIME:
                    empHrs=8;
                default:empHrs=0;
            }
            totatlEmpHrs= companyEmpWage.totalEmpWage+empHrs;
            System.out.println("Day: "+totalWorkingDays+"Employee Hours: "+empHrs);
        }
       return totatlEmpHrs+companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        UC10_WageForMultipleCompaniesUsingOops wageForMultipleCompaniesUsingOops=new UC10_WageForMultipleCompaniesUsingOops();
        wageForMultipleCompaniesUsingOops.addCompanyEmpWage("TCS",40,21,100);
        wageForMultipleCompaniesUsingOops.addCompanyEmpWage("Genpact",30,26,140);
        wageForMultipleCompaniesUsingOops.addCompanyEmpWage("Cognizant",60,21,180);
        wageForMultipleCompaniesUsingOops.computeEmpWage();
    }
}
