package com.coherentsolutions.java.webauto.section01.advanced;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

/**
 * Ex08StepAnnotation demonstrates the use of the @Step annotation from Allure to log individual test steps.
 * This makes it easier to understand what each part of the test is doing when viewing the report.
 */
public class Ex08StepAnnotation {

    @Test
    public void testWithSteps() {
        openLoginPage();
        enterCredentials("user", "password");
        submitLogin();
        verifyLoginSuccess();
    }

    @Step("Open login page")
    private void openLoginPage() {
        System.out.println("Opening login page...");
        // Code to open login page
    }

    @Step("Enter credentials: {0}, {1}")
    private void enterCredentials(String username, String password) {
        System.out.println("Entering credentials...");
        // Code to enter username and password
    }

    @Step("Submit login form")
    private void submitLogin() {
        System.out.println("Submitting login form...");
        // Code to submit login
    }

    @Step("Verify login success")
    private void verifyLoginSuccess() {
        System.out.println("Verifying login success...");
        // Code to verify login was successful
    }
}
