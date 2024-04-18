package com.herokuapp.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UploadPage extends BasePage{
    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileUpload;
    @FindBy(id = "file-submit")
    WebElement fileSubmit;
    public UploadPage uploadFile(String path) {
        fileUpload.sendKeys(path);
        click(fileSubmit);
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement successTitle;
    public UploadPage verifySuccessUpload(String text) {
        Assert.assertTrue(shouldHaveText(successTitle, text, 10));
        return this;
    }

    @FindBy(className = "dz-hidden-input")
    WebElement dropzone;
    public UploadPage dropFile(String path) {
        dropzone.sendKeys(path);
        return this;
    }

    @FindBy(className = "dz-success-mark")
    WebElement successMark;
    public UploadPage verifySuccessDrop() {
        Assert.assertTrue(successMark.isDisplayed());
        return this;
    }
}
