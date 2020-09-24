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
    @When("I click on Check-in Button")
    public void i_click_on_check_in_button() {
        unitedAirlinesHomePage.clickOnCheckInButton();
    }

    @When("I put {string} to Confirmation number Text Box")
    public void i_put_to_confirmation_number_text_box(String confirmNumber) {
        unitedAirlinesHomePage.typeOnConfirmationNumber(confirmNumber);
    }

    @When("I put {string} to last name Text Box")
    public void i_put_to_last_name_text_box(String lastName) {
        unitedAirlinesHomePage.typeOnLastName(lastName);
    }

    @Then("I Click on Search Button")
    public void i_click_on_search_button() {
        unitedAirlinesHomePage.clickOnSearchButton();
    }

    @Then("I Validate Check-in Web page Landed Properly")
    public void i_validate_check_in_web_page_landed_properly() {
        unitedAirlinesHomePage.validationLandedOnCheckInPageText();
    }

}
