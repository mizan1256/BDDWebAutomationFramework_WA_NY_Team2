package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tripadvisorregistration.TripAdvisorRegistration;


import java.io.IOException;

public class RegistrationStepDefinitions extends WebAPI {
     static TripAdvisorRegistration tripAdvisorHomePage;
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
        tripAdvisorHomePage= PageFactory.initElements(driver, TripAdvisorRegistration.class);
    }

    @Given("I am in TripAdvisor homepage")
    public void i_am_in_trip_advisor_homepage() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @And("I enter Mexico City in searchBox")
    public void i_enter_mexico_city_in_search_box() {
       tripAdvisorHomePage.searchBoxCheck("Mexico City");
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        tripAdvisorHomePage.searchButton();

    }

    @Then("I verify Mexico City is appear properly")
    public void i_verify_mexico_city_is_appear_properly() {
    tripAdvisorHomePage.validateSearchBox("Top result matching \"Mexico City\"");

    }

    @Then("I verify page title as Mexico City")
    public void i_verify_page_title_as_mexico_city() {
        String expectedTitle="Search results: Mexico City - Tripadvisor";
        String actualTitle=driver.getTitle().toString();
        Assert.assertEquals("Title do not match", actualTitle, expectedTitle);
    }
    @And("I click on signIn Button adn continue button")
    public void i_click_on_sign_in_button_adn_continue_button() {
    tripAdvisorHomePage.signInButtonCheck();
    }
    @And("I enter email as {string} and password as {string}")
    public void i_enter_email_as_and_password_as(String email, String password) {
    tripAdvisorHomePage.enterEmailAndPassword(email,password);
    }

    @And("I click on LOG IN")
    public void i_click_on_log_in() {

    }
    @Then("I landed on home page")
    public void i_landed_on_home_page() {

    }

}
