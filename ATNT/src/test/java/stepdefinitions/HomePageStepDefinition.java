package stepdefinitions;

import atnthome.AtntHome;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
public class HomePageStepDefinition extends WebAPI {
    static AtntHome atntHome;            // Instance
    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
// Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp(); }
    @BeforeStep
    public void getInit(){
        atntHome= PageFactory.initElements(driver,AtntHome.class);
    }
    @Given("I am on Atnt HomePage")
    public void i_am_on_atnt_home_page() throws IOException {
       openBrowser("https://www.att.com/");
    }
    @When("I click on Prepaid Button")
    public void i_click_on_prepaid_button() {
        atntHome.prepaidButtonCheck();
    }
    @When("I click on Mobile Plans")
    public void i_click_on_mobile_plans() {
        atntHome.mobilePlansButtonCheck();
    }
    @Then("I verify SM is appeared properly")
    public void i_verify_sm_is_appeared_properly() {
        atntHome.validatePrepaidButton("SM");
    }
    @Then("I verify page title")
    public void i_verify_page_title() {
        atntHome.validatePrepaidTitlePage();
    }

    @When("I click on Bundles Button")
    public void i_click_on_bundles_button() {
        atntHome.bundleButtonCheck();
    }
    @When("I click on Check availability Button")
    public void i_click_on_check_availability_button() {
        atntHome.checkAvailabilityButtonCheck();
    }
    @Then("I verify Your address is appeared properly")
    public void i_verify_your_address_is_appeared_properly() {
    }

    /**
     * HomePage TV Button Check
     */

    @When("I click on TV Button")
    public void i_click_on_tv_button() {
        atntHome.tvButtonCheck();
    }
    @When("I click on Sports Button")
    public void i_click_on_sports_button() {
        atntHome.sportsButton();
    }
    @When("I click on Shop now Button")
    public void i_click_on_shop_now_button() throws InterruptedException {
        atntHome.shopNowButton();
    }
    @Then("I verify Internet is appeared properly")
    public void i_verify_internet_is_appeared_properly() {
        atntHome.internetText();
    }
}








//    @Given("I'm in Atnt HomePage.")
//    public void i_m_in_atnt_home_page() throws IOException {
//        openBrowser();
//    }
//
//    @Given("I clicked on Account Icon.")
//    public void i_clicked_on_account_icon() {
//        atntHome.accountIconButton();
//
//    }
//
//    @Given("I clicked on SignIn Button.")
//    public void i_clicked_on_sign_in_button() {
//        atntHome.signInButtoon();
//    }
//
//    @Then("I clicked on Create one now Button")
//    public void i_clicked_on_create_one_now_button() {
//        atntHome.createOneNowButton();
//    }
