package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tripadvisorhome.TripAdvisorHomePage;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static TripAdvisorHomePage tripAdvisorHome;
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
//            Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ...and embed it in the report.
        }
        cleanUp();
    }
    @BeforeStep
    public void getInit(){ tripAdvisorHome= PageFactory.initElements(driver,TripAdvisorHomePage.class);
    }
    @Given("I am on TripAdvisor HomePage")
    public void i_am_on_trip_advisor_home_page() throws IOException {
        openBrowser();
    }

    @When("I click on Restaurant Button")
    public void i_click_on_restaurant_button() {


    }

    @When("I wrote Grass Valley on the search box")
    public void i_wrote_grass_valley_on_the_search_box() {

    }

    @Then("I click on Grass Valley")
    public void i_click_on_grass_valley() {

    }

    @Then("I verify Valley is appeared properly")
    public void i_verify_valley_is_appeared_properly() {

    }

    @Then("I verify page title")
    public void i_verify_page_title() {

    }

}
