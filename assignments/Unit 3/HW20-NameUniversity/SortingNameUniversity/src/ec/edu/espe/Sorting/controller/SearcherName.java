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
public class SearcherName {
    public static int SearchName(String[]name, String dataToFind){
        int n = name.length;
        for (int i = 0; i < n ; i++) {
           
            if (dataToFind == null ? (name[i]) == null : dataToFind.equals(name[i])){
                return 1;
            }
        }
        return -1;
    }

   
}
