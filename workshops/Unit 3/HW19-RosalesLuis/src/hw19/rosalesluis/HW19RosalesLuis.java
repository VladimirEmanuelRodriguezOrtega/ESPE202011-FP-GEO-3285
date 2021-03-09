/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw19.rosalesluis;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class HW19RosalesLuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int add = 0;
        int[] arrangement = new int[5];
        int[] array = new int[]{12, 23, 34, 98, 87, 65, 0};
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the " + i + " num:");
            arrangement[i] = ent.nextInt();
            add += arrangement[i];

        }
        {
            int i = 0;

            System.out.println("The num " + (i + 1) + " saved: " + arrangement[i]);
            System.out.println("The sum total is: " + add);
            Scanner sc = new Scanner(System.in);
        }
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        int i;
        float s = 0, p = 3;
        int[] a = new int[3];

        for (i = 0; i < 3; i++) {
            System.out.println("Enter the integer in position : " + (i + 1));

            a[i] = input.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            s = s + a[i];

            p = s / a.length;
        }
        System.out.println("the average is: " + p);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        int terms;
        System.out.println("\n\n");
        System.out.println("Enter a number: ");
        terms = input.nextInt();
        input.nextLine();
        boolean found = find(array, terms);

        if (found) {
            System.out.println(terms + " was array");
        } else {
            System.out.println(terms + " not array");
        }
    }

    public static boolean find(int[] elements, int term) {
        int n = elements.length;

        for (int i = 0; i < n; i++) {
            if (term == elements[i]) {
                return true;
            }
        }

        return false;
    }
}
