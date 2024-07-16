package stepDefinitions;

import belajarappium.pages.CartPage;
import io.cucumber.java.en.*;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("User redirected to cart page")
    @Given("User already to cart page")
    public void user_redirected_to_cart_page(){
        cartPage.validateOnPage();
    }

    @And("User checkout product")
    public void user_checkout_product(){
        cartPage.scrollCartPage("CHECKOUT");
        cartPage.clickCheckoutButton();
    }
}