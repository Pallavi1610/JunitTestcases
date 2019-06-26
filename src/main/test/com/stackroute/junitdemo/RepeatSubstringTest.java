package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatSubstringTest {
    RepeatSubstring obj=null;
    @Before
    public void setUp() throws Exception {

   obj=new RepeatSubstring();

    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test

       public void givenStringShouldReturnRepeatedSubString()
        {
            String result=obj.doRepetition("Pallavi",2);
            assertEquals("Pallavivivi",result);
        }
        @Test
    public void givenStringwithSpacesShouldReturnRepeatedSubString()
    {
        String result=obj.doRepetition("Pallav i",2);
        assertEquals("Pallav i i i",result);
    }

}