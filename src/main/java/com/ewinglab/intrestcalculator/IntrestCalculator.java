/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewinglab.intrestcalculator;

/**
 *
 * @author Ron
 */
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
