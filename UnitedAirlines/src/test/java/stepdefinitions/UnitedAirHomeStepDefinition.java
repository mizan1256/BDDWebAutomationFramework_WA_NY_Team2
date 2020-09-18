package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairlineshome.UnitedAirlinesHomePage;

import java.io.IOException;

public class UnitedAirHomeStepDefinition extends WebAPI {
    static UnitedAirlinesHomePage unitedAirlinesHomePage;
    //Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit(){
        unitedAirlinesHomePage=PageFactory.initElements(driver,UnitedAirlinesHomePage.class);
    }
    /**
     * Flight Status
     */

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

    @When("I enter Flight number and Date")
    public void i_enter_flight_number_and_date() throws InterruptedException {
        unitedAirlinesHomePage.enterFlightNumber();
    }

    @And("I click Search Button")
    public void i_click_search_button() {
        unitedAirlinesHomePage.clickOnSearchBtn();
    }
    @Then("I validate  flight status is appeared properly")
    public void i_validate_flight_status_is_appeared_properly() {

        unitedAirlinesHomePage.validateText();
    }
    /**
     * Book Hotels
     */

    @When("I click on book button")
    public void i_click_on_book_button() {
    unitedAirlinesHomePage.clickBookButton();
    }

    @When("I click on Hotels button")
    public void i_click_on_hotels_button() {
    unitedAirlinesHomePage.clickHotelsButton();
    }

    @When("I enter {string} in where to searchBox and submit")
    public void i_enter_in_where_to_search_box_and_submit(String searchItem) throws InterruptedException {
    unitedAirlinesHomePage.enterWhereToSearchBox(searchItem);
    }

    @Then("I validate Las Vegas landed page properly")
    public void i_validate_las_vegas_landed_page_properly() throws InterruptedException {
        unitedAirlinesHomePage.validateLandedPageText();


    }

}
