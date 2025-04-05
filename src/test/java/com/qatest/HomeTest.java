package com.qatest;

import com.qapage.HomePage;
import com.qapage.Testbase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeTest extends Testbase {

    HomePage page;
   // WebDriver driver;




    @BeforeMethod
    public void setup(){
        super.readproperties();
        initializeBrowser();

    }

    @Test
    public void homepage() throws IOException {
        page=new HomePage(driver);
       //String browser= getProperty("browser");
        page.login("swetat94@gmail.com");

    }
}
