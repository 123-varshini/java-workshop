package com.vetias.java.workshop.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExamples {

    public static void main(String[]args){
        List<String> names=new ArrayList<>();
        names.add("ram");
        names.add("raja");
        names.add("ramya");
        names.add("rahul");
        names.add("sam");
        names.add("soni");
        System.out.println(names);
        names.set(1,"krishna");
        names.forEach(System.out::println);
        names.sort(Comparator.reverseOrder());
            
        System.out.println(names);
    }
}
