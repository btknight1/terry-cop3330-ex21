/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print( "Please enter the number of the month: " );
        month = input.nextInt();
        String monthString = "";

        switch (month)
        {
            case 1:
                monthString = "The name of the month is January.";
                break;
            case 2:
                monthString = "The name of the month is February.";
                break;
            case 3:
                monthString = "The name of the month is March.";
                break;
            case 4:
                monthString = "The name of the month is April.";
                break;
            case 5:
                monthString = "The name of the month is May.";
                break;
            case 6:
                monthString = "The name of the month is June.";
                break;
            case 7:
                monthString = "The name of the month is July.";
                break;
            case 8:
                monthString = "The name of the month is August.";
                break;
            case 9:
                monthString = "The name of the month is September.";
                break;
            case 10:
                monthString = "The name of the month is October.";
                break;
            case 11:
                monthString = "The name of the month is November.";
                break;
            case 12:
                monthString = "The name of the month is December.";
                break;
            default: //For any value outside that range, display an appropriate error message.
                monthString = "Not a month!";
                break;
        }
        // Use a single output statement for this program.
        System.out.printf("%s", monthString);
    }
}