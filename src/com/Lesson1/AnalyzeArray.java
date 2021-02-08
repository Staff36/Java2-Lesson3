package com.Lesson1;

import java.util.*;

public class AnalyzeArray {
    private String[] stringArray;
   public AnalyzeArray(String...fruits){
       this.stringArray= fruits;
   }
    public void testArray() {
        System.out.println("Start array is: ");
        System.out.println(Arrays.toString(stringArray));
        System.out.println("\n Display unique values of array: ");
        displayUniqueValuesOfArray(this.stringArray);
        System.out.println("\n Display numbers of all words: ");
        displayCounterOfAllWords(this.stringArray);
    }

    public void displayUniqueValuesOfArray(String[] strings){
        Set<String> mySet= new TreeSet<>();
        for (int i = 0; i < strings.length; i++) {
            mySet.add(strings[i]);
        }
        System.out.println(mySet.toString());
    }

    public void displayCounterOfAllWords(String[] strings){
        Map<String,Integer> myMap= new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!myMap.containsKey(strings[i])){
                myMap.put(strings[i],1);}
            else {
                myMap.put(strings[i],(myMap.get(strings[i])+1));
            }
        }
        System.out.println(myMap.toString());
    }
}
