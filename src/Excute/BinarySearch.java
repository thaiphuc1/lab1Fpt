/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excute;

import Model.ArrayAlgorithm;

/**
 *
 * @author thaip
 */
public class BinarySearch extends ArrayAlgorithm{
    
    public BinarySearch(int[] array) {
        super(array);
    }
    
    public  int binarySearch(int x, int l, int r, int[] arr) {       
        if (r >= l) {
            int m = l + (r - l) / 2;
                if (x == arr[m]) {
                    if (m == arr.length - 1 || arr[m + 1] != x) {
                         return m;
                    }
        }
        if (x > arr[m]) {
            return binarySearch(x, m + 1, r, arr);
        } else if (x < arr[m]) {
            return binarySearch(x, l, m - 1, arr);
        }
        }
         return -1;
    } 
    
}
