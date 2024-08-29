package com.coherentsolutions.java.webauto.section01.advanced;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;

/**
 * Ex07AllureAnnotations demonstrates how to use various Allure annotations to enhance test reports.
 * This includes linking to issues, test cases, and adding descriptions.
 */
public class Ex07AllureAnnotations {

    @Test
    @TmsLink("LECOM-32245")
    @Issue("LECOM-32545")
    @Description("This is a test case for the login functionality.")
    public void testLoginWithAllureAnnotations() {
        System.out.println("Running test with Allure annotations...");
        // Test code here
    }
}
