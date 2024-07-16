package stepDefinitions;

import io.cucumber.java.en.*;
import belajarappium.pages.LoginPage;
import belajarappium.config.BaseTest;

public class LoginSteps extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Given("User is on Login page")
    public void user_is_on_login_page(){
        loginPage.validateOnPage();
    }

    @And("User input username with {string}")
    public void user_input_username(String username){
        loginPage.inputUsername(username);
    }

    @And("User input password with {string}")
    public void user_input_password(String password){
        loginPage.inputPassword(password);
    }

    @When("User click login button")
    public void user_click_login(){
        loginPage.clickLoginButton();
    }

    @Then("Login page display error message")
    public void login_page_display_error(){
        loginPage.errorMessageDisplayed();
    }

}
