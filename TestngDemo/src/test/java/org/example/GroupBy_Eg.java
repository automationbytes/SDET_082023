package org.example;

import org.testng.annotations.Test;

public class GroupBy_Eg {


    @Test(priority = 1,groups = {"Regression"})
    public void one(){
        System.out.println("Test one");
    }

    @Test (priority = 2)
    public void two(){
        System.out.println("Test two");
    }


    @Test (priority = 3)
    public void three(){
        System.out.println("Test three");
    }

    @Test (priority = 4,groups = {"Regression"})
    public void four(){
        System.out.println("Test four");
    }

}
