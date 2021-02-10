/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.recursion;
import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int binary;
        
        System.out.println("Convertion from decimal to binary");
        System.out.println();
        
        System.out.println("Enter a number: ");
        number = input.nextInt();
        
        binary = decimalToBinary(number);
        System.out.println(number + " in binary representation is: " + binary);
    }
    
    public static int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        
        return decimal % 2 + 10 * (decimalToBinary(decimal / 2));
    }
}
