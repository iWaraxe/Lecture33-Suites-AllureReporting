package com.coherentsolutions.java.webauto.section01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Ex03RegressionTestSuite demonstrates how to configure a regression test suite using TestNG.
 * The test methods in this suite are grouped under the 'regression' group.
 */
public class Ex03RegressionTestSuite {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.out.println("Setting up test environment...");
    }

    @Test(groups = "regression")
    public void testLogin() {
        System.out.println("Running regression test for Login...");
        // Test code here
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("Tearing down test environment...");
    }
}
