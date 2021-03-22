/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Vladimir Rodriguez
 */
public class BinarySearch {

    public static int binarySearch(int birthYear[], int left, int right, int elementToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (birthYear[mid] == elementToSearch) 
                return mid;
            
                if (birthYear[mid] > elementToSearch) 
                    return binarySearch(birthYear, left, mid - 1, elementToSearch);
                
                    return binarySearch(birthYear, mid + 1, right, elementToSearch);
                }
         return -1;
   }
}
