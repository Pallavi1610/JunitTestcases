package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
Palindrome object;
    @Before
    public void setUp() throws Exception {
        object=new Palindrome();

    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void checkWhetherTheSumIsLess() {
        String result = object.isPalindrome("98566589");

        assertEquals("String is palindrome and sum of even numbers is greater than 25", result);
    }

    @Test
    public void checkWhetherTheSumIsGreater() {
        String result = object.isPalindrome("123321");

        assertEquals("String is palindrome and sum of even numbers is less than 25", result);


    }

    @Test
    public void checkWhetherTheStringIsPalindrome() {
        String result = object.isPalindrome("123456");
        assertEquals("String is not palindrome", result);
    }

}