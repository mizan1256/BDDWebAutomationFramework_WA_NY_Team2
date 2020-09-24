package stepdefinitions;

import common.WebAPI;
import geicohome.GeicoHome;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GeicoHomeStepDefinitions extends WebAPI {

    static GeicoHome geicoHome;

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
        geicoHome = PageFactory.initElements(driver, GeicoHome.class);
    }

    /**
     * Search box check
     */
    @Given("I am on Geico home page")
    public void i_am_on_geico_home_page() throws IOException {
        openBrowser("https://www.geico.com/");
    }

    @When("I click on search icon")
    public void i_click_on_search_icon() throws InterruptedException {
        geicoHome.searchIconCheck();
    }

    @When("I enter Auto in search box")
    public void i_enter_auto_in_search_box() throws InterruptedException {
        geicoHome.searchBoxCheck();
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        geicoHome.searchButtonCheck();
    }

    @Then("I validate {string} is appeared properly")
    public void i_validate_is_appeared_properly(String string) {
        geicoHome.validateSearchIconCheck(string);
    }

    /**
     * Site search manage account check
     */
    @When("I click on manage account")
    public void i_click_on_manage_account() throws InterruptedException {
        geicoHome.autoSearchSite();
    }

    @Given("I click searchLogo")
    public void i_click_searchlogo() {
        geicoHome.clickSearchLogo();
    }

    @Given("I enter motorcycle in searchBox")
    public void i_enter_motorcycle_in_search_box() {
        geicoHome.typeOnSearchBox();
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        geicoHome.submitSearchBox();
    }

    @Then("I verify siteSearchText")
    public void i_verify_site_search_text() {
        geicoHome.verifySiteSearchText();
    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String searchItem) {
        geicoHome.typeOnSearchBox(searchItem);
    }

    //login


    //    @Given("I click loginLogo")
//    public void i_click_login_logo() {
//        geicoHome.clickOnLogin();
//
//    }
    @Given("I choose click on the arrow to choose policy")
    public void i_choose_click_on_the_arrow_to_choose_policy() {
        geicoHome.policyDropDown();
    }

    @Given("I choose accessPolicy")
    public void i_choose_access_policy() {
        geicoHome.choosePolicy();
    }

    @Given("I click on LoginOption")
    public void i_click_on_login_option() {
        geicoHome.clickLoginToEnterUSerNameAndPassword();
    }

    @Given("I enter userName and password")
    public void i_enter_user_name_and_password() {
        geicoHome.enterUserNameAndPassword();
    }

    @When("I click loginButton")
    public void i_click_login_button() {
        geicoHome.submitLogin();
    }

    @Then("I verify title")
    public void i_verify_title() {
        geicoHome.verifyTitle();
    }

    @Given("I enter {string} and {string}")
    public void i_enter_and(String userName, String password) {
        geicoHome.enterUserNameAndPassword(userName, password);
    }


    @Given("I click on startHere")
    public void i_click_on_start_here() {
        geicoHome.startHere();
    }

    @Given("I enter {string}, {string} and {string}")
    public void i_enter_and(String policyNumber, String dateOfBirth, String zipCode) {
        geicoHome.enterPolicyNumberAndDateOfBirthAndZipCode(policyNumber, dateOfBirth, zipCode);
    }

    @When("I click continue")
    public void i_click_continue() {
        geicoHome.clickContinue();

    }

    @Then("I verify errorText on screen")
    public void i_verify_error_text_on_screen() {
        geicoHome.verifyErrorText();

    }

    @Then("I verify policyNumber on screen")
    public void i_verify_policy_number_on_screen() {
        geicoHome.verifyPolicyNumberErrorText();

    }

    @And("I click on Career button")
    public void i_click_on_career_button() throws InterruptedException {
        geicoHome.clickCareerBtn();
    }

    @When("I Click on Customer Service Button")
    public void i_click_on_customer_service_button() throws InterruptedException {
        geicoHome.clickCustomerServiceBtn();
    }

    @Then("I validate Customer Service Careers text appear Properly")
    public void i_validate_customer_service_careers_text_appear_properly() {
        geicoHome.validateText();
    }
}
