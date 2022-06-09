package stepdefinition;

import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Gandhi on 12/13/2016.
 */
public class BaseStepDefinition implements En {

    private boolean intialized = false;
    WebDriver driver;

    public BaseStepDefinition() {

        Before((Scenario scenario) ->
        {
            System.out.println("launched");

        });

        After((Scenario scenario) ->{
            System.out.println("Quit");
            intialized=false;
            driver.quit();
        });
    }

    public WebDriver getDriver(String browser){

        if(!intialized) {
            switch (browser){
                case "CHROME":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "SAFARI":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
            }

            intialized = true;
        }

        return driver;
    }

}
