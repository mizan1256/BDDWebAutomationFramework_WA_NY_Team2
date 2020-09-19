package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import creditcard.TDBankRegistration;

public class CreditCardsStepDefinitions extends WebAPI {

    TDBankRegistration tdBankRegistration;

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
        tdBankRegistration = PageFactory.initElements(driver, TDBankRegistration.class);
    }

    /**
     * TD bank Credit Card home page display check
     */
    @Given("I click on CreditCard icon")
    public void i_click_on_credit_card_icon() throws InterruptedException {
        tdBankRegistration.clickOnCreditIcon();
    }
    @Then("I validate Credit Card Home page Title")
    public void i_validate_credit_card_home_page_title() {
        tdBankRegistration.validateCredCardHome();
    }
    /**
     * TD bank Credit Card home page display check
     */
    @Given("I click on Td Cash Credit Card")
    public void i_click_on_td_cash_credit_card() {
        tdBankRegistration.clickOnTdCashCreditCard();
    }

    @Given("I validate Td Cash Credit Card is display")
    public void i_validate_td_cash_credit_card_is_display() {
        tdBankRegistration.validateCashCreditCardImage();
    }

    @Then("I validate Td Cash Credit Card page Title")
    public void i_validate_td_cash_credit_card_page_title() {
        tdBankRegistration.validateCashCreditCardTitle();
    }
    /**
     * TD First Class Credit Card page check
     */
    @Given("I click on TD First Class Credit Card Button")
    public void i_click_on_td_first_class_credit_card_button() {
        tdBankRegistration.clickOnTdFirstClassCreditCard();
    }

    @Then("I validate TD First Class Credit Card Image is display")
    public void i_validate_td_first_class_credit_card_image_is_display() {
        tdBankRegistration.validateTdFirstClassCreditCardImage();
    }

    @Then("I validate TD First Class Credit Card page Title")
    public void i_validate_td_first_class_credit_card_page_title() {
        tdBankRegistration.validateTdFirstClassCreditCardTitle();
    }

    /**
     * Help me choose button check
     */
    @When("I click on Help me Choose Button")
    public void i_click_on_help_me_choose_button() {
        tdBankRegistration.clickOnHelpMeBtn();
    }

    @When("I click on Cash and Next button")
    public void i_click_on_cash_and_next_button() {
        tdBankRegistration.clickOnCashAndNextBtn();
    }

    @Then("I validate welcome message")
    public void i_validate_welcome_message() {
        tdBankRegistration.validateHelpValidateTextText("Our suggestion for you");
    }
}
