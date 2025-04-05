package com.qapage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testbase {
    protected String path = "src/main/java/com/qautil/config.properties";
    protected Properties prop;
    protected WebDriver driver;

    public void readproperties() {
        try {
            FileInputStream file = new FileInputStream(path);
            prop = new Properties();
            prop.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initializeBrowser() {

        String browser = getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(prop.getProperty("url"));
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Unsupported browser: " + browser);
        }
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}