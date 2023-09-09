package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Eg {
    @Test(priority = 1)
    public void one(){
        Assert.assertNotEquals(2,7);
        System.out.println("Test one");
    }

    @Test (dependsOnMethods = "one")
    public void two(){
        Assert.assertTrue(1==2);
        System.out.println("Test two");
    }


    @Test (dependsOnMethods = "one")
    public void three(){
        System.out.println("Test three");
    }

    @Test (dependsOnMethods = "one")
    public void four(){
        System.out.println("Test four");
    }

}
