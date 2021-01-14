package hw03iterations;


public class HW03Iterations {

        public static void main(String[] args) {
     int i;
        i = 1;
        
        System.out.println("==== HOMEWORK 3.1: This is a while loop from 1 to 37 ====");
        
        while( i <= 37) {
            System.out.println("i ->" + i);
            //i = i+1; anorher option
            i++;
            //i = i + 1; another option
        }
                
            System.out.println("");              
        System.out.println("HOMEWORK 3.2: Multiplication Tables : 37");
        int top = 12;
        int product = 0;
        int table = 37;
        for (int j =1; j <= top; j++) {
            product = table * j;
            System.out.println("37 *" + j + " = " + product);
        }
        
            System.out.println("");
        System.out.println("HOMEWORK 3.3: 20 first numbers raised to 2 power");
        int base = 20;
        int exponent = 2;
        int potencia = 2; // resultado
        for (int a = 0; a <= base; a++) {
            potencia = a*a;
            System.out.println("(" + a + ")" + "^" + exponent + "=" + potencia);
        }
    }
    
}
