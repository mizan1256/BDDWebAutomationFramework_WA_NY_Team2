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

import static unitedairlineshome.UnitedAirlinesHopeWebElement.*;

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

    @Given("I am in United Air home page")
    public void i_am_in_United_Air_home_page() throws IOException {
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

    /**
     * United Air Check in test
     */
    @When("I click Check In")
    public void i_click_check_in() {
    unitedAirlinesHomePage.clickByXpath(checkInBtnWebElement);
    }

    @When("I enter ticket Number and Last Name")
    public void i_enter_ticket_number_and_last_name() throws InterruptedException {
   unitedAirlinesHomePage.enterConfirmationAndLastName();
    }
    @Then("I click checkIn Search Button")
    public void i_click_checkIn_search_button() {
        unitedAirlinesHomePage.clickOnCheckInSearchBtn();
    }
    @Then("I validate Check In page message")
    public void i_validate_check_in_page_message() {
        unitedAirlinesHomePage.validateCheckInTxt();
    }

    /**
     * United Airlines Book Button functionality test
     */
    @When("I click on Book Button")
    public void i_click_on_book_button() {
    unitedAirlinesHomePage.clickOnBookBtn();
    }

    @When("I click on Hotels Button")
    public void i_click_on_hotels_button() {
    unitedAirlinesHomePage.clickOnHotelsBtn();
    }

    @When("I enter {string} in searchBox and submit")
    public void i_enter_in_search_box_and_submit(String searchItem) throws InterruptedException {
    unitedAirlinesHomePage.enterSearchBoxAndSubmit(searchItem);
    }

    @Then("I validate Landed page properly")
    public void i_validate_landed_page_properly() throws InterruptedException {
        unitedAirlinesHomePage.validateLandedPageTxt();

    }

    @Given("I click on signInOption")
    public void i_click_on_sign_in_option() {
        unitedAirlinesHomePage.clickSignInOption();
    }

    @Given("I enter userName and password")
    public void i_enter_user_name_and_password() {
        unitedAirlinesHomePage.enterUserNameAndPassword("mtt123", "abc1233");
    }

    @When("I click loginButton")
    public void i_click_login_button() {
        unitedAirlinesHomePage.clickLoginButton();
    }

    @Then("I verify image")
    public void i_verify_image() {

//        homePage.verifyText();
        unitedAirlinesHomePage.verifyImage();
    }

    @Given("I enter {string} and {string}")
    public void i_enter_and(String userName, String password) {
        unitedAirlinesHomePage.enterUserNameAndPassword(userName, password);
    }

    @Given("i click on the searchLogo")
    public void i_click_on_the_search_logo() {
        unitedAirlinesHomePage.clickSearchLogo();
    }

    @Given("I enter {string} in the searchBox")
    public void i_enter_in_the_search_box(String searchItem) {
        unitedAirlinesHomePage.searchItemInSearchBox(searchItem);
    }
    @When("I click searchButton")
    public void i_click_searchButton() {
        unitedAirlinesHomePage.clickSearch();
    }

    @Then("I verify searchText")
    public void i_verify_search_text() throws InterruptedException {
        unitedAirlinesHomePage.verifySearchText();
    }


    @Given("I enter location From*")
    public void i_enter_location_from() {
        unitedAirlinesHomePage.enterFromLocationToSearchFlight();

    }

    @Given("I enter location To")
    public void i_enter_location_to() {
        unitedAirlinesHomePage.enterToLocationToSearchFlight();
    }

    @Given("I clear enter departDate")
    public void i_clear_enter_depart_date() throws InterruptedException {
        unitedAirlinesHomePage.enterDepartDateToSearchFlight();
    }

    @Given("I clear enter returnDate")
    public void i_clear_enter_return_date() {
        unitedAirlinesHomePage.enterReturnDateToSearchFlight();

    }

    @When("I click findFlights")
    public void i_click_find_flights() {
        unitedAirlinesHomePage.clickFindFlightsSearchFlight();
    }

    @Then("I verify SearchFlightsTitle")
    public void i_verify_search_flights_title() {
        unitedAirlinesHomePage.validateSearchFlightTitle();
    }

    @Given("I enter destination location {string}*")
    public void i_enter_destination_location(String Paris) throws InterruptedException {
        sleepFor(5);
        unitedAirlinesHomePage.enterToLocationToSearchFlight(Paris);
    }

    @Given("I clear enter depart Date departDate")
    public void i_clear_enter_depart_date_depart_date() throws InterruptedException {
        unitedAirlinesHomePage.enterDepartDateToSearchFlight();
    }

    @Given("I clear enter return date returnDate")
    public void i_clear_enter_return_date_return_date() {
        unitedAirlinesHomePage.enterReturnDateToSearchFlight();

    }

}
