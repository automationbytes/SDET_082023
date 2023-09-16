package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    public static int max = 2;
    public static int count = 0;

    public boolean retry(ITestResult iTestResult){
        if(iTestResult.getThrowable() != null && count < max){
           count++;
           return true;
        }
        return false;
    }

    public static int getCount(){
        return count;
    }
}
