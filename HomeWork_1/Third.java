package com.company;

import java.util.Scanner;

public class Third
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R1:");
        double r1 = scan.nextDouble();
        System.out.println("Enter R2:");
        double r2 = scan.nextDouble();
        if (r1 < r2)
        {
            throw new ArithmeticException("r1 should be larger than r2");
        }
        double sq = Math.PI * Math.pow(r1, 2) - Math.PI * Math.pow(r2, 2);
        System.out.println("Square:" + sq);
    }
}
