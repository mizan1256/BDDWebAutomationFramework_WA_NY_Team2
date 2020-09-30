package stepdefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairregistration.UnitedAirRegistrationPage;

import java.util.List;

public class UnitedAirStepDefinition extends WebAPI {
    static UnitedAirRegistrationPage unitedAirFunctionPage;

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
        unitedAirFunctionPage = PageFactory.initElements(driver, UnitedAirRegistrationPage.class);
    }

    @When("I click on signIn button")
    public void i_click_on_sign_in_button() throws InterruptedException {
        unitedAirFunctionPage.signInButton();
    }

    @When("I click on join now and use title")
    public void i_click_on_join_now_and_use_title() throws InterruptedException {
        unitedAirFunctionPage.joinNowButton();
    }

    @When("I use data in member information field")
    public void i_use_data_in_member_information_field(DataTable data) throws InterruptedException {
        List<List<String>> sign = data.asLists(String.class);
        unitedAirFunctionPage.typeFirstName(sign.get(1).get(0));
        unitedAirFunctionPage.typeMiddleName(sign.get(1).get(1));
        unitedAirFunctionPage.typeLastName(sign.get(1).get(2));
        unitedAirFunctionPage.typeDate(sign.get(1).get(3));
        unitedAirFunctionPage.typeYear(sign.get(1).get(4));
    }
    @When("month and gender field is selected")
    public void month_and_gender_field_is_selected() throws InterruptedException {
        unitedAirFunctionPage.monthAndGender();
    }


    @Then("I validate Contact Information is appeared properly")
    public void i_validate_contact_information_is_appeared_properly() {
        unitedAirFunctionPage.setValidateSignUp();
    }
    /**
     * Contact information test
     */
    @When("I entered data in Contact Information field")
    public void i_entered_data_in_contact_information_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirFunctionPage.typeStreetName(sign.get(1).get(0));
        unitedAirFunctionPage.typeCityName(sign.get(1).get(1));
        unitedAirFunctionPage.typeStateName(sign.get(1).get(2));
        unitedAirFunctionPage.typeZipCode(sign.get(1).get(3));
    }

    @Then("I validate {string} appear properly")
    public void i_validate_appear_properly(String phone) {
        unitedAirFunctionPage.ValidateContactInformation(phone);
    }
    /**
     * Phone number field check
     */
    @When("I entered data in phone number field")
    public void i_entered_data_in_phone_number_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirFunctionPage.typePhoneNumber(sign.get(1).get(0));
        unitedAirFunctionPage.typeExtensionPhone(sign.get(1).get(1));
        unitedAirFunctionPage.typeBusinessPhone(sign.get(1).get(2));
        unitedAirFunctionPage.typeExtensionBusinessPhn(sign.get(1).get(3));
        unitedAirFunctionPage.typeAirportName(sign.get(1).get(4));
    }
    @And("I click on check box field")
    public void i_click_on_check_box_field() {
        unitedAirFunctionPage.checkBoxClick();
    }
    @Then("I verify {string} appear properly")
    public void i_verify_appear_properly(String email) {
        unitedAirFunctionPage.ValidatePhoneNumber(email);
    }
    /**
     * Email field test
     */
    @When("I entered data in email field")
    public void i_entered_data_in_email_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirFunctionPage.typeEmailAddressField(sign.get(1).get(0));
        unitedAirFunctionPage.typeVerifyEmailId(sign.get(1).get(1));
    }
    @When("I click on check box and uncheck box")
    public void i_click_on_check_box_and_uncheck_box() throws InterruptedException {
        unitedAirFunctionPage.checkAndUnCheckBox();
    }
    @When("I entered data in password field")
    public void i_entered_data_in_password_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirFunctionPage.typePasswordField(sign.get(1).get(0));
        unitedAirFunctionPage.typeReEnterPassword(sign.get(1).get(1));
    }
    @When("I click on Show button")
    public void i_click_on_show_button() throws InterruptedException {
        unitedAirFunctionPage.showButton();
    }
    @Then("I verify {string} display properly")
    public void i_verify_display_properly(String text) {
        unitedAirFunctionPage.ValidateEmailField(text);
    }
    /**
     * Security questions check
     */
    @When("I entered data in answer field")
    public void i_entered_data_in_answer_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirFunctionPage.questionAndAnswer1(sign.get(1).get(0));
        unitedAirFunctionPage.questionAndAnswer2(sign.get(2).get(0));
        unitedAirFunctionPage.questionAndAnswer3(sign.get(3).get(0));
        unitedAirFunctionPage.questionAndAnswer4(sign.get(4).get(0));
        unitedAirFunctionPage.questionAndAnswer5(sign.get(5).get(0));
    }
    @When("I click on accept and enroll button")
    public void i_click_on_accept_and_enroll_button() {
        unitedAirFunctionPage.acceptAndEnrollBtn();
    }



}



