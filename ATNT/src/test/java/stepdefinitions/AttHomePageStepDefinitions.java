package stepdefinitions;

import atntregistration.AttRegistration;
import atthome.AttHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;


public class AttHomePageStepDefinitions extends WebAPI {
    static AttHomePage attHomePage;
    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit(){
        attHomePage = PageFactory.initElements(driver, AttHomePage.class);
    }


    @When("I click Deals Button")
    public void i_click_deals_button() {
        attHomePage.dealsTabButton();
    }

    @Then("I verify Wireless is appear properly")
    public void i_verify_wireless_is_appear_properly() {
        attHomePage.validateDealTabButton("Wireless");
    }

    @Then("I verify page title as AT&T Deals on Phones, Wireless Plans, Internet & TV Services")
    public void i_verify_page_title_as_at_t_deals_on_phones_wireless_plans_internet_tv_services() {
        attHomePage.validateDealGetTitle();
    }

    @When("I click Wireless Button")
    public void i_click_wireless_button() {
        attHomePage.wirelessButtonCheck();
    }

    @Then("I verify LEARN HOW TO is appear properly")
    public void i_verify_learn_how_to_is_appear_properly() {
        attHomePage.validateWirelessTabButton("LEARN HOW TO");
    }

    @And("I verify page title as AT&T Wireless – Latest Phones & Best Wireless Plans")
    public void i_verify_page_title_as_at_t_wireless_latest_phones_best_wireless_plans() {
        attHomePage.validateWirelessGetTitle();
    }

    @When("I click internet Button")
    public void i_click_internet_button() {
        attHomePage.internetButtonCheck();
    }

    @Then("I verify AT&T INTERNET is appear properly")
    public void i_verify_at_t_internet_is_appear_properly() {
        attHomePage.validateInternetTabButton("AT&T INTERNET");
    }

    @Then("I verify page title as AT&T Internet Plans - Home Internet - AT&T® Official Site")
    public void i_verify_page_title_as_at_t_internet_plans_home_internet_at_t_official_site() {
        attHomePage.validateInternetGetTitle();
    }

    @When("I click TV Button")
    public void i_click_tv_button() {
        attHomePage.TVTabButtonCheck();
    }

    @When("I click on shop now button")
    public void i_click_on_shop_now_button() {
        attHomePage.TVShopNowButton();
    }

    @Then("I verify Choose a TV package is appear properly")
    public void i_verify_choose_a_tv_package_is_appear_properly() {
        attHomePage.validateTVTabButton("1. Choose a TV package");
    }

    @Then("I verify page title as Shop AT&T Bundles")
    public void i_verify_page_title_as_shop_at_t_bundles() {
        attHomePage.validateTVGetTitle();
    }

    // Prepaid Tab Btn
    @When("I click Prepaid Button")
    public void i_click_prepaid_button() {
        attHomePage.PrepaidTabBtnCheck();
    }

    @When("I click on Mobile Plans button")
    public void i_click_on_mobile_plans_button() {
        attHomePage.MobilePlanBtn();
    }

    @Then("I verify Choose a SM is appear properly")
    public void i_verify_choose_a_sm_is_appear_properly() {
        attHomePage.validatePrepaidBtn("SM");
    }

    @Then("I verify page title as Prepaid Phone Plans, including Unlimited  I AT&T PREPAID")
    public void i_verify_page_title_as_prepaid_phone_plans_including_unlimited_i_at_t_prepaid() {
        attHomePage.validatePrepaidGetTitle();
    }
}
