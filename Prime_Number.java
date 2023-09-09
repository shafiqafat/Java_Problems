package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
     int n,i;
     Scanner abc = new Scanner(System.in);
     System.out.print("Enter a number to check if it's prime: ");
     n = abc.nextInt();
     for (i = 2; i <= n/2; i++)
     {
         if (n % i == 0)
         {
             System.out.print(n+" Is not a prime number");
         }
     }
        if (i == ((n / 2) + 1))
        {
            System.out.print(n+" Is prime number");
        }
    }
}
