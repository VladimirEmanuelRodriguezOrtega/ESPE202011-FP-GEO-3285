/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.metodgeoconverter;

import java.util.Scanner;
/**
 *
 * @author nuevo
 */
public class HW12MetodGeoconverter {
static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;

        do {

            System.out.println("███████░▒*        WELCOME TO GEOCONVERTER       *░▒███████\n"
                    + "█                         VERSION 0.1                             █\n"
                    + "█                       10 FEBRUARY 2021                          █\n"
                    + "████████████████████ ███████████████████████\n"
                    + "                   Transformer of units of length                \n"
                    + "_______________________");

            System.out.println("  What would you like to do? ");
            System.out.println("▒ 1.  Kilometers to meters.");
	    System.out.println("▒ 2.  Meters to centimeters.");
            System.out.println("▒ 3.  Meters to millimeters");
            System.out.println("▒ 4.  Meters to nanometers.");
            System.out.println("▒ 5.  Exit.");

            System.out.println("Enter your menu option >> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    convertKmToMeters();
                break;
		case 2:
                    convertMetersToCentimeters();
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
    
    public static void convertKmToMeters() {
        double kilometers;
        double meters;
        
        System.out.println("enter enter the data --> ");
        kilometers = input.nextDouble();
        meters = kilometers * 1000;
        System.out.println(kilometers + " Kilometers is equal to " + meters + " meters\n ");
    }
    
    public static void convertMetersToCentimeters() {
        double meters;
        double centimeters;
        
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        centimeters = meters * 100;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters\n ");
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
