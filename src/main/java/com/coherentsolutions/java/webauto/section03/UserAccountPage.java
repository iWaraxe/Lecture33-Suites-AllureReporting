package com.coherentsolutions.java.webauto.section03;

import com.codeborne.selenide.SelenideElement;
import com.coherentsolutions.java.webauto.section03.baseclasses.PageBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class UserAccountPage extends PageBase {

    private SelenideElement ybarMailLink = $("#ybarMailLink");

    @Step("Check if the Mail Link is displayed on the User Account Page")
    public boolean isDisplayedMailLink() {
        return ybarMailLink.shouldBe(visible).isDisplayed();
    }
}
