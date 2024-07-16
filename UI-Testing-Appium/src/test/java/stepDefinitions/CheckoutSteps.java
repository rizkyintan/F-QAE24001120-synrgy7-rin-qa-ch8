package stepDefinitions;

import belajarappium.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("User redirected checkout page")
    @Given("User already on checkout page")
    public void user_is_on_checkout_page(){
        checkoutPage.validateOnPage();
    }

    @And("User fill their name with {string} {string} and zip code with {string}")
    public void user_fill_their_identity_on_checkout(String firstName, String lastName, String zipCode){
        checkoutPage.enterFirstName(firstName);
        checkoutPage.enterLastName(lastName);
        checkoutPage.enterZipCode(zipCode);
        checkoutPage.clickContinueButton();
    }

}