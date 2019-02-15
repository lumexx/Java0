package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int headsCount, tailsCount = 0;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number Of Flips: ");
        int flipsNumber = scan.nextInt();
        System.out.println("Flips: " + flipsNumber);
        for (int i = 0; i < flipsNumber; i++) {
            if (random.nextInt(2) == 0) {
                tailsCount++;
            }
        }
        headsCount = flipsNumber - tailsCount;
        System.out.println("Heads: " + headsCount + "\n" + "Tails: " + tailsCount);
    }
}
