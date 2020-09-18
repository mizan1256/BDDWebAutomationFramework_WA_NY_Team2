package stepdefinitions;

import common.WebAPI;
import geicoHome.GeicoHome;
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

        // Cucumber Hook
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
        public void getInit() {
            geicoHome = PageFactory.initElements(driver, GeicoHome.class);
        }

    @Given("I am on Geico HopePage")
    public void i_am_on_geico_hope_page() throws IOException {
            openBrowser("https://www.united.com/en/us");
    }

    @Given("I click SearchBox")
    public void i_click_search_box() {
            geicoHome.searchIconCheck();

    }

    @Then("I Enter Auto in SearchBox")
    public void i_enter_auto_in_search_box() {
            geicoHome.searchBoxText();

    }

    @When("I clik search Button")
    public void i_clik_search_button() {
            geicoHome.searchButtonClickable();

    }

    @Then("I verify the page title")
    public void i_verify_the_page_title() {
            geicoHome.validatePageTitle();
    }
    }

