package com.Lesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      //Task1
        System.out.println("Task1:");
        task1();

      // Task2
        System.out.println("\nTask 2");
        task2();

    }

    public static void task1(){
        AnalyzeArray analyzeArray= new AnalyzeArray(new String[]
                {"Banana", "Potato", "Cherry", "Cucumber",
                "Tomato", "Apple", "PineApple", "Orange",
                "Tomato", "Cherry", "Tomato", "Tomato",
                "Strawberry", "Cherry", "Orange"});
        analyzeArray.testArray();

    }

    public static void task2(){
        ContactsBook contactsBook= new ContactsBook();
        contactsBook.add("Grisha","9204000112");
        contactsBook.add("Petya",9510022331L);
        contactsBook.add("Sanya","9386541122");
        contactsBook.add("Grisha","4364812");
        contactsBook.add("Grisha","321237");

        System.out.println(contactsBook.get("Sanya"));
        System.out.println(contactsBook.get("Grisha"));
        System.out.println(contactsBook.get("Dima"));

    }

}
