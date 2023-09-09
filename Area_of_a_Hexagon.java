package com.shafiq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("a: ");
        a = input.nextInt();
        double Area = ((3*(Math.sqrt(3))/2)*a*a) ;
        System.out.print("Area of a Hexagon: "+Area);
    }
}
