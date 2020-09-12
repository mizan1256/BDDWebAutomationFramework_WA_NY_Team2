package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairlineshome.UnitedAirHomePage;

import java.io.IOException;

public class UnitedAirStepDefinition extends WebAPI {

    static UnitedAirHomePage unitedAirHomePage;

    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public void getInIt() {
        unitedAirHomePage = PageFactory.initElements(driver, UnitedAirHomePage.class);
    }

    @Given("I am in home page")
    public void i_am_in_home_page() throws IOException {
        openBrowser("https://www.united.com/en/us");
    }

    @When("I click on flight status tab")
    public void i_click_on_flight_status_tab() {
        unitedAirHomePage.flightStatusTab();
    }

    @And("I enter city name in from field and To field")
    public void i_enter_city_name_in_from_field_and_to_field() throws InterruptedException {
        unitedAirHomePage.fromAndToField();
    }

    @And("I enter flight number and date")
    public void i_enter_flight_number_and_date() {
        unitedAirHomePage.flightNumberAndDateField();
    }

    @And("I click search button")
    public void i_click_search_button() {
        unitedAirHomePage.searchBtnCheck();
    }

    @Then("I validate DEPARTURE is appeared properly")
    public void i_validate_departure_is_appeared_properly() {
        unitedAirHomePage.validateFlightStatus();
    }

    // Check In
    @When("I click on CheckIn tab")
    public void i_click_on_check_in_tab() {
        unitedAirHomePage.checkInTab();
    }

    @When("I enter ticket number in confirmation field")
    public void i_enter_ticket_number_in_confirmation_field() {
        unitedAirHomePage.ticketNumberField();
    }

    @When("I enter last name in Last name field")
    public void i_enter_last_name_in_last_name_field() {
        unitedAirHomePage.lastNameField();
    }

    @When("I click search box")
    public void i_click_search_box() {
        unitedAirHomePage.searchButtonClick();
    }

    @Then("I validate We couldn't find a reservation with the provided information. is appeared properly")
    public void i_validate_we_couldn_t_find_a_reservation_with_the_provided_information_is_appeared_properly() {
        unitedAirHomePage.validateCheckInfield();
    }

    @When("I click on My trips tab")
    public void i_click_on_my_trips_tab() {
        unitedAirHomePage.myTripTab();
    }

    @When("I enter confirmation number in confirmation field")
    public void i_enter_confirmation_number_in_confirmation_field() {
        unitedAirHomePage.confirmationNumberField();
    }

    @When("I type last name in Last name field")
    public void i_type_last_name_in_last_name_field() {
        unitedAirHomePage.myTripLastNameField();
    }

    @When("I click search box tab")
    public void i_click_search_box_tab() {
        unitedAirHomePage.myTripSearchButtonClick();
    }

    @Then("I validate Your confirmation number, a {int} character alphanumeric code, and\\/or last name is not valid. is appeared properly")
    public void i_validate_your_confirmation_number_a_character_alphanumeric_code_and_or_last_name_is_not_valid_is_appeared_properly(Integer int1) {
        unitedAirHomePage.validateMyTripfield();
    }

}
