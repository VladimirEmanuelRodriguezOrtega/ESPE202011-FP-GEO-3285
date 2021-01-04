/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatements;

/**
 *
 * @author nuevo
 */
public class FP02_controlStatements {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        int number; // numero de entrada
        int remainder; // residuo
        
        number = 8;
        remainder = number % 2; // el residuo de n dividido 2
        
        if (remainder == 0) {
            // en caso de que sea verdadero...
            System.out.println("n is even");
        } else {
            System.out.println("n is odd");
        }
    }
}
