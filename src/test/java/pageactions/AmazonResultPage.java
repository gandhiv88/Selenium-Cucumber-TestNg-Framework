package pageactions;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import pageobjects.homepage.AmazonResultsPageUI;

public class AmazonResultPage extends BasePage{

    AmazonResultsPageUI arp;

    public AmazonResultPage(WebDriver d) {
        super(d);
    }

    public void validateSearchResult(){
        arp= new AmazonResultsPageUI(driver);

        if(arp.getSearchResultHeader().isDisplayed()){
            System.out.println("System Works As Expected");
        }else{
            throw new RuntimeException("System not working as expected");
        }
    }
}
