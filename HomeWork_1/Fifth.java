package com.company;

import java.util.Scanner;

public class Fifth
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scan.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 0; i < 6; i++)
        {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        double arithmetic = (double) sum / 6;
        double geometric = Math.pow(multi, (double) 1 / 6);
        System.out.println("Arithmetic: " + arithmetic);
        System.out.println("Geometric: " + geometric);
    }
}
