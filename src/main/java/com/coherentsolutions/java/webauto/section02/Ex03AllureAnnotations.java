package com.coherentsolutions.java.webauto.section02;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;

/**
 * Ex03AllureAnnotations demonstrates the use of various Allure annotations such as @TmsLink, @Issue, and @Description.
 * These annotations help link the test to external systems and provide detailed descriptions in the Allure report.
 */
public class Ex03AllureAnnotations {

    @Test
    @TmsLink("LECOM-32245")
    @Issue("LECOM-32545")
    @Description("This test case verifies the login functionality with valid credentials.")
    public void testValidLogin() {
        System.out.println("Running valid login test...");
        // Test code here
    }
}
