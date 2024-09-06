package org.example;

import java.util.Scanner;

public class FizzBuzz
{
    public static void fizzBuzz()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number");
        int n = scan.nextInt();

        //running the method to answer.
        count(n);
    }

    //the method to change the multiples of 3 and 5 to Fizz and Buzz.
    private static void count (int n)
    {
        //creating a loop for printing the numbers.
        for (int i = 1 ; i <= n ; i++)
        {
            // to check if the i is devisible by 3.
            if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            //to check if the i is divisible by 5.
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
