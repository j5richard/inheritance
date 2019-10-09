
package com.company;
public class CommissionEmployee extends Employee{
    private int numberOfSales;
    //final makes a variable constant - unchangable
    public static final double commission = 100;

    public CommissionEmployee(){
        numberOfSales = 0;
    }

    public void makeSale(){
        numberOfSales++;
    }

    @Override
    public double calculateBiWeeklyPay() {
        var pay = 1000 + numberOfSales*commission;
        numberOfSales = 0;//after paying commission reset
        return pay;
    }
}