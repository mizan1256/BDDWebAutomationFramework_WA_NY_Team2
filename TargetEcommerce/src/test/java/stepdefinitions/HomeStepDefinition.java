package stepdefinitions;


import common.WebAPI;
import io.cucumber.datatable.DataTable;
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
import targetHome.TargetHome;

import java.io.IOException;
import java.util.List;

public class HomeStepDefinition extends WebAPI {
    static TargetHome targetHome;
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

        targetHome= PageFactory.initElements(driver,TargetHome.class);
    }
    /**
     * Target ecommerce searchBox display check
     */
    @Given("I am on targetEcommerce home page")
    public void i_am_on_target_ecommerce_home_page() throws IOException {
        openBrowser("https://www.target.com/");
    }

    @Given("I validate searchBox is displayed")
    public void i_validate_search_box_is_displayed() {

        targetHome.searchBoxIsDisplayed();
    }

    /**
     * Target ecommerce SearchBox functionality test
     */

    @Given("I enter iPhone in searchBox")
    public void i_enter_i_phone_in_search_box() {

        targetHome.searchBoxCheck("iPhone");
    }
    @Then("I verify iPhone is appear properly")
    public void i_verify_i_phone_is_appear_properly() throws InterruptedException {
        targetHome.validateSearchText();
    }
    @Then("I verify p age title as iPhone")
    public void i_verify_p_age_title_as_i_phone() {

        targetHome.validateSearchBoxTitle();
    }
    /**
     * targetEcommerce signUp functional test
     */
    @And("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        targetHome.signUpNecessaryStep();
    }
    @And("I enter user credentials")
    public void i_enter_user_credentials(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        targetHome.enterUseEmail(data.get(1).get(0));
        targetHome.enterUseFirstName(data.get(1).get(1));
        targetHome.enterUseLastName(data.get(1).get(2));
        targetHome.enterUsePhnNum(data.get(1).get(3));
        targetHome.enterUsePassword (data.get(1).get(4));
    }

    @When("I click on create account")
    public void i_click_on_create_account() {

        targetHome.enterCreateTargetAccount();
    }

    @Then("I validate signUp message")
    public void i_validate_sign_up_message() {
        targetHome.validateSingUpMessage("Sorry, something went wrong. Please try again.");
    }

    /**
     * targetEcommerce signIn check
     */
    @Given("I am on signIn page")
    public void i_am_on_sign_in_page() throws InterruptedException {
        targetHome.iAmOnSignInPage();
    }

    @Given("I enter email as {string} and password as {string}")
    public void i_enter_email_as_and_password_as(String userEmail, String Password) throws InterruptedException {
        targetHome.enterUserSignInInfo(userEmail, Password);
    }

    @Given("I click on signIn button")
    public void i_click_on_sign_in_button() {
        targetHome.clickOnSignInBtn();
    }

    @Then("I should be getting a message")
    public void i_should_be_getting_a_message() {
        targetHome.validaUserSignIn();
    }

    /**
     * Target searchBox functionality check
     */
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        targetHome.searchBoXCheck(productName);
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        targetHome.clickOnSearchBtn();
    }

    @When("I validate {string} is appear properly")
    public void i_validate_is_appear_properly(String validateProduct) {
        targetHome.validateSearchTxt(validateProduct);
    }

    @When("I validate page title as {string}")
    public void i_validate_page_title_as(String validateTitle) {
        targetHome.validateSearchProductTitle(validateTitle);
    }

    /**
     * TargetEcommerce SearchBox functionality getting value from Scenario
     * @param string
     */
    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String string) throws InterruptedException {
        targetHome.validateSearchBox("Homepage");
    }
    /**
     * Target shoppingCart logo functionality check
     */
    @Given("I click on shopping cart Icon")
    public void i_click_on_shopping_cart_icon() {
        targetHome.shoppingCartLogoIsClickable();
    }

    @Then("I validate shopping cart page")
    public void i_validate_shopping_cart_page() throws InterruptedException {
        targetHome.validateShoppingCartLogoIsClickable();
    }

    /**
     * Target Shopping Cart log in functionality check
     */
    @Then("I click on shopping cart signIn button")
    public void i_click_on_shopping_cart_signIn_button() throws InterruptedException {
        targetHome.shoppingInCartLogIn() ;
    }
    @Then("I validate shopping cart log in page")
    public void i_validate_shopping_cart_log_in_page() {
        targetHome.validateShoppingCartLogIn();
    }


}
