package stepdefinitions;

import cnnhome.CnnHomePage;
import common.WebAPI;
import io.cucumber.datatable.DataTable;
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

import java.io.IOException;
import java.util.List;

public class CnnHomeStepDefinition extends WebAPI {
    static CnnHomePage homePage;

    //cucumber hook
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

        homePage = PageFactory.initElements(driver, CnnHomePage.class);
    }

    @Given("I am in CNN home page")
    public void i_am_in_cnn_home_page() throws IOException {
        openBrowser("https://www.cnn.com/");
    }

    @When("I click on burger button")
    public void i_click_on_burger_button() {
        homePage.burgerButtonCheck();
    }

    @And("I enter sports in search box")
    public void i_enter_sports_in_search_box() {
        homePage.typeInSearchBox();
    }

    @And("I click on search button")
    public void i_click_on_search_button() {
        homePage.searchArrowButton();
    }

    @And("I click on politics radio button")
    public void i_click_on_politics_radio_button() throws InterruptedException {
        homePage.politicsRadioButton();
    }

    @Then("I validate politics page is appeared properly")
    public void i_validate_politics_page_is_appeared_properly() {
        homePage.validateSearchText();
    }

    /**
     * Travel Tab test
     */
    @When("I click on travel tab")
    public void i_click_on_travel_tab() throws InterruptedException {
        homePage.travelTabCheck();
    }

    @And("I click on best beach")
    public void i_click_on_best_beach() throws InterruptedException {
        homePage.bestBeachTab();
    }

    @And("I click on Map tab")
    public void i_click_on_map_tab() {
        homePage.mapTab();
    }

    @And("I click on radio button")
    public void i_click_on_radio_button() {
        homePage.clickMapRadioButton();
    }

    @And("I validate View All is visible")
    public void i_validate_view_all_is_visible() {
        homePage.validateTravelTabCheck();
    }

    /**
     * Edition dropdown button
     */
    @When("I click on edition dropDown button")
    public void i_click_on_edition_drop_down_button() {
        homePage.dropDownEditionButton();
    }

    @When("I click on international")
    public void i_click_on_international() {
        homePage.internationalButton();
    }

    @When("I click on all stories")
    public void i_click_on_all_stories() {
        homePage.covid19AllStories();
    }

    @When("I click on Covid-{int} symptoms")
    public void i_click_on_covid_symptoms(Integer int1) {
        homePage.covidSymptoms();
    }

    @Then("I validate By Sandee LaMotte, CNN is visible")
    public void i_validate_by_sandee_la_motte_cnn_is_visible() {
        homePage.validateDropDownEditionButton();
    }

    /**
     * Live Tv check
     */
    @When("I click on live Tv button")
    public void i_click_on_live_tv_button() throws InterruptedException {
        homePage.liveTvButton();
    }

    @When("I click on Tv Play Button")
    public void i_click_on_tv_play_button() throws InterruptedException {
        homePage.liveTvPlayButton();
    }

    @When("I click on back to cnn.com")
    public void i_click_on_back_to_cnn_com() throws InterruptedException {
        homePage.liveTvBackHome();
    }

    @Then("I validate Covid-{int} is visible")
    public void i_validate_covid_is_visible(Integer int1) throws InterruptedException {
        homePage.validateLiveTvButtonCheck();
    }

    /**
     * Tv channel Box
     */
    @When("I click on Tv channel box")
    public void i_click_on_tv_channel_box() throws InterruptedException {
        homePage.tvChannelBoxCheck();
    }

    @When("I click on cnn channel")
    public void i_click_on_cnn_channel() throws InterruptedException {
        homePage.clickTvChannelBox();
    }

    @Then("I validate Login is visible")
    public void i_validate_login_is_visible() throws InterruptedException {
        homePage.validateTvChannelBoxCheck();
    }

    /**
     * Tv channel Box Close
     */
    @When("I click close button")
    public void i_click_close_button() throws InterruptedException {
        homePage.channelCloseOption();
    }

    @Then("I validate News Shows is visible")
    public void i_validate_news_shows_is_visible() throws InterruptedException {
        homePage.validateChannelCloseOption();
    }

    /**
     * Tv Channel linda voice check
     */
    @When("I click linda voice button")
    public void i_click_linda_voice_button() throws InterruptedException {
        homePage.lindaVoiceCheck();
    }

    @When("I click linda voice play button")
    public void i_click_linda_voice_play_button() throws InterruptedException {
        homePage.lindaVideoPlay();
    }

    @Then("I validate US is visible")
    public void i_validate_us_is_visible() throws InterruptedException {
        homePage.validateLindaVoiceCheck();
    }

    /**
     * User Account Check
     */
    @When("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        homePage.userAccountCheck();
    }

    @When("I enter user credentials")
    public void i_enter_user_credentials(DataTable userTable) throws InterruptedException {
        List<List<String>> data = userTable.asLists(String.class);
        homePage.userCredentialEmail(data.get(1).get(0));
        homePage.userCredentialPassword(data.get(1).get(1));
        homePage.userCredentialZipCode(data.get(1).get(2));
    }

    @Then("I validate *Required message")
    public void i_validate_required_message() {
        homePage.validateUserAccountCheck();
    }

    /**
     * User Account negative test
     */
    @When("I click on register button")
    public void i_click_on_register_button() throws InterruptedException {
        homePage.userCredentialRegisterBox();
    }

    @Then("I validate {string} message")
    public void i_validate_message(String string) {
        homePage.validateUserAccountNegativeTest(string);
    }

    /**
     * Log In positive test
     */
    @When("I do necessary steps to land on LogIn info page")
    public void i_do_necessary_steps_to_land_on_log_in_info_page() throws InterruptedException {
        homePage.logInPositiveCheck();
    }

    @When("I enter credentials in logIn field")
    public void i_enter_credentials_in_log_in_field(DataTable logInTable) {
        List<List<String>> login = logInTable.asLists(String.class);
        homePage.logInEmail(login.get(1).get(0));
        homePage.logInPassword(login.get(1).get(1));
    }

    @Then("I validate {string} message is appeared")
    public void i_validate_message_is_appeared(String string) {
        homePage.validateLogInPositiveCheck(string);
    }

    /**
     * Log in negative
     */
    @When("I click on logIn button")
    public void i_click_on_log_in_button() {
        homePage.logInBoxClick();
    }

    @Then("I validated {string} message is appeared")
    public void i_validated_message_is_appeared(String string) {
        homePage.validateLogInNegativeCheck(string);
    }


}
