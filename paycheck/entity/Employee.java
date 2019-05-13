package com.paycheck.entity;

import static com.paycheck.entity.Paycheck.COUNT_ON_MONTH;

public class Employee {
    private String name;
    private String dateOfBirth;
    private String address;
    private int yearsOfExperience;

    private Paycheck paycheck;

    public Employee(String name, String dateOfBirth, String address, int yearsOfExperience) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Employee(String name, String dateOfBirth, String address, int yearsOfExperience, Paycheck paycheck) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.yearsOfExperience = yearsOfExperience;
        this.paycheck = paycheck;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Paycheck getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(Paycheck paycheck) {
        this.paycheck = paycheck;
    }


    
    @Override
    public String toString() {
        return name + "\t\t" + "Sallary:$"+getPaycheck().grossPay()*COUNT_ON_MONTH
                + '\n' + address + "\t\t\t"+ String.format("FederalTax: $%.2f", getPaycheck().federalTax())
                + '\n' + "\t\t\t\t\t" + String.format("Social Security: $%.2f", getPaycheck().socialSecurity())
                +'\n' + "\t\t\t\t\t" + String.format("Medicare: $%.2f", getPaycheck().medicare())
                + '\n' + "\t\t\t\t\t" + String.format("Net Pay: $%.2f", getPaycheck().netPay());
    }
}
