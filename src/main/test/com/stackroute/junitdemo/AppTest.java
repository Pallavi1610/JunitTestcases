package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
 App app;
    @Before
    public void setUp() throws Exception {
        System.out.println("Inside before");
        app=new App();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        app=null;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AfterClass");

    }

    @Test
    public void concatAndConvertString() {
    }
    @Test
    public void givenTwoStringsShouldReturnConcatenatedUpperString()
    {
        //arrange

        //act
        String result=app.concatAndConvertString("Hello","Pallavi");
        //assert
        assertEquals("HELLOPALLAVI",result);

    }
    @Test
     public void givenTwoNullShouldReturnErrorMessage()
    {

        String result=app.concatAndConvertString(null,null);
        assertEquals("null not allowed",result);

    } @Test
    public void givenOneNullOneStringShouldReturnConcatenatedString()
    {

        String result=app.concatAndConvertString("Hello",null);
        assertEquals("HELLO",result);

    }

}