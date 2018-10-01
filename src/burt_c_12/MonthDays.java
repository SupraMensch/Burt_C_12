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

//Class accessible to main
public class MonthDays 
{
    //variable declarations to be used within class
    private int month;
    private int year;
    
    //Class constructor arguments
    public MonthDays( int monthInput, int yearInput)
    {
        month = monthInput;
        year = yearInput; 
    }
    
    //  Leap year and number of days logic; February only month affected by leap year
    public int getNumberOfDays()
    {
        int numberOfDays = 0;
        switch( month)
        {
            case 1:
                    numberOfDays = 31;
                    break;
            case 2:
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
                {
                    numberOfDays = 29;
                }
                    else 
                {
                    numberOfDays = 28;
                }
                break;
            case 3:
                numberOfDays = 31;
                break;
            case 4:
                numberOfDays = 30;
                break;
            case 5:
                numberOfDays = 31;
                break;
            case 6:
                numberOfDays = 30;
                break;
            case 7:
                numberOfDays = 31;
                break;
            case 8:
                numberOfDays = 31;
                break;
            case 9:
                numberOfDays = 30;
                break;
            case 10:
                numberOfDays = 31;
                break;
            case 11:
                numberOfDays = 30;
                break;
            case 12:
                numberOfDays = 31;
                break;
        }
        return numberOfDays;
    }
    

    
}
