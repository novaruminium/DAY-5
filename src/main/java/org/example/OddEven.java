package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEven
{
    public static void getOddEven()
    {
        int[] evenNumbers = oddEven();

        System.out.println("Here is your even numbers: ");

//        loop to print out the even numbers.
        for (int num : evenNumbers)
        {System.out.println(num + " ");}
    }

    private static int[] oddEven()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values do you want to input: ");
        int sum = scan.nextInt();

        int[] array = new int[sum];

//        creating a temporary storage for the even number.
        ArrayList<Integer> evenNumberList = new ArrayList<>();

        System.out.println("Input the number: ");

//        creating a loop that can read all the input.
        for (int i=0 ; i<sum ; i++)
        {
            array[i] = scan.nextInt();

            if(array[i] % 2 == 0)
            {
                evenNumberList.add(array[i]);
            }
        }
        int[] evenNumbersArray = new int[evenNumberList.size()];

        for (int i = 0 ; i < evenNumberList.size() ; i++)
        {
            evenNumbersArray[i] = evenNumberList.get(i);
        }
        return evenNumbersArray;
    }

}
