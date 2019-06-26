package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetermineCharacterTest {
    DetermineCharacter obj=null;
    @Before
    public void setUp() throws Exception {
        obj=new DetermineCharacter();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void checkTheCapitalInputCharacter() {
        String result = obj.determineGivenCharacter('Z');

        assertEquals("Capital Letter", result);
    }

    @Test
    public void checkTheSymbolInputCharacter() {
        String result = obj.determineGivenCharacter('#');

        assertEquals("Special Symbol", result);
    }

}