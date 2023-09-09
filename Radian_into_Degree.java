package com.shafiq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double radian,degree,pi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Radians: ");
        radian = input.nextDouble();
        degree = (radian*(180/pi));
        System.out.print("Degrees: "+degree);
    }
}
