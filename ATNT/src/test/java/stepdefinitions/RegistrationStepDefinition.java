package stepdefinitions;

import atnthome.AtntHome;
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
import registration.RegistrationPage;

public class RegistrationStepDefinition extends WebAPI {
    static RegistrationPage registrationPage;

    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public static void getInIt() {
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }

    @Given("I click the Account dropdown button")
    public void i_click_the_account_dropdown_button() {
        registrationPage.accountArrowButtonClick();
    }

    @And("I click signIn")
    public void i_click_sign_in() {
        registrationPage.accountSignInButton();
    }

    @And("I enter admin1234 in user Id box")
    public void i_enter_admin1234_in_user_id_box() {
        registrationPage.userIdBox();
    }

    @And("I enter admin1234 in password box")
    public void i_enter_admin1234_in_password_box() {
        registrationPage.passwordBox();
    }

    @When("I click signIn button")
    public void i_click_sign_in_button() {
        registrationPage.signInButtonClick();
    }

    @Then("I verified {string} ia appeared properly")
    public void i_verified_ia_appeared_properly(String string) {
        registrationPage.validateLoginAccount("Sign in");
    }

    @And("I verify page title as Login Screen")
    public void i_verify_page_title_as_login_screen() {
        registrationPage.ValidateLoginGetTitle();
    }

    // CapCha Test
    @Given("I click Pay without signing in")
    public void i_click_pay_without_signing_in() {
        registrationPage.payWithoutSignInBtn();
    }

    @And("I enter {string} Active AT&T phone number box")
    public void i_enter_active_at_t_phone_number_box(String string) {
        registrationPage.phoneNumberBox();
    }

    @Given("I enter {string} Billing ZIP Code")
    public void i_enter_billing_zip_code(String string) {
        registrationPage.zipCodeBox();
    }

    @Given("I click capcha box")
    public void i_click_capcha_box() throws InterruptedException {
        registrationPage.capChaClick();
    }

    //    Create Account
    @Given("I click Account overview")
    public void i_click_account_overview() {

    }

    @Given("I click Create one now")
    public void i_click_create_one_now() {

    }

    @Given("I click Wireless radio button")
    public void i_click_wireless_radio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I click continue box")
    public void i_click_continue_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I type phone number in AT&T phone number box")
    public void i_type_phone_number_in_at_t_phone_number_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I type {int} digit zip code in Billing zip code Box")
    public void i_type_digit_zip_code_in_billing_zip_code_box(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click continue button")
    public void i_click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I verify page title as Create or link an ID")
    public void i_verify_page_title_as_create_or_link_an_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}