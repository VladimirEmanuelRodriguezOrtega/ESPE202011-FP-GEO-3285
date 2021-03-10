/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.printer;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class WS21Printer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("@Autor: Vladimir Rodriguez");
        Scanner input = new Scanner(System.in);

        float tiempo = 0;
        float nrohojasnecesarias = 0;
        float vida = 0;
        float nrohojastotales = 0;
        
                
        System.out.println("Calcular el tiempo de impresion");
        System.out.println("Por favor ingrese el numero de hojas a imprimir: ");
        nrohojasnecesarias = input.nextFloat();
        tiempo = calcularNroDeHojas(nrohojasnecesarias);
        System.out.println(" El tiempo que Ud. requiere para imprimir es de :" + tiempo + " minutos ");
        
        System.out.println(" Calcular el porcentaje de tinta sobrante");
        System.out.println("Por favor ingrese el numero de hojas totales que imprimira");
        nrohojastotales = input.nextFloat();
        vida = calcularTiempoDeVida(nrohojastotales);
        System.out.println(" El porcentaje de tinta gastado es de " + vida + " %" );
    }
    private static float calcularNroDeHojas(float nrohojasnecesarias) {

        float tiempo;
        tiempo = ((nrohojasnecesarias) / 8);
        return tiempo;
    }
    
    private static float calcularTiempoDeVida(float nrohojastotales) {

        float vida;
        vida = ((nrohojastotales * 100) / 500);
        return vida;
    }
    
}