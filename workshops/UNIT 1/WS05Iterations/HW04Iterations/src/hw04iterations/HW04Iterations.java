/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04iterations;

/**
 *
 * @author nuevo
 */
public class HW04Iterations {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        // TODO code application logic here
    int i;
        i = 1;
        
        System.out.println("===> PART 1: This is a -COUNTER BUCLE WHILE OF VLADIMIR- from 1 to 40 because Vladimir is this number in the list ====");
        
        while( i < 41) {
            System.out.println("i ->" + i);
            //i = i+1; anorher option
            i++;
            //i = i + 1; another option
        }
        
        
        System.out.println("===> PART 2: -Multiplication Tables- : 40; because Vladimir is this number in the list");
        int top = 12;
        int product = 0;
        int table = 40;
        for (int j =1; j <= top; j++) {
            product = table * j;
            System.out.println("40 *" + j + " = " + product);
        }
        
        
        System.out.println("===> PART 3: -EXERCISE FOR THE CICLE FOR- : squared potentiation of the first 15 integers numbers");
        int x = 0;
        int y = 16;
        
        int resultado = 1;
        for(int u =1; u <= y; u++){
            resultado = resultado * x; 
        }
        return resultado;
             
    }
}