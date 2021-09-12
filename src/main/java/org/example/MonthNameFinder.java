/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class MonthNameFinder
{
    static Scanner scanner = new Scanner(System.in);

    public int getNumberOfMonthInput()
    {
        System.out.print("Please enter the number of the month: ");
        return scanner.nextInt();
    }

    public void displayMonthNameMessage(int numberOfMonth)
    {
        String nameOfTheMonth = determineMonth(numberOfMonth);
        System.out.print(MessageFormat.format("The name of the month is {0}.", nameOfTheMonth));
    }

    private String determineMonth(int monthNum)
    {
        String month = "";
        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                String errorMessage = MessageFormat.format("There is no corresponding month for the given input of {0}", monthNum);
                System.out.println(errorMessage);
                System.exit(0);
        }
        return month;
    }
}
