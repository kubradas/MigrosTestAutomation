package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "utilities"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber-report.json",
                "html:target/cucumber-reports/cucumber-report.html"
        },
        monochrome = true
)
public class TestRunner {

}