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

    static AtntHome atntHome;
    static RegistrationPage registrationPage;

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
    //        @After
    //        public void closeBrowser () {
    //            cleanUp();
    //        }

    @BeforeStep
    public static void getInIt() {
        atntHome = PageFactory.initElements(driver, AtntHome.class);
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }

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

    @Then("I verify page title as Prepaid Phone Plans, including Unlimited  I AT&T PREPAID")
    public void i_verify_page_title_as_prepaid_phone_plans_including_unlimited_i_at_t_prepaid() {
        atntHome.validatePrepaidGetTitle();
    }

    // Table
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String string) {
        atntHome.tableSearchItems(string);
    }

    @Then("I verify {string} and {string}")
    public void i_verify_and(String string, String string2) {
        atntHome.validateTableProduct();
    }

}
