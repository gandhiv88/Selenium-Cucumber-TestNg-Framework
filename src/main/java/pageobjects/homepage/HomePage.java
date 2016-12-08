package pageobjects.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by GXV8851 on 12/6/2016.
 */
public class HomePage {
    WebDriver driver = new FirefoxDriver();
    HomePageUI ui = new HomePageUI(driver);

    String websiteUrl = "www.google.com";

    public void lauchWebPage(){
        driver.get(websiteUrl);
    }

    public void validateHomePage(){
        if(ui.getGoogleLogo().isDisplayed()){
            System.out.println("Google page displayed");
        } else{
            System.out.println("Google page not displayed");
        }
    }

    public void searchInGoogle(String criteria){

    }

    public void validateResults(){

    }
}
