package stepdefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
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
import unitedairlineshome.UnitedAirlinesHomePage;

import java.io.IOException;
import java.util.List;

public class StepDefinitions extends WebAPI {


    static UnitedAirlinesHomePage unitedAirlinesHomePage;

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
        unitedAirlinesHomePage = PageFactory.initElements(driver, UnitedAirlinesHomePage.class);
    }
    @Given("I am in United Airlines home page")
    public void i_am_in_united_airlines_home_page() throws IOException {
        openBrowser("https://www.united.com/en/us");
    }

    @When("I click on signIn button")
    public void i_click_on_sign_in_button() throws InterruptedException {
        unitedAirlinesHomePage.signInButton();
    }

    @When("I click on join now and use title")
    public void i_click_on_join_now_and_use_title() throws InterruptedException {
        unitedAirlinesHomePage.joinNowButton();
    }

    @When("I use data in member information field")
    public void i_use_data_in_member_information_field(DataTable data) throws InterruptedException {
        List<List<String>> sign = data.asLists(String.class);
        unitedAirlinesHomePage.typeFirstName(sign.get(1).get(0));
        unitedAirlinesHomePage.typeMiddleName(sign.get(1).get(1));
        unitedAirlinesHomePage.typeLastName(sign.get(1).get(2));
        unitedAirlinesHomePage.typeDate(sign.get(1).get(3));
        unitedAirlinesHomePage.typeYear(sign.get(1).get(4));
    }
    @When("month and gender field is selected")
    public void month_and_gender_field_is_selected() throws InterruptedException {
        unitedAirlinesHomePage.monthAndGender();
    }


    @Then("I validate Contact Information is appeared properly")
    public void i_validate_contact_information_is_appeared_properly() {
        unitedAirlinesHomePage.setValidateSignUp();
    }

//      Contact information test
    @When("I entered data in Contact Information field")
    public void i_entered_data_in_contact_information_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirlinesHomePage.typeStreetName(sign.get(1).get(0));
        unitedAirlinesHomePage.typeCityName(sign.get(1).get(1));
        unitedAirlinesHomePage.typeStateName(sign.get(1).get(2));
        unitedAirlinesHomePage.typeZipCode(sign.get(1).get(3));
    }

    @Then("I validate {string} appear properly")
    public void i_validate_appear_properly(String phone) {
        unitedAirlinesHomePage.ValidateContactInformation(phone);
    }

//      Phone number field check
    @When("I entered data in phone number field")
    public void i_entered_data_in_phone_number_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirlinesHomePage.typePhoneNumber(sign.get(1).get(0));
        unitedAirlinesHomePage.typeExtensionPhone(sign.get(1).get(1));
        unitedAirlinesHomePage.typeBusinessPhone(sign.get(1).get(2));
        unitedAirlinesHomePage.typeExtensionBusinessPhn(sign.get(1).get(3));
        unitedAirlinesHomePage.typeAirportName(sign.get(1).get(4));
    }
    @And("I click on check box field")
    public void i_click_on_check_box_field() {
        unitedAirlinesHomePage.checkBoxClick();
    }
    @Then("I verify {string} appear properly")
    public void i_verify_appear_properly(String email) {
        unitedAirlinesHomePage.ValidatePhoneNumber(email);
    }

//      Email field test
    @When("I entered data in email field")
    public void i_entered_data_in_email_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirlinesHomePage.typeEmailAddressField(sign.get(1).get(0));
        unitedAirlinesHomePage.typeVerifyEmailId(sign.get(1).get(1));
    }
    @When("I click on check box and uncheck box")
    public void i_click_on_check_box_and_uncheck_box() throws InterruptedException {
        unitedAirlinesHomePage.checkAndUnCheckBox();
    }
    @When("I entered data in password field")
    public void i_entered_data_in_password_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirlinesHomePage.typePasswordField(sign.get(1).get(0));
        unitedAirlinesHomePage.typeReEnterPassword(sign.get(1).get(1));
    }
    @When("I click on Show button")
    public void i_click_on_show_button() throws InterruptedException {
        unitedAirlinesHomePage.showButton();
    }
    @Then("I verify {string} display properly")
    public void i_verify_display_properly(String text) {
        unitedAirlinesHomePage.ValidateEmailField(text);
    }

