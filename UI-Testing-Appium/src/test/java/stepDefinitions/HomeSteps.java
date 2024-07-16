package stepDefinitions;

import io.cucumber.java.en.*;
import belajarappium.pages.HomePage;
import belajarappium.config.BaseTest;
import org.testng.Assert;

public class HomeSteps extends BaseTest{

    HomePage homePage = new HomePage();

    @Then("User redirected to Home page")
    @Given("User already on Home page")
    public void user_is_on_home_page() {
        homePage.validateOnPage();
    }

    @When("User sort from low to high")
    public void user_sort_from_low_to_high(){
        homePage.clickSortButton();
        homePage.clickLowHighButton();
    }

    @And("User add product to cart")
    public void user_add_product_to_cart(){
        homePage.addProduct();
        homePage.clickCartButton();
    }

    @Then("Product sorted from low to high")
    public void product_sorted_from_low_to_high(){
        Assert.assertTrue(homePage.getFirstPrice() < homePage.getSecondPrice(), "Test failed: First price is not higher than the last price");
    }
}
