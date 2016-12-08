package pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by GXV8851 on 12/6/2016.
 */
public class HomePageUI {

    WebDriver driver;

    int firstIndex=0;

    By googleLogo = By.id("hplogo");

    By searchInputBox = By.id("lst-ib");

    By searchBtn = By.name("_fZl");

    public HomePageUI(WebDriver d){
        this.driver = d;
    }

    public WebElement getGoogleLogo(){
        return driver.findElement(googleLogo);
    }

    public WebElement geSearchInputBox(){
        return driver.findElement(searchInputBox);
    }

    public WebElement getSearchButton(){
        return driver.findElement(searchBtn);
    }
}
