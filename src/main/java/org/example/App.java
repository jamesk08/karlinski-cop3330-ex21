/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

public class App
{
    public static void main(String[] args)
    {
        MonthNameFinder monthNameFinder = new MonthNameFinder();
        int numberOfMonth = monthNameFinder.getNumberOfMonthInput();
        monthNameFinder.displayMonthNameMessage(numberOfMonth);
    }
}
