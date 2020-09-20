package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import targetregistration.TargetRegistrationPage;

import java.io.IOException;
import java.util.List;

public class TargetRegistrationStepDefinition extends WebAPI {
    static TargetRegistrationPage targetRegistrationPage;

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
        targetRegistrationPage = PageFactory.initElements(driver, TargetRegistrationPage.class);
    }

    @Given("I am on TargetECommerce homepage")
    public void i_am_on_target_e_commerce_homepage() throws IOException {
        openBrowser("https://www.target.com/");
    }

    @Given("I click on signIn")
    public void i_click_on_sign_in() {
        targetRegistrationPage.clickSignIn();
    }

    @Given("I click on signInOption to sign in")
    public void i_click_on_sign_in_option_to_sign_in() {
        targetRegistrationPage.signIn();

    }
//    @Given("I enter {string} and {string}")
//    public void i_enter_and(String userName, String password) {
//        targetRegistrationPage.enterEmailAddressAndPassword1(userName,password);
//
//    }
@Given("I input email and password")
public void i_input_email_and_password(io.cucumber.datatable.DataTable dataTable) {
    List<List<String>> data = dataTable.asLists(String.class);
    targetRegistrationPage.enterEmailAddress(data.get(0).get(0));
    targetRegistrationPage.enterPassword(data.get(0).get(1));
}

    @Given("I enter emailAddress and password")
    public void i_enter_email_address_and_password() {
        targetRegistrationPage.enterEmailAddressAndPassword();
    }

    @When("I click keepMeSignIn")
    public void i_click_keep_me_sign_in() {
        targetRegistrationPage.keepMeSignIn();
    }

    @Then("I verify text sign into your target account")
    public void i_verify_text_sign_into_your_target_account() {
        targetRegistrationPage.validateSignInToYourTargetAccount();
    }


}
