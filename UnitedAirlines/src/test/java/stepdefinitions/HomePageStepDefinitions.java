package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairlineshome.UnitedAirlinesHomePage;

import java.io.IOException;

public class HomePageStepDefinitions extends WebAPI {
    static UnitedAirlinesHomePage unitedAirlinesHomePage;
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
        unitedAirlinesHomePage = PageFactory.initElements(driver, UnitedAirlinesHomePage.class);
    }
    @Given("I am in United Airlines Homepage")
    public void i_am_in_united_airlines_homepage() throws IOException {
        openBrowser("https://www.united.com/en/us");
    }

    @When("I click on Book Button")
    public void i_click_on_book_button() throws InterruptedException {
        unitedAirlinesHomePage.clickOnBookButton();
    }

    @When("I click on Hotels Button")
    public void i_click_on_hotels_button() throws InterruptedException {
        unitedAirlinesHomePage.clickOnHotelButton();
    }

    @When("I enter {string} in where to search box and submit")
    public void i_enter_in_where_to_search_box_and_submit(String searchItem) throws InterruptedException {
        unitedAirlinesHomePage.textOnWhereToSearchBox(searchItem);

    }

    @Then("I validate Miami Beach landing properly")
    public void i_validate_miami_beach_landing_properly() throws InterruptedException {
        unitedAirlinesHomePage.validateLandedPageText();
    }

}