//      Security questions check
    @When("I entered data in answer field")
    public void i_entered_data_in_answer_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirlinesHomePage.questionAndAnswer1(sign.get(1).get(0));
        unitedAirlinesHomePage.questionAndAnswer2(sign.get(2).get(0));
        unitedAirlinesHomePage.questionAndAnswer3(sign.get(3).get(0));
        unitedAirlinesHomePage.questionAndAnswer4(sign.get(4).get(0));
        unitedAirlinesHomePage.questionAndAnswer5(sign.get(5).get(0));
    }
    @When("I click on accept and enroll button")
    public void i_click_on_accept_and_enroll_button() {
        unitedAirlinesHomePage.acceptAndEnrollBtn();
    }


    @When("I click on flight status tab")
    public void i_click_on_flight_status_tab() {
        unitedAirlinesHomePage.flightStatusTab();
    }

    @And("I enter city name in from field and To field")
    public void i_enter_city_name_in_from_field_and_to_field() throws InterruptedException {
        unitedAirlinesHomePage.fromAndToField();
    }

    @And("I enter flight number and date")
    public void i_enter_flight_number_and_date() {
        unitedAirlinesHomePage.flightNumberAndDateField();
    }

    @And("I click search button")
    public void i_click_search_button() {
        unitedAirlinesHomePage.searchBtnCheck();
    }

    @Then("I validate DEPARTURE is appeared properly")
    public void i_validate_departure_is_appeared_properly() {
        unitedAirlinesHomePage.validateFlightStatus();
    }

    // Check In
    @When("I click on CheckIn tab")
    public void i_click_on_check_in_tab() {
        unitedAirlinesHomePage.checkInTab();
    }

    @When("I enter ticket number in confirmation field")
    public void i_enter_ticket_number_in_confirmation_field() {
        unitedAirlinesHomePage.ticketNumberField();
    }

    @When("I enter last name in Last name field")
    public void i_enter_last_name_in_last_name_field() {
        unitedAirlinesHomePage.lastNameField();
    }

    @When("I click search box")
    public void i_click_search_box() {
        unitedAirlinesHomePage.searchButtonClick();
    }

    @Then("I validate We couldn't find a reservation with the provided information. is appeared properly")
    public void i_validate_we_couldn_t_find_a_reservation_with_the_provided_information_is_appeared_properly() {
        unitedAirlinesHomePage.validateCheckInfield();
    }

    @When("I click on My trips tab")
    public void i_click_on_my_trips_tab() {
        unitedAirlinesHomePage.myTripTab();
    }

    @When("I enter confirmation number in confirmation field")
    public void i_enter_confirmation_number_in_confirmation_field() {
        unitedAirlinesHomePage.confirmationNumberField();
    }

    @When("I type last name in Last name field")
    public void i_type_last_name_in_last_name_field() {
        unitedAirlinesHomePage.myTripLastNameField();
    }

    @When("I click search box tab")
    public void i_click_search_box_tab() {
        unitedAirlinesHomePage.myTripSearchButtonClick();
    }

    @Then("I validate Your confirmation number, a {int} character alphanumeric code, and\\/or last name is not valid. is appeared properly")
    public void i_validate_your_confirmation_number_a_character_alphanumeric_code_and_or_last_name_is_not_valid_is_appeared_properly() {
        unitedAirlinesHomePage.validateMyTripfield();
    }

    //    Check Search Button
    @When("I click on search button")
    public void i_click_on_search_button() {
        unitedAirlinesHomePage.searchIconCheck();
    }

    @When("I click on covid-{int} update")
    public void i_click_on_covid_update(Integer int1) throws InterruptedException {
        unitedAirlinesHomePage.coronavirusUpdate();
    }

    @When("I click on request a refund")
    public void i_click_on_request_a_refund() throws InterruptedException {
        unitedAirlinesHomePage.requestRefundClick();
    }

    @Then("I validate Refund policies is appeared properly")
    public void i_validate_refund_policies_is_appeared_properly() {
        unitedAirlinesHomePage.validateSearchIcon();
    }

    // Flight Receipt
    @When("I click on get a flight receipt")
    public void i_click_on_get_a_flight_receipt() throws InterruptedException {
        unitedAirlinesHomePage.flightReceiptCheck();
    }


    @And("I enter city name in from field and To fieldtraveler last name")
    public void i_enter_city_name_in_from_field_and_to_fieldtraveler_last_name() {
        unitedAirlinesHomePage.enterLastName();
    }

    @And("I enter Last {int} digits of card")
    public void i_enter_last_digits_of_card(Integer int1) {
        unitedAirlinesHomePage.enterCardNumber();
    }

    @And("I click searchButton box")
    public void i_click_search_button_box() {
        unitedAirlinesHomePage.searchButtonCheck();
    }

    @Then("I validate We couldn't find your receipt is appeared properly")
    public void i_validate_we_couldn_t_find_your_receipt_is_appeared_properly() {
        unitedAirlinesHomePage.validateFlightReceipt();
    }


//     Book button check
    @When("I click on Book Button")
    public void i_click_on_book_button() throws InterruptedException {
        unitedAirlinesHomePage.clickOnBookButton();
    }

    @When("I click on Hotels Button")
    public void i_click_on_hotels_button() throws InterruptedException {
        unitedAirlinesHomePage.clickOnHotelButton();
    }

    @When("I enter {string} in where to search box and submit")
    public void i_enter_in_where_to_search_box_and_submit(String searchItem) throws InterruptedException {
        unitedAirlinesHomePage.textOnWhereToSearchBox(searchItem);

    }

    @Then("I validate Miami Beach landing properly")
    public void i_validate_miami_beach_landing_properly() throws InterruptedException {
        unitedAirlinesHomePage.validateLandedPageText();
    }


}
