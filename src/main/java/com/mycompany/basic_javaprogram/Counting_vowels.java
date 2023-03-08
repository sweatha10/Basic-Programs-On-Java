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
public class Counting_vowels {

    public int count_vowel(String input) {

        int vcount = 0;
        int ccount = 0;

        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                vcount++;

            } else if (c >= 'a' && c <= 'z') {

                ccount++;

            }

        }

        System.out.println("NUMBER OF VOWELS : " + vcount);
        System.out.println("NUMBER OF CONSONANTS : " + ccount);

        return vcount;
    }

    public String last_Nvowels(String input, int n) {

        StringBuilder vowels = new StringBuilder();
        int count = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                vowels.append(c);
                count++;
                if (count == n) {

                    break;

                }
            }
        }

        if (count < n) {

            return "NUMBER OF VOWELS MISMATCH!!!!";

        }

        return vowels.reverse().toString();

    }

    public static void main(String[] args) {

        Counting_vowels vowel = new Counting_vowels();

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE SENTENCE : ");
        String input = scan.nextLine();

        System.out.println("ENTER THE NUMBER OF VOWELS TO RETRIVE : ");
        int n = scan.nextInt();

        vowel.count_vowel(input);
        String result = vowel.last_Nvowels(input, n);
        System.out.println("LAST " + n + " VOWELS : " + result);

        scan.close();
    }
}
