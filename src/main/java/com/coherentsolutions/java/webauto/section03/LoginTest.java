package com.coherentsolutions.java.webauto.section03;

import com.coherentsolutions.java.webauto.section03.baseclasses.TestBase;
import com.coherentsolutions.java.webauto.section03.baseclasses.TestConfig;
import io.qameta.allure.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

@Epic("Yahoo Login")
@Feature("User Login")
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class LoginTest extends TestBase {

    private static final String USER_NAME = TestConfig.getUsername();
    private static final String PASSWORD = TestConfig.getPassword();
    private static final String LOGIN_PAGE_URL = TestConfig.getUrl();

    private static final String EXPECTED_ERROR_MESSAGE_TEXT = "Please provide password.";
    private static final String INCORRECT_PASSWORD_ERROR_MESSAGE_TEXT = "Invalid password. Please try again";
    private static final String EMPTY_USER_NAME_ERROR_MESSAGE_TEXT = "Sorry, we don't recognize this email.";
    private static final String EXPECTED_TITLE = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

    private UserAccountPage userAccountPage;
    private LoginPage loginPage;

    @BeforeMethod
    @Step("Opening Yahoo Login page")
    public void setUpTest() {
        open(LOGIN_PAGE_URL);
        loginPage = new LoginPage();
    }

    @Test(enabled = false)
    @Description("Test to verify successful login")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest() {
        loginPage.inputUserName(USER_NAME);
        loginPage.clickLoginButton();
        loginPage.inputUserPassword(PASSWORD);
        userAccountPage = loginPage.clickPasswordFormLoginButton();
        Assert.assertTrue(userAccountPage.isDisplayedMailLink(), "User Account page is not displayed");
    }

    @Test
    @Description("Test to verify error message when password is not provided")
    @Severity(SeverityLevel.NORMAL)
    public void emptyPasswordTest() {
        loginPage.inputUserName(USER_NAME);
        loginPage.clickLoginButton();
        loginPage.inputUserPassword("");
        userAccountPage = loginPage.clickPasswordFormLoginButton();
        String actualErrorText = loginPage.getEmptyPasswordErrorMessage();
        Assert.assertEquals(actualErrorText, EXPECTED_ERROR_MESSAGE_TEXT);
    }

    @Test
    @Description("Test to verify error message with incorrect password")
    @Severity(SeverityLevel.NORMAL)
    public void incorrectPasswordTest() {
        loginPage.inputUserName(USER_NAME);
        loginPage.clickLoginButton();
        loginPage.inputUserPassword(RandomStringUtils.randomAlphabetic(10));
        userAccountPage = loginPage.clickPasswordFormLoginButton();
        String actualErrorText = loginPage.getIncorrectPasswordErrorMessage();
        Assert.assertEquals(actualErrorText, INCORRECT_PASSWORD_ERROR_MESSAGE_TEXT);
    }

    @Test
    @Description("Test to verify error message when username is not provided")
    @Severity(SeverityLevel.NORMAL)
    public void emptyUserNameFieldTest() {
        loginPage.clickLoginButton();
        String actualErrorText = loginPage.getInvalidUserNameErrorMessage();
        Assert.assertEquals(actualErrorText, EMPTY_USER_NAME_ERROR_MESSAGE_TEXT);
    }
}
