package stepdefinition;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import pageobjects.homepage.HomePage;

/**
 * Created by Gandhi on 12/13/2016.
 */
public class TestAmazonPageStepDefn implements En{

    WebDriver driver;
    HomePage hp;
    BaseStepDefinition baseStepDefinition;

    public TestAmazonPageStepDefn(BaseStepDefinition base){
        baseStepDefinition = base;
        Given("^Launch amazon website$", () -> {
            driver = baseStepDefinition.getDriver();
            hp = new HomePage(driver);
            hp.lauchWebPage("https://www.amazon.com/");
        });

        Then("^Amazon launch page is displayed$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });

        When("^Some criteria is searched in amazon$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });

        Then("^Amazon search results are displayed$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });
    }
}
