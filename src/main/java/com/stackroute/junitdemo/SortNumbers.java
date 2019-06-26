package com.stackroute.junitdemo;

import java.util.Arrays;

public class SortNumbers {
    public static String sortNumbersAndAddEvenNumber(String inputString) {
        int sumOfNumbers = 0;
        char[] inputStringArray = inputString.toCharArray();
        Arrays.sort(inputStringArray);
        String order = new String(inputStringArray);
        StringBuilder stringBuilder = new StringBuilder(order);
        order = stringBuilder.reverse().toString();
        System.out.println("Sorted number in non-increasing order : " + order);
        for(int i=0; i<order.length(); i++) {
            if((Character.getNumericValue(order.charAt(i))%2) == 0) {
                sumOfNumbers = sumOfNumbers + Character.getNumericValue(order.charAt(i));
            }
        }
        System.out.println("Sum of even numbers : " + sumOfNumbers);
        if(sumOfNumbers > 15) {
            return "True";
        }
        else {
            return "False";
        }
    }
}
