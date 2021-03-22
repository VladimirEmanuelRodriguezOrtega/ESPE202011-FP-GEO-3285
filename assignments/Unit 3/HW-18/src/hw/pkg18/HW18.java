/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg18;

import java.util.Scanner;
import Utils.BinarySearch;
import Utils.LinearSearch;


/**
 *
 * @author Vladimir Rodriguez
 */
public class HW18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int elementToSearch;
        int resultBinary;
        int resultLinear;
        int right;
        int mid = 1;

        System.out.println("Enter the number to search since 1 until 20");
        elementToSearch = input.nextInt();

        System.out.println("Welcome User \n Linear Search");

        resultLinear = LinearSearch.search(numbers, elementToSearch);
        System.out.println(elementToSearch + " is found at index: " + resultLinear);

        right = numbers.length - 1;
        resultBinary = BinarySearch.binarySearch(numbers, mid + 1, right, elementToSearch);

        System.out.println("Binary Search");
        System.out.println("Element found at index " + resultBinary);
    }
}

