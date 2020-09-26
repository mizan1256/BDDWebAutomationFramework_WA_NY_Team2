package stepdefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tripadvisorhome.HotelBookPage;

import java.io.IOException;
import java.util.List;

public class HotelBookSteps extends WebAPI {

    HotelBookPage hotelBookPage;

    @BeforeStep
    public void getInit(){
        hotelBookPage = PageFactory.initElements(driver, HotelBookPage.class);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo");
        }
        driver.quit();

    }

    /**
     * TripAdvisor Hotels Booking Steps From Start to End
     */

    @Given("I am on Trip advisor home page")
    public void i_am_on_trip_advisor_home_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/");

    }

    @When("I click on Hotels button")
    public void i_click_on_hotels_button() {
        hotelBookPage.clickOnHotelsBtn();
        sleepFor(3);

    }

    @When("I type {string} in where to field and enter")
    public void i_type_in_where_to_field_and_enter(String destinationName) {
        hotelBookPage.enterDestination(destinationName);
        sleepFor(2);
    }



    @When("I input {string} into checkIn Field")
    public void i_input_into_check_in_field(String checkInDate) {
        hotelBookPage.enterCheckInDate(checkInDate);
        sleepFor(2);
    }

    @When("I input {string} into checkOutField")
    public void i_input_into_check_out_field(String checkOutDate) {
        hotelBookPage.enterCheckOutDate(checkOutDate);
        sleepFor(3);
    }

    @When("I click on update guest button")
    public void i_click_on_update_guest_button() {
        hotelBookPage.clickOnUpdateGuestBtn();
    }

    @When("I click on crown plaza view deal button")
    public void i_click_on_crown_plaza_view_deal_button() {
        hotelBookPage.clickOnViewDealBtn();

    }

    @When("I navigate to crown plaza page and change currency from dropdown")
    public void i_navigate_to_crown_plaza_page_and_change_currency_from_dropdown() {
        hotelBookPage.navigateToCrownPlaza();
        sleepFor(3);
        //hotelBookPage.changeCurrency();

    }

    @When("I select one bed and click on queen bed select room button")
    public void i_select_one_bed_and_click_on_queen_bed_select_room_button() {
        hotelBookPage.clickOnOneBed();
        sleepFor(2);
        hotelBookPage.clickSelectRoomBtn();
        sleepFor(2);

    }

    @When("I select standard rate and click on select rate button")
    public void i_select_standard_rate_and_click_on_select_rate_button() {
        hotelBookPage.clickOnStandardRate();
        sleepFor(2);
        hotelBookPage.clickOnSelectRateBtn();
        sleepFor(3);
    }

    @When("I enter required data into respective fields")
    public void i_enter_required_data_into_respective_fields(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
        hotelBookPage.enterFirstName(data.get(1).get(0));
        hotelBookPage.enterLastName(data.get(1).get(1));
        hotelBookPage.enterEmail(data.get(1).get(2));
        hotelBookPage.enterAddress(data.get(1).get(3));
        hotelBookPage.enterCity(data.get(1).get(4));
        hotelBookPage.enterPostalCode(data.get(1).get(5));
        hotelBookPage.enterPhoneNumber(data.get(1).get(6));
        hotelBookPage.enterCardNumber(data.get(1).get(7));



    }

    @When("I select appropriate data from drop down")
    public void i_select_appropriate_data_from_drop_down(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
        hotelBookPage.selectCountryFromDropdown(data.get(1).get(0));
        sleepFor(3);
        hotelBookPage.selectStateFromDropdown(data.get(1).get(1));
        sleepFor(2);
        hotelBookPage.selectCountryCodeFromDropdown(data.get(1).get(2));
        hotelBookPage.selectCardExpMonth(data.get(1).get(3));
        hotelBookPage.selectCardExpYear(data.get(1).get(4));

    }

    @When("I select certify check mark button")
    public void i_select_certify_check_mark_button() {
        hotelBookPage.clickCheckMark();

    }

    @When("I click on book reservation button")
    public void i_click_on_book_reservation_button() {
        hotelBookPage.clickReservationBtn();

    }






}
