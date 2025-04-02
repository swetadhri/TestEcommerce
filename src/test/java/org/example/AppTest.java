package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest {
 @Test
    public void login(){
     WebDriver driver=new ChromeDriver();
     driver.get("https://google.com");
     driver.manage().window().maximize();
   String url=  driver.getCurrentUrl();
   driver.findElement(By.className("gLFyf")).sendKeys("testing");
   driver.findElement(By.className("gLFyf")).submit();
     System.out.println("The URL is:"+url);
     driver.quit();

 }
}