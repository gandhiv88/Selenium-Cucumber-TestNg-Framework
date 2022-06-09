package pageactions;

import org.openqa.selenium.WebDriver;

/**
 * Created by Gandhi on 12/12/2016.
 */
public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver d){
        driver = d;
    }

    public void lauchUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

}
