package com.vetias.java.workshop.Streams;
import java.util.Arrays;
import java.util.List;


public class Arraystream {
    public static void main(String[]args){
        int[] marks={90,98,89,76,80};
        long numberOfSubjectsPassed =Arrays.stream(marks)
        .filter (mark -> mark >80).count();
        System.out.println(numberOfSubjectsPassed);

    }

}
