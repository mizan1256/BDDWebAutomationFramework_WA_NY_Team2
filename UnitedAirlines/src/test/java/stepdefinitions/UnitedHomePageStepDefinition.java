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

public class UnitedHomePageStepDefinition extends WebAPI {
    static UnitedAirlinesHomePage homePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, UnitedAirlinesHomePage.class);
    }

    @Given("I am on United homepage")
    public void i_am_on_united_homepage() throws IOException {
        openBrowser("https://www.united.com/");
    }

    @Given("I click on signInOption")
    public void i_click_on_sign_in_option() {
        homePage.clickSignInOption();
    }

    @Given("I enter userName and password")
    public void i_enter_user_name_and_password() {
        homePage.enterUserNameAndPassword("mtt123", "abc1233");
    }

    @When("I click loginButton")
    public void i_click_login_button() {
        homePage.clickLoginButton();
    }

    @Then("I verify image")
    public void i_verify_image() {
//        homePage.verifyText();
        homePage.verifyImage();
    }

    @Given("I enter {string} and {string}")
    public void i_enter_and(String userName, String password) {
        homePage.enterUserNameAndPassword(userName, password);
    }

    @Given("i click on the searchLogo")
    public void i_click_on_the_search_logo() {
        homePage.clickSearchLogo();
    }

    @Given("I enter {string} in the searchBox")
    public void i_enter_in_the_search_box(String searchItem) {
        homePage.searchItemInSearchBox(searchItem);
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        homePage.clickSearch();
    }

    @Then("I verify searchText")
    public void i_verify_search_text() throws InterruptedException {
        homePage.verifySearchText();
    }


    @Given("I enter location From*")
    public void i_enter_location_from() {
        homePage.enterFromLocationToSearchFlight();

    }

    @Given("I enter location To*")
    public void i_enter_location_to() {

        homePage.enterToLocationToSearchFlight();


    }

    @Given("I clear enter departDate")
    public void i_clear_enter_depart_date() {

        homePage.enterDepartDateToSearchFlight();

    }

    @Given("I clear enter returnDate")
    public void i_clear_enter_return_date() {
        homePage.enterReturnDateToSearchFlight();

    }

    @When("I click findFlights")
    public void i_click_find_flights() {
        homePage.clickFindFlightsSearchFlight();
    }

    @Then("I verify SearchFlightsTitle")
    public void i_verify_search_flights_title() {
        homePage.validateSearchFlightTitle();
    }

    @Given("I enter destination location {string}*")
    public void i_enter_destination_location(String Paris) throws InterruptedException {
        sleepFor(5);
        homePage.enterToLocationToSearchFlight(Paris);
    }


    @Given("I clear enter depart Date departDate")
    public void i_clear_enter_depart_date_depart_date() {
        homePage.enterDepartDateToSearchFlight();

    }

    @Given("I clear enter return date returnDate")
    public void i_clear_enter_return_date_return_date() {
        homePage.enterReturnDateToSearchFlight();

    }



}
