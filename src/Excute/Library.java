/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excute;

import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class Library {
    Scanner sc = new Scanner(System.in);
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public  void printArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("");
    }
    public void inArray(int[] mang, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu "+ i +" : ");
            mang[i] = sc.nextInt();
        }
    }
}
