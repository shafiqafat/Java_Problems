package com.shafiq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("""
            0. Download MyGP
            1. Balance, Call Rate & FnF
            2. GP STAR
            3. Internet Pack
            4. Talk Time/ Minutes Pack
            5. My Offers
            6. Welcome tune
            """ );
   System.out.print("Select an Option from (0 to 6): ");
        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
/*
        if(number == 0){
            System.out.println("Downloading MyGP App");
        }else if(number == 1){
            System.out.println("You don't have enough balance," + "recharge now.");
        }else if(number == 2){
            System.out.println("Your sounding privileged!");
        }else if(number == 3){
            System.out.println("1 GB at Tk 21 for 7days");
            System.out.println("5 GB at Tk 299 for 30days");
        }else if(number == 4){
            System.out.println("You have 100 minutes free talktime and 10 sms," + "use them.");
        }else if(number == 5){
            System.out.println("You don't have any offer," + "migrate to another provider!");
        }else if(number == 6){
            System.out.println("We are out of service at this moment.");
        }else {
            System.out.println("You have pressed the wrong code.");
        }
*/
        switch (number){
            case 0:
                System.out.println("Downloading MyGP App");
                break;
            case 1:
                System.out.println("You don't have enough balance," + "recharge now.");
                break;
            case 2:
                System.out.println("Your sounding privileged!");
                break;
            case 3:
                System.out.println("1 GB at Tk 21 for 7days");
                System.out.println("5 GB at Tk 299 for 30days");
                break;
            case 4:
                System.out.println("You have 100 minutes free talktime and 10 sms," + "use them.");
                break;
            case 5:
                System.out.println("You don't have any offer," + "migrate to another provider!");
                break;
            case 6:
                System.out.println("We are out of service at this moment.");
                break;
            default:
                System.out.println("You have pressed the wrong code.");
                break;
        }
    }
}
