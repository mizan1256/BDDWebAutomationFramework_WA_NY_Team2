package stepdefinitions;

import cnnhome.CnnHomePage;
import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

public class CnnHomeStepsDefinitions extends WebAPI {
    CnnHomePage cnnHomePage;

    @BeforeStep
    public void getInit() {
        cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
    }


    @After
    public void tearDown(Scenario scenario) {
        //driver.quit();
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        driver.quit();
    }



    //LoginIn Steps:
    @Given("I am on cnn home page")
    public void i_am_on_cnn_home_page() throws IOException {
        openBrowser("https://www.cnn.com");
    }

    @When("I click on user account button")
    public void i_click_on_user_account_button() {
        cnnHomePage.clickOnUserAccountBtn();
    }

    @When("I enter {string} into email text field")
    public void i_enter_into_email_text_field(String email) {
        cnnHomePage.enterEmailIntoEmailField(email);
    }

    @When("I enter {string} into password text field")
    public void i_enter_into_password_text_field(String password) {
        cnnHomePage.enterPasswordIntoPasswordField(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        cnnHomePage.clickOnLoginBtn();
    }

    @Then("I verify invalid login text")
    public void i_verify_invalid_login_text() {
        cnnHomePage.verifyInvalidLogin();
    }

    @Then("I verify the page title")
    public void i_verify_the_page_title() {
        cnnHomePage.validateLoginWithAllValidCredentials();
    }


    //SignUp Steps:

    @When("I click on sign up link")
    public void i_click_on_sign_up_link() {
        cnnHomePage.clickOnSignUpLink();
    }

    @When("I enter {string} into the eamil text field")
    public void i_enter_into_the_eamil_text_field(String email) {
        cnnHomePage.typeEmailInEmailField(email);

    }

    @When("I enter {string} into the password text field")
    public void i_enter_into_the_password_text_field(String password) {
        cnnHomePage.typePasswordInEmailField(password);

    }

    @When("I enter {string} into the zipcode text field")
    public void i_enter_into_the_zipcode_text_field(String zipcode) {
        cnnHomePage.typeZipcodeInZipcodeField(zipcode);
    }

    @When("I click on register button")
    public void i_click_on_register_button() {
        cnnHomePage.clickOnRegisterBtn();

    }

    @Then("I verify that account is valid")
    public void i_verify_that_account_is_valid() {
        cnnHomePage.verifyTheAccountIsValid();

    }

    //Verify invalid sign up errorMsg

    @Then("I verify invalid email address text")
    public void i_verify_invalid_email_address_text(){
        cnnHomePage.invalidEmailText();

    }

    @Then("I verify invalid password text")
    public void i_verify_invalid_password_text(){
        cnnHomePage.invalidPasswordText();

    }

    @Then("I verify invalid zipcode message")
    public void i_verify_invalid_zipcode_message(){
        cnnHomePage.invalidZipCodeText();

    }


    @Then("I verify the {string} for invalid sign up")
    public void i_verify_the_for_invalid_sign_up(String errorMsg) {
        cnnHomePage.invalidSignUpText();


    }




}
