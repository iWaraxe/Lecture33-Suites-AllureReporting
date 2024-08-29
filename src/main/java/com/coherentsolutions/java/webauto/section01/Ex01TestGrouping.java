package com.coherentsolutions.java.webauto.section01;

import org.testng.annotations.Test;

/**
 * Ex01TestGrouping demonstrates the basic concept of grouping test methods using TestNG.
 * It shows how to group methods and execute them together in a test suite.
 */
public class Ex01TestGrouping {

    @Test(groups = "method1")
    public void testingMethod1() {
        System.out.println("Method - testingMethod1()");
    }

    @Test(groups = "method2")
    public void testingMethod2() {
        System.out.println("Method - testingMethod2()");
    }

    @Test(groups = "method1")
    public void testingMethod1_1() {
        System.out.println("Method - testingMethod1_1()");
    }

    @Test(groups = "method4")
    public void testingMethod4() {
        System.out.println("Method - testingMethod4()");
    }
}
