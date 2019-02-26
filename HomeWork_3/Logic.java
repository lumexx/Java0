package com.company;


public class Logic {

    public static double findMatrixMaxValue(double[][] matrix) {
        double maxValue = matrix[0][0];
        for (double[] i : matrix) {
            for (double j : i) {
                if (maxValue < j) {
                    maxValue = j;
                }
            }
        }
        return maxValue;
    }

    public static double findMatrixMinValue(double[][] matrix) {
        double maxValue = matrix[0][0];
        for (double[] i : matrix) {
            for (double j : i) {
                if (maxValue > j) {
                    maxValue = j;
                }
            }
        }
        return maxValue;
    }

    public static double findMatrixArithmeticMean(double[][] matrix) {
        double mean = 0;
        int count = 0;
        for (double[] i : matrix) {
            for (double j : i) {
                mean += j;
                count++;
            }
        }
        return mean / count;
    }

    public static double findMatrixGeometricMean(double[][] matrix) {
        double mean = 1;
        int count = 0;
        for (double[] i : matrix) {
            for (double j : i) {
                mean *= j;
                count++;
            }
        }
        return Math.exp(Math.log(mean) / count);
    }

    public static double findMatrixLocalMin(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                double current = matrix[i][j];
                if (!(i + 1 < matrix.length && current >= matrix[i + 1][j] ||
                        i - 1 >= 0 && current >= matrix[i - 1][j] ||
                        j + 1 < matrix[i].length && current >= matrix[i][j + 1] ||
                        j - 1 >= 0 && current >= matrix[i][j - 1])) {
                    return matrix[i][j];
                }
            }
        }
        return -1;
    }

    public static double findMatrixLocalMax(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                double current = matrix[i][j];
                if (!(i + 1 < matrix.length && current <= matrix[i + 1][j] ||
                        i - 1 >= 0 && current <= matrix[i - 1][j] ||
                        j + 1 < matrix[i].length && current <= matrix[i][j + 1] ||
                        j - 1 >= 0 && current <= matrix[i][j - 1])) {
                    return matrix[i][j];
                }
            }
        }
        return -1;
    }

    public static double[][] getTransposedMatrix(double[][] matrix) {
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix[0].length; j++) {
                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
            }
            return matrix;
        }
        else {
            double[][] matrixTransposed = new double[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrixTransposed[j][i] = matrix[i][j];
                }
            }
            return matrixTransposed;
        }
    }
}
