package com.coherentsolutions.java.webauto.section01;

/**
 * Ex04RegressionSuiteXML provides a sample XML configuration for a regression test suite.
 * This XML file specifies the tests that belong to the 'regression' group and are to be executed.
 */
public class Ex04RegressionSuiteXML {

    public static final String REGRESSION_SUITE_XML =
            """
            <!DOCTYPE suite SYSTEM "http://beust.com/testng/testng-1.0.dtd" >
            <suite name="My test suite">
                <test name="testing">
                    <groups>
                        <run>
                            <include name="regression"/>
                        </run>
                    </groups>
                    <classes>
                        <class name="com.coherentsolutions.java.webauto.section01.Ex03RegressionTestSuite" />
                    </classes>
                </test>
            </suite>
            """;

    public static void main(String[] args) {
        System.out.println(REGRESSION_SUITE_XML);
    }
}
