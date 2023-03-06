package org.example.task1_listOfIntegersSorted;


import java.util.*;

/**
 * TASK 1
 *
 * Write a program that reads in a list
 * of integers and outputs the highest
 * and lowest numbers in the list
 *
 */

public class LowestAndHighestInteger {


    public static void main(String[] args) {
        List<Integer> unsortedList = new ArrayList<>();

        Random random = new Random();
        for(int i = 0;i<10;i++)
        unsortedList.add(random.nextInt(1,1000));

        unsortedList.stream()
                .forEach(i -> System.out.println(i));

        Map<Integer, Integer> map = new TreeMap<>();

        for(Integer i:unsortedList){
            map.put(i,i);
        }

        List<Integer> sortedList = new ArrayList<>(map.values());

        System.out.println("Lowest number: " + sortedList.get(0) + ", Highest number: " + sortedList.get(sortedList.size()-1));

    }
}
