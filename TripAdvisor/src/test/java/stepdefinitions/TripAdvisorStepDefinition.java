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
import tripadvisorhome.TripAdvisorHomePage;

import java.io.IOException;

public class TripAdvisorStepDefinition extends WebAPI {

    static TripAdvisorHomePage homePage;

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
    public static void getInIt(){

        homePage= PageFactory.initElements(driver,TripAdvisorHomePage.class);
    }

    @Given("I am in TripAdvisor homepage")
    public void i_am_in_trip_advisor_homepage() throws IOException {
    openBrowser("https://www.tripadvisor.com/");
    }

    @And("I enter Cox's Bazar in searchBox")
    public void i_enter_cox_s_bazar_in_search_box() throws InterruptedException {
        homePage.searchBoxCheck("Cox's Bazar");

    }

    @When("I click searchButton")
    public void i_click_search_button() {
        homePage.searchButtonClick();

    }

    @Then("I verify Cox's Bazar is appear properly")
    public void i_verify_cox_s_bazar_is_appear_properly() throws InterruptedException {
        homePage.searchButtonCheck("Cox's Bazar");

    }

    @And("I verify page title as Search results: Cox's Bazar - Tripadvisor")
    public void i_verify_page_title_as_search_results_cox_s_bazar_tripadvisor() {
    String expectedTitle="Search results: Cox's Bazar - Tripadvisor";
    String actualTitle=driver.getTitle();
        Assert.assertEquals("title doesn't match", expectedTitle,actualTitle);
    }

    @When("I click on Post")
    public void i_click_on_post() {
        homePage.clickOnPost();
    }

    @And("I click Write a Review")
    public void i_click_write_a_review() {
      homePage.clickOnWriteAReview();
    }

    @Then("I verify Review page")
    public void i_verify_review_page() {
      homePage.validate_ClickOnWriteAReview();
    }

    @When("I click on Alerts")
    public void i_click_on_alerts() {
       homePage.clickOnAlerts();
    }

    @And("I enter email address")
    public void i_enter_email_address(String email) {
       homePage.enterEmail(email);
    }

    @And("I enter password")
    public void i_enter_password(String password) {
    homePage.enterPassword(password);
    }

    @Then("i click on join")
    public void i_click_on_join() {
        homePage.clickOnJoin();
    }

    @Then("i verify alerts page")
    public void i_verify_alerts_page() {
       homePage.validate_ClickOnAlerts();
    }
//////////////////////////////////////////

    @When("I click on SignIn")
    public void i_click_on_sign_in() {
        homePage.clickOnSignIn();
    }

    @Then("I click on continue with email")
    public void i_click_on_continue_with_email() {
        homePage.clickOnContinueWithEmail();
    }

    @And("i enter password")
    public void i_enter_password() {
        homePage.enterPassword();
    }

    @Then("i verify error message")
    public void i_verify_error_message() {
       homePage.validate_ClickOnSignIn();
    }
}
