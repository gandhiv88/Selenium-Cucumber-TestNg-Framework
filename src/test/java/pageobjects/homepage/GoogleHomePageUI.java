package pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Gandhi on 12/6/2016.
 */
public class GoogleHomePageUI {

    WebDriver driver;

    By googleLogo = By.xpath("//img[@alt='Google']");

    By searchInputBox = By.xpath("//input[@title='Search']");

    By searchBtn = By.xpath("//input[@value='Google Search']");

    public GoogleHomePageUI(WebDriver d){
        this.driver = d;
    }

    public WebElement getGoogleLogo(){
        return driver.findElement(googleLogo);
    }

    public WebElement geSearchInputBox(){
        return driver.findElement(searchInputBox);
    }

    public WebElement getSearchButton(){
        return driver.findElements(searchBtn).get(1);
    }
}
