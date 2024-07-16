package belajarappium.config;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;


public class CucumberHooks {

    @BeforeAll
    public static void beforeAll(){
        BaseTest.setupDriver();
    }

    @AfterAll
    public static void afterAll(){
        BaseTest.stopDriver();
    }

    @After
    public static void after(){
        BaseTest.resetApp();
    }

}
