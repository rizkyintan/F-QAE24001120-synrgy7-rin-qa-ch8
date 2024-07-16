package belajarappium.pages;

import belajarappium.config.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {

    //Locator atau element
    By productsText = AppiumBy.xpath("//*[contains(@text, 'PRODUCTS')]");
    By sortButton = AppiumBy.xpath("//*[contains(@content-desc, 'test-Modal Selector Button')]");
    By cartButton = AppiumBy.xpath("//*[@content-desc='test-Cart']");
    By onesiePrice = AppiumBy.xpath("(//*[contains(@content-desc, 'test-Price')])[1]");
    By bikePrice = AppiumBy.xpath("(//*[contains(@content-desc, 'test-Price')])[2]");
    By lowHighButton = AppiumBy.xpath("//*[contains(@text, 'Price (low to high)')]");
    By sortContainer = AppiumBy.xpath("//*[contains(@content-desc, 'Selector container')]");

    By backCartButton = AppiumBy.xpath("(//*[contains(@content-desc, 'test-ADD TO CART')])[1]");
    By bikeCartButton = AppiumBy.xpath("(//*[contains(@content-desc, 'test-ADD TO CART')])[1]");

    //Action method
    public void validateOnPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(productsText));
        wait.until(ExpectedConditions.presenceOfElementLocated(sortButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(cartButton));
    }

    public void addProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(backCartButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(bikeCartButton)).click();
    }

    public void clickSortButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortButton)).click();
    }

    public void clickLowHighButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortContainer)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lowHighButton)).click();
    }

    public void clickCartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton)).click();
    }

    public double getFirstPrice(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(onesiePrice)).isDisplayed();
        String firstPriceString = driver.findElement(onesiePrice).getText().replace("$", "");
        return Double.parseDouble(firstPriceString);
    }

    public double getSecondPrice(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(bikePrice)).isDisplayed();
        String secondPriceString = driver.findElement(bikePrice).getText().replace("$", "");
        return Double.parseDouble(secondPriceString);
    }

}
