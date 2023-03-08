/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_javaprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rssk1
 */
public class Repetative_words {

    public void count_words(String filepath, Map<String, Integer> words) throws FileNotFoundException {

        Scanner file = new Scanner(new File(filepath));

        String mostrepetatedword = null;
        int mostrepetatedwordcount = 0;

        while (file.hasNext()) {

            String wrd = file.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            Integer count = words.get(wrd);

            if (count != null) {
                count++;
            } else {
                count = 1;
            }

            words.put(wrd, count);

            if (count > mostrepetatedwordcount) {

                mostrepetatedword = wrd;
                mostrepetatedwordcount = count;

            }
        }
        file.close();
        System.out.println("MOST REPETATED WORD : " + mostrepetatedword + ", COUNT : " + mostrepetatedwordcount);

        for (String word : words.keySet()) {
            int count = words.get(word);
            if (count == mostrepetatedwordcount && !word.equals(mostrepetatedword)) {

                System.out.println("MOST REPETATED WORD : " + word + ", COUNT : " + count);

            }

        }

    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Repetative_words rw = new Repetative_words();
        
        Map<String, Integer> words = new HashMap<String, Integer>();
        rw.count_words("C:/Users/rssk1/OneDrive/Desktop/testfile.txt", words);
    }
}
