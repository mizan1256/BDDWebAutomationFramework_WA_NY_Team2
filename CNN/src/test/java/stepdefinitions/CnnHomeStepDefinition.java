package stepdefinitions;

import cnnhome.CnnHomePage;
import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class CnnHomeStepDefinition extends WebAPI {

    static CnnHomePage cnnHomePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }
    @BeforeStep
    public void getInIt(){
        cnnHomePage= PageFactory.initElements(driver, CnnHomePage.class);
    }
    @Given("I am in Cnn home page")

    public void i_am_in_cnn_home_page() throws IOException {
        openBrowser("https://www.cnn.com/");
    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String SearchItem) throws InterruptedException {
        cnnHomePage.cnnSearchBoxCheck(SearchItem);
    }

    @Then("I validate Sports page appear properly")
    public void i_validate_sports_page_appear_properly() {
        cnnHomePage.validateCNNSearchBoxTypeAble();
    }
    /**
     * Cnn search box check using data table
     */

    @When("I validate page title as {string}")
    public void i_validate_page_title_as(String validatePageTitle) {
        cnnHomePage.validateDataTablePageTitle(validatePageTitle);
    }
    /**
     * Cnn edition button check
     */
    @When("I click on edition button")
    public void i_click_on_edition_button() throws InterruptedException {
        cnnHomePage.clickOnEditionBtn();
    }

    @When("I click on Us International Arabic and Espanol button")
    public void i_click_on_us_international_arabic_and_espanol_button() throws InterruptedException {
        cnnHomePage.selectFromEditionDropDown();
    }

    @Then("I validate page title")
    public void i_validate_page_title() {
        cnnHomePage.validateEditionBtn();
    }

}
