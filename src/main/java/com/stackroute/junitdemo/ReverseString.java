package com.stackroute.junitdemo;

import java.util.*;

public class ReverseString {

    public static String reverse(String word1)
    {

    char[] reverse = word1.toCharArray();
    String reverseword = "";
    for (int i = reverse.length-1; i>=0; i--)
        reverseword = reverseword + reverse[i];
    return reverseword;
    }
}
