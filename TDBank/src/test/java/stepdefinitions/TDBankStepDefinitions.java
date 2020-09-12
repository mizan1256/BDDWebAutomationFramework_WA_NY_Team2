package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tdbankhome.TDBankHome;

import java.io.IOException;

public class TDBankStepDefinitions extends WebAPI {

    static TDBankHome tdBankHome;

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
    public void getInIt() {
        tdBankHome = PageFactory.initElements(driver, TDBankHome.class);
    }

    @Given("I am on TD Bank home page")
    public void i_am_on_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");
    }

    @When("I mouseHover on logIn")
    public void i_mouse_hover_on_log_in() {
        tdBankHome.logInIcon();
    }

    @And("I click online banking")
    public void i_click_online_banking() {
        tdBankHome.onlineBanking();
    }

    @Then("i validate log in page is displayed")
    public void i_validate_log_in_page_is_displayed() {
        tdBankHome.validateLogInIcon();
    }


}
