package stepdefinitions;

import atnthome.HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        cleanUp();

    }
//    public void closeBrowser(){
//
//        cleanUp();
//    }

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am on atnt homepage")
    public void i_am_on_atnt_homepage() throws IOException {
        openBrowser("https://www.att.com");
//        openBrowser1("www.att.com");
    }

    @And("I enter iphone in searchBox")
    public void i_enter_iphone_in_search_box() {
        homePage.searchBox.sendKeys("iphone");

    }

    @When("I click searchButton")
    public void i_click_search_button() {
        homePage.clickOnSearchButton();

    }

    @Then("I verify iphone page title")
    public void i_verify_iphone_page_title() {
        String expectedTitle = "Results for iphone - AT&T Search";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle, expectedTitle);

    }


    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String product) {

        homePage.enterSearchKeyword(product);
    }

    @When("I click enter")
    public void i_click_enter() {
        homePage.searchBox.submit();
    }

    @Then("I verify {string} page title")
    public void i_verify_page_title(String productTitle) {
        homePage.validateSearchTitle(productTitle);

    }

    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String searchItem) {

        homePage.validateSearchTitleMultiple(searchItem);
    }

//    @Then("I verify showing results for {string}")
//    public void i_verify_showing_results_for(String text,String productName) {
//        homePage.validateSearchTextMultiple(text,productName);
////    String actualText= "Showing results for "+ productName+".";
////    String expectedText=text;
////      Assert.assertEquals("not found",expectedText,actualText);
//
//    }


}
