package PTTKYC.MilkTea;

import PTTKYC.MilkTea.Test.AllTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful()?"SUCCESS\n" + result.getRunCount() + " test cases passed":"FAILURE\n" + result.getFailureCount() + " failed");
    }
}