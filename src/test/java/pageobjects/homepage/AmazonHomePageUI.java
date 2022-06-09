package pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageUI {

    WebDriver driver;

    public AmazonHomePageUI(WebDriver d){ this.driver = d;}

    By amazonLogo = By.id("nav-logo-sprites");

    By searchInputBox = By.id("twotabsearchtextbox");

    By searchInputBtn = By.id("nav-search-submit-button");

    public WebElement getAmazonLogo(){ return driver.findElement(amazonLogo); }

    public WebElement getSearchInputBox(){ return driver.findElement(searchInputBox); }

    public WebElement getSearchInputBtn(){ return  driver.findElement(searchInputBtn); }
}
