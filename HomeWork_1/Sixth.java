package com.company;

import java.util.Scanner;

public class Sixth {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int reverse = 0;
        System.out.println("Enter N");
        n = scan.nextInt();
        for (int i = 0; i < 7; i++)
        {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse: " + reverse);
    }
}
