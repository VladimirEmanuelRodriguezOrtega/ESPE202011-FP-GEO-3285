/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class WS13Task {
static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;

        do {

            System.out.println("███████░▒*        WELCOME TO TASKER       *░▒███████\n");

            System.out.println("  What would you like to do? ");
            System.out.println("▒ 1.  AREA OF CIRCLE");
	    System.out.println("▒ 2.  AREA OF TRIANGLE");
            System.out.println("▒ 3.  AREA OF DIAMOND");
            System.out.println("▒ 4.  VELOCITY");
            System.out.println("▒ 5.  TIME");
            System.out.println("▒ 6.  SPACE");

            System.out.println("Enter your menu option >> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    AreaOfCircle();
                break;
		case 2:
                    AreaOfTriangle();
                break;
		case 3:
                    convertMetersToMilimeters();
                break;	
                case 4:
                    convertMeterseToNanometers();
                break;
                case 14:
                    System.out.println(" ** GOOD BYE USER ** ");
                    System.exit(0);
                break;
                default:
                    System.out.println("Invalid option\n\n\n");
                break;
            }
        } while (option != 5);
    }
    
    public static void AreaOfCircle() {
        double a;
        double radio;
        double areaC;
        
        System.out.println("enter enter the radio --> ");
        radio = a;
        areaC = PI * radio;
        System.out.println(" The area of circle is equal to " + areaC + " units\n ");
    }
    
    public static void AreaOfTriangle() {
        double base = 0;
        double high = 0;
        double areaT;
        
        System.out.println("enter enter the radio --> ");
        areaT = base * high;
        System.out.println(" The area of triangle is equal to " + areaT + " units\n ");
    }
    
    public static void convertMetersToMilimeters() {
        double meters;
        double millimeters;
        
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        millimeters = meters * 1000;
        System.out.println(meters + " meters is equal to " + millimeters + " millimeters\n ");
    }
    
    public static void convertMeterseToNanometers() {
        double meters;
        double nanometers;
        
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        nanometers = meters * 1000000000;
        System.out.println(meters + " meters is equal to " + nanometers + " nanometers\n ");
    }
    
}
