package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import targetHome.TargetEcommerceHomePage;

import java.io.IOException;

public class TargetEcommerceStepDefinitions extends WebAPI {

TargetEcommerceHomePage targetEcommerceHomePage;
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
        targetEcommerceHomePage = PageFactory.initElements(driver, TargetEcommerceHomePage.class);
    }

    @Given("I am on targetEcommerce home page")
    public void i_am_on_target_ecommerce_home_page() throws IOException {
    openBrowser("https://www.target.com/");
    }

    @Given("I validate searchBox is displayed")
    public void i_validate_search_box_is_displayed() {
   targetEcommerceHomePage.searchBoxIsDisplayed();
    }

    /**
     * Target ecommerce SearchBox functionality test
     */


    @Given("I enter iPhone in searchBox")
    public void i_enter_i_phone_in_search_box() {
    targetEcommerceHomePage.searchBoxCheck("iPhone");
    }

    @Then("I verify iPhone is appear properly")
    public void i_verify_i_phone_is_appear_properly() throws InterruptedException {
    targetEcommerceHomePage.validateSearchText();
    }

    @Then("I verify p age title as iPhone")
    public void i_verify_p_age_title_as_i_phone() {
    targetEcommerceHomePage.validateSearchBoxTitle();
    }
}
