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
        import java.util.List;

public class TDBankHomeStepDefinitions extends WebAPI {

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

    @Given("I am in TD Bank home page")
    public void i_am_in_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");

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

    @When("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        tdBankHome.pleaseConfirmCheckBtn();
        tdBankHome.acceptPopUpUsingAlert();
        tdBankHome.eSignAcceptCheckBox();
        tdBankHome.acceptSecondPopUpUsingAlert();
    }

    @When("I select account type")
    public void i_select_account_type() {
        tdBankHome.selectAccountType();
    }

    @When("I enter user information")
    public void i_enter_user_information(io.cucumber.datatable.DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        tdBankHome.enterFirstName(data.get(1).get(0));
        tdBankHome.enterLastName(data.get(1).get(1));
        tdBankHome.enterEmail(data.get(1).get(02));
        tdBankHome.enterAtmCardNumber(data.get(1).get(3));
        tdBankHome.enterSsnNumber(data.get(1).get(4));
        tdBankHome.enterAccountNumber(data.get(1).get(5));
        tdBankHome.enterUserName(data.get(1).get(6));
        tdBankHome.reEnterUserName(data.get(1).get(7));
        tdBankHome.enterUserPassword(data.get(1).get(8));
        tdBankHome.reEnterUserPassword(data.get(1).get(9));
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
        tdBankHome.clickOnContinueBtn();
    }

    @Then("I validate signUp message")
    public void i_validate_sign_up_message() {
        tdBankHome.validateSignUpPageText("");
    }

    /**
     * Td bank Login functionality test with invalid credentials
     */
    @When("I click on logIn button in homePage")
    public void i_click_on_log_in_button_in_home_page() {
        tdBankHome.clickOnTdLogInBtn();
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String userName, String password) {
        tdBankHome.enterUserInfo(userName, password);
    }

    @When("I click on login")
    public void i_click_on_login() {
        tdBankHome.clickOnLogInBtn();
    }

    @Then("I validate the error message")
    public void i_validate_the_error_message() throws InterruptedException {
        tdBankHome.validateLogInText("Economic Impact Payments:  Be sure your bank info is correct and track your payment with the IRS.  Learn more");
    }

    /**
     * TD Bank product dropDown list check
     */
    @When("I click on product")
    public void i_click_on_product() throws InterruptedException {
        tdBankHome.clickOnProductBtn();
    }

    @When("I click on checking")
    public void i_click_on_checking() throws InterruptedException {
        tdBankHome.clickOnCheckingBtn();
    }

    /**
     * TD Bank location searchBox check
     */
    @Then("I validate checking account page")
    public void i_validate_checking_account_page() {
        tdBankHome.validateProductText("TD Bank Checking Accounts");
    }

    @When("I click FindUs Icon")
    public void i_click_find_us_icon() {
        tdBankHome.clickOnFindUsIcon();
    }

    @When("I enter {string} and click on searchIcon")
    public void i_enter_and_click_on_search_icon(String zipcode) throws InterruptedException {
        tdBankHome.enterLocationAndClickOnSearchIcon(zipcode);
    }

    @Then("I validate TD bank locations appeared")
    public void i_validate_td_bank_locations_appeared() throws InterruptedException {
        tdBankHome.validateFindUsValidationText("10 locations near \"Jamaica, NY\"");
    }

    /**
     * Get Direction Button check
     */
    @When("I take necessary steps and landed on locations page")
    public void i_take_necessary_steps_and_landed_on_locations_page() throws InterruptedException {
        tdBankHome.landingOnLocationsPage();
    }

    @When("I click on Get Direction Button")
    public void i_click_on_get_direction_button() {
        tdBankHome.clickOnGetDirection();
    }

    @Then("I validate google map page Title")
    public void i_validate_google_map_page_title() {
        tdBankHome.validateGetDirection();
    }
}
