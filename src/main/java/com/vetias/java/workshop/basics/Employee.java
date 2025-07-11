package com.vetias.java.workshop.basics;


import java.util.Arrays;

public class Employee {
    
    public static void main(String[] args) {
        
        String[][] empDetails = new String[5][2];
        empDetails[0][0] = "saran";
        empDetails[0][1] = "10000000";  
        empDetails[1][0] = "manoj";
        empDetails[1][1] = "10000000";   
        empDetails[2][0] = "bhithun";
        empDetails[2][1] = "20000000";
        empDetails[3][0] = "varsha";
        empDetails[3][1] = "50000000";
        empDetails[4][0] = "nithish";
        empDetails[4][1] = "1000000";

        for(String[] employee : empDetails) {
              System.out.println(Arrays.toString(employee));
        }
    }
}

