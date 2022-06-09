package pageobjects.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultsPageUI {

    WebDriver driver;

    By searchResultHeader = By.xpath("//h3[text()='Selenium']");

    public GoogleResultsPageUI(WebDriver d){
        this.driver = d;
    }

    public WebElement getSearchResultHeader(){ return driver.findElement(searchResultHeader); }
}
