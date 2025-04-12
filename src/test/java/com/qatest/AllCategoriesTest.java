package com.qatest;

import com.qapage.AllCategoriesPage;
import com.qapage.Testbase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllCategoriesTest extends Testbase {

    AllCategoriesPage acp;

    @BeforeMethod
    public void setup() {
        super.readproperties();
        initializeBrowser();
        acp = new AllCategoriesPage(driver);
    }

    @Test
    public void clickCategories() {
        acp.clickAllCategories();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), url, "The url is same");

    }

    @Test
    public void getcategoriesname() {
        acp.clickAllCategories();
        acp.allcategorieslist();
       // acp.allcategoriesname();

    }
}
