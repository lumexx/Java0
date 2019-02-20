package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Type t-rex weight in kg");
        double weight = scan.nextFloat();
        double mg = 1000000 * weight;
        double gr = 1000 * weight;
        double t = weight/1000;
        System.out.println("mg:" + mg + "\n" + "gr:" + gr + "\n" + "t:" + t);
    }
}
