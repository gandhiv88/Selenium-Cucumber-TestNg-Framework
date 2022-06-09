package pageactions;

import org.openqa.selenium.WebDriver;
import pageobjects.homepage.AmazonHomePageUI;

public class AmazonHomePage extends BasePage{

    AmazonHomePageUI ah;

    public AmazonHomePage(WebDriver d) {
        super(d);
    }

    public void lauchWebPage(String url){
        lauchUrl(url);
        ah = new AmazonHomePageUI(driver);
    }

    public void validateHomePage(){
        if(ah.getAmazonLogo().isDisplayed()){
            System.out.println("Amazon Homepage displayed");
        }else{
            System.out.println("Amazon Homepage not displayed");
        }
    }

    public void search(String searchTerm) throws InterruptedException {
        ah.getSearchInputBox().sendKeys(searchTerm);
        ah.getSearchInputBtn().click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
