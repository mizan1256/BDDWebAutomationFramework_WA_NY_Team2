package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import tdbankhome.TDBankHome;

import java.io.IOException;

public class TDHomePageStepDefinitions extends WebAPI {
    static TDBankHome tdBankHome;
    //cucumber hook
    @After
    public void closeBrowser(){

        cleanUp();
    }
    @BeforeStep
    public static void getInIt(){

        tdBankHome= PageFactory.initElements(driver,TDBankHome.class);
    }
    @Given("I am on TD bank home page.")
    public void i_am_on_td_bank_home_page() throws IOException {
       openBrowser("https://www.td.com/us/en/personal-banking/");
    }

    @When("i mouse hover on LogIn")
    public void i_mouse_hover_on_log_in() {
       tdBankHome.logInIcon();
    }

    @And("i click on Online Banking")
    public void i_click_on_online_banking() {
        tdBankHome.onlineBanking();

    }

    @Then("i validate LogIn page is displayed")
    public void i_validate_log_in_page_is_displayed() {
       tdBankHome.validateOnlineBanking();
    }


    @When("I click on sign up")
    public void i_click_on_sign_up() {

    }

    @And("I enter personal information")
    public void i_enter_personal_information() {

    }

    @And("I enter personal account information")
    public void i_enter_personal_account_information() {

    }

    @And("create User and Password name")
    public void create_user_and_password_name() {

    }

    @Then("i validate Signup page is displayed")
    public void i_validate_signup_page_is_displayed() {

    }
}
