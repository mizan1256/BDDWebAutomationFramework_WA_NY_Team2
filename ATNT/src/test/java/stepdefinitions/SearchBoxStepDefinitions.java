package stepdefinitions;

import SearchBox.SearchBox;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxStepDefinitions extends WebAPI {
    static SearchBox searchBox;
    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }
    @BeforeStep
    public static void getInit() {
        searchBox = PageFactory.initElements(driver, SearchBox.class);
    }

    /**
     * Att searchBox functionality test
     *
     * @param int1
     */
    @Given("I enter Apple iPhone {int} in searchBox")
    public void i_enter_iphone_in_search_box(Integer int1) {
        searchBox.searchBoxCheck();
    }
    @When("I click searchButton")
    public void i_click_search_button() {
        searchBox.searchBtnCheck();
    }

    @Then("I verify Apple iPhone {int} is appear properly")
    public void i_verify_apple_i_phone_is_appear_properly(Integer int1) {
        searchBox.validateSearchBoxTxt("Showing results for \"Apple iPhone 11\".");
    }

    @Then("I verify page title as iphone {int}")
    public void i_verify_page_title_as_iphone(Integer int1) {
        searchBox.validateSearchBoxPageTitle();
    }

    /**
     * Att searchBox functionality test get value from feature file
     */
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String product) {
        searchBox.setSearchBoxCheckWithParameter(product);
    }
    @Then("I validate {string} is appear properly")
    public void i_validate_is_appear_properly(String string) {
        searchBox.validateSearchBoxTxt("Showing results for \"Apple iPhone 11\".");
    }

    @Then("I validate page title as iphone {int}")
    public void i_validate_page_title_as_iphone(Integer int1) {
        searchBox.validateSearchBoxPageTitle();
    }

    /**
     * Att searchBox functionality check with multiple products
     */
    @When("I validate \"Showing results for \"Apple iPhone {int}\".\" is appear properly")
    public void i_validate_showing_results_for_apple_i_phone_is_appear_properly(String validateProduct) {
        searchBox.validateSearchBoxTxt(validateProduct);
    }
    @When("I validate \"\"Showing results for {string}.\" is appear properly")
    public void i_validate_showing_results_for_is_appear_properly(String validateProduct) {
    searchBox.validateSearchBoxTxt(validateProduct);
    }

    @And("I validate page title as {string}")
    public void i_validate_page_title_as(String string) {
        searchBox.validateSearchBoxPageTitle();
    }
}
