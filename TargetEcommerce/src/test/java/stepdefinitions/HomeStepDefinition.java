package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import targethome.TargetHomePage;

import java.io.IOException;
import java.util.List;

public class HomeStepDefinition extends WebAPI {
    static TargetHomePage homePage;

    //cucumber hook
    @After
    public void closeBrowser() {

        cleanUp();
    }

    @BeforeStep
    public static void getInIt() {

        homePage = PageFactory.initElements(driver, TargetHomePage.class);
    }

    @Given("I am on targetEcommerce home page")
    public void i_am_on_target_ecommerce_home_page() throws IOException {
        openBrowser("https://www.target.com/");
    }

    @Given("I validate searchBox is displayed")
    public void i_validate_search_box_is_displayed() {
        homePage.searchBoxIsDisplayed();
    }

    /**
     * Target ecommerce SearchBox functionality test
     */

    @Given("I enter iPhone in searchBox")
    public void i_enter_i_phone_in_search_box() {
        homePage.searchBoxCheck("iPhone");
    }
    @Then("I verify iPhone is appear properly")
    public void i_verify_i_phone_is_appear_properly() throws InterruptedException {
        homePage.validateSearchText();
    }
    @Then("I verify page title as iPhone")
    public void i_verify_page_title_as_i_phone() {
        homePage.validateSearchBoxTitle();
    }
    /**
     * targetEcommerce signUp functional test
     */
    @Given("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        homePage.signUpNecessaryStep();
    }
    @Given("I enter user credentials")
    public void i_enter_user_credentials(io.cucumber.datatable.DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        homePage.enterUseEmail(data.get(1).get(0));
        homePage.enterUseFirstName(data.get(1).get(1));
        homePage.enterUseLastName(data.get(1).get(2));
        homePage.enterUsePhnNum(data.get(1).get(3));
        homePage.enterUsePassword(data.get(1).get(4));
    }

    @When("I click on create account")
    public void i_click_on_create_account() {

        homePage.enterCreateTargetAccount();
    }

    @Then("I validate signUp message")
    public void i_validate_sign_up_message() {
        homePage.validateSingUpMessage("Sorry, something went wrong. Please try again.");

    }
    /**
     * targetEcommerce signIn check
     */
    @Given("I am on signIn page")
    public void i_am_on_sign_in_page() throws InterruptedException {
        homePage.iAmOnSignInPage();
    }

    @Given("I enter email as {string} and password as {string}")
    public void i_enter_email_as_and_password_as(String userEmail, String Password) throws InterruptedException {
        homePage.enterUserSignInInfo(userEmail, Password);
    }

    @Given("I click on signIn button")
    public void i_click_on_sign_in_button() {
        homePage.clickOnSignInBtn();
    }

    @Then("I should be getting a message")
    public void i_should_be_getting_a_message() {
        homePage.validaUserSignIn();
    }

    /**
     * Target searchBox functionality check
     */
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        homePage.searchBoXCheck(productName);
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        homePage.clickOnSearchBtn();
    }

    @When("I validate {string} is appear properly")
    public void i_validate_is_appear_properly(String validateProduct) {
        homePage.validateSearchTxt(validateProduct);
    }

    @When("I validate page title as {string}")
    public void i_validate_page_title_as(String validateTitle) {
        homePage.validateSearchProductTitle(validateTitle);
    }

    /**
     * TargetEcommerce SearchBox functionality getting value from Scenario
     * @param string
     */
    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String string) throws InterruptedException {
        homePage.validateSearchBox("Homepage");
    }
    /**
     * Target shoppingCart logo functionality check
     */
    @Given("I click on shopping cart Icon")
    public void i_click_on_shopping_cart_icon() {
        homePage.shoppingCartLogoIsClickable();
    }

    @Then("I validate shopping cart page")
    public void i_validate_shopping_cart_page() throws InterruptedException {
        homePage.validateShoppingCartLogoIsClickable();
    }

    /**
     * Target Shopping Cart log in functionality check
     */
    @Then("I click on shopping cart signIn button")
    public void i_click_on_shopping_cart_signIn_button() throws InterruptedException {
        homePage.shoppingInCartLogIn() ;
    }
    @Then("I validate shopping cart log in page")
    public void i_validate_shopping_cart_log_in_page() {
        homePage.validateShoppingCartLogIn();
    }

}
