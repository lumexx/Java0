package com.company;

import java.util.Scanner;

public class Seventh {
    public static void main(String args[])
    {
        int x, y;
        System.out.println("Enter x and y");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Before x = " + x + " y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After x = " + x + " y = " + y);
    }
}
