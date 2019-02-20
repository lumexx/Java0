package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = scan.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 0; i < 6; i++) {
            sum += number % 10;
            multi *= number % 10;
            number /= 10;
        }
        double arithmetic = (double) sum / 6;
        double geometric = Math.pow(multi, (double) 1 / 6);
        System.out.println("Arithmetic: " + arithmetic);
        System.out.println("Geometric: " + geometric);
    }
}
