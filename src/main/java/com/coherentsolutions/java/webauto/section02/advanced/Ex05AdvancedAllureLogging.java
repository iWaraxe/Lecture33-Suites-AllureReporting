package com.coherentsolutions.java.webauto.section02.advanced;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Ex05AdvancedAllureLogging demonstrates advanced Allure features such as logging text and capturing additional attachments.
 * This class shows how to attach plain text and files to an Allure report.
 */
public class Ex05AdvancedAllureLogging {

    @BeforeMethod
    public void setUp() {
        System.out.println("Setting up test environment...");
        Allure.step("Test environment setup complete");
    }

    @Test
    public void testWithAdvancedLogging() {
        System.out.println("Running a test with advanced Allure logging...");
        logAdditionalInfo("Test started successfully");
        Allure.addAttachment("Important Log", "text/plain", createInputStream("This is a critical log entry."), ".txt");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down test environment...");
        Allure.step("Test environment teardown complete");
    }

    /**
     * Logs additional info to Allure report.
     *
     * @param message The message to log.
     */
    private void logAdditionalInfo(String message) {
        Allure.addAttachment("Additional Info", message);
    }

    /**
     * Creates an InputStream from a string for attachment to an Allure report.
     *
     * @param content The content to convert to InputStream.
     * @return InputStream containing the content.
     */
    private InputStream createInputStream(String content) {
        return new ByteArrayInputStream(content.getBytes());
    }
}
