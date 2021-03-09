/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguezvq11;

import java.util.Scanner;

/**
 *
 * @author
 */
public class RodriguezVQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int[] array2 = new int[]{ 12, 23, 34, 98, 87, 65, 0 };
        float[] scores = new float[3];
        int sum;
        float average;
        
        System.out.println("Please enter 5 numbers");
        System.out.println("\n");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
            input.nextLine();
        }
        
        sum = sumArray(array);
        
        System.out.println();
        System.out.println("sum: " + sum);
        
        ////////////////////////////////////////////////////////////////////////
        
        System.out.println("\n\n");
        System.out.println("Please enter 3 numbers: ");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            scores[i] = input.nextFloat();
            input.nextLine();
        }
        
        average = calculateAverage(scores);
        
        System.out.println("average: " + average);
        
        ////////////////////////////////////////////////////////////////////////
        
        int term;
        System.out.println("\n\n");
        System.out.println("Enter a number to search: ");
        term = input.nextInt();
        input.nextLine();
        boolean found = find(array2, term);
        
        if (found) {
            System.out.println(term + " was found in array");
        } else {
            System.out.println(term + " not found in array");
        }
    }
    
    public static float calculateAverage(float[] scores) {
        float sum = 0;
        int n = scores.length;
        
        for (int i = 0; i < n; i++) {
            sum += scores[i];
        }
        
        return (sum / n);
    }
    
    public static int sumArray(int[] elements) {
        int n = elements.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += elements[i];
        }
        
        return sum;
    }
    
    public static boolean find(int[] elements, int term) {
        int n = elements.length;
        
        for (int i = 0; i < n; i++) {
            if (term == elements[i]) {
                return true;
            }
        }
        
        return false;
    }
}