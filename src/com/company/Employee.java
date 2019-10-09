package com.company;

public abstract class Employee{

    public abstract double calculateBiWeeklyPay();

    public void withholdTaxes(){
        System.out.println("We are witholding " +
                calculateBiWeeklyPay()*.1+ "From your paycheck");
    }

    public void fileW2Forms(){
        System.out.println("That is one copy for you, and one for the IRS");
    }
}