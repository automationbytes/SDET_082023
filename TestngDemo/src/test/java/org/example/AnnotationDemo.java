package org.example;

import org.testng.annotations.*;

public class AnnotationDemo {


    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }



    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }


    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }



    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }


    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }



    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }



    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }

}
