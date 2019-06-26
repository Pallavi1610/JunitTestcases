package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration obj=null;
    @Before
    public void setUp() throws Exception {
    obj=new Iteration();
    }

    @After
    public void tearDown() throws Exception {
    obj=null;
    }

    @Test
    public void givenNumberShouldDisplayLoop() {
        String result=obj.displaySeries(2);
        assertEquals("122",result);

    }
    @Test
    public void givenNumberShouldDisplay() {
        String result= obj.displaySeries(5);
        assertEquals("122333444455555",result);

    }
}