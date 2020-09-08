package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "stepdefinitions",
        plugin = {"html:target/cucumber-html-report.html", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
        strict = true,
        monochrome = true,
        dryRun = false,
        tags = "(@SmokeTest or Regression) and (not @pending)"

)



public class TestRunner {

}
