/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;


/**
 *
 * @author nuevo
 */
public class HW15MatrixOperation {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a[][] = new int[3][3];
            int b[][] = new int[3][3];
            int c[][] = new int[3][3];

            System.out.println("Enter the data for matrix A: ");
            System.out.println("");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("enter the value for A[" + i + "][" + j + "]: ");
                    int value = scanner.nextInt();
                    scanner.nextLine();

                    a[i][j] = value;
                }
            }

            System.out.println("\n");

            System.out.println("Enter the data for matrix B: ");
            System.out.println("");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("enter the value for B[" + i + "][" + j + "]: ");
                    int value = scanner.nextInt();
                    scanner.nextLine();

                    b[i][j] = value;
                }
            }

            System.out.println("\n");

            for(int i = 0 ; i < 3 ; i++) {
                for (int j = 0 ; j < 3 ; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }

            System.out.println("The subtraction of matrix A -> ");

            for(int i = 0 ; i < 3 ; i++) {
                System.out.println("");

                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print("\t " + a[i][j]);
                }
            }

            System.out.println("\nAnd Matrix B -> ");

            for(int i = 0 ; i < 3 ; i++) {
                System.out.println("");

                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print("\t " + b[i][j]);
                }
            }

            System.out.println("\nequals to -> ");

            for(int i = 0 ; i < 3 ; i++) {
                System.out.println("");

                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print("\t " + c[i][j]);
                }
            }

            System.out.println();
        }
    }