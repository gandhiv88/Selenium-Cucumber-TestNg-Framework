package stepdefinition;

import cucumber.api.java8.En;
import pageobjects.homepage.HomePage;

/**
 * Created by GXV8851 on 12/6/2016.
 */
public class SampleTestStepDefn implements En {

    HomePage page = new HomePage();

    public SampleTestStepDefn(){
        Given("^Launch google website$", () -> {
            page.lauchWebPage();
        });

        Then("^Google launch page is displayed$",() ->{
            page.validateHomePage();
        });

        When("^Some criteria is searched in google$",() ->{
            page.searchInGoogle("Gandhi Valliappan");
        });

        Then("Search results are displayed",() -> {
            page.validateResults();
        });
    }

}
