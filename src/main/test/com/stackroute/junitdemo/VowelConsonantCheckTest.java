package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantCheckTest {
    VowelConsonantCheck obj=null;
    @Before
    public void setUp() throws Exception {
        obj=new VowelConsonantCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;

    }
    @Test
    public void givenCheckForVowelConsonant()
    {
        String result=obj.lettercheck("ap");
        assertEquals("VowelConsonant",result);
    }
    @Test
    public void givenCheckForVowel()
    {
        String result=obj.lettercheck("a");
        assertEquals("Vowel",result);
    }
    @Test
    public void givenCheckForConsonant()
    {
        String result=obj.lettercheck("l");
        assertEquals("Consonant",result);
    }

}