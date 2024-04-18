package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.UploadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFileUpload();
    }

    @Test
    public void uploadFileWithButtonTest(){
        new UploadPage(driver).uploadFile("C:/Tools/lions.jpg").verifySuccessUpload("File Uploaded!");
    }
    @Test
    public void uploadFileIntoDropAreaTest(){
        new UploadPage(driver).dropFile("C:/Tools/lions.jpg").verifySuccessDrop();
    }

}
