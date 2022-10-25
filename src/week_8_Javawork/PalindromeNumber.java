package week_8_Javawork;

import java.util.Scanner;

public class PalindromeNumber {
    private static Scanner sc;

    public static void main(String[] args) {
        int Number, Temp, Reminder, Reverse = 0;
        sc = new Scanner(System.in);

        System.out.println("Please Enter any number to Check : ");
        Number = sc.nextInt();
        //Helps to prevent altering the original value
        Temp = Number;
        while (Temp > 0) {
            Reminder = Temp % 10;
            Reverse = Reverse * 10 + Reminder;
            Temp = Temp / 10;
        }
        System.out.format("Reverse of entered number is = %d\n", Reverse);
        if (Number == Reverse) {
            System.out.format("%d is Palindrome Number.", Number);
        } else {
            System.out.format("%d is Not.", Number);
        }

    }
}