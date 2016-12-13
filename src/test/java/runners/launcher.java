package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

/**
 * Created by GXV8851 on 11/29/2016.
 */
@CucumberOptions(
        format = {"pretty"},
        monochrome = true,
        features = "src/test/resources",
        glue = "stepdefinition"
)

public class launcher {
    @Test
    public void runTests(){
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}
