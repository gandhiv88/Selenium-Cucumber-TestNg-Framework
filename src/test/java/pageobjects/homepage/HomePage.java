package pageobjects.homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by GXV8851 on 12/6/2016.
 */
public class HomePage {

    WebDriver driver;
    HomePageUI ui;

    String websiteUrl = "https://www.google.com/";

    public void lauchWebPage(){

        System.setProperty("webdriver.chrome.driver","C:\\Gandhi\\Personal\\Learnings\\Selenium\\Sample-Selenium-Framework\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
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
        driver.quit();
    }
}
