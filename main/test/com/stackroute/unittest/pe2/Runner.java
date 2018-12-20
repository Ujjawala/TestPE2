package com.stackroute.unittest.pe2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
    public static void main(String[] arg){
        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
