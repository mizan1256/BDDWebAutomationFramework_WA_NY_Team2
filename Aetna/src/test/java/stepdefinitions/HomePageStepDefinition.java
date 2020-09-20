package stepdefinitions;

import aetnahome.HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
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
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am on Aethna homepage")
    public void i_am_on_aethna_homepage() throws IOException {
        openBrowser("https://www.aetna.com/");
    }

    @Given("I click search")
    public void i_click_search() {
        homePage.clickSearchLogo();
    }

    @Given("I enter medicate in searchBox")
    public void i_enter_medicate_in_search_box() {
        homePage.typeOnSearchBox();
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        homePage.searchBox.submit();
    }

    @Then("I verify searchText")
    public void i_verify_search_text() {
        homePage.verifySearchText();

    }
    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String searchItem) {
        homePage.searchBox.sendKeys(searchItem);
    }

    @Then("I verify aethna logo")
    public void i_verify_aethna_logo() {
        homePage.verifyAethnaLogo();
    }



}
