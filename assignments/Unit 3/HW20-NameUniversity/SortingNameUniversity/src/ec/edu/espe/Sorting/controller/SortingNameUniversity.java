/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Sorting.controller;

/**
 *
 * @author HP
 */
public class SortingNameUniversity {
    public String[] sortByName(String [] name) {
        int n = name.length;
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j <name.length; j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i <= name.length - 1; i++) {
            System.out.print(name[i] + ", ");
        }
        return name;
    }
}



