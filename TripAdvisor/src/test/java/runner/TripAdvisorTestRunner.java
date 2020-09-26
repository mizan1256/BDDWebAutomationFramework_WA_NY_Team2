package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "stepdefinitions", //the path of the step definition files
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/index.html",
                "pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml"}, //to generate different types of reporting
        strict = true,
        monochrome = true,
        dryRun = false,
        publish = true,
        tags = "(@SmokeTest or Regression) and (not @pending or @Shuvo)"


)

public class TripAdvisorTestRunner{


}
