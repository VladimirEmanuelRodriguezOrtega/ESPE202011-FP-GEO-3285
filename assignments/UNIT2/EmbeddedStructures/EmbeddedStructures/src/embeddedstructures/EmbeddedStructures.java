/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedstructures;

import java.util.Scanner;
/**
 *
 * @author nuevo
 */
public class EmbeddedStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int result;
        char option;
        
        do {
            System.out.print("ingrese el numero 1: ");
            number1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("ingrese el numero 2: ");
            number2 = scanner.nextInt();
            scanner.nextLine();

            if (number1 % 2 == 0 && number2 % 2 == 0) {
                result = number1 * number2;
                System.out.println(number1 + " x " + number2 + " = " + result);
            } else if (number1 % 3 == 0 && number2 % 3 == 0) {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            } else if (number1 % 7 == 0 && number2 % 7 == 0) {
                result = number1 % number2;
                System.out.println(number1 + " % " + number2 + " = " + result);
            } else if (number1 % 11 == 0 && number2 % 11 == 0) {
                for (int i = 1; i <= 12; i++) {
                    System.out.println(number1 + " x " + i + " = " + (number1 * i));
                }
                
                if (number1 != number2) {
                    for (int i = 1; i <= 12; i++) {
                        System.out.println(number2 + " x " + i + " = " + (number2 * i));
                    }
                }
            } else if (number1 % 13 == 0 && number2 % 13 == 0) {
                result = (number1 / number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
            } else {
                System.out.println("No es posible realizar esta operacion");
                System.out.println("No existe esta operacion");
            }

            System.out.println();
            System.out.println();
            System.out.println("Do you want retry again? [y/n]");
            option = scanner.nextLine().charAt(0);
        } while (option != 'n');
    }
}
