package com.qapage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

   private WebDriver driver;

    private By login= By.xpath("//li[@class='logreg']/span[text()='Login /']");
    private  By emailid=By.xpath("//input[@type='text']");
     private By continuebutton=By.xpath("//div[@id=\"loginotp\"]/span[text()='CONTINUE']");


   public HomePage(WebDriver driver) {
      this.driver=driver;
    }

    public void login(String email){
        driver.findElement(login).click();
        driver.findElement(emailid).sendKeys(email);
        driver.findElement(continuebutton).click();
    }
        }

