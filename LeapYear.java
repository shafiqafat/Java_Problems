package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = input.nextInt();
        
        boolean isDivisibleBy4 = year%4 == 0;
        boolean isDivisibleBy100 = year%100 == 0;
        boolean isDivisibleBy400 = year%400 == 0;
        
        boolean isLeapYear = (isDivisibleBy4 && isDivisibleBy100) || isDivisibleBy400;
        
        if(isLeapYear){
            System.out.println(year + " is a Leap Year.");
        }else{
             System.out.println(year + " is not a Leap Year.");
        }
    }
    
}
