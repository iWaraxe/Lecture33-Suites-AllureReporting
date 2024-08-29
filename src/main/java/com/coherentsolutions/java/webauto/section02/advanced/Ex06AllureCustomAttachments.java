package com.coherentsolutions.java.webauto.section02.advanced;

import io.qameta.allure.Attachment;
import org.testng.annotations.Test;

/**
 * Ex06AllureCustomAttachments demonstrates how to create custom attachments for Allure reports.
 * This class provides an example of attaching binary data (e.g., images, logs) to the report.
 */
public class Ex06AllureCustomAttachments {

    @Test
    public void testWithCustomAttachments() {
        System.out.println("Running test with custom attachments...");
        attachTextLog("Custom log message: Test executed successfully.");
        attachBinaryData("binaryData.bin", new byte[]{0x01, 0x02, 0x03, 0x04});
    }

    /**
     * Attaches a text log to the Allure report.
     *
     * @param message The log message to attach.
     */
    @Attachment(value = "Text Log", type = "text/plain")
    public String attachTextLog(String message) {
        return message;
    }

    /**
     * Attaches binary data to the Allure report.
     *
     * @param fileName The name of the file to be displayed in the report.
     * @param data     The binary data to attach.
     */
    @Attachment(value = "{0}", type = "application/octet-stream")
    public byte[] attachBinaryData(String fileName, byte[] data) {
        return data;
    }
}
