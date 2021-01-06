/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author nuevo
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplicand;
        int multiplier;
        int product;
        
        float divisor;
        float dividend;
        float quotient;
        
        int divisor2;
        int dividend2;
        int remainder;
      
        
        //initialization sum
        addend1 = 5;
        addend2 = 18;
        
        //initialization difference
        minuend = 18;
        subtrahend = 5; 
        
        //initialization product
        multiplicand = 3;
        multiplier = 5;
        
        //initialization division
        divisor = 50;
        dividend = 6;
        
        //initialization modulo
        divisor2 = 55;
        dividend2 = 7;
                        
        //operation sum
        sum = addend1 + addend2;
                       
        System.out.println("The addition of " + addend1 + " + " + addend2 + "is equal to = " + sum);
        
        ++sum;
        System.out.println("sum is equal to = " + sum);
        
        sum++;
        System.out.println("sum is equal to = " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum " + ((++sum)));
        
        //operation difference
        difference = minuend - subtrahend;
        
        System.out.println("the subtraction of " + minuend + " - " + subtrahend + " is equal to = " + difference);
                
        //operation product
        product = multiplicand * multiplier;
        System.out.println("the product of " + multiplicand + " * " + multiplier + " is equal to = " + product);
        
        //operation division (quotient)
        quotient = divisor / dividend;
        System.out.println("the quotient of " + divisor + " / " + dividend + " is equal to = " + quotient);
        
        //operation modulo (remaninder)
        remainder = divisor2 % dividend2;
        System.out.println("the remainder of " + divisor2 + " / " + dividend2 + " is equal to = " + remainder);
        
        
                
        
        
        
            
    }
    
}
