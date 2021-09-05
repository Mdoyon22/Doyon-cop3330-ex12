/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        int principal, years;
        float interest;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = inp.nextInt();
        System.out.print("Enter the rate of interest: ");
        interest = inp.nextFloat();
        System.out.print("Enter the number of years: ");
        years = inp.nextInt();

        float conversion = (((principal * interest) / 100) * years) + principal;
        System.out.print("After " + years + " years at " + interest + "%, the investment will be worth $" + conversion + ".");


    }
}
