package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement alerts;

    public AlertsPage getJavaScriptAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(css = "[href='/windows']")
    WebElement windows;
    public WindowsPage getMultipleWindows() {
        click(windows);
        return new WindowsPage(driver);
    }
}
