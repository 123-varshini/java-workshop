package com.vetias.java.workshop.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfMarks {
    public static void main(String[]args){
        List<Integer>marks=new ArrayList<>();
        marks.add(80);
        marks.add(90);
        marks.add(70);
        marks.add(60);
        marks.add(50);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println("marks in ascending order:"+ marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("marks in decending order :"+marks);
        System.out.println("hightest mark"+marks.getFirst());

    }

}
