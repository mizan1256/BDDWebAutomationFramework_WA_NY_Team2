package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tdbankhome.TDBankHome;

import java.io.IOException;

public class TDBankHomePageStepDefinitions extends WebAPI {
    TDBankHome tdBankHome;

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
        openBrowser();
    }

    @When("I mouseHover on LogIn")
    public void i_mouse_hover_on_log_in() {
        tdBankHome.logInIcon();
    }

    @When("I click on online banking")
    public void i_click_on_online_banking() {
        tdBankHome.onlineBanking();
    }

    @Then("I validate log in page is displayed")
    public void i_validate_log_in_page_is_displayed() {
        tdBankHome.validateOnlineBankingTxt();
    }

    /**
     * TD Bank SignUp functionality test
     */


    @When("I click on signUp button")
    public void i_click_on_sign_up_button() {
        tdBankHome.clickOnSignInBtn();
    }

    @When("I select Personal Accounts Radio button from PopUp")
    public void i_select_personal_accounts_radio_button_from_pop_up() {

    }

    @When("I checked Please Confirm checkBox from PopUp")
    public void i_checked_please_confirm_check_box_from_pop_up() {
        tdBankHome.pleaseConfirmCheckBtn();
    }

    @Then("I click continue in PopUp")
    public void i_click_continue_in_pop_up() {
        tdBankHome.acceptPopUpUsingAlert();
    }

    @Then("I check Accept button from second PopUp")
    public void i_check_accept_button_from_second_pop_up() {
        tdBankHome.eSignAcceptCheckBox();
    }

    @Then("I Accept second PopUp")
    public void i_accept_second_pop_up() {
        tdBankHome.acceptSecondPopUpUsingAlert();
    }

    @Then("I enter FirstName LastName and Email")
    public void i_enter_first_name_last_name_and_email() {
        tdBankHome.insertCredentials();
    }

    @Then("I select Checking From Account Type")
    public void i_select_checking_from_account_type() {
        tdBankHome.selectAccountType();
    }

    @Then("I enter ATM card Number")
    public void i_enter_atm_card_number() {
        tdBankHome.enterAtmCardNumber();
    }

    @Then("I enter SSN number")
    public void i_enter_ssn_number() {
        tdBankHome.enterSsnNumber();
    }

    @Then("I enter Account Number")
    public void i_enter_account_number() {
        tdBankHome.enterAccountNumber();
    }

    @Then("I check Yes from Bill Pay Option")
    public void i_check_yes_from_bill_pay_option() {
        tdBankHome.checkYesFromBillPayOption();
    }

    @Then("I select Yes from go paperless option")
    public void i_select_yes_from_go_paperless_option() {
        tdBankHome.goPaperlessOption();
    }

    @Then("I Accept the third popUp")
    public void i_accept_the_third_pop_up() {
        tdBankHome.acceptThirdPopUp();
    }

    @Then("I enter user name in Create your UserName field")
    public void i_enter_user_name_in_create_your_user_name_field() {
        tdBankHome.enterUserName();
    }

    @Then("I re enter user name In Re enter your user name field")
    public void i_re_enter_user_name_in_re_enter_your_user_name_field() {
        tdBankHome.reEnterUserName();
    }

    @Then("I enter password in Your new password field")
    public void i_enter_password_in_your_new_password_field() {
        tdBankHome.enterUserPassword();
    }

    @Then("I re enter password in Re enter password field")
    public void i_re_enter_password_in_re_enter_password_field() {
        tdBankHome.reEnterUserPassword();
    }

    @Then("I click on continue")
    public void i_click_on_continue() {
        tdBankHome.clickOnContinueBtn();
    }

    @Then("I validate error message")
    public void i_validate_error_message() {
        tdBankHome.validateSignUpPageText("wrong text");
    }

}



