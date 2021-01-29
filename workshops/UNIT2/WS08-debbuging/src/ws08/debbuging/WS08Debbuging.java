/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws08.debbuging;

import java.util.Scanner;
/**
 *
 * @author nuevo
 */
public class WS08Debbuging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // DONE
        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 15;

        product = 0;

        do {
            System.out.println("Enter the table you want to study until 15");
            System.out.println("0 (zero) to exit  --> ");

            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();

            if (multiplicand != 0) {
                System.out.println("Studying the Table of ----> " + multiplicand + " <----");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " x " + multiplier + " = " + product);
                }
            }
            multiplier = 1;

        } while (multiplicand != 0);

        System.out.println("Good bye");

    }

}
