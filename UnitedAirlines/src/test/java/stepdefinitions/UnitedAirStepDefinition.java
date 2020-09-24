package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("I am in United Airlines home page")
    public void i_am_in_united_airlines_home_page() throws IOException {
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
    public void i_validate_your_confirmation_number_a_character_alphanumeric_code_and_or_last_name_is_not_valid_is_appeared_properly() {
        unitedAirHomePage.validateMyTripfield();
    }

    //    Check Search Button
    @When("I click on search button")
    public void i_click_on_search_button() {
        unitedAirHomePage.searchIconCheck();
    }

    @When("I click on covid-{int} update")
    public void i_click_on_covid_update(Integer int1) throws InterruptedException {
        unitedAirHomePage.coronavirusUpdate();
    }

    @When("I click on request a refund")
    public void i_click_on_request_a_refund() throws InterruptedException {
        unitedAirHomePage.requestRefundClick();
    }

    @Then("I validate Refund policies is appeared properly")
    public void i_validate_refund_policies_is_appeared_properly() {
        unitedAirHomePage.validateSearchIcon();
    }

    // Flight Receipt
    @When("I click on get a flight receipt")
    public void i_click_on_get_a_flight_receipt() throws InterruptedException {
        unitedAirHomePage.flightReceiptCheck();
    }

//    @And("I enter traveler first name")
//    public void i_enter_traveler_first_name() {
//        unitedAirHomePage.enterFirstName();
//    }

    @And("I enter city name in from field and To fieldtraveler last name")
    public void i_enter_city_name_in_from_field_and_to_fieldtraveler_last_name() {
        unitedAirHomePage.enterLastName();
    }

    @And("I enter Last {int} digits of card")
    public void i_enter_last_digits_of_card(Integer int1) {
        unitedAirHomePage.enterCardNumber();
    }

    @And("I click searchButton box")
    public void i_click_search_button_box() {
        unitedAirHomePage.searchButtonCheck();
    }

    @Then("I validate We couldn't find your receipt is appeared properly")
    public void i_validate_we_couldn_t_find_your_receipt_is_appeared_properly() {
        unitedAirHomePage.validateFlightReceipt();
    }

    /**
     *  Book button check
     */

    @When("I click on Book Button")
    public void i_click_on_book_button() throws InterruptedException {
        unitedAirHomePage.clickOnBookButton();
    }

    @When("I click on Hotels Button")
    public void i_click_on_hotels_button() throws InterruptedException {
        unitedAirHomePage.clickOnHotelButton();
    }

    @When("I enter {string} in where to search box and submit")
    public void i_enter_in_where_to_search_box_and_submit(String searchItem) throws InterruptedException {
        unitedAirHomePage.textOnWhereToSearchBox(searchItem);

    }

    @Then("I validate Miami Beach landing properly")
    public void i_validate_miami_beach_landing_properly() throws InterruptedException {
        unitedAirHomePage.validateLandedPageText();
    }

}
