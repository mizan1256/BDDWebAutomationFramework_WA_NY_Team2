package stepdefinitions;

import common.WebAPI;
import geico.Geico;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GeicoStepDefinition extends WebAPI {
    static Geico geico;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        geico = PageFactory.initElements(driver, Geico.class);
    }
    @Given("I am on Geico Homepage")
    public void i_am_on_geico_homepage() throws IOException {
        openBrowser("https://www.geico.com/");
    }
    @And("I click on Career button")
    public void i_click_on_career_button() throws InterruptedException {
        geico.clickCareerBtn();
    }

    @When("I Click on Customer Service Button")
    public void i_click_on_customer_service_button() throws InterruptedException {
        geico.clickCustomerServiceBtn();
    }

    @Then("I validate Customer Service Careers text appear Properly")
    public void i_validate_customer_service_careers_text_appear_properly() {
        geico.validateText();
    }

}
