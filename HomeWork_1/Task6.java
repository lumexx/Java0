package com.company;

import java.util.Scanner;

public class Task6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number;
        int reverse = 0;
        System.out.println("Enter N");
        number = scan.nextInt();
        for (int i = 0; i < 7; i++) {
            reverse = reverse*10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse: " + reverse);
    }
}
