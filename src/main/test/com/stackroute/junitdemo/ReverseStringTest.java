package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.String;
import static org.junit.Assert.*;

public class ReverseStringTest {
ReverseString str=null;
    @Before
    public void setUp() throws Exception {
        str=new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        str=null;
    }
    @Test
    public void givenStringShouldReturnReverseString()
    {
        String rev = str.reverse("GOOGLE");
        assertEquals("ELGOOG",rev);
    }
    @Test
    public void givenStringWithSpacesShouldReturnReverseString()
    {
        String rev = str.reverse("Hello world @ the ");
        assertEquals(" eht @ dlrow olleH",rev);
    }
}