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
public class LinearSearch extends ArrayAlgorithm{
    
    public LinearSearch(int[] array) {
        super(array);
    }
    public int LinearSearch(int k, int n, int[] arr){
        for (int i = 0; i < n; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}
