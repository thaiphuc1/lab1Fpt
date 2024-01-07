/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author thaip
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import Excute.BinarySearch;
import Excute.BubbleSort;
import View.Menu;
import java.util.Scanner;
import Excute.Library;
import Excute.LinearSearch;
import Excute.QuickSort;
/**
 *
 * @author thaip
 */
public class Main extends Menu<String>{
    private static String[] mc={"Sort", "Search","Exit"};
    Library lib = new Library();
    Scanner sc = new Scanner(System.in);
    public Main() {
        super("Algorithm",mc);
        
    }
    
    public static void main(String[] args) {
        
        new Main().run();
    }
    
    @Override
    public void execute(int ch) {
         if (ch == 3) {
            System.out.println("Thoat Chuong trinh!");
            System.exit(0);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kick thuoc cua mang : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if (ch == 1 || ch == 2) {
            
            lib.inArray(arr, n);
        }
        switch(ch) {
            case 1: sort(arr, n);break;
            case 2: search(arr, n); break;
            
        }
    }
    
    public void sort(int[] arr, int n){
         String[] mcs={"Bubble Sort", "Quick Sort"};
        Menu smenu= new Menu("Pick your choice : ",mcs){
            @Override
            public void execute(int ch) {
                
                switch(ch) {
                    case 1: bubbleSort(arr, n); break;
                    case 2: quickSort(arr, n); break;
                    
        }
            }
            
        };
        smenu.run();
    }
    
    public void search(int[] arr, int n){
        String[] mcs={"Linear Search", "Binary Search"};
        Menu smenu= new Menu("Pick your choice : ",mcs){
            @Override
            public void execute(int ch) {
                switch(ch) {
                    case 1: linearSearch(arr, n);break;
                    case 2: binarySearch(arr, n);break;
        }
            }
            
        };
        smenu.run();
    }
    
    
    public void quickSort(int[] arr, int n){
        
        QuickSort quick = new QuickSort(arr);
        quick.QuickSort(arr, 0, n - 1);
        System.out.println("");
        System.out.println("Mang sau khi duoc sap xep : ");
        lib.printArr(arr);
        System.out.println();
    }
    
    
    public void bubbleSort(int[] arr, int n){
        
        BubbleSort bs = new BubbleSort(arr);
        bs.bubbleSort(arr);
        System.out.println("");
        System.out.println("Mang sau khi duoc sap xep : ");
        lib.printArr(arr);
        System.out.println();
    }
    
    public void linearSearch(int[] arr, int n){
        System.out.println("Nhap so muon tim : ");
        int k = sc.nextInt();
        LinearSearch ls = new LinearSearch(arr);
        int result = ls.LinearSearch(k, n, arr);
        lib.printArr(arr);
        System.out.println("Phan tu can tim o vi tri so : " + result);
    }
    
    public void binarySearch(int[] arr, int n){
        quickSort(arr, n);
        System.out.println("Nhap so muon tim : ");
        int x = sc.nextInt();
        lib.printArr(arr);
        BinarySearch bins = new BinarySearch(arr);
        int result = bins.binarySearch(x, 0, n, arr);
        System.out.println("Phan tu can tim o vi tri so : " + result);
    }
    
    
}

