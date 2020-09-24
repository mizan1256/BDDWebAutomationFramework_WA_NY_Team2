package stepdefinitions;

import aetnahome.HomePage;
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

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

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
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Given("I am in Aetna home page")
    public void i_am_in_Aetna_home_page() throws IOException {
        openBrowser("https://www.aetna.com/");
    }

    @When("I click shop for a plan")
    public void i_click_shop_for_a_plan() throws InterruptedException {
        homePage.shopPlanCheck();
    }

    @And("I go Health coverage")
    public void i_go_health_coverage() throws InterruptedException {
        homePage.healthCoverageBtn();
    }

    @And("I click Student plans")
    public void i_click_student_plans() {
        homePage.studentPlansBtn();
    }

    @Then("I validate {string} is appeared properly")
    public void i_validate_is_appeared_properly(String string) {
        homePage.validateHealthCoverage("Helpful links");
    }

    // Plans through an Employer
    @And("I click Plans through an employer")
    public void i_click_plans_through_an_employer() {
        homePage.plansThroughEmployer();
    }

    @Then("I validate Legal notices is appeared properly")
    public void i_validate_legal_notices_is_appeared_properly() {
        homePage.validatePlansThroughEmployer("Legal notices");
    }

    // International Plans
    @And("I click International Plans")
    public void i_click_international_plans() {
        homePage.internationalPlansCheck();
    }

    @Then("I validate Aetna Well-being is appeared properly")
    public void i_validate_aetna_well_being_is_appeared_properly() {
        homePage.validateInternationalPlans("Aetna Well-being");

    }

    // Find a doctor
    @And("I click find a doctor")
    public void i_click_find_a_doctor() {
        homePage.findADoctorCheck();
    }

    @Then("I validate COVID-{int} Alert is appeared properly")
    public void i_validate_covid_alert_is_appeared_properly(String actualResult) {
        homePage.validateFindADoctorCheck("");
    }

    // Dental plan
    @When("I click on dental, vision and supplemental")
    public void i_click_on_dental_vision_and_supplemental() throws InterruptedException {
        homePage.dentalAndVisionCheck();
    }

    @When("I click dental plans")
    public void i_click_dental_plans() {
        homePage.dentalPlanCheck();
    }

    // Find a Dentist
    @When("I click find a dentist")
    public void i_click_find_a_dentist() {
        homePage.findADentistCheck();
    }

    @Then("I validate You Can: is appeared properly")
    public void i_validate_you_can_is_appeared_properly() {
        homePage.validateFindADentistCheck("You Can:");
    }
    // Vision Plans
    @When("I click vision plans")
    public void i_click_vision_plans() {
        homePage.visionPlansCheck();
    }

    @Then("I validate Aetna Dental Direct plan is appeared properly")
    public void i_validate_aetna_dental_direct_plan_is_appeared_properly() {
        homePage.validateVisionPlansCheck("Aetna Dental Direct plan");
    }
}