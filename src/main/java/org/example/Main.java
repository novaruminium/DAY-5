package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select the number for the question: ");
        System.out.println("1. Word Guessing Game.");
        System.out.println("2. Currency Converter.");
        System.out.println("3. Remove Odds.");
        System.out.println("4. Fizz Buzz.");
        System.out.println("5. Indices of the Two Numbers.");
        System.out.print("Enter choice: ");
        int a = scan.nextInt();

        switch (a)
        {
            case 1:
//              Complete the implementation of the Word Guessing Game

                break;

            case 2:
//              Write a program to handle currency conversion.

                break;

            case 3:
//              Write a function to remove all odd numbers in an array.
                OddEven.getOddEven();

                break;

            case 4:
//              Create a function that can loop the number of times according to the input we provide.
                FizzBuzz.fizzBuzz();

                break;

            case 5:
//              Return indices of the two numbers such that they add up to target.


                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}