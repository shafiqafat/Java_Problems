package com.shafiq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lenght of array for Students ID: ");
        int aid = input.nextInt();
        int[] id = new int[aid];
        for(int i = 0; i < id.length; i++)
        {
            System.out.print(i + ": ");
            id[i] = input.nextInt();
        }
        System.out.println("Student's ID: ");
        for(int i = 0; i < id.length; i++)
        {
            System.out.println(i + ":\t  " +id[i]);
        }

        System.out.println("Lenght of array for Students Name: ");
        int asn = input.nextInt();
        String[] studensname  = new String[asn];
        for(int i = 0; i < studensname.length; i++)
        {
            System.out.print(i + ": ");
            studensname[i] = input.next();
        }
        System.out.println("Student's ID: ");
        for(int i = 0; i < studensname.length; i++)
        {
            System.out.println(i + ":\t   " +studensname[i]);
        }

        System.out.println("Student's Batch: ");
        int abatch = input.nextInt();
        int[] batch = new int[abatch];
        for(int i = 0; i < batch.length; i++)
        {
            System.out.print(i + ": ");
            batch[i] = input.nextInt();
        }
        System.out.println("Student's Batch No: ");
        for(int i = 0; i < batch.length; i++)
        {
            System.out.println(i + ":\t  " +batch[i]);
        }
        System.out.println("Running Semester: ");
        int asemester = input.nextInt();
        int[] semester = new int[asemester];
        for(int i = 0; i < semester.length; i++)
        {
            System.out.print(i + ": ");
            batch[i] = input.nextInt();
        }
        System.out.println("Student's Batch No: ");
        for(int i = 0; i < semester.length; i++)
        {
            System.out.println(i + ":\t  " +batch[i]);
        }
    }
}
