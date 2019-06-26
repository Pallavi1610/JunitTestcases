package com.stackroute.junitdemo;

        import java.util.*;
public class RepeatSubstring {

    public static String doRepetition(String word1, int number1) {
        int len=word1.length();
        String str1=word1.substring(len-number1,len);
        return word1.concat(str1.repeat(number1));
    }
}

