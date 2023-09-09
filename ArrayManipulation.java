package com.shafiq;

import java.util.Scanner;

public class ArrayManipulation
{
    int max_size = 4;
    int a[] = new int[max_size];
    int max = 0, min = 99999;

    void userInput()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < max_size; i++)
            a[i] = sc.nextInt();
    }

    /*
    void maxminFinder()
    {
        for(int i = 0; i < max_size; i++)
        {
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }
    }


     */
    void sortInput()
    {
        for(int i = 0; i < max_size - 1; i++)
            for(int j = i + 1; j < max_size; j++)
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
    }

    public static void main(String[] args)
    {
        ArrayManipulation abc = new ArrayManipulation();
        abc.userInput();
        //abc.maxminFinder();
        //System.out.print("\n Maximum : " + abc.max);
        //System.out.print("\n Minimum : " + abc.min);
        abc.sortInput();
        System.out.print("\n Maximum : " + abc.a[abc.max_size - 1]);
        System.out.print("\n Minimum : " + abc.a[0]);
    }
}