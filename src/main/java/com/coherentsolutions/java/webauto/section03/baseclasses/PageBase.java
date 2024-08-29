package com.coherentsolutions.java.webauto.section03.baseclasses;

import com.codeborne.selenide.Selenide;

public abstract class PageBase {

    public String getPageTitle() {
        return Selenide.title();
    }

    public void navigateTo(String url) {
        Selenide.open(url);
    }

    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}