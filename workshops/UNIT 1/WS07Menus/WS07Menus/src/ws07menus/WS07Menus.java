/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Adittion");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 2:
                    int subtrahend1;
                    int subtrahend2;
                    int substraction;
                    System.out.println("enter subtrahend1 -> ");
                    subtrahend1 = input.nextInt();
                    System.out.println("enter subtrahend2 -> ");
                    subtrahend2 = input.nextInt();
                    substraction = subtrahend1 - subtrahend2;
                    System.out.println("The subtraction is " + "= " + substraction);
                    break;
                case 3:
                    int factor1;
                    int factor2;
                    int product;
                    System.out.println("enter factor1 -> ");
                    factor1 = input.nextInt();
                    System.out.println("enter factor2 -> ");
                    factor2 = input.nextInt();
                    product = factor1 * factor2;
                    System.out.println("The multiplcation is " + "= " + product);
                    break;
                case 4:
                    int dividend;
                    int divider;
                    int quotient;
                    System.out.println("enter dividend -> ");
                    dividend = input.nextInt();
                    System.out.println("enter divider -> ");
                    divider = input.nextInt();
                    quotient = dividend / divider;
                    System.out.println("The division is " + "= " + quotient);
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}