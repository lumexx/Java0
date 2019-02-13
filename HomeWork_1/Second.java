package com.company;

import java.util.Scanner;

public class Second
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type t-rex weight in kg");
        double weight = scan.nextFloat();
        System.out.println("mg:" + 0.000001 * weight + "\n" + "gr:" + 0.001 * weight + "\n" + "t:" + 1000 * weight);
    }
}
