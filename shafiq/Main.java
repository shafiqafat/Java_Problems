package com.shafiq;

public class Main {

    public static void main(String[] args) {
        PiCalculator piCalculator = new PiCalculator();
        var pi = piCalculator.calculate(100_000);
        System.out.println("pi = " +pi);
    }
}
