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
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import registration.RegistrationPage;

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
//    public void i_click_on_shop_now_button() throws InterruptedException {
//        atntHome.shopNowButton();
//    }
    @Then("I verify Internet is appeared properly")
    public void i_verify_internet_is_appeared_properly() {
        atntHome.internetText();
    }

    /**
     * Atnt search box functionality check
     * @param searchItem
     */

    @When("I enter {string} on search box")
    public void i_enter_on_search_box(String searchItem) {
        atntHome.searchBox(searchItem);
    }
    @When("I click on search icon")
    public void i_click_on_search_icon() {
        atntHome.searchIcon();
    }
    @Then("I validate \"Showing results for \"Samsung Note10\".\" as search result appears properly")
    public void i_validate_showing_results_for_samsung_note10_as_search_result_appears_properly() {
        atntHome.validateSearchItemText();
    }
    //
    static RegistrationPage registrationPage;

    //    Cucumber Hook


    @Given("I am in at&t homepage")
    public void i_am_in_at_t_homepage() throws IOException {
        openBrowser("https://www.att.com/");
    }

    @And("I enter Samsung Phones in searchBox")
    public void i_enter_samsung_phones_in_search_box() {
        atntHome.enterSearchKeyWord("Samsung Phones");
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        atntHome.clickOnSearchButton();
    }

    @Then("I verify Samsung Phones is appear properly")
    public void i_verify_samsung_phones_is_appear_properly() {
        atntHome.validateSearchText("Showing results for \"Samsung Phones\".");
    }

    @And("I verify page title as Samsung Phones")
    public void i_verify_page_title_as_samsung_phones() {
        String expectedTitle = "Results for Samsung Phones - AT&T Search";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
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

    // Prepaid Tab Btn
    @When("I click Prepaid Button")
    public void i_click_prepaid_button() {
        atntHome.PrepaidTabBtnCheck();
    }

    @When("I click on Mobile Plans button")
    public void i_click_on_mobile_plans_button() {
        atntHome.MobilePlanBtn();
    }

    @Then("I verify Choose a SM is appear properly")
    public void i_verify_choose_a_sm_is_appear_properly() {
        atntHome.validatePrepaidBtn("SM");
    }

    @Then("I verify page title as Prepaid Phone Plans, including Unlimited  I AT&T PREPAID")
    public void i_verify_page_title_as_prepaid_phone_plans_including_unlimited_i_at_t_prepaid() {
        atntHome.validatePrepaidGetTitle();
    }

    // Table
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        atntHome.tableSearchItems(productName);
    }

    @Then("I verify {string} and {string}")
    public void i_verify_and(String validateProduct,String validateTitle) {
        atntHome.validateSearchTxt(validateProduct);
        atntHome.validateSearchProductTitle(validateTitle);
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
