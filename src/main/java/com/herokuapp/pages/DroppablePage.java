package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DroppablePage extends BasePage{
    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;
    @FindBy(id = "column-b")
    WebElement columnB;

    public DroppablePage actionDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(columnA,columnB).perform();
        return this;
    }

    public void verifyDroppableObjects() {
        Assert.assertEquals(columnA.getText(), "B");
    }
}
