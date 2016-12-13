package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.DefaultPicoContainer;
import pageobjects.homepage.BasePage;

/**
 * Created by Gandhi on 12/13/2016.
 */
public class BaseStepDefinition implements En {

    private static boolean intialized = false;
    WebDriver driver;
    BasePage page;

    public BaseStepDefinition() {

        Before((Scenario scenario) ->
        {
            System.out.println("launched");
            if(!intialized) {
                System.setProperty("webdriver.chrome.driver", "C:\\Gandhi\\Personal\\Learnings\\Selenium\\Sample-Selenium-Framework\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                page = new BasePage(driver);
                intialized = true;
            }
        });

        After((Scenario scenario) ->{
            System.out.println("Quit");
            driver.quit();
        });
    }

    public WebDriver getDriver(){
        return driver;
    }

}
