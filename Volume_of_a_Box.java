package com.shafiq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int length,width,height,volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();
        System.out.print("Enter height: ");
        height = input.nextInt();
        volume = (length*width*height);
        System.out.print("Volume: "+volume);
    }
}
