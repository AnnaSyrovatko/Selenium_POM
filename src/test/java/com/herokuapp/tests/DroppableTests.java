package com.herokuapp.tests;

import com.herokuapp.pages.DroppablePage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDroppable();
    }

    @Test
    public void actionDragMeTest(){
        new DroppablePage(driver).actionDragMe().verifyDroppableObjects();
    }

}
