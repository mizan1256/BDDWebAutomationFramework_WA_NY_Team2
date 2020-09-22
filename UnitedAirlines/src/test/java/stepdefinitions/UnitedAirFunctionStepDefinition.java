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
import unitedAirfunction.UnitedAirFunctionPage;

import java.util.List;

public class UnitedAirFunctionStepDefinition extends WebAPI {

    static UnitedAirFunctionPage unitedAirFunctionPage;

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
        unitedAirFunctionPage = PageFactory.initElements(driver, UnitedAirFunctionPage.class);
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


}
