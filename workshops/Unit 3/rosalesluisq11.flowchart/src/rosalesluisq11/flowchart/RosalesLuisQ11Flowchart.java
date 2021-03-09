/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosalesluisq11.flowchart;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RosalesLuisQ11Flowchart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Table 6");
            System.out.println("2. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Multiplication Tables : 6");
                 int top=12;
                 int product=1;
                 int table=6;
                 for (int j= 1 ; j<= top ; j++){
                 product = table * j;
            System.out.println("6 *" + j + " = " + product);
                }
                     break;
               case 2:{
                    System.out.println("Good Bye");
                    System.exit(0);
                }
                    System.out.println("Invalid option\n\n\n");

            }

        } while (option != 2);

    }

}