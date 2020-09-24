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
import targetecommarcehome.TargetHomePage;


import java.io.IOException;
import java.util.List;

public class TargetStepDefinition extends WebAPI {

    static TargetHomePage targetHomePage;

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
        targetHomePage = PageFactory.initElements(driver, TargetHomePage.class);
    }

    @Given("I am on targetEcommerce home page")
    public void i_am_on_target_ecommerce_home_page() throws IOException {
        openBrowser("https://www.target.com/");
    }

    /**
     * SearchBox
     */
    @When("I enter Samsung Phones")
    public void i_enter_samsung_phones() {
        targetHomePage.searchBoxCheck();
    }

    @And("I click on search button")
    public void i_click_on_search_button() {
        targetHomePage.searchButtonClick();
    }

    @Then("I validate “Samsung Phone” is appeared properly")
    public void i_validate_samsung_phone_is_appeared_properly() throws InterruptedException {
        targetHomePage.validateSearchText();
    }

    /**
     * Clearance Field
     */
    @When("I click on clearance tab")
    public void i_click_on_clearance_tab() throws InterruptedException {
        targetHomePage.clearanceImage();
    }

    @When("I click on Furniture clearance")
    public void i_click_on_furniture_clearance() throws InterruptedException {
        targetHomePage.furnitureClearance();
    }

    @Then("I validate “Filter results” is appeared properly")
    public void i_validate_filter_results_is_appeared_properly() {
        targetHomePage.validateClearanceImage();
    }

    /**
     * Registry Tab
     */
    @When("I click on registry tab")
    public void i_click_on_registry_tab() throws InterruptedException {
        targetHomePage.appsRegistryTab();
    }

    @And("I click on Create a Baby box")
    public void i_click_on_create_a_baby_box() throws InterruptedException {
        targetHomePage.clickBabyField();
    }

    @Then("I validate EASY FOR EVERYONE is appeared properly")
    public void i_validate_easy_for_everyone_is_appeared_properly() {
        targetHomePage.validateAppsStoreLogo();
    }

    /**
     * Shopping Cart
     */
    @When("I do necessary steps to Target create Account page")
    public void i_do_necessary_steps_to_target_create_account_page() throws InterruptedException {
        targetHomePage.shoppingCart();
    }

    @When("I enter invalid credentials")
    public void i_enter_invalid_credentials(DataTable cartTable) throws InterruptedException {
        List<List<String>> data = cartTable.asLists(String.class);
        targetHomePage.enterEmailId(data.get(1).get(0));
        targetHomePage.enterFirstName(data.get(1).get(1));
        targetHomePage.enterLastName(data.get(1).get(2));
        targetHomePage.enterPhoneNumber(data.get(1).get(3));
        targetHomePage.enterPassword(data.get(1).get(4));
    }

    @Then("I validate Keep me signed in message")
    public void i_validate_keep_me_signed_in_message() {
        targetHomePage.validateShoppingCart();
    }

    /**
     * Shopping cart signIn test with invalid data
     */
    @When("I do necessary steps to land sign In page")
    public void i_do_necessary_steps_to_land_sign_in_page() throws InterruptedException {
        targetHomePage.cartSignInNegative();
    }

    @When("I enter invalid email in email field")
    public void i_enter_invalid_email_in_email_field() throws InterruptedException {
        targetHomePage.emailField();
    }

    @And("I enter invalid password in email field")
    public void i_enter_invalid_password_in_email_field() throws InterruptedException {
        targetHomePage.passwordField();
    }

    @And("I Click on sign In Button")
    public void i_click_on_sign_in_button() {
        targetHomePage.clickSignInBox();
    }

    @Then("I validate show message")
    public void i_validate_we_can_t_find_your_account_message() {
        targetHomePage.validateShoppingCartSignIn();
    }


    /**
     * Create Account
     */
    @And("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        targetHomePage.dropDownSignInButton();
    }

    @And("I enter user credentials")
    public void i_enter_user_credentials(DataTable table) throws InterruptedException {
        List<List<String>> data = table.asLists(String.class);
        targetHomePage.typeEmailId(data.get(1).get(0));
        targetHomePage.typeFirstName(data.get(1).get(1));
        targetHomePage.typeLastName(data.get(1).get(2));
        targetHomePage.typePhoneNumber(data.get(1).get(3));
        targetHomePage.typePassword(data.get(1).get(4));
    }

    @And("I Click on create account")
    public void i_click_on_create_account() throws InterruptedException {
        targetHomePage.clickCreateAccountButton();
    }

    @Then("I validate signUp message")
    public void i_validate_sign_up_message() {
        targetHomePage.validateSignUpAccount();
    }

    /**
     * Sign In Field Test
     */

    @When("I enter use email {string}")
    public void i_enter_use_email(String Email) {
        targetHomePage.emailBox(Email);
    }

    @When("I enter user password  {string}")
    public void i_enter_user_password(String Password) {
        targetHomePage.passwordBox(Password);
    }

    /**
     * Search Box Table
     */
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        targetHomePage.searchBoXCheck(productName);
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        targetHomePage.clickOnSearchBtn();
    }

    @When("I validate {string} is appear properly")
    public void i_validate_is_appear_properly(String validateProduct) {
        targetHomePage.validateSearchTxt(validateProduct);
    }

    @When("I validate page title as {string}")
    public void i_validate_page_title_as(String validateTitle) {
        targetHomePage.validateSearchProductTitle(validateTitle);
    }
}