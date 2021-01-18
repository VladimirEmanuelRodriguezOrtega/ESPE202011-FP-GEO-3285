/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit1;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class RodriguezOrtegaVladimirQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
        int target;
        
        do {
            System.out.print("Enter the table that you want to study (0) for exit: ");
        
            target = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            
            if (target > 0) {
                for (int i = 1; i <= 12; i++) {
                    int product = i * target;
                    System.out.println(target + "x" + i + " = " + product);
                }
            }
            
            System.out.println();
            System.out.println();
        } while (target > 0);
    }
    
}
