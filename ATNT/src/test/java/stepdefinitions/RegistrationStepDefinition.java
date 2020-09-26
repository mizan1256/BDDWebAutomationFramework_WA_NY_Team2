
package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import registration.RegistrationPage;

import static registration.RegistrationPageWebElement.continueButtonWebElement;
import static registration.RegistrationPageWebElement.wirelessRadioButtonWebElement;

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


    @And("I click accountIcon")
    public void i_click_account_icon() {
        registrationPage.accountIconButton();
    }

    @And("I click singInButton")
    public void i_click_sing_in_button() {
        registrationPage.signInButton();
    }

    @When("I click on CreateButton")
    public void i_click_on_create_button() {

        registrationPage.createButton();
    }
    @And("I click wireless radioButton and continueButton")
    public void i_click_wireless_radio_button_and_continue_button() throws InterruptedException {
        registrationPage.clickOnElement(wirelessRadioButtonWebElement);
        registrationPage.clickOnElement(continueButtonWebElement);
        Thread.sleep(2000);
    }

    @Then("I enter phoneNumber and zipCode")
    public void i_enter_phone_number_and_zip_code() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("11432");
        Thread.sleep(3000);
    }

    @When("I click continueButton")
    public void i_click_continue_button() {
        driver.findElement(By.xpath("//button[@class='btn btn-primary-functional btn-medium span3 ng-scope ng-isolate-scope']")).click();
    }

    @Then("I should be get en error message")
    public void i_should_be_get_en_error_message() {
        registrationPage.validateSignUpText("Sorry we could not validate your information.");
    }

    /**
     * ATnT signIn functionality check with invalid credentials
     */

    @And("I on signIn page")
    public void i_on_sign_in_page() {
        registrationPage.accountIconButton();
        registrationPage.signInButton();
    }
    @When("I enter userName and passWord")
    public void i_enter_user_name_and_pass_word() {
        registrationPage.enterUserId("pnt30242");
        registrationPage.enterUserPassword("Pnt@30242");
    }
    @And("I click on signIn button")
    public void i_click_on_sign_in_button() {
        registrationPage.clickSignInButton();
    }

    @Then("I am getting error message")
    public void i_am_getting_error_message() {
        registrationPage.validateSignInPage();
    }

    /**
     * Att data driven negative signIn test case
     * @param userName
     * @param PassWord
     */
    @Given("I enter email as {string} and password as {string}")
    public void i_enter_email_as_and_password_as(String userName, String PassWord) {
        registrationPage.enterUserId(userName);
        registrationPage.enterUserPassword(PassWord);
    }

    /**
     * Att BurgerButton menu test
     */
    @When("I click on burgerButton")
    public void i_click_on_burger_button() throws InterruptedException {
        registrationPage.clickBurgBtnMenu();
    }

    @And("I select wireless and click on Explore Wireless")
    public void i_select_wireless_and_click_on_explore_wireless() {
        registrationPage.selectWirelessAndExploreBtn();
    }

    @Then("I verify page title")
    public void i_verify_page_title() {
        registrationPage.validateExploreWirelessTitle();
    }
}
