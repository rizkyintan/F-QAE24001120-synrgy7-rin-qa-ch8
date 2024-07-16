package stepDefinitions;

import belajarappium.pages.CompletePage;
import io.cucumber.java.en.*;

public class CompleteSteps {

    CompletePage completePage = new CompletePage();

    @Then("User redirected to complete page")
    public void user_on_complete_page(){
        completePage.getCompleteValidation();
    }

}