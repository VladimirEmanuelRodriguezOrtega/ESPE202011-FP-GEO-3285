/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ***** Calculator of multiple operations  ***** ");
            System.out.println("1. -> Peimeter of uneven square figure ");
            System.out.println("2. -> Sum of three quantities ");
            System.out.println("3. -> Table of multiplication of number 5 ");
            System.out.println("4. -> Area of rectangle");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int lado1;
                    int lado2;
                    int lado3;
                    int lado4;
                    int sum2;
                    System.out.println("enter lado1 of the square figure -> ");
                    lado1 = input.nextInt();
                    System.out.println("enter lado2 of the square figure -> ");
                    lado2 = input.nextInt();
                    System.out.println("enter lado3 of the square figure -> ");
                    lado3 = input.nextInt();
                    System.out.println("enter lado4 of the square figure -> ");
                    lado4 = input.nextInt();
                    sum2 = lado1 + lado2 + lado3 + lado4;
                    System.out.println(" The perimeter of the uneven square figure is --> " + sum2);
                    break;
                case 2:
                    int addend1;
                    int addend2;
                    int addend3;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    System.out.println("enter addend 3 -> ");
                    addend2 = input.nextInt();
                    addend3 = input.nextInt();
                    sum = addend1 + addend2 + addend3;
                    System.out.println(" the sum of this 3 quantities is --> " + sum);
                    break;
                case 3:
                    int top = 12;
                    int product1 = 1;
                    int table = 5;
                    for (int j =1; j <= top; j++) {
                        product1 = table * j;
                        System.out.println("The table of multiplication of number 5 is ");
                        System.out.println("5 *" + j + " = " + product1);
                    }
                    break;
                case 4:
                    int base;
                    int height;
                    int product2;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height -> ");
                    height = input.nextInt();
                    product2 = base * height;
                    System.out.println("The area of rectangle is " + "= " + product2);
                    break;
                case 5:
                    System.out.println("Good Bye Human, I am the supercomputer XD");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}