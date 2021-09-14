package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is the order amount? " );
        int amt = sc.nextInt();
        sc.nextLine(); //consume \n char

        System.out.print( "What state do you live in? " );
        String state = sc.nextLine();

        float tax = 0f;

        if (state.equals("Wisconsin")){
            tax = 0.05f;
            System.out.print( "What county do you live in? " );
            String county = sc.nextLine();

            if(county.equals("Eau Claire")){
                tax += 0.005f;
            }

            else if (county.equals("Dunn")){
                tax += 0.004f;
            }
        }

        else if (state.equals("Illinois")){
            tax = 0.08f;
        }

        String out = String.format("The tax is $%.2f.%nThe total is $%.2f", tax*amt, amt+(tax*amt));
        System.out.println(out);
    }
}
