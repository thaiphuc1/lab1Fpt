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
public class BubbleSort extends ArrayAlgorithm{
    
    public BubbleSort(int[] array) {
        super(array);
    }
    
    public  void bubbleSort(int[] arr){
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    Library.swap(arr, i, i + 1);
                    flag = true;
                }
            }
        } while (flag);
        
    }
    
}
