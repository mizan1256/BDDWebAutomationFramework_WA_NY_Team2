package stepdefinitions;

import common.WebAPI;
import geicohomeB.GeicoHome;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GeicoBBBHomeStepDefinition extends WebAPI {
    static GeicoHome homePage;

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
    public static void getInIt(){

        homePage= PageFactory.initElements(driver,GeicoHome.class);
    }
//////////////// bdd 1
    @Given("I am in Geico homepage.")
    public void i_am_in_geico_homepage() throws IOException {
        openBrowser("https://www.geico.com/");
    }

    @When("I click on Start Quote")
    public void i_click_on_start_quote() {
    homePage.clickOnStartQuote();
    }

    @Then("I verify customer information page.")
    public void i_verify_customer_information_page() {
    homePage.validate_clickOnStartQuote();
    }

    /////////////////////bdd 2

    @When("I click on renters")
    public void i_click_on_renters() {
        homePage.clickOnRenters();
    }

    @Then("i verify check mark on renters")
    public void i_verify_check_mark_on_renters() {
       homePage.validate_ClickOnRenters();
    }

    //////////////////////bdd 3

    @When("I click on zip code")
    public void i_click_on_zip_code() {
    homePage.clickOnZipCode();
    }

    @And("I enter zip code")
    public void i_enter_zip_code() {
    homePage.enterZipCode();
    }

    @And("I hit enter on keyboard")
    public void i_hit_enter_on_keyboard() {
        homePage.hitEnterKeyboard();
    }

    @Then("i verify zip code result page")
    public void i_verify_zip_code_result_page() {
    homePage.validate_ClickOnZipCode();
    }
//////////////////////////////////

    @When("I click on Icon logo")
    public void i_click_on_icon_logo() {
       homePage.clickOnIcon();
    }

    @Then("I type zip code")
    public void i_type_zip_code() {
       homePage.enterZipCode("11103");
    }

    @And("I click on Update button")
    public void i_click_on_update_button() {
      homePage.clickOnUpdate();
    }

    @Then("i verify updated location result")
    public void i_verify_updated_location_result() {
    homePage.validate_ClickOnIcon();
    }
    ///////////////////////

    @Then("I type invalid zip code")
    public void i_type_invalid_zip_code() {
        homePage.enterZipCode("11111");
    }

    @Then("i verify error message")
    public void i_verify_error_message() {
        homePage.validate_ClickOnIconInvalid();
    }




}
