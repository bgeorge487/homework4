/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework4;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

/**
 * Task 1. Sum of Numbers
    Write a program that asks the user for a positive nonzero integer value. The program should
    use a loop to get the sum of all the integers from 1 up to the number entered. For example, if
    the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50. You will use a for loop to
    solve this.
    * 
    Sample output, The user’s input is shown in bold:
    * 
    Enter a positive nonzero integer value to sum: 50 [Enter]
    The sum of 1 to 50 is 1275 
    * 
 * Task 2. Uppercase File Converter
    Write a program that asks the user for the names of two files. The first file should be opened
    for reading and the second file should be opened for writing. The program should read the
    contents of the first file, change all characters to uppercase, and store the results in the second
    file. The second file will be a copy of the first file, except that all the characters will be
    uppercase. Use Notepad or another text editor to create a simple file that can be used to test
    the program. 
    * 
 * Task 3. Weekday or Weekend
    Write a program using a switch statement to show whether day of the week is a weekday or
    weekend. The day of the week is read in from the user as string: Monday through Friday are
    assumed to be weekdays and Saturday and Sunday are weekend days. Assume the day of the
    week will be lowercase.
    * 
    Sample output, The user’s input is shown in bold:
    * 
    Enter a day of the week (e.g. Monday, Tuesday, etc): Wednesday [Enter]
    Wednesday is a weekday. 
    * 
     * @author brgeorge
 */
public class Homework4 {

    public static void main(String[] args) {
        
        //Task 1 - Sum of numbers
        
        System.out.println("Enter a number: \n");
        
        Scanner num = new Scanner(System.in);
        int numUser = num.nextInt();
        
        if(numUser > 0){
            int sum = 0;
            while(numUser >= 0){
                sum += numUser--;
            }
            System.out.println("The sum of all numbers is: " + sum);
        }
        
        //Task 2 - Uppercase File Converter
        File fileName = new File("");
        
        
        //Task 3 - Weekday or Weekend
        Scanner day = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String dayInput = day.nextLine().toLowerCase();
        
        switch(dayInput){
            case "monday":
                System.out.println("It's a weekday!");
                break;
            case "tuesday":
                System.out.println("It's a weekday!");
                break;
            case "wednesday":
                System.out.println("It is Wednesday my dude. (Also a weekday!)");
                break;
            case "thursday":
                System.out.println("It's a weekday!");
                break;
            case "friday":
                System.out.println("It's a weekday!");
                break;
            case "saturday":
                System.out.println("It's a weekend day!");
                break;
            case "sunday":
                System.out.println("It's a weekend day!");
                break;
            default:
                System.out.println("Please enter in a valid day");
                break;
                
        }
        
    }
    
   
}
