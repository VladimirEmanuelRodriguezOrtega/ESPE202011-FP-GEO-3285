/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author nuevo
 */
public class LinearSearch {

    public static int search(int yearBirth[], int elementToSearch) {
        int n = yearBirth.length;
        for (int i = 0; i < n; i++) {
            if (yearBirth[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

}