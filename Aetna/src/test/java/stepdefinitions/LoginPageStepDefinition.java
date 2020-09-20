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

public class LoginPageStepDefinition extends WebAPI {
    static HomePage homePage;// have to create a login page: but i did login inside homepage



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



    @Given("I am on Aethna loginPage")
    public void i_am_on_aethna_login_page() throws IOException {
        openBrowser("https://www.aetna.com/");
    }

    @Given("I click on login")
    public void i_click_on_login() {
        homePage.clickToLogin();


    }

    @Given("I click on loginTab option")
    public void i_click_on_login_tab_option() {
        homePage.clickLoginOption();
    }

    @Given("i enter user ID {string} and  password {string}")
    public void i_enter_user_id_and_password(String userName, String password) {
        homePage.enterUserNameAndPassword(userName,password);

    }

    @When("I click login button")
    public void i_click_login_button() {
        homePage.clickLoginButton();

    }

    @Then("I verify the popup Error text")
    public void i_verify_the_popup_error_text() {
        homePage.verifyErrorTextLogin();

    }


}
