package stepdefinitions;

import atnthome.AtntHome;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static atnthome.AtntWebElements.continueButtonWebElement;
import static atnthome.AtntWebElements.wirelessRadioButtonWebElement;


public class StepDefinitions extends WebAPI {

    static AtntHome atntHome;

    //    Cucumber Hook
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
    public static void getInIt() {
        atntHome = PageFactory.initElements(driver, AtntHome.class);
    }

    @Given("I am in at&t homepage")
    public void i_am_in_at_t_homepage() throws IOException {
        openBrowser("https://www.att.com/");
    }

    @When("I click Deals Button")
    public void i_click_deals_button() {
        atntHome.dealsTabButton();
    }

    @Then("I verify Wireless is appear properly")
    public void i_verify_wireless_is_appear_properly() {
        atntHome.validateDealTabButton("Wireless");
    }

    @Then("I verify page title as AT&T Deals on Phones, Wireless Plans, Internet & TV Services")
    public void i_verify_page_title_as_at_t_deals_on_phones_wireless_plans_internet_tv_services() {
        atntHome.validateDealGetTitle();
    }

    @When("I click Wireless Button")
    public void i_click_wireless_button() {
        atntHome.wirelessButtonCheck();
    }

    @Then("I verify LEARN HOW TO is appear properly")
    public void i_verify_learn_how_to_is_appear_properly() {
        atntHome.validateWirelessTabButton("LEARN HOW TO");
    }

    @And("I verify page title as AT&T Wireless – Latest Phones & Best Wireless Plans")
    public void i_verify_page_title_as_at_t_wireless_latest_phones_best_wireless_plans() {
        atntHome.validateWirelessGetTitle();
    }

    @When("I click internet Button")
    public void i_click_internet_button() {
        atntHome.internetButtonCheck();
    }

    @Then("I verify AT&T INTERNET is appear properly")
    public void i_verify_at_t_internet_is_appear_properly() {
        atntHome.validateInternetTabButton("AT&T INTERNET");
    }

    @Then("I verify page title as AT&T Internet Plans - Home Internet - AT&T® Official Site")
    public void i_verify_page_title_as_at_t_internet_plans_home_internet_at_t_official_site() {
        atntHome.validateInternetGetTitle();
    }

    @When("I click TV Button")
    public void i_click_tv_button() {
        atntHome.TVTabButtonCheck();
    }

    @When("I click on shop now button")
    public void i_click_on_shop_now_button() {
        atntHome.TVShopNowButton();
    }

    @Then("I verify Choose a TV package is appear properly")
    public void i_verify_choose_a_tv_package_is_appear_properly() {
        atntHome.validateTVTabButton("1. Choose a TV package");
    }

    @Then("I verify page title as Shop AT&T Bundles")
    public void i_verify_page_title_as_shop_at_t_bundles() {
        atntHome.validateTVGetTitle();
    }

    @Given("I am in att homepage")
    public void i_am_in_att_homepage() throws IOException {
        openBrowser("https://www.att.com/");
    }

    @And("I click accountIcon")
    public void i_click_account_icon() {
        atntHome.accountIconButton();
    }

    @And("I click singInButton")
    public void i_click_sing_in_button() {
        atntHome.signInButton();
    }

    @When("I click on CreateButton")
    public void i_click_on_create_button() {

        atntHome.createButton();
    }
    @And("I click wireless radioButton and continueButton")
    public void i_click_wireless_radio_button_and_continue_button() throws InterruptedException {
        atntHome.clickOnElement(wirelessRadioButtonWebElement);
        atntHome.clickOnElement(continueButtonWebElement);
        Thread.sleep(2000);
    }

    @Then("I enter phoneNumber and zipCode")
    public void i_enter_phone_number_and_zip_code() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("11432");
        Thread.sleep(3000);
    }

    @When("I click continueButton")
    public void i_click_continue_button() {
        driver.findElement(By.xpath("//button[@class='btn btn-primary-functional btn-medium span3 ng-scope ng-isolate-scope']")).click();
    }

    @Then("I should be get en error message")
    public void i_should_be_get_en_error_message() {
        atntHome.validateSignUpText("Sorry we could not validate your information.");
    }

//      ATnT signIn functionality check with invalid credentials
    @And("I on signIn page")
    public void i_on_sign_in_page() {
        atntHome.accountIconButton();
        atntHome.signInButton();
    }
    @When("I enter userName and passWord")
    public void i_enter_user_name_and_pass_word() {
        atntHome.enterUserId("pnt30242");
        atntHome.enterUserPassword("Pnt@30242");
    }
    @And("I click on signIn button")
    public void i_click_on_sign_in_button() {
        atntHome.clickSignInButton();
    }

    @Then("I am getting error message")
    public void i_am_getting_error_message() {
        atntHome.validateSignInPage();
    }

//      Att data driven negative signIn test case
    @Given("I enter email as {string} and password as {string}")
    public void i_enter_email_as_and_password_as(String userName, String PassWord) {
        atntHome.enterUserId(userName);
        atntHome.enterUserPassword(PassWord);
    }

//      Att BurgerButton menu test
    @When("I click on burgerButton")
    public void i_click_on_burger_button() throws InterruptedException {
        atntHome.clickBurgBtnMenu();
    }

    @And("I select wireless and click on Explore Wireless")
    public void i_select_wireless_and_click_on_explore_wireless() {
        atntHome.selectWirelessAndExploreBtn();
    }

    @Then("I verify page title")
    public void i_verify_page_title() {
        atntHome.validateExploreWirelessTitle();
    }

    @Given("I enter Apple iPhone {int} in searchBox")
    public void i_enter_iphone_in_search_box() {
        atntHome.searchBoxCheck();
    }
    @When("I click searchButton")
    public void i_click_search_button() {
        atntHome.searchBtnCheck();
    }

    @Then("I verify Apple iPhone {int} is appear properly")
    public void i_verify_apple_i_phone_is_appear_properly(Integer int1) {
        atntHome.validateSearchBoxTxt("Showing results for \"Apple iPhone 11\".");
    }

    @Then("I verify page title as iphone {int}")
    public void i_verify_page_title_as_iphone(Integer int1) {
        atntHome.validateSearchBoxPageTitle();
    }

//      Att searchBox functionality test get value from feature file
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String product) {
        atntHome.setSearchBoxCheckWithParameter(product);
    }
    @Then("I validate {string} is appear properly")
    public void i_validate_is_appear_properly(String string) {
        atntHome.validateSearchBoxTxt("Showing results for \"Apple iPhone 11\".");
    }

    @Then("I validate page title as iphone {int}")
    public void i_validate_page_title_as_iphone(Integer int1) {
        atntHome.validateSearchBoxPageTitle();
    }

//      Att searchBox functionality check with multiple products
    @When("I validate \"Showing results for \"Apple iPhone {int}\".\" is appear properly")
    public void i_validate_showing_results_for_apple_i_phone_is_appear_properly(String validateProduct) {
        atntHome.validateSearchBoxTxt(validateProduct);
    }
    @When("I validate \"\"Showing results for {string}.\" is appear properly")
    public void i_validate_showing_results_for_is_appear_properly(String validateProduct) {
        atntHome.validateSearchBoxTxt(validateProduct);
    }

    @And("I validate page title as {string}")
    public void i_validate_page_title_as(String string) {
        atntHome.validateSearchBoxPageTitle();
    }



}
