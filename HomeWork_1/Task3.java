package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R1:");
        double r1 = scan.nextDouble();
        System.out.println("Enter R2:");
        double r2 = scan.nextDouble();
        double sq = Math.PI * ((r1 * r1) - (r2 * r2));
        System.out.println("Square:" + sq);
    }
}
