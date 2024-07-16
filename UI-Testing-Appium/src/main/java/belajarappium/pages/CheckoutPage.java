package belajarappium.pages;

import belajarappium.config.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage  extends BaseTest {

    By firstnameEdit = AppiumBy.xpath("//*[contains(@content-desc, 'test-First Name')]");
    By lastnameEdit = AppiumBy.xpath("//*[contains(@content-desc, 'test-Last Name')]");
    By zipcodeEdit = AppiumBy.xpath("//*[contains(@content-desc, 'test-Zip/Postal Code')]");
    By continueButton = AppiumBy.xpath("//*[contains(@text, 'CONTINUE')]");
    By checkoutText = AppiumBy.xpath("//*[contains(@text, 'CHECKOUT: INFORMATION')]");

    public void validateOnPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(checkoutText));
        wait.until(ExpectedConditions.presenceOfElementLocated(firstnameEdit));
        wait.until(ExpectedConditions.presenceOfElementLocated(lastnameEdit));
        wait.until(ExpectedConditions.presenceOfElementLocated(zipcodeEdit));
        wait.until(ExpectedConditions.presenceOfElementLocated(checkoutText));
    }

    public void enterFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstnameEdit)).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastnameEdit)).sendKeys(lastName);
    }

    public void enterZipCode(String zipCode){
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipcodeEdit)).sendKeys(zipCode);
    }

    public void clickContinueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton)).click();
    }

}
