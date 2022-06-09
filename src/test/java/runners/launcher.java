package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

/**
 * Created by Gandhi on 11/29/2016.
 */
@CucumberOptions(
        monochrome = true,
        features = "src/test/resources",
        glue = "stepdefinition"
)

public class launcher extends AbstractTestNGCucumberTests {
}
