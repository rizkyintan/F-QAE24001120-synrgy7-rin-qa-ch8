package belajarappium.pages;

import belajarappium.config.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BaseTest {

    By cartText = AppiumBy.xpath("//*[contains(@text, 'YOUR CART')]");
    By checkoutButton = AppiumBy.xpath("//*[contains(@content-desc, 'test-CHECKOUT')]");

    public void scrollCartPage(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))", text)));
    }

    public void clickCheckoutButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton)).click();
    }


    public void validateOnPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartText)).isDisplayed();
    }
}
