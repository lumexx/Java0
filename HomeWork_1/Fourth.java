package com.company;

import java.util.Scanner;

public class Fourth
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scan.nextInt();
        int progressionCount = 0;
        for (int i = 0; i < 3; i++)
        {
            if ((n / 10) % 10 < n % 10)
            {
                progressionCount++;
            }
            if ((n / 10) % 10 > n % 10)
            {
                progressionCount--;
            }
            n = n / 10;
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
