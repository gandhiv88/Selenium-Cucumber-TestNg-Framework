package pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonResultsPageUI {

    WebDriver driver;

    By searchResultHeader = By.xpath("//span[contains(text(),'bag')]");

    public AmazonResultsPageUI(WebDriver d){ this.driver = d; }

    public WebElement getSearchResultHeader(){ return driver.findElements(searchResultHeader).get(0); }

}
