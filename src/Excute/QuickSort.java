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
public class QuickSort extends ArrayAlgorithm{
    
    public QuickSort(int[] array) {
        super(array);
    }
    
    public int excuteQuickSort(int[] arr, int low, int high){
        
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                ++i;
                Library.swap(arr, i, j);
            }
        }
        ++i;
        Library.swap(arr, i, high);

        return i;
    }
    public  void QuickSort(int arr[], int low, int high) {
        if(low >= high){
            return;
        }
        int pivot = excuteQuickSort(arr, low, high);
        QuickSort(arr, low, pivot - 1);
        QuickSort(arr, pivot + 1, high);
    }
    
}
