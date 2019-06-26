package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionCheckTest {
    ConditionCheck obj=null;

    @Before
    public void setUp() throws Exception {
        obj=new ConditionCheck();

    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void givenEvenNumberShouldReturnJerry()
    {
        String result=obj.action(28);

    }
    @Test
    public void givenOddNumberShouldReturnTom()
    {
        String result=obj.action(21);

    }
    @Test
    public void givenNumberOutOfRangeShouldReturnMessage()
    {
        String result=obj.action(32);

    }

}