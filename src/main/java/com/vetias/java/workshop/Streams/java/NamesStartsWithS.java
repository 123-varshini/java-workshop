package com.vetias.java.workshop.Streams.java;
import java.util.ArrayList;
import java.util.List;

public class NamesStartsWithS {

    public static void main(String[]args){
        List<String> names=new ArrayList<>();
        names.add("ram");
        names.add("raja");
        names.add("ramya");
        names.add("rahul");
        names.add("sam");
        names.add("soni");
        //long nameCount=names.stream().filter(name-> name.startsWith ("s")).count();
        //System.out.println(nameCount); 
        name.stream().filter(name-> name.startswith("s")|| name.startsWith("s")
        .distinct().map(String:: toUpperCase).foreach(System.out::println));
        System.out.println(names);  
    }

}
