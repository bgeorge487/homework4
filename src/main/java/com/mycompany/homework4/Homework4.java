/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework4;

import java.util.Scanner;
import java.io.*;

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

    public static void main(String[] args) throws IOException {
        
        //Task 1 - Sum of numbers
        
        System.out.println("Enter a number: \n");
        
        Scanner num = new Scanner(System.in);
        int numUser = num.nextInt();
        
        if(numUser > 0){
            int sum = 0;
            while(numUser > 0){
                sum += numUser--;
            }
            System.out.println("The sum of all numbers is: " + sum + "\n");
        }
        
        //Task 2 - Uppercase File Converter
     
        //Read from first file -> Change content to caps -> Write to second file
        
        //Step 1 Get two filenames from a user
        System.out.println("Please enter a file to read from: ");
        Scanner readingFile = new Scanner(System.in);
        String fileOne = readingFile.nextLine(); //readingFile.txt
        
        System.out.println("Please enter a file to write to: ");
        Scanner writingFile = new Scanner(System.in);
        String fileTwo = writingFile.nextLine(); //writingFile.txt
        
        //Step 2 Open the first file for reading
        File read = new File(fileOne);
        Scanner readFile = new Scanner(read);
        
        //Step 3 Change all characters to upper case
        while(readFile.hasNext()){
            String str = readFile.nextLine().toUpperCase();
            //Step 4 Write the upper case content to the second file
            PrintWriter pw = new PrintWriter(fileTwo);
            pw.println(str.toUpperCase());
            pw.close();
        }
        readFile.close();
        
        //Step 5 Print out a confirmation to the console for the user
        System.out.println("Completed successfully. \n");
        
        //Task 3 - Weekday or Weekend
        Scanner day = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String dayInput = day.nextLine().toLowerCase();
        
        switch(dayInput){
            case "monday":
                System.out.println(dayInput + " is a weekday!");
                break;
            case "tuesday":
                System.out.println(dayInput + " is a weekday!");
                break;
            case "wednesday":
                System.out.println(dayInput + " is a weekday!" + "(It is Wednesday my dude.)");
                break;
            case "thursday":
                System.out.println(dayInput + " is a weekday!");
                break;
            case "friday":
                System.out.println(dayInput + " is a weekday!");
                break;
            case "saturday":
                System.out.println(dayInput + " is a weekend day!");
                break;
            case "sunday":
                System.out.println(dayInput + " is a weekend day!");
                break;
            default:
                System.out.println("Please enter in a valid day");
                break;
                
        }
        
    }
    
   
}
