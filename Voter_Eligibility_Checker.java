package com.shafiq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you?");
        int age = input.nextInt();

        if(age < 18){
            System.out.println("Sorry you are not elegable to vote." + "Better luck next time");
        }
        else {
            System.out.println("Congertulation! " + "You are eligibale to vote.");
        }
    }
}
