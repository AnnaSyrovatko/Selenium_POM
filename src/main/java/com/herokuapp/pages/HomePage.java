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

    @FindBy(css = "[href='/checkboxes']")
    WebElement checkboxes;
    public CheckboxesPage getCheckboxes() {
        click(checkboxes);
        return new CheckboxesPage(driver);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement dropdown;
    public DropdownPage getDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    @FindBy(css = "[href='/upload']")
    WebElement upload;
    public UploadPage getFileUpload() {
        click(upload);
        return new UploadPage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImages;
    public BrokenImagesPage getImages() {
        click(brokenImages);
        return new BrokenImagesPage(driver);
    }

    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragAndDrop;
    public DroppablePage getDroppable() {
        click(dragAndDrop);
        return new DroppablePage(driver);
    }
}
