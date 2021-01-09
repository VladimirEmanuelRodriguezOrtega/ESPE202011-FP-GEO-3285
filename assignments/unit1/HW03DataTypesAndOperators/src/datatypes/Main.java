package datatypes;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///////////////////////// example 1 ////////////////////////////////////
        System.out.println("The volume of the radius sphere");
        System.out.println();
        
        // declaro las variables
        Scanner escaner;
        float radio;
        float volumen;
        float pi = 3.1416f;
        
        // defino el escaner
        escaner = new Scanner(System.in);
        
        // pido por consola el radio
        System.out.println("Enter the radius: ");
        radio = escaner.nextFloat(); // obtengo el radio
        
        // definimos el valor del volumen mediante
        // la formula (4/3)*pi*r^3
        volumen = (4/3) * pi * (radio * radio * radio);
        
        // mostramos al usuario el volumen
        System.out.println("The volume with the radius " + radio + " is " + volumen);
        System.out.println();
        System.out.println();
        
        ///////////////////////// example 2 ////////////////////////////////////
        // suma de 10 primeros numeros multiplos de n
        
        System.out.println("The sum of the first 10 divisible numbers of a given number");
        System.out.println();
        
        int sum;
        int n;
        
        sum = 0;
        
        System.out.println("Enter a number: ");
        n = escaner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            sum += (i * n);
        }
        
        System.out.println("the sum is: " + sum);
        System.out.println();
        System.out.println();
        
        ///////////////////////// example 3 ////////////////////////////////////
        System.out.println("Body Mass Index calculator (aprox)");
        System.out.println();
        
        short weight;
        short height;
        
        System.out.println("enter your weight [kg]: ");
        weight = escaner.nextShort();
        
        System.out.println("enter your height [cm]: ");
        height = escaner.nextShort();
        float heightm = (float)(height)/100;  
        
        //It is a casting from float to short (transform between datatype) 
        short imc = (short)((weight) / (heightm * heightm));
        
        System.out.println("your IMC is: " + imc);
    }
}
