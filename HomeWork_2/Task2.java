package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int number, number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Natural Number: ");
        number = scan.nextInt();
        System.out.println("Enter Second Natural Number You Want To Find LCM and GCD with: ");
        number2 = scan.nextInt();
        System.out.println("Number Largest Digit: " + findLargestDigit(number));
        System.out.println((isPalindrome(number)) ? "Number Is Palindrome" : "Number Is Not Palindrome");
        System.out.println((isPrime(number)) ? "Number Is Prime" : "Number Is Not Prime");
        System.out.println("Number Prime Divisors: "); printPrimeDivisors(number);
        System.out.println("Numbers LCM: " + findLCM(number, number2));
        System.out.println("Numbers GCD: " + findGCD(number, number2));
        System.out.println("Number Digits Amount: " + findDigitsCount(number));
    }

    private static int findLargestDigit(int number) {
        int largestDigit = 0;
        while (number > 0) {
            if (largestDigit < (number % 10)) {
                largestDigit = number % 10;
            }
            number = number / 10;
        }
        return largestDigit;
    }

    private static boolean isPalindrome(int number) {
        int temp = number;
        int sum = 0;
        while (number > 0) {
            sum = (sum * 10) + (number % 10);
            number = number / 10;
        }
        return temp == sum;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        else {
            int divisor = 2;
            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    return false;
                }
                divisor++;
            }
            return true;
        }
    }

    private static void printPrimeDivisors(int number) {
        boolean isHavingDivisors = false;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i + " ");
                    isHavingDivisors = true;
                }
            }
        }
        if (!isHavingDivisors) {
            System.out.println("None");
        }
    }

    private static int findLCM(int number, int number2) {
        return (number * number2) / findGCD(number, number2);
    }

    private static int findGCD(int number, int number2) {
        int gcd = 1;
        for (int i = 1; i <= number && i <= number2; i++) {
            if (number % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int findDigitsCount(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

}
