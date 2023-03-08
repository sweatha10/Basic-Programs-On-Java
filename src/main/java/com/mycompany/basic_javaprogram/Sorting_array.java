/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_javaprogram;

import java.util.Scanner;

/**
 *
 * @author rssk1
 */
public class Sorting_array {
    
    public void scnd_largst_elemnt(int arr[]) {
        
        int a;
        int length = arr.length;
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i] < arr[j]) {
                    
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                    
                }
            }
        }
        
        System.out.println("SECOND LARGEST ELEMENT : " + arr[length - 2]);
        
    }
    
    public void secnd_smllst_elemnt(int arr[]) {
        
        int a;
        int length = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                    
                }
            }
        }
        
        System.out.println("SECOND SMALLEST ELEMENT : " + arr[1]);
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBERS OF ELEMENTS : ");
        
        int n = input.nextInt();
        int array[] = new int[n];
        
        System.out.println("ENTER THE ELEMENTS OF AN ARRAY : ");
        
        for (int i = 0; i < n; i++) {
            
            array[i] = input.nextInt();
            
        }
        
        Sorting_array sa = new Sorting_array();
        sa.secnd_smllst_elemnt(array);
        sa.scnd_largst_elemnt(array);
        
    }
    
}
