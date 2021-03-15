/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22.modularcalculator;
import java.util.Scanner;
import utils.BasicOperators;

/**
 *
 * @author Vladimir Rodriguez
 */
public class WS22ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // None
        float operand1;
        float operand2;
        float result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Enter two numbers:");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();
        
        System.out.println("__Addition (+)__");
        result = BasicOperators.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "+" + operand2 + "=" + result);
        
        System.out.println("__Subtraction (-)__");
        result = BasicOperators.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "-" + operand2 + "=" + result);
        
        System.out.println("__Multiply (+)__");
        result = BasicOperators.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "*" + operand2 + "=" + result);
        
        System.out.println("__Division (+)__");
        result = BasicOperators.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "/" + operand2 + "=" + result);
        
    }
    
}









