package com.coherentsolutions.java.webauto.section01.advanced;

import com.coherentsolutions.java.webauto.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;

/**
 * Ex06AdvancedTestListener demonstrates the implementation of a TestNG listener that captures screenshots
 * on test failure, which is useful for reporting with Allure.
 */
@Listeners(Ex06AdvancedTestListener.TestListener.class)
public class Ex06AdvancedTestListener {

    WebDriver driver; // Assume WebDriver is initialized

    @Test
    public void testThatFails() {
        System.out.println("Running a test that will fail...");
        // Code that causes the test to fail
        throw new RuntimeException("Test failure simulation");
    }

    public static class TestListener implements ITestListener {

        @Override
        public void onTestFailure(ITestResult result) {
            takeScreenshot();
        }

        @Attachment(value = "Page Screenshot", type = "image/png")
        private byte[] takeScreenshot() {
            return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        }
    }
}
