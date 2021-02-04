/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divd;
        int divr;
        float quotient = 0;
        int x = 0;
        int y = 0;
        
        System.out.print("Enter dividend: ");
        divd = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter divisor: ");
        divr = scanner.nextInt();
        scanner.nextLine();

        //call to divideTwoNumbers() function
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of " + divd + " and " + divr + " is = " + quotient); //0.5 or ?
        System.out.println();
        
        System.out.println("f(x): x^2");
        System.out.print("Enter a value for f(x): ");
        x = scanner.nextInt();
        scanner.nextLine();
        y = f(x);
        System.out.println(x + "^" + x + " = " + y);
        System.out.println();

        System.out.println("g(x): x^2 + 2x + 1");
        System.out.print("Enter a value for g(x): ");
        x = scanner.nextInt();
        scanner.nextLine();
        y = g(x);
        System.out.println(x + "^2 + 2(" + x + ") + 1 = " + y);
        System.out.println();
        
        System.out.print("Enter a value for generate a multiplication table: ");
        x = scanner.nextInt();
        generateMultiplicationTable(x);
    }
    
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }
    
    public static int f(int x) {
        int y;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y;

        y = x * x + 2 * x + 1;

        return y;
    }
    
    public static void generateMultiplicationTable(int x) {
        int product;
        
        for (int i = 1; i <= 12; i++) {
            product = (x * i);
            System.out.println(x + "x" + i + " = " + product);
        }
    }
}
