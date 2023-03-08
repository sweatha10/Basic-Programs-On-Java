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
public class Basic_calculator {

    public void calculator() {

        double num1, num2, ans;
        int operators;

        Scanner scan = new Scanner(System.in);

        System.out.println("1.Addition '+'");
        System.out.println("2.Subraction '-'");
        System.out.println("3.Multiplication '*'");
        System.out.println("4.Division '/'");

        System.out.println("Enter A Number From 1-4 : ");
        operators = scan.nextInt();

        System.out.println("Enter The First Number : ");
        num1 = scan.nextDouble();

        System.out.println("Enter The Second Number : ");
        num2 = scan.nextDouble();

        switch (operators) {
            case 1:
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);

                break;

            case 2:
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);

                break;

            case 3:
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);

                break;

            case 4:
                ans = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + ans);

                break;

            default:
                System.out.println("Invalid Operator");
        }

        scan.close();

    }

    public static void main(String[] args) {

        Basic_calculator calc = new Basic_calculator();
        calc.calculator();

    }

}
