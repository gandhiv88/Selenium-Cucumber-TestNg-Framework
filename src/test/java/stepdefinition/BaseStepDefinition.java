package stepdefinition;

import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Gandhi on 12/13/2016.
 */
public class BaseStepDefinition implements En {

    private static boolean intialized = false;
    WebDriver driver;

    public BaseStepDefinition() {

        Before((Scenario scenario) ->
        {
            System.out.println("launched");
            if(!intialized) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                intialized = true;
            }
        });

        After((Scenario scenario) ->{
            System.out.println("Quit");
            intialized=false;
            driver.quit();
        });
    }

    public WebDriver getDriver(){
        return driver;
    }

}
