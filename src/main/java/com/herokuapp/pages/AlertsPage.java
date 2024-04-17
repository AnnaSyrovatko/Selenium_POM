package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-child(1) button")
    WebElement alertButton;
    public AlertsPage isAlertPresent() {
        click(alertButton);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }

    @FindBy(css = "li:nth-child(2) button")
    WebElement confirmButton;
    public AlertsPage selectResult(String confirm) {
        click(confirmButton);

        if (confirm != null && confirm.equals("OK")){
            driver.switchTo().alert().accept();
        }
        else if (confirm != null && confirm.equals("Cancel")){
        driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(css = "li:nth-child(3) button")
    WebElement promptButton;
    public AlertsPage sendMessageToAlert(String message) {
        click(promptButton);

        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
}
