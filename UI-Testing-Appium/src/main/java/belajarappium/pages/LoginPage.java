package belajarappium.pages;

import belajarappium.config.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage  extends BaseTest {

    //Locator atau element
    By usernameField = AppiumBy.accessibilityId("test-Username");
    By passwordField = AppiumBy.accessibilityId("test-Password");
    By loginButton = AppiumBy.accessibilityId("test-LOGIN");
    By errorMessage = AppiumBy.xpath("(//*[contains(@text, 'Username and password do not match any user in this service.')])");

    //Action method
    public void validateOnPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }

    public void errorMessageDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).isDisplayed();
    }

    public void inputUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }

}
