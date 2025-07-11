package com.vetias.java.workshop.Streams;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;



public class EvenOddSplitExamples {
    public static void main (String[]args){
        List<Integer> numbers= Arrays.asList(10,11,12,13,14,15,16);
        Map<Boolean, List<Integer>> groupedMap= numbers.stream()
        .collect(Collectors.partitioningBy(no ->no%2==0));

        System.out.println("Even Number"+ groupedMap.get(true));
        System.out.println("Odd Number"+ groupedMap.get(false));



    }

}
