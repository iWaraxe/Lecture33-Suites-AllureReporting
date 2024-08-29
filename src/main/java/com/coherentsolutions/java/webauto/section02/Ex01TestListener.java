package com.coherentsolutions.java.webauto.section02;

import com.coherentsolutions.java.webauto.DriverManager;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Ex01TestListener demonstrates how to create a TestNG listener to capture screenshots when a test fails.
 * This listener is useful for generating detailed Allure reports.
 */
public class Ex01TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    /**
     * Captures a screenshot and attaches it to the Allure report.
     *
     * @return A byte array containing the screenshot in PNG format.
     */
    @Attachment(value = "Page Screenshot", type = "image/png")
    private byte[] takeScreenshot() {
        // Assuming 'DriverManager' is a utility class that provides the WebDriver instance.
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
