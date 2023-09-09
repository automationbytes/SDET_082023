package org.example;

import org.testng.annotations.Test;

public class Parameters {


    @Test
    @org.testng.annotations.Parameters({"a","b"})
    public void add(int a, int b){
        System.out.println(a+b);
    }

    @Test
    @org.testng.annotations.Parameters({"a","b"})
    public void sub(int a, int b){
        System.out.println(a-b);
    }


}
