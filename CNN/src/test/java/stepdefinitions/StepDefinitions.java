package stepdefinitions;

import cnnhome.CnnHomePage;
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

import java.io.IOException;
import java.util.List;

public class StepDefinitions extends WebAPI {

    static CnnHomePage cnnHomePage;


    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
// Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @BeforeStep
    public void getInIt(){
        cnnHomePage = PageFactory.initElements(driver,CnnHomePage.class);
    }


    @Given("Im in Cnn HomePage")

    public void i_am_in_cnn_home_page() throws IOException {
        openBrowser("https://www.cnn.com/");
    }

    @And("I click on AccountIcon")
    public void i_click_on_account_icon() {
        cnnHomePage.cnnAccountIcon();
    }
    @Then("I enter email and Password")
    public void i_enter_email_and_password() {
        cnnHomePage.enterEmail();
        cnnHomePage.enterPassword();
    }
    @And("I click on SignIn button")
    public void i_click_on_sign_in_button() {
        cnnHomePage.clickSignIn();
    }



    @Given("I click on US button")
    public void i_click_on_us_button() {
        cnnHomePage.cnnUsClick();
    }

    @Then("I verify the page title")
    public void i_verify_the_page_title() {
        cnnHomePage.ValidateCnnUsText("US");
    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String SearchItem) throws InterruptedException {
        cnnHomePage.cnnSearchBoxCheck(SearchItem);
    }

    @Then("I validate Sports page appear properly")
    public void i_validate_sports_page_appear_properly() {
        cnnHomePage.validateCNNSearchBoxTypeAble();
    }

//      Cnn search box check using data table
    @When("I validate page title as {string}")
    public void i_validate_page_title_as(String validatePageTitle) {
        cnnHomePage.validateDataTablePageTitle(validatePageTitle);
    }

//      Cnn edition button check
    @When("I click on edition button")
    public void i_click_on_edition_button() throws InterruptedException {
        cnnHomePage.clickOnEditionBtn();
    }

    @When("I click on Us International Arabic and Espanol button")
    public void i_click_on_us_international_arabic_and_espanol_button() throws InterruptedException {
        cnnHomePage.selectFromEditionDropDown();
    }

    @Then("I validate page title")
    public void i_validate_page_title() {
        cnnHomePage.validateEditionBtn();
    }

//       Burger button test
    @When("I click on burger button")
    public void i_click_on_burger_button() {
        cnnHomePage.burgerButtonCheck();
    }

    @And("I enter sports in search box")
    public void i_enter_sports_in_search_box() {
        cnnHomePage.typeInSearchBox();
    }

    @And("I click on search button")
    public void i_click_on_search_button() {
        cnnHomePage.searchArrowButton();
    }

    @And("I click on politics radio button")
    public void i_click_on_politics_radio_button() throws InterruptedException {
        cnnHomePage.politicsRadioButton();
    }

    @Then("I validate politics page is appeared properly")
    public void i_validate_politics_page_is_appeared_properly() {
        cnnHomePage.validateSearchText();
    }


//       Travel Tab test
    @When("I click on travel tab")
    public void i_click_on_travel_tab() throws InterruptedException {
        cnnHomePage.travelTabCheck();
    }

    @And("I click on best beach")
    public void i_click_on_best_beach() throws InterruptedException {
        cnnHomePage.bestBeachTab();
    }

    @And("I click on Map tab")
    public void i_click_on_map_tab() {
        cnnHomePage.mapTab();
    }

    @And("I click on radio button")
    public void i_click_on_radio_button() {
        cnnHomePage.clickMapRadioButton();
    }

    @And("I validate View All is visible")
    public void i_validate_view_all_is_visible() {
        cnnHomePage.validateTravelTabCheck();
    }


//      Edition dropdown button
    @When("I click on edition dropDown button")
    public void i_click_on_edition_drop_down_button() {
        cnnHomePage.dropDownEditionButton();
    }

