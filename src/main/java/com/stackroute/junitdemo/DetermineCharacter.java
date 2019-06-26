package com.stackroute.junitdemo;
import java.util.*;
public class DetermineCharacter {

    public static String determineGivenCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return "Capital Letter";

        else if (ch >= 'a' && ch <= 'z')
            return "Small Letter";
        else if (ch >= '0' && ch <= '9')
            return "digit";
        else
            return "Special Symbol";
    }
}
