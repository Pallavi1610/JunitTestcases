package com.stackroute.junitdemo;

import java.util.*;
public class VowelConsonantCheck {


    public static String lettercheck(String word) {
        String str = "";
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char character = word.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                str = str.concat("Vowel");
            } else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
                str = str.concat("Consonant");

            else
                str = str.concat("error because it is digit");
        }
     return str;
    }

}

