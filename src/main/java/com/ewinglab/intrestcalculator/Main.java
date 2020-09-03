/*
 * @author Ron
 * This program will calculate the intrest of a loan
 * over the course of a year at X percent intrest
 */
package com.ewinglab.intrestcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        //Get users investment amount
        System.out.println("What is your Investment Amount?");
        double investment = s.nextDouble();
        
        //Get users intrest rate
        System.out.println("What is the Intrest Rate?");
        double intrestrate = s.nextDouble();
        
        //Get users intrest rate
        System.out.println("How many years do you want to calculate?");
        int years = s.nextInt();
        
        //Loading screen
        System.out.println("Calculating...  (please wait)");
        
        //Create new usable instance of the Intrest Calculator
        IntrestCalculator calculator = new IntrestCalculator();
        
        //Convert return of double to usable string that we can print using the PrintLN method.
        String TotalString = Double.toString(calculator.CalculateIntrest(investment, intrestrate, years));
        
        //Give to user
        System.out.println("Your Total is: "+TotalString);
        
        
    }
    
}
