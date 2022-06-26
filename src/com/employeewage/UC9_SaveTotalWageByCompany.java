package com.employeewage;

public class UC9_SaveTotalWageByCompany {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    public UC9_SaveTotalWageByCompany(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
    {
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
    }
    public void computeEmpWage(){
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        while (totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays){
            totalWorkingDays++;
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case IS_PART_TIME :
                    empHrs=4;
                    break;
                case IS_FULL_TIME:
                    empHrs=8;
                default:empHrs=0;
            }
            totalEmpHrs=totalEmpWage+empHrs;
            System.out.println("Day: "+totalWorkingDays+"Employee Hours: "+empHrs);
        }
        totalEmpWage=totalEmpHrs+empRatePerHour;
    }
    @Override
    public String toString(){
        return "Total employee wage for Company: "+company+" is: "+totalEmpWage;
    }
    public static void main(String args[]){
        UC9_SaveTotalWageByCompany TCS=new UC9_SaveTotalWageByCompany("TCS",20,2,20);
        UC9_SaveTotalWageByCompany Infosys=new UC9_SaveTotalWageByCompany("Infosys",50,20,120);
        TCS.computeEmpWage();
        System.out.println(TCS);
        Infosys.computeEmpWage();
        System.out.println(Infosys);
    }
}
