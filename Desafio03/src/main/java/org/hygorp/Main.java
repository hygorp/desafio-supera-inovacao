package org.hygorp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String traverseSnailMatrix(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();

        do {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        } while (top <= bottom && left <= right);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da Matriz: ");
        int matrixSize = sc.nextInt();

        if (matrixSize == 0) {
            System.err.println("Matriz vazia: []");
        } else {
            int[][] matrix = new int[matrixSize][matrixSize];

            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("=> " + traverseSnailMatrix(matrix));
        }

        sc.close();
    }
}