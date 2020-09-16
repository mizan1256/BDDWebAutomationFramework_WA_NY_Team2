package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import tripadvisorhome.TripAdvisorHomePage;

import java.io.IOException;

public class TripAdvisorStepDefinition extends WebAPI {

    static TripAdvisorHomePage tripAdvisorHomePage;
    //cucumber hook
    @After
    public void closeBrowser(){

        cleanUp();
    }
    @BeforeStep
    public static void getInIt(){

        tripAdvisorHomePage= PageFactory.initElements(driver,TripAdvisorHomePage.class);
    }

    @Given("I am in TripAdvisor homepage")
    public void i_am_in_trip_advisor_homepage() throws IOException {
    openBrowser("https://www.tripadvisor.com/");
    }

    @And("I enter Cox's Bazar in searchBox")
    public void i_enter_cox_s_bazar_in_search_box() throws InterruptedException {
        tripAdvisorHomePage.searchBoxCheck("Cox's Bazar");

    }

    @When("I click searchButton")
    public void i_click_search_button() {
        tripAdvisorHomePage.searchButtonClick();

    }

    @Then("I verify Cox's Bazar is appear properly")
    public void i_verify_cox_s_bazar_is_appear_properly() throws InterruptedException {
        tripAdvisorHomePage.searchButtonCheck("Cox's Bazar");

    }

    @And("I verify page title as Search results: Cox's Bazar - Tripadvisor")
    public void i_verify_page_title_as_search_results_cox_s_bazar_tripadvisor() {
    String expectedTitle="Search results: Cox's Bazar - Tripadvisor";
    String actualTitle=driver.getTitle();
        Assert.assertEquals("title doesn't match", expectedTitle,actualTitle);
    }

    @When("I click on Post")
    public void i_click_on_post() {
        tripAdvisorHomePage.clickOnPost();
    }

    @And("I click Write a Review")
    public void i_click_write_a_review() {
      tripAdvisorHomePage.clickOnWriteAReview();
    }

    @Then("I verify Review page")
    public void i_verify_review_page() {
      tripAdvisorHomePage.validate_ClickOnWriteAReview();
    }

    @When("I click on Alerts")
    public void i_click_on_alerts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("I enter email address")
    public void i_enter_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("I enter password")
    public void i_enter_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("i click on join")
    public void i_click_on_join() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("i verify alerts page")
    public void i_verify_alerts_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
