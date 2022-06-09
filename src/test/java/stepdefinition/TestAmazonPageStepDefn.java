package stepdefinition;

import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pageactions.AmazonHomePage;
import pageactions.AmazonResultPage;

/**
 * Created by Gandhi on 12/13/2016.
 */
public class TestAmazonPageStepDefn implements En {

    WebDriver driver;
    AmazonHomePage hp;

    AmazonResultPage arp;
    BaseStepDefinition baseStepDefinition;

    public TestAmazonPageStepDefn(BaseStepDefinition base){
        baseStepDefinition = base;
        Given("^Launch amazon website$", () -> {
            driver = baseStepDefinition.getDriver();
            hp = new AmazonHomePage(driver);
            hp.lauchWebPage("https://www.amazon.com/");
        });

        Then("^Amazon launch page is displayed$", () -> {
            // Write code here that turns the phrase above into concrete actions
            hp.validateHomePage();
        });


        Then("^Amazon search results are displayed$", () -> {
            // Write code here that turns the phrase above into concrete actions
            arp = new AmazonResultPage(driver);
            arp.validateSearchResult();
        });
        When("^\"([^\"]*)\" is searched in amazon$", (String searchTerm) -> {

            hp.search(searchTerm);
        });
    }
}
