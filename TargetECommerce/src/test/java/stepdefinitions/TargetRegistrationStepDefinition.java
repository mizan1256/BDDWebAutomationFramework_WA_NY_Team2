package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import targetregistration.TargetHomePage;

import java.io.IOException;
import java.util.List;

public class TargetRegistrationStepDefinition extends WebAPI {
    static TargetHomePage targetHomePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInit() {
        targetHomePage = PageFactory.initElements(driver, TargetHomePage.class);
    }

    @Given("I am on TargetECommerce homepage")
    public void i_am_on_target_e_commerce_homepage() throws IOException {
        openBrowser("https://www.target.com/");
    }

    @Given("I click on signIn")
    public void i_click_on_sign_in() {
        targetHomePage.clickSignIn();
    }

    @Given("I click on signInOption to sign in")
    public void i_click_on_sign_in_option_to_sign_in() {
        targetHomePage.signIn();

    }

    @Given("I input email and password")
    public void i_input_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        targetHomePage.enterEmailAddress(data.get(0).get(0));
        targetHomePage.enterPassword(data.get(0).get(1));
    }

    @Given("I enter emailAddress and password")
    public void i_enter_email_address_and_password() {
        targetHomePage.enterEmailAddressAndPassword();
    }

    @When("I click keepMeSignIn")
    public void i_click_keep_me_sign_in() {
        targetHomePage.keepMeSignIn();
    }

    @Then("I verify text sign into your target account")
    public void i_verify_text_sign_into_your_target_account() {
        targetHomePage.validateSignInToYourTargetAccount();
    }

    @Given("I enter {string} and {string}")
    public void i_enter_and(String userName, String password) {
        targetHomePage.enterEmailAddressAndPassword(userName, password);
    }


    //search
    @Given("I enter productName in searchBox")
    public void i_enter_product_name_in_search_box(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        targetHomePage.enterSearchKeyword(data.get(0).get(0));
//         targetHomePage.enterSearchKeyword(data.get(1).get(0));
//         targetHomePage.enterSearchKeyword(data.get(2).get(0));
//         targetHomePage.enterSearchKeyword(data.get(3).get(0));
    }


    @When("I click searchButton")
    public void i_click_search_button() {
        targetHomePage.clickSearch();
    }

    @Then("I verify SearchedProduct is appear properly")
    public void i_verify_searched_product_is_appear_properly(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        targetHomePage.validateSearchItemText(data.get(0).get(0));
//        targetHomePage.validateSearchItemText(data.get(1).get(0));
//        targetHomePage.validateSearchItemText(data.get(2).get(0));
//        targetHomePage.validateSearchItemText(data.get(3).get(0));
    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        targetHomePage.SearchMultipleItems(productName);
    }

    @Then("I verify {string} is appear properly")
    public void i_verify_is_appear_properly(String SearchedProductCheck) {
        targetHomePage.validateSearchProducts(SearchedProductCheck);
    }


    @Given("I click accountOption")
    public void i_create_account_option() throws InterruptedException {
        targetHomePage.clickCreateAccount();
    }
@When("I click create account button")
    public void i_click_create_account_button() {
        targetHomePage.setClickCreateAccountButton();
    }

    @Given("I enter  information to login")
    public void i_enter_information_to_login(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> data = dataTable.asLists(String.class);
        targetHomePage.enterEmailAddressForRegistration(data.get(0).get(0));
        sleepFor(5);
        targetHomePage.enterFirstName(data.get(0).get(1));

        targetHomePage.enterLastName(data.get(0).get(2));
        targetHomePage.enterPasswordForRegistration(data.get(0).get(3));

    }




}
