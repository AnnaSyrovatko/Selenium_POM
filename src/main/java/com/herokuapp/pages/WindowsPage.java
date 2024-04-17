package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage{
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement windowLink;

    public WindowsPage switchToNextWindow(int index) {
        click(windowLink);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement heading;
    public WindowsPage verifyNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(heading, text, 10));
        return this;
    }
}
