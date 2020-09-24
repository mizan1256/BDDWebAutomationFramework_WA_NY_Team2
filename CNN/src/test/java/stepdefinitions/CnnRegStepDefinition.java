package stepdefinitions;

import cnnregistration.CnnRegistration;
import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CnnRegStepDefinition extends WebAPI {

    static CnnRegistration cnnRegistration;

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
        cnnRegistration = PageFactory.initElements(driver, CnnRegistration.class);
//        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }





    /**
     * User Account Check
     *
     */
    @When("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        cnnRegistration.userAccountCheck();
    }

    @When("I enter user credentials")
    public void i_enter_user_credentials(DataTable userTable) throws InterruptedException {
        List<List<String>> data = userTable.asLists(String.class);
        cnnRegistration.userCredentialEmail(data.get(1).get(0));
        cnnRegistration.userCredentialPassword(data.get(1).get(1));
        cnnRegistration.userCredentialZipCode(data.get(1).get(2));
    }

    @Then("I validate *Required message")
    public void i_validate_required_message() {
        cnnRegistration.validateUserAccountCheck();
    }

    /**
     * User Account negative test
     */
    @When("I click on register button")
    public void i_click_on_register_button() throws InterruptedException {
        cnnRegistration.userCredentialRegisterBox();
    }

    @Then("I validate {string} message")
    public void i_validate_message(String string) {
        cnnRegistration.validateUserAccountNegativeTest(string);
    }

    /**
     *  Log In positive test
     */
    @When("I do necessary steps to land on LogIn info page")
    public void i_do_necessary_steps_to_land_on_log_in_info_page() throws InterruptedException {
        cnnRegistration.logInPositiveCheck();
    }

    @When("I enter credentials in logIn field")
    public void i_enter_credentials_in_log_in_field(DataTable logInTable) {
        List<List<String>> login = logInTable.asLists(String.class);
        cnnRegistration.logInEmail(login.get(1).get(0));
        cnnRegistration.logInPassword(login.get(1).get(1));
    }

    @Then("I validate {string} message is appeared")
    public void i_validate_message_is_appeared(String string) {
        cnnRegistration.validateLogInPositiveCheck(string);
    }

    /**
     *  Log in negative
     */
    @When("I click on logIn button")
    public void i_click_on_log_in_button() {
        cnnRegistration.logInBoxClick();
    }

    @Then("I validated {string} message is appeared")
    public void i_validated_message_is_appeared(String string) {
        cnnRegistration.validateLogInNegativeCheck(string);
    }

}
