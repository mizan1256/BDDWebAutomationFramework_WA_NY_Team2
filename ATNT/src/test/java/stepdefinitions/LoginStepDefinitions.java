package stepdefinitions;

import atnthome.HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import login.Login;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginStepDefinitions extends WebAPI {
    static Login login;



    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();

    }
//    public void closeBrowser(){
//        cleanUp();
//    }

    @BeforeStep
    public static void getInit(){
        login= PageFactory.initElements(driver, Login.class);
    }


    @Given("I am on atnt homepage")
    public void i_am_on_atnt_homepage() throws IOException {
        openBrowser("https://www.att.com");
//        openBrowser1("www.att.com");
    }

    @Given("I click on account button")
    public void i_click_on_account_button() {
        login.clickOnAccount();

    }

    @Given("I click on Sign in option")
    public void i_click_on_sign_in_option() {
        login.clickOnSignInOption();
    }

    @Given("i enter user ID")
    public void i_enter_user_id() {
        login.typeOnUserID();
    }

    @Given("I enter password")
    public void i_enter_password() {

        login.typeOnPassword();
    }

    @When("I click signIn button")
    public void i_click_sign_in_button() {

//        login.password.submit();
        login.clickSignInButton();
    }

    @Then("I verify the popup Error text")
    public void i_verify_the_popup_error_text() throws InterruptedException {
        login.validateSignIn();
    }

    @Given("i enter user ID {string}")
    public void i_enter_user_id(String userID) {
        login.typeOnUserID();

    }

    @Given("I enter password {string}")
    public void i_enter_password(String string) {
        login.typeOnPassword();

    }







}
