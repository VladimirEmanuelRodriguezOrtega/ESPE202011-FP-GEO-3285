/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author nuevo
 */
public class BasicOperators {
    //addition, subtraction, multiplication, division.
    
    public static float addTwoNumbers(float addend1, float addend2){
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }
    public static float subtractTwoNumbers(float minuend, float subtrahend){
        float subtraction = 0;
        subtraction = minuend - subtrahend;
        return subtraction;
    }
    public static float multiplyTwoNumbers(float multiplying, float multiplier){
        float multiply = 0;
        multiply = multiplying * multiplier;
        return multiply;
    }
    public static float divideTwoNumbers(float Dividend, float divisor){
        float divide = 0;
        divide = Dividend / divisor;
        return divide;
    }
}
