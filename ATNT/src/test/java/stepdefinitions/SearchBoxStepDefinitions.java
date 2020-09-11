package stepdefinitions;

import SearchBox.SearchBox;
import atnthome.AtntHome;
import common.WebAPI;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxStepDefinitions extends WebAPI {
    static SearchBox searchBox;

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
    public void i_verify_Apple_iPhone_is_appear_properly(Integer int1) {
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

    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String string) {
        searchBox.validateSearchBoxTxt("Showing results for \"Apple iPhone 11\".");
    }
    /**
     * Att searchBox functionality check with multiple products
     */
    @Then("I verify page title as {string}")
    public void i_verify_page_title_as(String productName) {
        searchBox.validateSearchBoxTxt(productName);
    }
}
