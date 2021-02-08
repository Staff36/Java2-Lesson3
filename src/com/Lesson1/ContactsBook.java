package com.Lesson1;

import java.util.*;

public class ContactsBook {
    private final Map<String, Set<String>> contactBook= new HashMap<>();
    public void add(String name, String phoneNumber){
        if(!contactBook.containsKey(name.toLowerCase())){
            contactBook.put(name.toLowerCase(), new HashSet<String>());
        }
        contactBook.get(name.toLowerCase()).add(phoneNumber);

    }
    public void add(String name, Long phoneNumber){
        this.add(name,phoneNumber.toString());
    }

    public Set<String> get(String name){
      if (contactBook.containsKey(name.toLowerCase()))
        return contactBook.get(name.toLowerCase());
      else
        return Collections.emptySet();
    }

}
