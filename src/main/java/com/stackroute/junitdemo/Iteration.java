package com.stackroute.junitdemo;
import java.util.*;
public class Iteration {

        public static String displaySeries(int number) {
            String result="";
            Integer.parseInt(String.valueOf(number));
            for(int i=0;i<=number;i++)
            {
                for(int j=0;j<i;j++)
                {
                    result=result+i;
                }
            }
            return result;
        }
    }

