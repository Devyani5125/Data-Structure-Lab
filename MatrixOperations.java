// Experiment 2:
// Perform matrix operations
// This program is written in Java and uses 2D arrays to store matrix elements.
// It takes input for rows, columns, and elements of two matrices using the Scanner class.
// The program performs matrix addition and matrix subtraction by operating on corresponding elements.
// It also calculates the transpose of a matrix by interchanging rows and columns.
// Nested for loops are used to process and display matrix values.
// The program demonstrates the use of arrays, loops, and user input handling in Jaimport java.util.Scanner;
import java.util.*;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition
        System.out.println("\nMatrix Addition:");
        int[][] add = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                add[i][j] = A[i][j] + B[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        // Subtraction
        System.out.println("\nMatrix Subtraction:");
        int[][] sub = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sub[i][j] = A[i][j] - B[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication (only valid if cols of A == rows of B)
        if (cols == rows) {
            System.out.println("\nMatrix Multiplication:");
            int[][] mul = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix multiplication not possible (columns of A must equal rows of B).");
        }

        // Transpose of Matrix A
        System.out.println("\nTranspose of Matrix A:");
        int[][] transposeA = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeA[j][i] = A[i][j];
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeA[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of Matrix B
        System.out.println("\nTranspose of Matrix B:");
        int[][] transposeB = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeB[j][i] = B[i][j];
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeB[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
