/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        final double tax = .055;
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is the price of item 1: " );
        double price1 = sc.nextDouble();

        System.out.println( "What is the quantity of item 1: " );
        double quantity1 = sc.nextDouble();

        System.out.println( "What is the price of item 2: " );
        double price2 = sc.nextDouble();

        System.out.println( "What is the quantity of item 2: " );
        double quantity2 = sc.nextDouble();

        System.out.println( "What is the price of item 3: " );
        double price3 = sc.nextDouble();

        System.out.println( "What is the quantity of item 3: " );
        double quantity3 = sc.nextDouble();

        double subTotal = ((price1 *quantity1) + (price2 *quantity2) + (price3 *quantity3));
        double taxAdded = (subTotal * tax);
        double total = (subTotal + taxAdded);

        System.out.println( "Subtotal: $" + subTotal + "\nTax: $" + taxAdded + "\nTotal: $" + total);

    }
}
