package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropdownPage extends BasePage{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropdownPage selectDropdownOptions(String option) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(option); //can be also selected by value or index


        return this;
    }

    public void verifySelectedOption(String option) {
        Select select = new Select(dropdown);
        //List<WebElement> selectedOptionList = select.getAllSelectedOptions();
        Assert.assertEquals(option, select.getFirstSelectedOption().getText());

    }

}

