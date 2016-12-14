package pageobjects.homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Gandhi on 12/6/2016.
 */
public class HomePage extends BasePage{

    HomePageUI ui;
   // WebDriver driver;

    public HomePage(WebDriver d) {
        super(d);
        System.out.println("second");
        //this.driver = d;
    }

    public void lauchWebPage(String websiteUrl){
        driver.get(websiteUrl);
        ui = new HomePageUI(driver);
    }

    public void validateHomePage(){
        if(ui.getGoogleLogo().isDisplayed()){
            System.out.println("Google page displayed");
        } else{
            System.out.println("Google page not displayed");
        }
    }

    public void searchInGoogle(String criteria){
        ui.geSearchInputBox().sendKeys(criteria);
        ui.geSearchInputBox().sendKeys(Keys.ENTER);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void validateResults(){
        System.out.println("Results validated");
    }
}
