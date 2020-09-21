package stepdefinitions;

import atnthome.AtntHome;
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

import java.io.IOException;

import static atnthome.AtntHomeWebElements.*;

public class HomePageDefinition extends WebAPI {
    static AtntHome atntHome;

    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }

    //    @After
//    public void closeBrowser(){
//        cleanUp();
//    }
    @BeforeStep
    public static void getInit(){
        atntHome= PageFactory.initElements(driver,AtntHome.class);
    }

    @Given("I am in att homepage")
    public void i_am_in_att_homepage() throws IOException {
        openBrowser("https://www.att.com/");
    }

    @And("I click accountIcon")
    public void i_click_account_icon() {
        atntHome.accountIconButton();
    }

    @And("I click singInButton")
    public void i_click_sing_in_button() {
        atntHome.signInButton();
    }

    @When("I click on CreateButton")
    public void i_click_on_create_button() {

        atntHome.createButton();
    }
    @And("I click wireless radioButton and continueButton")
    public void i_click_wireless_radio_button_and_continue_button() throws InterruptedException {
        atntHome.clickOnElement(wirelessRadioButtonWebElement);
        atntHome.clickOnElement(continueButtonWebElement);
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
        atntHome.validateSignUpText("Sorry we could not validate your information.");
    }

    /**
     * ATnT signIn functionality check with invalid credentials
     */

    @And("I on signIn page")
    public void i_on_sign_in_page() {
        atntHome.accountIconButton();
        atntHome.signInButton();
    }
    @When("I enter userName and passWord")
    public void i_enter_user_name_and_pass_word() {
        atntHome.enterUserId("pnt30242");
        atntHome.enterUserPassword("Pnt@30242");
    }
    @And("I click on signIn button")
    public void i_click_on_sign_in_button() {
        atntHome.clickSignInButton();
    }

    @Then("I am getting error message")
    public void i_am_getting_error_message() {
        atntHome.validateSignInPage();
    }

    /**
     * Att data driven negative signIn test case
     * @param userName
     * @param PassWord
     */
    @Given("I enter email as {string} and password as {string}")
    public void i_enter_email_as_and_password_as(String userName, String PassWord) {
        atntHome.enterUserId(userName);
        atntHome.enterUserPassword(PassWord);
    }

    /**
     * Att BurgerButton menu test
     */
    @When("I click on burgerButton")
    public void i_click_on_burger_button() throws InterruptedException {
        atntHome.clickBurgBtnMenu();
    }

    @And("I select wireless and click on Explore Wireless")
    public void i_select_wireless_and_click_on_explore_wireless() {
        atntHome.selectWirelessAndExploreBtn();
    }

    @Then("I verify page title")
    public void i_verify_page_title() {
        atntHome.validateExploreWirelessTitle();
    }
}
