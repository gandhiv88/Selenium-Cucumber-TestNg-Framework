package pageactions;

import org.openqa.selenium.WebDriver;
import pageobjects.homepage.GoogleResultsPageUI;

public class GoogleResultsPage extends BasePage{

    GoogleResultsPageUI grp;

    public GoogleResultsPage(WebDriver d) {
        super(d);
    }

    public void validateResults(){
        grp = new GoogleResultsPageUI(driver);
        if(grp.getSearchResultHeader().isDisplayed())
        {
            System.out.println("Results validated");
        }else{
            throw new RuntimeException("Not The Expected Result");
        }
    }}
