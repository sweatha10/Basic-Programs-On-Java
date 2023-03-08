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
public class swapping_numbers {

    public void swap_nums(int x, int y) {

        System.out.println("BEFORE SWAPPING NUMBERS : " + x + "," + y);// 20,50

        x = x + y;//20+50->70
        y = x - y;//70-50->20
        x = x - y;//70-20->50

        System.out.println("AFTER SWAPPING NUMBERS : " + x + "," + y);//50,20

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE TWO NUMBERS TO BE SWAPPED : ");
        int num1 = scan.nextInt();//20
        int num2 = scan.nextInt();//50

        swapping_numbers swap = new swapping_numbers();
        swap.swap_nums(num1, num2);
    }

}
