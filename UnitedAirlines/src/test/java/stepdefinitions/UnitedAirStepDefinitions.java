package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairlineshome.UnitedAirlinesHomePage;

import java.io.IOException;

public class UnitedAirStepDefinitions extends WebAPI {
    UnitedAirlinesHomePage unitedAirlinesHomePage;
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }
    @BeforeStep
    public void getInIt(){
        unitedAirlinesHomePage= PageFactory.initElements(driver, UnitedAirlinesHomePage.class);
    }
    @Given("I am in home page")
    public void i_am_in_home_page() throws IOException {
     openBrowser("https://www.united.com/en/us");
    }

    @When("I click Flight status")
    public void i_click_flight_status() {
    unitedAirlinesHomePage.clickOnFlightStatusBtn();
    }

    @When("I enter City in From field and To field")
    public void i_enter_city_in_from_field_and_to_field() {
    unitedAirlinesHomePage.enterCityName();
    }

    @When("I enter Flight number and  Date")
    public void i_enter_flight_number_and_date() throws InterruptedException {
    unitedAirlinesHomePage.enterFlightNumber();
    }

    @Then("I click Search Button")
    public void i_click_search_button() {
    unitedAirlinesHomePage.clickOnSearchBtn();
    }
    @Then("I validate Flight status is appear properly")
    public void i_validate_flight_status_is_appear_properly() {
     unitedAirlinesHomePage.validateFlightStatus();
    }
}
