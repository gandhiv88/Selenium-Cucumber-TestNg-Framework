package pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageobjects.homepage.GoogleHomePageUI;

/**
 * Created by Gandhi on 12/6/2016.
 */
public class GoogleHomePage extends BasePage {

    GoogleHomePageUI ui;

    public GoogleHomePage(WebDriver d) {
        super(d);
        System.out.println("second");
    }

    public void launchWebPage(String url){
        lauchUrl(url);
        ui = new GoogleHomePageUI(driver);
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


}
