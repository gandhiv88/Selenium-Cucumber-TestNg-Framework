package stepdefinition;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import pageobjects.homepage.HomePage;

/**
 * Created by Gandhi on 12/6/2016.
 */


public class TestGooglePageStepDefn implements En {

    WebDriver driver;
    HomePage hp;
    BaseStepDefinition baseStepDefinition;
    public TestGooglePageStepDefn(BaseStepDefinition base) {
        baseStepDefinition = base;


        Given("^Launch google website$", () -> {
            driver = baseStepDefinition.getDriver();
            hp = new HomePage(driver);
            hp.lauchWebPage();
        });


        Then("^Google launch page is displayed$", () -> {
            hp.validateHomePage();
        });

        When("^Some criteria is searched in google$", () -> {
            hp.searchInGoogle("Gandhi Valliappan");
        });

        Then("Search results are displayed", () -> {
            hp.validateResults();
        });

    }

}
