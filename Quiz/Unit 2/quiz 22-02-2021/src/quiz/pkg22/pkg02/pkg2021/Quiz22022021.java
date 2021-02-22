/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg22.pkg02.pkg2021;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class Quiz22022021 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        do {
            int totalStudents;
        
            System.out.print("Enter the number of students or 0 to exit: ");
            totalStudents = input.nextInt();
            input.nextLine();
            
            if (totalStudents <= 0) break;

            String studentNames[] = new String[totalStudents]; // nombres
            double studentGrades[] = new double[totalStudents]; // notas
            
            System.out.println();
            System.out.println();
                
            for (int i = 0; i < totalStudents; i++) {
                System.out.println("Student #" + (i + 1));
                System.out.println();
                
                System.out.print("Enter the name: ");
                String name = input.nextLine();
                
                System.out.print("Enter the grade: ");
                double grade = input.nextDouble();
                input.nextLine();
                
                studentNames[i] = name;
                studentGrades[i] = grade;
                
                System.out.println();
                System.out.println();
            }
            
            // suma de todas las notas
            double sum = 0;
            
            for (int i = 0; i < totalStudents; i++) {
                sum += studentGrades[i];
            }
            
            // promedio, suma de las notas dividido para el total de estudiantes
            double average = (sum / totalStudents);
            
            // mostramos los estudiantes
            for (int i = 0; i < totalStudents; i++) {
                System.out.println("Student #" + (i + 1) + "-> ");
                System.out.println("name: " + studentNames[i]);
                System.out.println("grade: " + studentGrades[i]);
                System.out.println("-----------------------------------------");
            }
            
            // mostramos el promedio
            System.out.println();
            System.out.println("students average: " + average);
            System.out.println();
            System.out.println();
        } while (true);
    }
    
}
