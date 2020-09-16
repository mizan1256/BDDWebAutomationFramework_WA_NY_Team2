package stepdefinitions;

import aetnahome.HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;
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
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @Given("I am in Aetna HomePage")
    public void i_am_in_aetna_home_page() throws IOException {
        openBrowser("https://www.aetna.com/individuals-families.html");
    }

    @When("I Click ShopForAPLan Button")
    public void i_click_shop_for_ap_lan_button()  {
    homePage.clickShopForPlan();
    }

    @When("I Click on HealthCoverage Button")
    public void i_click_on_health_coverage_button() throws InterruptedException {
        homePage.checkHealthCoverageButton();
    }

    @And("I click FindADoctor Button")
    public void i_click_find_a_doctor_button() {
    homePage.clickFindADoctor();
    }

    @Then("I Verify page Title")
    public void i_verify_page_title() {
    homePage.checkVerifyTitle();
    }



}
