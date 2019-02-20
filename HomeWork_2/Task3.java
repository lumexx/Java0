package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Natural Number: ");
        number = scan.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.format("Perfect Number");
        } else {
            System.out.format("Not Perfect Number");
        }
    }
}
