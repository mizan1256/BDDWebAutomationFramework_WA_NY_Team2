package stepdefinitions;

import common.WebAPI;
import geicohome.GeicoHome;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static GeicoHome geicoHome;
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
        geicoHome= PageFactory.initElements(driver,GeicoHome.class);
    }

    @Given("I am on Geico Home Page")
    public void i_am_on_geico_home_page() throws InterruptedException, IOException {
        openBrowser("https://www.geico.com/");
    }

    @When("I click on Auto Button")
    public void i_click_on_auto_button() throws InterruptedException {
        geicoHome.autoButtonClickable();
    }

    @When("I checked the Check Box")
    public void i_checked_the_check_box() throws InterruptedException {
        geicoHome.checkButton();
    }

    @Then("I click on START QUOTE")
    public void i_click_on_start_quote() {
        geicoHome.startQuote();
    }

    @Then("I verify CONTACT US")
    public void i_verify_contact_us() {
       geicoHome.contactUsText();
    }
}
