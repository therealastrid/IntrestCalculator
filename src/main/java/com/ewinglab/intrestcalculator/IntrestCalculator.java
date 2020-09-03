package com.ewinglab.intrestcalculator;

public class IntrestCalculator {
    
    public double Investment;
    public double IntrestRate;
    public double Intrest;
     
    public double CalculateIntrest(double investment, double intrestrate, int years)
    {
        Investment = investment;
        IntrestRate = intrestrate;
        
        int i = 1;
        while (i <= years){
            //Run some code
            Intrest = Investment*IntrestRate;
            Investment = Investment+Intrest;
            i++; //increment I to show that one time has passed
        }        
        return Investment;
    }
}
