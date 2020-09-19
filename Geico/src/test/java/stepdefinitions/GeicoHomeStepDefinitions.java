package stepdefinitions;

import common.WebAPI;
import geicohome.GeicoHome;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GeicoHomeStepDefinitions extends WebAPI {

    static GeicoHome geicoHome;

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
        geicoHome = PageFactory.initElements(driver, GeicoHome.class);
    }

    /**
     * Search box check
     */
    @Given("I am on Geico home page")
    public void i_am_on_geico_home_page() throws IOException {
        openBrowser("https://www.geico.com/");
    }

    @When("I click on search icon")
    public void i_click_on_search_icon() throws InterruptedException {
        geicoHome.searchIconCheck();
    }

    @When("I enter Auto in search box")
    public void i_enter_auto_in_search_box() throws InterruptedException {
        geicoHome.searchBoxCheck();
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        geicoHome.searchButtonCheck();
    }

    @Then("I validate {string} is appeared properly")
    public void i_validate_is_appeared_properly(String string) {
        geicoHome.validateSearchIconCheck(string);
    }

    /**
     *  Site search manage account check
     */
    @When("I click on manage account")
    public void i_click_on_manage_account() throws InterruptedException {
        geicoHome.autoSearchSite();
    }




}
