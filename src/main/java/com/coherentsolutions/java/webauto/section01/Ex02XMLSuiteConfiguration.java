package com.coherentsolutions.java.webauto.section01;

/**
 * Ex02XMLSuiteConfiguration provides a sample XML configuration for TestNG to run specific test methods grouped by their names.
 * This XML configuration can be used to control which methods are executed during the test run.
 */
public class Ex02XMLSuiteConfiguration {

    public static final String TEST_SUITE_XML =
            """
            <!DOCTYPE suite SYSTEM "http://beust.com/testng/testng-1.0.dtd" >
            <suite name="My test suite">
              <test name="testing">
                  <groups>
                  <run>
                    <include name="method1"/>
                  </run>
                </groups>
                <classes>
                   <class name="com.coherentsolutions.java.webauto.section01.Ex01TestGrouping" />
                </classes>
              </test>
            </suite>
            """;

    public static void main(String[] args) {
        System.out.println(TEST_SUITE_XML);
    }
}
