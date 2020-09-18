package stepdefinations;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import tripadvisorhome.TripAdvisorHomePage;

import java.io.IOException;

public class TripAdvisorStepDefinition extends WebAPI {
    static TripAdvisorHomePage tripAdvisorHomePage;
// Cucumber Hook
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
    openBrowser();
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
    public void i_verify_cox_s_bazar_is_appear_properly() {
    tripAdvisorHomePage.searchButtonCheckText("Cox's Bazar");

    }

    @And("I verify page title as Search results: Cox's Bazar - Tripadvisor")
    public void i_verify_page_title_as_search_results_cox_s_bazar_tripadvisor() {

    }
}
