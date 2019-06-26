package com.stackroute.junitdemo;
import java.util.*;
public class ConditionCheck {
    public static String action(int number1) {

        if (number1 % 2 != 0 && number1 >= 20 && number1 <= 30)
        {
            return "Tom";
        } else if (number1 % 2 == 0 && number1 >= 20 && number1 <= 30)
        {
            return "Jerry";
        } else
            {
            return "Number is not in the 20-30 range";

        }

    }


}
