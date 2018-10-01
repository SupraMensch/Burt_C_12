//  Christopher Burt
//  Project 12

//  Days in a month project

//  Write a class named MonthDays.  the class's constructor should accept two arguments:

// * An integer for the month (1 = January,2 = February, etc,).
// * An integer for the year

// The class should have a method named getNumberOfDays that returns the number of days in the specified month.
// The method should use the following criteria to identify leap years:

//1.  Determine whether the year is divisible by 100.  If it is, then it is a leap year if and only if it is divisible by 400.
//  For example, 2000 is a leap year but 2100 is not.

//2.  If the year is not divisible by 100, then it is a leap year if and only if it is divisible by 4.  For example, 2008 is a leap year
// but 2009 is not.

//  Demonstrate the class ina program that asks the user to enter the month (letting the user enter an integer in the range 
// of 1 through 12) and the year.  The program should then display the number of days in that month.

// Example:

//  Enter a month (1-12): 2 [enter]
// Enter a year: 2008 [Enter]
// output:  29 days

package burt_c_12;

import java.util.Scanner;

public class Burt_C_12
{

    
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        int monthEntry;
        int yearEntry;
        
        System.out.println("Enter a month (1-12): ");
        monthEntry = scanner.nextInt();
        
        System.out.println("Enter a year: ");
        yearEntry = scanner.nextInt();
        
        MonthDays monthTest = new MonthDays(monthEntry, yearEntry);
        
        System.out.println( monthTest.getNumberOfDays());
        
        
    }
    
}
