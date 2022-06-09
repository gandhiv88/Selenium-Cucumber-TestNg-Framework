package stepdefinition;

import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pageactions.GoogleHomePage;
import pageactions.GoogleResultsPage;

/**
 * Created by Gandhi on 12/6/2016.
 */


public class TestGooglePageStepDefn implements En {

    WebDriver driver;
    GoogleHomePage hp;

    GoogleResultsPage grp;
    BaseStepDefinition baseStepDefinition;
    public TestGooglePageStepDefn(BaseStepDefinition base) {
        baseStepDefinition = base;

        Then("^Google launch page is displayed$", () -> {
            hp.validateHomePage();
        });

        Then("Search results are displayed", () -> {
            grp = new GoogleResultsPage(driver);
            grp.validateResults();
        });
        When("^\"([^\"]*)\" is searched in google$", (String searchTerm) -> {
            hp.searchInGoogle(searchTerm);

        });
        Given("^Launch google website in \"([^\"]*)\"$", (String browser) -> {
            driver = baseStepDefinition.getDriver(browser.toUpperCase());
            hp = new GoogleHomePage(driver);
            hp.launchWebPage("https://www.google.com/");
        });

    }

}
