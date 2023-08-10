// Runner class configuration
package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//setting up the path to the Contact_Us.feature and stepDefinitions
@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
                tags = "@regression", monochrome = true, dryRun = false,
                plugin = {"pretty", "html:target/cucumber_report.html", "json:target/cucumber.json"})


//We set the monochrome option to true inside the @CucumberOptions annotation to remove unreadable characters in the console output during execution.
public class MainRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}