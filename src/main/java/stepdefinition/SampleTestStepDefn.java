package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java8.En;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
            page.searchInGoogle("Hammer");
        });

        Then("Search results are displayed",() -> {
            page.validateResults();
        });
    }


    /*@Given("^Launch google website$")
    public void launch_google_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.lauchWebPage();
    }

    @Then("^Google launch page is displayed$")
    public void google_launch_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.validateHomePage();
    }

    @When("^Some criteria is searched in google$")
    public void some_criteria_is_searched_in_google() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.searchInGoogle("hammer");
    }

    @Then("^Search results are displayed$")
    public void search_results_are_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page.validateResults();
    }*/

}
