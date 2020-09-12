package stepdefinitions;

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
import tdbankhome.TDBankHome;

import java.io.IOException;

public class TDStepDefinition extends WebAPI {
    static TDBankHome tdBankHome;
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
        tdBankHome= PageFactory.initElements(driver,TDBankHome.class);
    }
    @Given("I am In TD Bank HomePage")
    public void i_am_in_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");
    }

    @When("I mouseHover on logIn Icon")
    public void i_mouse_hover_on_log_in_icon() {
    tdBankHome.logInIcon();
    }

    @And("I Click Online Banking Button")
    public void i_click_online_banking_button() {
    tdBankHome.onlineBankingCheck();
    }

    @Then("I validated logIn Page is Displayed")
    public void i_validated_log_in_page_is_displayed() {
    tdBankHome.validateOnlineText();
    }
}
