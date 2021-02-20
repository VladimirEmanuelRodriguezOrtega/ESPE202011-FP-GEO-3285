/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.arrays;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class HW14Arrays {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ejemplo 1: Lista de estudiantes (ID, nombre)
         */
        int studentIds[] = new int[10];
        String studentNames[] = {
            "ACOSTA PEREZ DOMENICA CAMILA",
            "AGUIRRE ANRANGO ARIEL NICOLAS",
            "ALOUNGA CATAGÑA DENNIS FABIAN",
            "ALVAREZ SAVEDRA ELAM YUSSIF",
            "ARTEAGA BOSMEDIANO SANTIAGO ISRAEL",
            "BACUY TARCO DIANA FERNANADA",
            "BARRIGA CARVAJAL KAREN JHOMARA",
            "BORJA POZO XIOMARA ARIEL",
            "CALDERON MENDOZA DAYANA LISETH",
            "CALVACHE PONCE EMILIA VALENTIN"
        };
        
        System.out.println("\n\n========== EXAMPLE 1: students list ==========\n\n");
        
        // generamos los ids de los estudiantes
        for (int i = 0; i < 10; i++) {
            studentIds[i] = (i + 1);
        }
        
        System.out.println("ORD   \t\t   Nombre");
        System.out.println("-----------------------------------------");
        
        // mostramos los datos
        for (int i = 0; i < 10; i++) {
            System.out.println(studentIds[i] + "\t" + studentNames[i]);
        }
        
        
        /**
         * Ejemplo 2: Arreglo de canciones (nombre, artista)
         */
        String songs[] = new String[5];
        String artists[] = new String[5];
        
        System.out.println("\n\n========== EXAMPLE 2: Songs list ==========\n\n");
        
        songs[0] = "Étude in C major, Waterfall";
        artists[0] = "Frédéric Chopin";
        
        songs[1] = "Imagine";
        artists[1] = "John Lennon";
        
        songs[2] = "Yesterday";
        artists[2] = "The Beatles";
        
        songs[3] = "One";
        artists[3] = "U2";
        
        songs[4] = "Every Breath You Take";
        artists[4] = "The Police";
        
        System.out.println();
        System.out.printf("%-40.40s%-30.30s\n", "name", "artist");
        System.out.println("----------------------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-40.40s%-30.30s\n", songs[i], artists[i]);
        }
        
        /**
         * Ejemplo 3: Lista de productos
         */
        Scanner scanner = new Scanner(System.in);
        int totalProducts;
        
        System.out.println("\n\n========== EXAMPLE 3: products list ==========\n\n");
        
        System.out.print("Enter products amount: ");
        totalProducts = scanner.nextInt();
        scanner.nextLine();
        
        String products[] = new String[totalProducts];
        double prices[] = new double[totalProducts];
        
        for (int i = 0; i < totalProducts; i++) {
            System.out.println("Product #" + (i + 1));
            
            System.out.print("product name: ");
            products[i] = scanner.nextLine();
            
            System.out.println("product price: ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println();
        }
        
        System.out.println();
        System.out.println("product price\t\tproduct name");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < totalProducts; i++) {
            System.out.println(prices[i] + "\t\t\t\t" + products[i]);
        }
    }
}
