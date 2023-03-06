package org.example.task2_occurrencesOfStringLetters;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * TASK 2
 *
 * Write a program that accepts a string as input
 * and counts the number of occurrences of each
 * character in the string
 *
 */


public class Occurrences {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String text = scanner.nextLine();
        scanner.close();

        Map<Character,Integer> map = new TreeMap<>();

        for(int i = 0; i < text.length();i++)
        {
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0) +1);
        }

        System.out.println("Character occurrences:");
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" x"+ entry.getValue());
        }

    }
}
