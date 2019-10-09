package com.company;


import java.util.Random;

public class Surgeon extends Doctor {
    private String hospital;

    public Surgeon(String school, double fee){
        super(school, fee*2);
        hospital = "Random Clinic";
    }

    @Override
    public void treatPatient(Person patient){
        System.out.println("As a Graduate of " + AlmaMater +
                " I'll be slicing you open in the healthiest way");
        super.treatPatient(patient);
        patient.getOperatedOn();
        var generator = new Random();
        patient.recover(generator.nextInt(9)+1);
    }
}