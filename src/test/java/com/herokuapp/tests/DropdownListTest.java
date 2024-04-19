package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.DropdownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownListTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();
    }

    @Test
    public void dropdownListTest(){
        new DropdownPage(driver).selectDropdownOptions("Option 2").verifySelectedOption("Option 2");
    }
}
