package belajarappium.pages;

import belajarappium.config.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompletePage extends BaseTest {

    By thankText = AppiumBy.xpath("//*[contains(@text, 'THANK YOU FOR YOU ORDER')]");
    By ponyPicture = AppiumBy.xpath("//*[contains(@content-desc, 'test-CHECKOUT: COMPLETE!')]");

    public void getCompleteValidation(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(thankText)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ponyPicture)).isDisplayed();
    }

}
