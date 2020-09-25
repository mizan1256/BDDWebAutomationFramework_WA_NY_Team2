package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tripadvisorhome.TripAdvisorHomePage;

public class TripAdvisorStepDefinition extends WebAPI {
    static TripAdvisorHomePage tripAdvisorHomePage;
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
        tripAdvisorHomePage=
                PageFactory.initElements(driver,TripAdvisorHomePage.class);
    }

//    @Given("I am in TripAdvisor homepage")
//    public void i_am_in_trip_advisor_homepage() throws IOException {
//    openBrowser("https://www.tripadvisor.com/");
//
//    }
//    @Given("I am in Trip Advisor home page")
//    public void i_am_in_trip_advisor_home_page() throws IOException {
//        openBrowser("https://www.tripadvisor.com/");

    @And("I enter Cox's Bazar in searchBox")
    public void i_enter_cox_s_bazar_in_search_box() throws InterruptedException {
    tripAdvisorHomePage.searchBoxCheck("Cox's Bazar");
    }

    @When("I click searchButton")
    public void i_click_search_button() {
    tripAdvisorHomePage.searchButtonCheck();
    }

    @Then("I verify Cox's Bazar is appear properly")
    public void i_verify_cox_s_bazar_is_appear_properly() {
    tripAdvisorHomePage.searchButtonTextCheck("Top results matching \"Cox's Bazar\"");
    }

    @And("I verify page title as Search results: Cox's Bazar - Tripadvisor")
    public void i_verify_page_title_as_search_results_cox_s_bazar_tripadvisor() {
    String expectedTitle="Search results: Cox's Bazar - Tripadvisor";
    String actualTitle=driver.getTitle();
    Assert.assertEquals("Title don't match",expectedTitle,actualTitle);
    }

//paris hotel

    @And("I click Hotels Button in homepage")
    public void i_click_hotels_button_in_homepage() {

        tripAdvisorHomePage.hotelButtonCheck();
    }

    @When("I enter on Paris in searchBox")
    public void i_enter_on_paris_in_search_box() {
     tripAdvisorHomePage.enterSearchItem("Paris");
    }


    @And("I verify Paris hotels is appear properly")
    public void i_verify_paris_hotels_is_appear_properly() {
    tripAdvisorHomePage.hotelValidateText();
    }

    @When("I verify page title")
    public void i_verify_page_title() {
    String expectedTitle="Search results: Paris - Tripadvisor";
    String actualTitle=driver.getTitle();
    Assert.assertEquals("Don't Exist",expectedTitle,actualTitle);
    }




}