    @When("I click on international")
    public void i_click_on_international() {
        cnnHomePage.internationalButton();
    }

    @When("I click on all stories")
    public void i_click_on_all_stories() {
        cnnHomePage.covid19AllStories();
    }

    @When("I click on Covid-{int} symptoms")
    public void i_click_on_covid_symptoms(Integer int1) {
        cnnHomePage.covidSymptoms();
    }

    @Then("I validate By Sandee LaMotte, CNN is visible")
    public void i_validate_by_sandee_la_motte_cnn_is_visible() {
        cnnHomePage.validateDropDownEditionButton();
    }


//      Live Tv check
    @When("I click on live Tv button")
    public void i_click_on_live_tv_button() throws InterruptedException {
        cnnHomePage.liveTvButton();
    }

    @When("I click on Tv Play Button")
    public void i_click_on_tv_play_button() throws InterruptedException {
        cnnHomePage.liveTvPlayButton();
    }

    @When("I click on back to cnn.com")
    public void i_click_on_back_to_cnn_com() throws InterruptedException {
        cnnHomePage.liveTvBackHome();
    }

    @Then("I validate Covid-{int} is visible")
    public void i_validate_covid_is_visible(Integer int1) throws InterruptedException {
        cnnHomePage.validateLiveTvButtonCheck();
    }


//      Tv channel Box
    @When("I click on Tv channel box")
    public void i_click_on_tv_channel_box() throws InterruptedException {
        cnnHomePage.tvChannelBoxCheck();
    }

    @When("I click on cnn channel")
    public void i_click_on_cnn_channel() throws InterruptedException {
        cnnHomePage.clickTvChannelBox();
    }

    @Then("I validate Login is visible")
    public void i_validate_login_is_visible() throws InterruptedException {
        cnnHomePage.validateTvChannelBoxCheck();
    }

//      Tv channel Box Close
    @When("I click close button")
    public void i_click_close_button() throws InterruptedException {
        cnnHomePage.channelCloseOption();
    }

    @Then("I validate News Shows is visible")
    public void i_validate_news_shows_is_visible() throws InterruptedException {
        cnnHomePage.validateChannelCloseOption();
    }


//      Tv Channel linda voice check
    @When("I click linda voice button")
    public void i_click_linda_voice_button() throws InterruptedException {
        cnnHomePage.lindaVoiceCheck();
    }

    @When("I click linda voice play button")
    public void i_click_linda_voice_play_button() throws InterruptedException {
        cnnHomePage.lindaVideoPlay();
    }

    @Then("I validate US is visible")
    public void i_validate_us_is_visible() throws InterruptedException {
        cnnHomePage.validateLindaVoiceCheck();
    }


    @When("I do all necessary steps to land on Registration page")
    public void i_do_all_necessary_steps_to_land_on_registration_page() throws InterruptedException {
        cnnHomePage.landOnSingUpPage();
    }

    @When("I enter user info")
    public void i_enter_user_info(io.cucumber.datatable.DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        cnnHomePage.enterUserEmail(data.get(1).get(0));
        cnnHomePage.enterUserPassword(data.get(1).get(1));
        cnnHomePage.enterUserZipcode(data.get(1).get(2));
    }

    @When("I click on registration button")
    public void i_click_on_registration_button() throws InterruptedException {
        cnnHomePage.clickOnRegistrationBtn();
    }

    @Then("I validate welcome message")
    public void i_validate_welcome_message() {
        cnnHomePage.validateRegistrationMessage("This account already exists. Please log in.");
    }

//      Cnn logIn functionality check
    @When("I click on SingInIcon")
    public void i_click_on_sing_in_icon() throws InterruptedException {
        cnnHomePage.clickOnSingInBtn();
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String userEmail, String password) throws InterruptedException {
        cnnHomePage.enterLogInInfo(userEmail,password);
    }

    @Then("I validate landed page title")
    public void i_validate_landed_page_title() {
        cnnHomePage.validateSingInPageTitle();
    }

}
