package com.company;

public class Doctor {
    protected String AlmaMater;
    private double fee;

    public Doctor(String university, double price){
        AlmaMater = university;
        fee = price;
    }

    @Override
    public boolean equals(Object other){
        if (this == other)
            return  true;
        if ( ! (other instanceof Doctor))
            return false;
        var isSame = this.fee == ((Doctor) other).fee &&
                this.AlmaMater.equals(((Doctor) other).AlmaMater);
        return isSame;
    }

    public void treatPatient(Person patient){
        System.out.println("Take two every twelve hours");
        patient.takeMedicine();
    }

    public double billPatient(Person patient){
        patient.payBill(fee);
        return fee;
    }

    public double billPatient(boolean medicarePatient,
                              GovernmentProgram govProgram){
        govProgram.processPaperwork(fee);
        return fee;
    }

}