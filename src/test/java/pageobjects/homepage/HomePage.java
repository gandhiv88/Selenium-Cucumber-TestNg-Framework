package pageobjects.homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by GXV8851 on 12/6/2016.
 */
public class HomePage extends BasePage{

    HomePageUI ui;
   // WebDriver driver;
    String websiteUrl = "https://www.google.com/";

    public HomePage(WebDriver d) {
        super(d);
        System.out.println("second");
        //this.driver = d;
    }

    public void lauchWebPage(){
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
