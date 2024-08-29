package com.coherentsolutions.java.webauto.section02;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Ex02LoginTestWithListener demonstrates how to use the TestListener created to capture screenshots on test failure.
 * The listener is attached using the @Listeners annotation.
 */
@Listeners(Ex01TestListener.class)
public class Ex02LoginTestWithListener {

    @Test
    public void testLoginFailure() {
        System.out.println("Running login test that will fail...");
        // Simulate a failure
        throw new RuntimeException("Login test failed!");
    }
}
