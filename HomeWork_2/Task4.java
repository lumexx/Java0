package com.company;

import java.util.Scanner;

public class Task4 {

    public static void main(String args[]) {
        int leftBorder, rightBorder;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Left Border: ");
        leftBorder = scan.nextInt();
        System.out.print("Enter Right Border: ");
        rightBorder = scan.nextInt();
        findAmicable(leftBorder, rightBorder);
    }

    private static void findAmicable(int leftBorder, int rightBorder) {
        int j = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            j = calculateDivisorsSum(i);
            if ((i < j) && (j <= rightBorder) && (calculateDivisorsSum(j) == i)) {
                System.out.println(i + ", " + j);
            }
        }
    }

    private static int calculateDivisorsSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if ((number % i) == 0) {
                sum += i;
            }
        return sum;
    }
}
