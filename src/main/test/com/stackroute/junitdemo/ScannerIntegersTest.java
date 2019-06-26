package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScannerIntegersTest {
    ScannerIntegers object;

    @Before
    public void setUp() throws Exception {
    object=new ScannerIntegers();

    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }
    @Test
    public void checkWhetherNumbersAreScannedAndAdded() {
        int result = object.readIntegersAndAddThem(new int[]{10, 20, 30, 0});
        assertEquals(60, result);
    }


}