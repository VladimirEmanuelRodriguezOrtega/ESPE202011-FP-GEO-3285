package ec.edu.espe.matrixutils;

import java.util.Scanner;

/**
 *
 * @author
 */
public class MatrixUtils {
    public static float[][] substract(float matrixA[][], float matrixB[][]) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        float result[][] = new float[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        return result;
    }
    
    public static float[][] add(float matrixA[][], float matrixB[][]) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        float result[][] = new float[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        return result;
    }
    
    public static float[][] multiply(float matrixA[][], float matrixB[][]) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        float result[][] = new float[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void prettyPrintMatrix(float matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // fallback for the previous extended ASCII characters
        String[] tiles = {
            "+", // 0: top left corner
            "+", // 1: top right corner
            "+", // 2: bottom left corner
            "+", // 3: bottom right corner
            "-", // 4: horizontal line
            "|", // 5: vertical line
            "+", // 6: top separator
            "+", // 7: bottom separator
            "+", // 8: middle left vertical line
            "+", // 9: middle center vertical line
            "+" // 10: middle right vertical line
        };
        
        
        // get the maximum total digits of each column
        int columnsWidth[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                float value = matrix[i][j];

                if (value < 0) value *= -1;
                else if (value == 0) value = 1;

                int digitLength = ("" + value).length();

                if (columnsWidth[j] < digitLength) {
                    columnsWidth[j] = digitLength;
                }
            }
        }
        
        // print the matrix
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                // top left corner
                System.out.print(tiles[0]);
                
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < (2 + columnsWidth[k]); l++) {
                        System.out.print(tiles[4]);
                    }
                    
                    if (k != n - 1) {
                        System.out.print(tiles[0]);
                    }
                }
                
                // top right corner
                System.out.print(tiles[1]);
            }
            
            System.out.println();
            
            for (int j = 0; j < n; j++) {
                int digitLength = ("" + matrix[i][j]).length();
                
                System.out.print(tiles[5] + " ");
                System.out.print(matrix[i][j]);
                
                for (int l = 0; l < columnsWidth[j] - digitLength + 1; l++) {
                    System.out.print(" ");
                }
                
                if (j == (n - 1)) {
                    System.out.print(tiles[5]);
                }
            }
            
            System.out.println();
            
            if (i == (m - 1)) {
                // bottom left corner
                System.out.print(tiles[2]);
                
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < (2 + columnsWidth[k]); l++) {
                        System.out.print(tiles[4]);
                    }
                        
                    if (k != n - 1) {
                        System.out.print(tiles[7]);
                    }
                }
                
                // bottom right corner
                System.out.print(tiles[3]);
            } else {
                // middle left vertical line
                System.out.print(tiles[8]);
                
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < (2 + columnsWidth[k]); l++) {
                        System.out.print(tiles[4]);
                    }
                        
                    if (k != n - 1) {
                        System.out.print(tiles[9]);
                    }
                }
                
                // middle right vertical line
                System.out.print(tiles[10]);
            }
        }
        
        System.out.println();
    }
    
    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float matrix[][] = new float[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter a value for matrix " + matrixName);
                System.out.print("[" + i + "][" + j + "]: ");
                float value = input.nextFloat();
                input.nextLine();
                
                matrix[i][j] = value;
            }
        }
        
        System.out.println();
        
        return matrix;
    }
}
