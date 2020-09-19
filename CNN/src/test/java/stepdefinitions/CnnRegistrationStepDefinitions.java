package stepdefinitions;

import cnnRegistration.RegistrationPage;
import cnnhome.CnnHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class CnnRegistrationStepDefinitions extends WebAPI {
    static RegistrationPage registrationPage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public void getInIt() {
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }

    /**
     * Cnn signUp functionality check
     * @throws InterruptedException
     */
    @When("I do all necessary steps to land on Registration page")
    public void i_do_all_necessary_steps_to_land_on_registration_page() throws InterruptedException {
        registrationPage.landOnSingUpPage();
    }

    @When("I enter user info")
    public void i_enter_user_info(io.cucumber.datatable.DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        registrationPage.enterUserEmail(data.get(1).get(0));
        registrationPage.enterUserPassword(data.get(1).get(1));
        registrationPage.enterUserZipcode(data.get(1).get(2));
    }

    @When("I click on registration button")
    public void i_click_on_registration_button() throws InterruptedException {
        registrationPage.clickOnRegistrationBtn();
    }

    @Then("I validate welcome message")
    public void i_validate_welcome_message() {
        registrationPage.validateRegistrationMessage("This account already exists. Please log in.");
    }
    /**
     * Cnn logIn functionality check
     */
    @When("I click on SingInIcon")
    public void i_click_on_sing_in_icon() throws InterruptedException {
    registrationPage.clickOnSingInBtn();
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String userEmail, String password) throws InterruptedException {
        registrationPage.enterLogInInfo(userEmail,password);
    }

    @Then("I validate landed page title")
    public void i_validate_landed_page_title() {
        registrationPage.validateSingInPageTitle();
    }

}
