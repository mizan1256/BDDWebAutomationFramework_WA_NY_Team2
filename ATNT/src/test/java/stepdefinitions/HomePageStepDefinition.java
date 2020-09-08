package stepdefinitions;

import atnthome.AtntHome;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static AtntHome atntHome;
//    Cucumber Hook
    @After
    public void closeBrowser(){
        cleanUp();
    }
    @BeforeStep
    public static void getInIt(){
        atntHome= PageFactory.initElements(driver,AtntHome.class);
    }
    @Given("I am in at&t homepage")
    public void i_am_in_at_t_homepage() throws IOException {
        openBrowser();
    }

    @And("I enter Samsung Phones in searchBox")
    public void i_enter_samsung_phones_in_search_box() {
        atntHome.enterSearchKeyWord("Samsung Phones");
    }

    @When("I click searchButton")
    public void i_click_search_button() {
        atntHome.clickOnSearchButton();
    }

    @Then("I verify Samsung Phones is appear properly")
    public void i_verify_samsung_phones_is_appear_properly() {
        atntHome.validateSearchText("Showing results for \"Samsung Phones\".");
    }

    @And("I verify page title as Samsung Phones")
    public void i_verify_page_title_as_samsung_phones() {
        String expectedTitle = "Results for Samsung Phones - AT&T Search";
        String actualTitle = driver.getTitle().toString();
        Assert.assertEquals("Title does not match",expectedTitle,actualTitle);
    }


}
