package com.paycheck.entity;

public class Paycheck {
    static final int COUNT_ON_MONTH = 12;
    private double wage;

    public Paycheck(double wage) {
        this.wage = wage;
    }


    final double FED_TAX_10 = 0.10;
    final double FED_TAX_15 = 0.15;
    final double FED_TAX_25 = 0.25;
    final double FED_TAX_28 = 0.28;
    final double FED_TAX_33 = 0.33;
    final double FED_TAX_35 = 0.35;
    final double FED_TAX_39 = 0.396;


    final double BRACKET_10 = 192;
    final double BRACKET_15 = 969;
    final double BRACKET_25 = 3354;
    final double BRACKET_28 = 7850;
    final double BRACKET_33 = 16163;
    final double BRACKET_35 = 34917;
    final double BRACKET_39 = 35058;

    public double federalTax(){
        double gross = grossPay();

        if(gross>BRACKET_10 || gross <BRACKET_15){
            return calcFederalTax(FED_TAX_10);
        }else if(gross>BRACKET_15 || gross<BRACKET_25){
            return calcFederalTax(FED_TAX_15);
        }else if(gross>BRACKET_25 || gross<BRACKET_28){
            return calcFederalTax(FED_TAX_25);
        }else if(gross>BRACKET_28 || gross<BRACKET_33){
            return calcFederalTax(FED_TAX_28);
        }else if(gross>BRACKET_33 || gross<BRACKET_35){
            return calcFederalTax(FED_TAX_33);
        }else if(gross>BRACKET_35 || gross<BRACKET_39){
            return calcFederalTax(FED_TAX_35);
        }else if(gross>BRACKET_39){
            return calcFederalTax(FED_TAX_39);
        }
        return -1;
    }


    private double calcFederalTax(double tax){
        return grossPay()*tax;
    }


    public double grossPay(){
        return wage/COUNT_ON_MONTH;
    }


    public double socialSecurity(){
        return grossPay()*0.12;
    }


    public double medicare(){
        return grossPay()*0.0145;
    }

    
    public double netPay(){
        return grossPay()-(federalTax()+socialSecurity()+medicare());
    }
}
