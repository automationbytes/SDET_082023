package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Eg {


    @DataProvider(name = "singleDP")
    public Object[][] singleDPMethd(){
        return new Object[][]{{10},{3}};
    }


    @Test(dataProvider = "singleDP")
    public void num(int a){
        System.out.println(a);
    }



    @DataProvider(name = "MultiDP")
    public Object[][] MultiDPMethd(){
        return new Object[][]{{10,3},{5,5}};
    }


    @Test(dataProvider = "MultiDP")
    public void add(int a, int b){
        System.out.println(a+b);
    }

}
