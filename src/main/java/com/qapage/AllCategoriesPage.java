package com.qapage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AllCategoriesPage {

    private WebDriver driver;

    private By AllCategories = By.xpath("//div[@class='fc-Menu']/descendant::li/a[text()=' All Categories']");

    private By Allcategoriesmenu = By.xpath("//div[@class='all-category-container']/descendant::li[contains(@class,'categry')]/a");

    private By imagename = By.xpath("//div[@class='all-category-container']/descendant::li[contains(@class,'categry')]/a/img");


    public AllCategoriesPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickAllCategories() {

        driver.findElement(AllCategories).click();
    }

    public void allcategorieslist() {
        List<String> combinedTexts = new ArrayList<>();
        List<WebElement> categories = driver.findElements(Allcategoriesmenu);

        List<WebElement> image = driver.findElements(imagename);

        for (WebElement category : categories) {
            String text1 = category.getAttribute("textContent");
            if (!text1.isEmpty()) {
                combinedTexts.add(text1);
            }
        }
        for (WebElement imagetext : image) {
            String imageTitle = imagetext.getAttribute("title");
            combinedTexts.add(imageTitle);
        }
        for(String text:combinedTexts){
            System.out.println("The text is"+text);
        }
    }



// Print all together

// Then, print image titles as part of categories

    }








