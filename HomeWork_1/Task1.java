package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scan.nextInt();
        System.out.println("Enter B: ");
        int b = scan.nextInt();
        System.out.println("Enter C: ");
        int c = scan.nextInt();
        if (a == b && b == c) {
            System.out.println("All equals");
        }
        else if (a != b && b != c && a != c) {
            System.out.println("No equals");
        }
        else {
            System.out.println("Some numbers are equal");
        }
    }
}
