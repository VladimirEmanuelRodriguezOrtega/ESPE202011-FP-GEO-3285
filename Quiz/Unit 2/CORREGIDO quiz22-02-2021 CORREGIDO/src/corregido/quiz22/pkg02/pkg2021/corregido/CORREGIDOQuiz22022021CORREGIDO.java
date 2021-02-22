/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido.quiz22.pkg02.pkg2021.corregido;

import java.util.Scanner;

/**
 *
 * @author nuevo
 */
public class CORREGIDOQuiz22022021CORREGIDO {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalStudents = 0;
        String[] students;
        float[] grades;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of students that you want to record ->");
        totalStudents = scanner.nextInt();

        students = new String[totalStudents];
        grades = new float[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            scanner.nextLine();
            System.out.print("Please enter the name of student # " + i + " -> ");
            students[i] = scanner.nextLine();
            System.out.print("Please enter " + students[i] + " grade -> ");
            grades[i] = scanner.nextFloat();
        }

        System.out.println("student   ->  \t    grade");

        for (int i = 0; i < totalStudents; i++) {
            System.out.println(students[i] + " -> \t " + grades[i]);
        }
    }
}