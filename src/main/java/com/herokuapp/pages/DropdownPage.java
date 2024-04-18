package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;
    @FindBy(css = "option:nth-child(2)")
    WebElement option1;
    @FindBy(css = "option:nth-child(3)")
    WebElement option2;
    public DropdownPage selectDropdownOptions(String option) {
        if (option.equals("Option 1")){
            click(option1);
        }
        if (option.equals("Option 2")){
            click(option2);
        }
        return this;
    }
}
