package com.shafiq;

public class PiCalculator {
    public static void main(String[] args) {
        PiCalculator piCalculator = new PiCalculator();
        var pi = piCalculator.calculate(100_000);
        System.out.println("pi = " + pi);
    }
}
