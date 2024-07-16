package belajarappium.pages;

import belajarappium.config.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class OverviewPage  extends BaseTest {

    By finishButton = AppiumBy.xpath("//*[contains(@content-desc, 'test-FINISH')]");
    By overviewText = AppiumBy.xpath("//*[contains(@text, 'CHECKOUT: OVERVIEW')]");

    public void validateOnPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(overviewText)).isDisplayed();
    }

    public void scrollCartPage(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))", text)));
    }

    public void clickFinishButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton)).click();
    }

}
