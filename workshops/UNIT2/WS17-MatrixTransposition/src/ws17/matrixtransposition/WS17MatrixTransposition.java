/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws17.matrixtransposition;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class WS17MatrixTransposition {
    
    /**
     *
     * @param args
     */
    public static void main(String [] args) {
        float [][] a;
        float [][] b;
        float [][] t;
        float [][] c;
        int m = 0;
        int n = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the matrix dimesions");
        System.out.println("\n m->");
        m= input.nextInt();
        
        System.out.println("\n n->");
        n= input.nextInt();
        
        a= new float[m][n];
        b= new float[m][n];
        c= new float[m][n];
        
        t=new float[n][m];
        
         System.out.println("------Enter the elements of the matrix-------");
         
         a=readMatrixElements(m, n, "A",input);
         b=readMatrixElements(m, n, "A",input);
         
         for(int tab=0; tab<= n/2; tab++){
           System.out.println("\t");   
         }
           System.out.println(" A");
           
           prettyPrintMatrix(m, n, a);
           System.out.println("");
           
           System.out.println(" B ");
            prettyPrintMatrix(m, n, b);
            
            transpose(n, m, t, a);
            
          for(int tab=0; tab<= n/2; tab++){
           System.out.println("\t");    
    }
         System.out.println(" T");
         prettyPrintMatrix(m, n, t);
         
         System.out.println("--The sum of matrices is--");
         
         c = addTwoMatrices(m, n, a, b);
          prettyPrintMatrix(m, n, c);
}

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float [][] matrix;
        matrix=new float [m][n];
        for(int i=0; i< m; i++){
            System.out.println("--Row Numbers" + (i+1) + "--");
        for(int j=0; j< n; j++){
             System.out.print(matrixName + "[" + (i+1) + "][" + (j+1)+ "] ->");
             matrix[i][j] = input.nextFloat();
        }
        }
        return matrix;
        }

    public static void transpose(int n, int m, float[][] t, float[][] a) {
        //transposition operation (transpose)
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                t[i][j] = a[j][i];
            }
        }
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }
    public static void printMatrix(int m, int n, float[][] matrix){
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");

    }
}