package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import targethome.TargetHomePage;

import java.io.IOException;

public class TargetHomeStepDefinitions  extends WebAPI {
    TargetHomePage targetHomePage;

    @BeforeStep
    public void getInit(){
        targetHomePage = PageFactory.initElements(driver,TargetHomePage.class);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        driver.quit();
    }



    //Search Box related Steps

    @Given("I am on Target Home Page")
    public void i_am_on_target_home_page() throws IOException {
        openBrowser("https://www.target.com/");
    }

    @When("I enter {string} in search box")
    public void i_enter_in_search_box(String item) {
        targetHomePage.enterItemInSearchBox(item);
    }

    @When("I click on searrch button")
    public void i_click_on_search_button() {
        targetHomePage.clickOnSearchBtn();

    }

    @Then("I verify the item is appeared properly")
    public void i_verify_the_item_is_appeared_properly() {
        targetHomePage.verifyItem();

    }

    //Search Box For multiple items
    @When("I enter {string} in serach box fields")
    public void i_enter_in_serach_box_fields(String items) {
        targetHomePage.enterItemsInSearchBoxFields(items);
    }

    @Then("I verify {string} are appeared properly")
    public void i_verify_are_appeared_properly(String itemsText) {
        targetHomePage.verifySearchedItemsText(itemsText);

    }










    }








