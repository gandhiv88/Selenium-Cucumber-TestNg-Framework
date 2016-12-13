package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.DefaultPicoContainer;
import pageobjects.homepage.BasePage;

/**
 * Created by GXV8851 on 12/13/2016.
 */
public class BaseStepDefinition implements En {

    private static boolean intialized = false;
    WebDriver driver;
    BasePage page;

    public BaseStepDefinition() {
       /* if(!intialized) {
            System.out.println("First");
            System.setProperty("webdriver.chrome.driver", "C:\\Gandhi\\Personal\\Learnings\\Selenium\\Sample-Selenium-Framework\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            page = new BasePage(driver);
            intialized = true;
        }*/
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
