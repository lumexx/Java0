package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matrixN, matrixM, minRangeValue, maxRangeValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        matrixN = scanner.nextInt();
        System.out.print("Enter M: ");
        matrixM = scanner.nextInt();
        System.out.print("Enter Min Range Value: ");
        minRangeValue = scanner.nextInt();
        System.out.print("Enter Max Range Value: ");
        maxRangeValue = scanner.nextInt();
        double[][] myMatrix = new double[matrixN][matrixM];
        initMatrix(myMatrix, minRangeValue, maxRangeValue);
        printMatrix(myMatrix);
        executeTasks(myMatrix);
    }

    private static void executeTasks(double[][] matrix) {
        System.out.println("Matrix Min Value: " + Logic.findMatrixMinValue(matrix));
        System.out.println("Matrix Max Value: " + Logic.findMatrixMaxValue(matrix));
        System.out.println("Matrix Arithmetic Mean:" + Logic.findMatrixArithmeticMean(matrix));
        System.out.println("Matrix Geometric Mean:" + Logic.findMatrixGeometricMean(matrix));
        System.out.println("Matrix Local Min:" + Logic.findMatrixLocalMin(matrix));
        System.out.println("Matrix Local Max:" + Logic.findMatrixLocalMax(matrix));
        System.out.println("Matrix After Transpose:"); printMatrix(Logic.getTransposedMatrix(matrix));
    }

    private static void initMatrix(double[][] matrix, int minRangeValue, int maxRangeValue) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(maxRangeValue - minRangeValue) + minRangeValue + Math.random();
            }
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] i : matrix) {
            for (double j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
