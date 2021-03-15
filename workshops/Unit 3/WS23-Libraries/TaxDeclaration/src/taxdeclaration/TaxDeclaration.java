package taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;



/**
 *
 * @author nuevo
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercentage = 12;

        Scanner input = new Scanner(System.in);

        System.out.println(" Vladimir Rodriguez Taxes ");
        System.out.println(" IVA --> ");
        System.out.println("Enter the price of your products");
        price = input.nextFloat();
        
        ivaValue = BasicTax.computeIva(price, ivaPercentage);
        totalPrice = price + ivaValue;
        
        System.out.println("total price -> " + String.format("%.2f", totalPrice));
        
    }
    
}
