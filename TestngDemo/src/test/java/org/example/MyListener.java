package org.example;

import org.testng.IExecutionListener;

public class MyListener  implements IExecutionListener {


    public void onExecutionStart(){
        System.out.println("Execution Started: "+ System.currentTimeMillis());
    }



    public void onExecutionFinish(){
        System.out.println("Execution Completed: "+ System.currentTimeMillis());
    }



}
