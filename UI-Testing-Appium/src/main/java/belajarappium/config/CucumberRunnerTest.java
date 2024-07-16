package belajarappium.config;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/features"},
    glue = {"belajarappium"},
    plugin = {
            "pretty",
            "html:target/report-cucumber.html",
            "json:target/cucumber-json.json"
    }
)

public class CucumberRunnerTest {}
