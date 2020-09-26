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
import tdbankhome.TDBankHome;

import java.io.IOException;
import java.util.List;

public class TdBankHomeSteps extends WebAPI {

    TDBankHome tdBankHome;

    @BeforeStep
    public void getInit(){
        tdBankHome = PageFactory.initElements(driver,TDBankHome.class);
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        driver.quit();
    }



    /**
     * Home page related steps
     * @throws IOException
     */

    @Given("I am on TD Bank home page")
    public void i_am_on_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");

    }

    @When("I click on flag button")
    public void i_click_on_flag_button() {
        tdBankHome.clickOnFlagBtn();
    }

    @When("I change the country from US to Canada")
    public void i_change_the_country_from_us_to_canada() {
        tdBankHome.changeCountry();
    }

    @Then("I verify Canada Td Bank website is appeared properly")
    public void i_verify_canada_td_bank_website_is_appeared_properly() {
        tdBankHome.verifyCountryChanged();
    }


    /**
     * Credit card page Steps:
     * In this steps I've used mouse hover functionality.
     */

    @When("I mouse hover over products drop down  button")
    public void i_mouse_hover_over_products_drop_down_button() {
        tdBankHome.mouseHoverOnProductsDropdown();
    }

    @When("I click on credit card link")
    public void i_click_on_credit_card_link() {
        tdBankHome.clickOnCreditCardLink();
    }

    @Then("I verify credit card page title in different tab")
    public void i_verify_credit_card_page_title_in_different_tab() {
        tdBankHome.validateCreditCardPage();

    }

    /**
     * Savings Account page Steps
     * In these steps I've used Select from dropDown  by Visible Text
     */

    @When("I click on savings link")
    public void i_click_on_savings_link() {
        tdBankHome.clickOnSavingsLink();
        sleepFor(3);
    }

    @When("I select {string} as a state")
    public void i_select_as_a_state(String state) {
        tdBankHome.selectState(state);
        sleepFor(2);
    }

    @When("I select {string} as a city")
    public void i_select_as_a_city(String city) {
        tdBankHome.selectCity(city);
        sleepFor(2);
    }

    @When("I set my location")
    public void i_set_my_location() {
        tdBankHome.clickOnSetMyLocation();
    }

    @Then("I verify savings account page")
    public void i_verify_savings_account_page() {
        tdBankHome.validateSavingsAccount();
    }

    /**
     * Verify Login with invalid Credentials:
     * using Scenario Table
     */

    @When("I mouse hover over login link")
    public void i_mouse_hover_over_login_link() {
        tdBankHome.mouseHoverOnLoginLink();
    }

    @When("I click on online banking")
    public void i_click_on_online_banking() {
        tdBankHome.clickOnOnlineBanking();
        sleepFor(3);
    }

    @When("I enter username and password into respective fields")
    public void i_enter_username_and_password_into_respective_fields(DataTable dataTable) {
       List<List<String>> data = dataTable.asLists(String.class);
       tdBankHome.enterUsername(data.get(0).get(0));
       tdBankHome.enterPassword(data.get(0).get(1));
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        tdBankHome.clickOnLoginBtn();
        sleepFor(2);
    }
    @Then("I verify invalid login text")
    public void i_verify_invalid_login_text() {
       tdBankHome.validateLoginWithInvalidCredentials();

    }


    @When("I enter data {string} and {string} into  fields")
    public void i_enter_data_and_into_fields(String username, String password) {
       tdBankHome.enterUsername(username);
       tdBankHome.enterPassword(password);
    }
















}
