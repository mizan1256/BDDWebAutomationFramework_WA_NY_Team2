package stepdefinitions;


import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tripadvisorhome.TripAdvisorHome;

import java.io.IOException;

public class TripAdvisorHomePageStepDefinitions extends WebAPI {


    static TripAdvisorHome tripAdvisorHome;
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit(){
        tripAdvisorHome= PageFactory.initElements(driver, TripAdvisorHome.class);
    }
    // Search Box
    @Given("I am in Trip Advisor home page")
    public void i_am_in_trip_advisor_home_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @When("I type Texas i search box")
    public void i_type_texas_i_search_box() {
        tripAdvisorHome.WhereToSearchBox();
    }

    @And("I click search button")
    public void i_click_search_button() throws InterruptedException {
        tripAdvisorHome.searchButtonClick();
    }

    @And("I click Hotels Button")
    public void i_click_hotels_button() throws InterruptedException {
        tripAdvisorHome.hotelButtonClick();
    }

    @Then("I varify {string} is appeared properly")
    public void i_varify_is_appeared_properly(String string) {
        tripAdvisorHome.validateWhereToSearchBox();
    }

    // Vacation Rentals
    @When("I click vacation rentals tab")
    public void i_click_vacation_rentals_tab() {
        tripAdvisorHome.vacationRentalsTabCheck();
    }

    // Restaurant Tab
    @When("I click Restaurants tab")
    public void i_click_restaurants_tab() {
        tripAdvisorHome.restaurantTabCheck();
    }

    @And("I click Texas Roadhouse")
    public void i_click_texas_roadhouse() {
        tripAdvisorHome.texasRoadHouse();
    }

    @And("I navigate new windows")
    public void i_navigate_new_windows() {
        tripAdvisorHome.navigateTexasRoadHouse();
    }

    @And("I click food picture")
    public void i_click_food_picture() {
        tripAdvisorHome.foodImageClick();
    }

    @And("I click Gallery button")
    public void i_click_gallery_button() {
        tripAdvisorHome.restaurantGallery();
    }

    @Then("I varify food image is appeared properly")
    public void i_varify_food_image_is_appeared_properly() {
        tripAdvisorHome.validateRestaurant();
    }

    // Flights status
    @When("I click TravelForum")
    public void i_click_travel_forum() throws InterruptedException {
        tripAdvisorHome.travelForumCheck();
    }

    @And("I click Flights")
    public void i_click_flights() throws InterruptedException {
        tripAdvisorHome.flightTab();
    }

    @And("I enter Where from and To field")
    public void i_enter_where_from_and_to_field() throws InterruptedException {
        tripAdvisorHome.whereFromToField();
    }

    @And("I enter departure and arrival date")
    public void i_enter_departure_and_arrival_date() throws InterruptedException {
        tripAdvisorHome.calenderCheckIn();
    }

    @When("I enter person field and close person field")
    public void i_enter_person_field_and_close_person_field() throws InterruptedException {
        tripAdvisorHome.personField();
    }

    @And("I click find flight button")
    public void i_click_find_flight_button() throws InterruptedException {
        tripAdvisorHome.findFlightBox();
    }

    @Then("I varify COVID-{int} Policies is appeared properly")
    public void i_varify_covid_policies_is_appeared_properly(Integer int1) {
        tripAdvisorHome.validateTravelForum();
    }
    // One Way Trip

    @And("I click TravelForum and click Flight")
    public void i_click_travel_forum_and_click_flight() throws InterruptedException {
        tripAdvisorHome.travelForumAndFlightClick();
    }

    @And("I click One way tab")
    public void i_click_one_way_tab() {
        tripAdvisorHome.oneWayTab();
    }

    @And("I enter departure date")
    public void i_enter_departure_date() throws InterruptedException {
        tripAdvisorHome.calenderOneWay();
    }

    // Things to Do
    @When("I click Things to Do")
    public void i_click_things_to_do() {
        tripAdvisorHome.thingsToDoCheck();
    }

    @When("I type in searchBox and submit")
    public void i_type_in_search_box_and_submit() {
        tripAdvisorHome.dhakaCity();
    }

    @Then("I varify Dhaka City is appeared properly")
    public void i_varify_dhaka_city_is_appeared_properly() {
        tripAdvisorHome.validateThingsToDo();
    }

    // Trip Button
    @When("I click trip button")
    public void i_click_trip_button() {
        tripAdvisorHome.tripTabBtn();
    }

    @And("I click get start")
    public void i_click_get_start() {
        tripAdvisorHome.getStartBtn();
    }

    @Then("I varify reCAPCHA is appeared properly")
    public void i_varify_re_capcha_is_appeared_properly() {
        tripAdvisorHome.validateTripBtn();
    }

    // Post Tab
    @When("I click Post")
    public void i_click_post() {
        tripAdvisorHome.postTabButton();
    }

    @When("I click Post Photo")
    public void i_click_post_photo() throws InterruptedException {
        tripAdvisorHome.postPhotoDropDownBtn();
    }

    @When("I click hohel radio button")
    public void i_click_hohel_radio_button() {
        tripAdvisorHome.hotelRadioButton();
    }

    @When("I type hotel name and city name and click search button")
    public void i_type_hotel_name_and_city_name_and_click_search_button() throws InterruptedException {
        tripAdvisorHome.enterHotelAndCityName();
    }
    @When("select and click radio button")
    public void select_and_click_radio_button() throws InterruptedException {
        tripAdvisorHome.hotel71RadioButton();
    }

    @When("I click Post Photos Button and click add photo btn")
    public void i_click_post_photos_button_and_click_add_photo_btn() {
        tripAdvisorHome.postPhotoButton();
    }

    @When("I click select photo from your computer.")
    public void i_click_select_photo_from_your_computer() throws InterruptedException {
        tripAdvisorHome.selectPhotoFromComputer();
    }
}
