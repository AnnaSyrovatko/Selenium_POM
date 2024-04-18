package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    //JavascriptExecutor js = (JavascriptExecutor)driver;

    @FindBy(css = "input:nth-child(1)")
    WebElement checkbox1;
    @FindBy(css = "input:nth-child(3)")
    WebElement checkbox2;
    public CheckboxesPage selectCheckboxOptions(String[] options) {

        if (checkbox1.isSelected()){
            click(checkbox1);
        } else if (checkbox2.isSelected()) {
            click(checkbox2);
        }

        for (String option : options) {
            if (option.equals("checkbox 1")) {
                click(checkbox1);
            }
            if (option.equals("checkbox 2")) {
                click(checkbox2);
            }
        }
        //js.executeScript("var x = document.getElementById('checkboxes');x[0].click();x[1].click();");

        return this;
    }
}
