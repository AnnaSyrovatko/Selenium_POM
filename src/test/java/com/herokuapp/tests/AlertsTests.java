package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlerts();
    }

    @Test
    public void isAlertPresentTest(){
        new AlertsPage(driver).isAlertPresent();
    }

    @Test
    public void alertWithSelectTest(){
        new AlertsPage(driver).selectResult("OK").verifyResult("Ok");
    }

    @Test
    public void sendMessageToAlertTest(){
        new AlertsPage(driver).sendMessageToAlert("I'm a guest").verifyResult("I'm a guest");
    }

}
