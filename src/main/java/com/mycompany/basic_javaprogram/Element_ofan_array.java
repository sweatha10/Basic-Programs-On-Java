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
public class Element_ofan_array {

    public void duplicate_element(int arr[]) {

        int length = arr.length;
        System.out.println("THE DUPLICATE ELEMENTS : ");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[j]);
                }
            }
        }
    }

    public void largest_element(int arr[]) {

        int max = arr[0];
        int length = arr.length;

        for (int i = 1; i < length; i++) {

            if (arr[i] > max) {

                max = arr[i];

            }
        }

        System.out.println("LARGEST ELEMENT IN THE ARRAY : " + max);

    }

    public void scnd_largst_elemnt(int arr[]) {

        int t;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i] < arr[j]) {

                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;

                }
            }
        }

        System.out.println("SECOND LARGEST ELEMENT : " + arr[length - 2]);

    }

    public void smallest_element(int arr[]) {

        int min = arr[0];
        int length = arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];

            }
        }

        System.out.println("SMALLEST ELEMENT IN THE ARRAY : " + min);

    }

    public void secnd_smllst_elemnt(int arr[]) {

        int t;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;

                }
            }
        }

        System.out.println("SECOND SMALLEST ELEMENT : " + arr[1]);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE NUMBERS OF ELEMENTS : ");

        int n = scan.nextInt();

        int element[] = new int[n];

        System.out.println("ENTER THE ELEMENTS OF AN ARRAY : ");

        for (int i = 0; i < n; i++) {

            element[i] = scan.nextInt();

        }

        Element_ofan_array elmnt = new Element_ofan_array();
        elmnt.duplicate_element(element);
        elmnt.largest_element(element);
        elmnt.smallest_element(element);
        elmnt.secnd_smllst_elemnt(element);
        elmnt.scnd_largst_elemnt(element);

        scan.close();
    }
}
