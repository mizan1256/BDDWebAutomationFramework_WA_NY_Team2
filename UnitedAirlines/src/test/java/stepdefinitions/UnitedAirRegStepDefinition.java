package stepdefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairregistration.UnitedAirRegistration;

import java.util.List;

public class UnitedAirRegStepDefinition extends WebAPI {
    static UnitedAirRegistration unitedAirRegistration;

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
        unitedAirRegistration = PageFactory.initElements(driver, UnitedAirRegistration.class);
    }

    @When("I click on signIn button")
    public void i_click_on_sign_in_button() throws InterruptedException {
        unitedAirRegistration.signInButton();
    }

    @When("I click on join now and use title")
    public void i_click_on_join_now_and_use_title() throws InterruptedException {
        unitedAirRegistration.joinNowButton();
    }

    @When("I use data in member information field")
    public void i_use_data_in_member_information_field(DataTable data) throws InterruptedException {
        List<List<String>> sign = data.asLists(String.class);
        unitedAirRegistration.typeFirstName(sign.get(1).get(0));
        unitedAirRegistration.typeMiddleName(sign.get(1).get(1));
        unitedAirRegistration.typeLastName(sign.get(1).get(2));
        unitedAirRegistration.typeDate(sign.get(1).get(3));
        unitedAirRegistration.typeYear(sign.get(1).get(4));
    }
    @When("month and gender field is selected")
    public void month_and_gender_field_is_selected() throws InterruptedException {
        unitedAirRegistration.monthAndGender();
    }


    @Then("I validate Contact Information is appeared properly")
    public void i_validate_contact_information_is_appeared_properly() {
        unitedAirRegistration.setValidateSignUp();
    }
    /**
     * Contact information test
     */
    @When("I entered data in Contact Information field")
    public void i_entered_data_in_contact_information_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirRegistration.typeStreetName(sign.get(1).get(0));
        unitedAirRegistration.typeCityName(sign.get(1).get(1));
        unitedAirRegistration.typeStateName(sign.get(1).get(2));
        unitedAirRegistration.typeZipCode(sign.get(1).get(3));
    }

    @Then("I validate {string} appear properly")
    public void i_validate_appear_properly(String phone) {
        unitedAirRegistration.ValidateContactInformation(phone);
    }
    /**
     * Phone number field check
     */
    @When("I entered data in phone number field")
    public void i_entered_data_in_phone_number_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirRegistration.typePhoneNumber(sign.get(1).get(0));
        unitedAirRegistration.typeExtensionPhone(sign.get(1).get(1));
        unitedAirRegistration.typeBusinessPhone(sign.get(1).get(2));
        unitedAirRegistration.typeExtensionBusinessPhn(sign.get(1).get(3));
        unitedAirRegistration.typeAirportName(sign.get(1).get(4));
    }
    @And("I click on check box field")
    public void i_click_on_check_box_field() {
        unitedAirRegistration.checkBoxClick();
    }
    @Then("I verify {string} appear properly")
    public void i_verify_appear_properly(String email) {
        unitedAirRegistration.ValidatePhoneNumber(email);
    }
    /**
     * Email field test
     */
    @When("I entered data in email field")
    public void i_entered_data_in_email_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirRegistration.typeEmailAddressField(sign.get(1).get(0));
        unitedAirRegistration.typeVerifyEmailId(sign.get(1).get(1));
    }
    @When("I click on check box and uncheck box")
    public void i_click_on_check_box_and_uncheck_box() throws InterruptedException {
        unitedAirRegistration.checkAndUnCheckBox();
    }
    @When("I entered data in password field")
    public void i_entered_data_in_password_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirRegistration.typePasswordField(sign.get(1).get(0));
        unitedAirRegistration.typeReEnterPassword(sign.get(1).get(1));
    }
    @When("I click on Show button")
    public void i_click_on_show_button() throws InterruptedException {
        unitedAirRegistration.showButton();
    }
    @Then("I verify {string} display properly")
    public void i_verify_display_properly(String text) {
        unitedAirRegistration.ValidateEmailField(text);
    }
    /**
     * Security questions check
     */
    @When("I entered data in answer field")
    public void i_entered_data_in_answer_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        unitedAirRegistration.questionAndAnswer1(sign.get(1).get(0));
        unitedAirRegistration.questionAndAnswer2(sign.get(2).get(0));
        unitedAirRegistration.questionAndAnswer3(sign.get(3).get(0));
        unitedAirRegistration.questionAndAnswer4(sign.get(4).get(0));
        unitedAirRegistration.questionAndAnswer5(sign.get(5).get(0));
    }
    @When("I click on accept and enroll button")
    public void i_click_on_accept_and_enroll_button() {
        unitedAirRegistration.acceptAndEnrollBtn();
    }

}
