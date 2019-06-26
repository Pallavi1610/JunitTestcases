package com.stackroute.junitdemo;

import java.util.*;
public class NumberGuess {

        public static String guessTheNumber(int[] inputNumber) {
            Scanner scanner = new Scanner(System.in);;
            int target = 30;
            int i=0;
            int number;
            while(true) {
                number = inputNumber[i];
                if(i < inputNumber.length) {
                    if (target > inputNumber[i]) {
                        System.out.println("Number guessed is less than original number");
                    } else if (target < inputNumber[i]) {
                        System.out.println("Number guessed is more than original number");
                    } else {
                        return "Number guessed matches the original number";
                    }
                    i++;
                }
                else {
                    return "Number guessed is not correct";
                }
            }
        }
}