package stepdefinition;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.picocontainer.DefaultPicoContainer;
import pageobjects.homepage.HomePage;

/**
 * Created by GXV8851 on 12/6/2016.
 */


public class SampleTestStepDefn implements En {

    WebDriver driver;
    HomePage hp;
    BaseStepDefinition baseStepDefinition;
    public SampleTestStepDefn(BaseStepDefinition base) {
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
