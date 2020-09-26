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
import tripadvisorhome.TripAdvisorHomePage;

import java.io.IOException;

public class StepDefinitions extends WebAPI {

    static TripAdvisorHomePage tripAdvisorHomePage;

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
        tripAdvisorHomePage = PageFactory.initElements(driver, TripAdvisorHomePage.class);
    }

    // Search Box
    @Given("I am in Trip Advisor home page")
    public void i_am_in_trip_advisor_home_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @When("I enter Texas in search box")
    public void i_enter_texas_in_search_box() {
        tripAdvisorHomePage.WhereToSearchBox();
    }

    @And("I click on search button")
    public void i_click_on_search_button() throws InterruptedException {
        tripAdvisorHomePage.searchButtonClick();
    }

    @And("I click on Hotels Button")
    public void i_click_on_hotels_button() {
        tripAdvisorHomePage.hotelButtonClick();
    }

    @Then("I verify {string} is appeared properly")
    public void i_verify_is_appeared_properly(String string) {
        tripAdvisorHomePage.validateWhereToSearchBox();
    }

    // Vacation Rentals
    @When("I click vacation rentals tab")
    public void i_click_vacation_rentals_tab() {
        tripAdvisorHomePage.vacationRentalsTabCheck();
    }

    // Restaurant Tab
    @When("I click Restaurants tab")
    public void i_click_restaurants_tab() {
        tripAdvisorHomePage.restaurantTabCheck();
    }

    @And("I click Texas Roadhouse")
    public void i_click_texas_roadhouse() {
        tripAdvisorHomePage.texasRoadHouse();
    }

    @And("I navigate new windows")
    public void i_navigate_new_windows() {
        tripAdvisorHomePage.navigateTexasRoadHouse();
    }

    @And("I click food picture")
    public void i_click_food_picture() {
        tripAdvisorHomePage.foodImageClick();
    }

    @And("I click Gallery button")
    public void i_click_gallery_button() {
        tripAdvisorHomePage.restaurantGallery();
    }

    @Then("I verify food image is appeared properly")
    public void i_verify_food_image_is_appeared_properly() {
        tripAdvisorHomePage.validateRestaurant();
    }

    //  Flights status
    @When("I click on TravelForum")
    public void i_click_on_travel_forum() throws InterruptedException {
        tripAdvisorHomePage.travelForumCheck();
    }

    @And("I click on Flights")
    public void i_click_on_flights() throws InterruptedException {
        tripAdvisorHomePage.flightTab();
    }

    @And("I enter Where from and To field")
    public void i_enter_where_from_and_to_field() throws InterruptedException {
        tripAdvisorHomePage.whereFromToField();
    }

    @And("I enter departure and arrival date")
    public void i_enter_departure_and_arrival_date() throws InterruptedException {
        tripAdvisorHomePage.calenderCheckIn();
    }

    @When("I enter person field and close person field")
    public void i_enter_person_field_and_close_person_field() throws InterruptedException {
        tripAdvisorHomePage.personField();
    }

    @And("I click on find flight button")
    public void i_click_on_find_flight_button() throws InterruptedException {
        tripAdvisorHomePage.findFlightBox();
    }

    @Then("I verify COVID-{int} Policies is appeared properly")
    public void i_verify_covid_policies_is_appeared_properly(Integer int1) {
        tripAdvisorHomePage.validateTravelForum();
    }

    //  One Way Trip
    @And("I click on TravelForum and click on Flight")
    public void i_click_on_travel_forum_and_click_on_flight() throws InterruptedException {
        tripAdvisorHomePage.travelForumAndFlightClick();
    }

    @And("I click on One way tab")
    public void i_click_on_one_way_tab() {
        tripAdvisorHomePage.oneWayTab();
    }

    @And("I enter departure date")
    public void i_enter_departure_date() throws InterruptedException {
        tripAdvisorHomePage.calenderOneWay();
    }

    //    Things to Do
    @When("I click on Things to Do")
    public void i_click_things_to_do() {
        tripAdvisorHomePage.thingsToDoCheck();
    }

    @When("I type in searchBox and submit")
    public void i_type_in_search_box_and_submit() {
        tripAdvisorHomePage.dhakaCity();
    }

    @Then("I verify Dhaka City is appeared properly")
    public void i_varify_dhaka_city_is_appeared_properly() {
        tripAdvisorHomePage.validateThingsToDo();
    }

    //    Trip Button
    @When("I click on trip button")
    public void i_click_on_trip_button() {
        tripAdvisorHomePage.tripTabBtn();
    }

    @And("I click on get start")
    public void i_click_on_get_start() {
        tripAdvisorHomePage.getStartBtn();
    }

    @Then("I verify reCAPCHA is appeared properly")
    public void i_verify_re_capcha_is_appeared_properly() {
        tripAdvisorHomePage.validateTripBtn();
    }

    //    Post Tab
    @When("I click on Post tab")
    public void i_click_on_post_tab() {
        tripAdvisorHomePage.postTabButton();
    }

    @When("I click on Post Photo")
    public void i_click_on_post_photo() throws InterruptedException {
        tripAdvisorHomePage.postPhotoDropDownBtn();
    }

    @When("I click on hotel radio button")
    public void i_click_on_hotel_radio_button() {
        tripAdvisorHomePage.hotelRadioButton();
    }

    @When("I type hotel name and city name and click search button")
    public void i_type_hotel_name_and_city_name_and_click_search_button() throws InterruptedException {
        tripAdvisorHomePage.enterHotelAndCityName();
    }
    @When("select and click radio button")
    public void select_and_click_radio_button() throws InterruptedException {
        tripAdvisorHomePage.hotel71RadioButton();
    }

    @When("I click on Post Photos Button and click add photo btn")
    public void i_click_on_post_photos_button_and_click_add_photo_btn() {
        tripAdvisorHomePage.postPhotoButton();
    }

    @When("I click on select photo from your computer.")
    public void i_click_on_select_photo_from_your_computer() throws InterruptedException {
        tripAdvisorHomePage.selectPhotoFromComputer();
    }




    @Given("I am on TripAdvisor HomePage")
    public void i_am_on_trip_advisor_home_page() {

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
