package stepdefinitions;

import atnt.Atnt;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AtntStepDefinition extends WebAPI {
    static Atnt atnt;

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
        atnt = PageFactory.initElements(driver, Atnt.class);
    }

    @Given("I am in at&t homepage")
    public void i_am_in_at_t_homepage() throws IOException {
        openBrowser("https://www.att.com/");
    }

    @When("I click Deals Button")
    public void i_click_deals_button() {
        atnt.dealsTabButton();
    }

    @Then("I verify Wireless is appear properly")
    public void i_verify_wireless_is_appear_properly() {
        atnt.validateDealTabButton("Wireless");
    }

    @Then("I verify page title as AT&T Deals on Phones, Wireless Plans, Internet & TV Services")
    public void i_verify_page_title_as_at_t_deals_on_phones_wireless_plans_internet_tv_services() {
        atnt.validateDealGetTitle();
    }

    @When("I click Wireless Button")
    public void i_click_wireless_button() {
        atnt.wirelessButtonCheck();
    }

    @Then("I verify LEARN HOW TO is appear properly")
    public void i_verify_learn_how_to_is_appear_properly() {
        atnt.validateWirelessTabButton("LEARN HOW TO");
    }

    @And("I verify page title as AT&T Wireless – Latest Phones & Best Wireless Plans")
    public void i_verify_page_title_as_at_t_wireless_latest_phones_best_wireless_plans() {
        atnt.validateWirelessGetTitle();
    }

    @When("I click internet Button")
    public void i_click_internet_button() {
        atnt.internetButtonCheck();
    }

    @Then("I verify AT&T INTERNET is appear properly")
    public void i_verify_at_t_internet_is_appear_properly() {
        atnt.validateInternetTabButton("AT&T INTERNET");
    }

    @Then("I verify page title as AT&T Internet Plans - Home Internet - AT&T® Official Site")
    public void i_verify_page_title_as_at_t_internet_plans_home_internet_at_t_official_site() {
        atnt.validateInternetGetTitle();
    }

    @When("I click TV Button")
    public void i_click_tv_button() {
        atnt.TVTabButtonCheck();
    }

    @When("I click on shop now button")
    public void i_click_on_shop_now_button() {
        atnt.TVShopNowButton();
    }

    @Then("I verify Choose a TV package is appear properly")
    public void i_verify_choose_a_tv_package_is_appear_properly() {
        atnt.validateTVTabButton("1. Choose a TV package");
    }

    @Then("I verify page title as Shop AT&T Bundles")
    public void i_verify_page_title_as_shop_at_t_bundles() {
        atnt.validateTVGetTitle();
    }


}
