package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by GXV8851 on 11/29/2016.
 */
@CucumberOptions(
        format = {"pretty"},
        monochrome = true,
        features = "src/main/resources",
        glue = "stepdefinition"
)
public class launcher extends AbstractTestNGCucumberTests {
}
