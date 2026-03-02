// Experiment 2:
// Perform matrix operations
// This program is written in Java and uses 2D arrays to store matrix elements.
// It takes input for rows, columns, and elements of two matrices using the Scanner class.
// The program performs matrix addition and matrix subtraction by operating on corresponding elements.
// It also calculates the transpose of a matrix by interchanging rows and columns.
// Nested for loops are used to process and display matrix values.
// The program demonstrates the use of arrays, loops, and user input handling in Jaimport java.util.Scanner;
import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];

        System.out.println("Enter first matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j] = sc.nextInt();

        // Addition
        int add[][] = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                add[i][j] = a[i][j] + b[i][j];

        // Subtraction
        int sub[][] = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                sub[i][j] = a[i][j] - b[i][j];

        // Multiplication
        int mul[][] = new int[r][c]; // assuming square matrix for simplicity
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<c;k++)
                    mul[i][j] += a[i][k] * b[k][j];

        // Display
        System.out.println("\nAddition:");
        printMatrix(add, r, c);

        System.out.println("\nSubtraction:");
        printMatrix(sub, r, c);

        System.out.println("\nMultiplication:");
        printMatrix(mul, r, c);
    }

    static void printMatrix(int mat[][], int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}