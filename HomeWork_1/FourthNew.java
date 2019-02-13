package com.company;

import java.util.Scanner;

public class FourthNew {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scan.nextInt();
        int progressionCount = 0;
        while (Math.abs(progressionCount) < 3)
        {
            if (n / 10 % 10 < n % 10 && progressionCount >= 0)
            {
                progressionCount++;
            }
            else if (n / 10 % 10 > n % 10 && progressionCount <= 0)
            {
                progressionCount--;
            }
            else
                {
                progressionCount = 4;
            }
            n /= 10;
        }
        if (progressionCount == 3)
        {
            System.out.println("Increasing sequence");
        }
        else if (progressionCount == -3)
        {
            System.out.println("Decreasing sequence");
        }
        else
        {
            System.out.println("No sequence");
        }
    }
}
