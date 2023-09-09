package com.shafiq;
import java.util.Scanner;
public class FactorialJava {
    public int factorial(int x){
        int f = 1, i;
        for(i = 1; i <= x; i++)
            f *= i;
        return f;
    }
    public static void main(String[] args) {
        int n, fact;
        Scanner abc = new Scanner(System.in);
        FactorialJava xyz = new FactorialJava();
        System.out.print("Enter a number: ");
        n = abc.nextInt();
        fact = xyz.factorial(n);
        System.out.print("\n" +fact);
    }

}
