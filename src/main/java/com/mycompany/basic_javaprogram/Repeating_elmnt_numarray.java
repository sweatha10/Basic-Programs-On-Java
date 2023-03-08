/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_javaprogram;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rssk1
 */
public class Repeating_elmnt_numarray {
    
    public void find_Rpting_Elmnt(int arr[]) {
        
        HashSet<Integer> repeating = new HashSet<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    
                    repeating.add(arr[i]);
                    
                }
            }
        }
        
        if (repeating.size() > 0) {
            
            System.out.println("REPEATING ELEMENTS : ");
            for (int elemnt : repeating) {
                
                System.out.println(elemnt);
                
            }
        }else{
            
            System.out.println("NO REPEATING INTEGER FOUND");
            
        }
     }
    
    public static void main(String[] args) {
        
        Repeating_elmnt_numarray repeat = new Repeating_elmnt_numarray();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ENTER THE SIZE OF THE ARRAY : ");
        int size = scan.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY : ");
        for (int i = 0; i < size; i++) {
            
             arr[i] = scan.nextInt();
            
        }
        
        repeat.find_Rpting_Elmnt(arr);
        
        scan.close();
        
    }
    
}
