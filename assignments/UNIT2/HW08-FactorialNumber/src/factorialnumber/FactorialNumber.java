package factorialnumber;
import java.util.*;
/**
 *
 * @author nuevo
 */
public class FactorialNumber {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    System.out.print(" Ingrese el numero que desee saber su factorial: ");
    
    int number = leer.nextInt();
    int factorial = 1;
    
    while(number !=0)
    {
        factorial*=number;
        number --;
        }
        System.out.println(" EL factorial de su numero es: " + factorial);
    }
    
}
