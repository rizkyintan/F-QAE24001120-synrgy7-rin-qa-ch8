package stepDefinitions;

import belajarappium.pages.OverviewPage;
import io.cucumber.java.en.*;

public class OverviewSteps {

    OverviewPage overviewPage = new OverviewPage();

    @When("User click finish")
    public void user_click_finish(){
        overviewPage.scrollCartPage("FINISH");
        overviewPage.clickFinishButton();
    }
}