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
import io.cucumber.java.en_scouse.An;
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
    public static void getInIt() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    //    ShopPlan - HealthCoverage
    @Given("i am in home page")
    public void i_am_in_home_page() throws IOException {
        openBrowser("https://www.aetna.com/");
    }

    @When("I click shop for a plan")
    public void i_click_shop_for_a_plan() {
        homePage.shopPlanCheck();
    }

    @And("I go Health coverage")
    public void i_go_health_coverage() {
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

    //    Plans through an Employer
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

    //   Find a doctor
    @And("I click find a doctor")
    public void i_click_find_a_doctor() {
        homePage.findADoctorCheck();
    }

    @Then("I validate COVID-{int} Alert is appeared properly")
    public void i_validate_covid_alert_is_appeared_properly() {
        homePage.validateFindADoctorCheck("");
    }

    //  Dental plan
    @When("I go dental, vision and supplemental")
    public void i_go_dental_vision_and_supplemental() {
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

    // Find an Eye Doctor
    @When("I click find an eye doctor")
    public void i_click_find_an_eye_doctor() {
        homePage.findAnEyeDoctorCheck();
    }

    //  Supplemental Plans
    @When("I click supplemental plans")
    public void i_click_supplemental_plans() {
        homePage.supplementalPlansCheck();
    }

    @Then("I validate Accident plans is appeared properly")
    public void i_validate_accident_plans_is_appeared_properly() {
        homePage.validateSupplementalPlansCheck("Accident plans");
    }

    // Pharmacy -  Get pharmacy plan
    @When("I go pharmacy element")
    public void i_go_pharmacy_element() {
        homePage.pharmacyBtnCheck();
    }

    @And("I click Get pharmacy plan information")
    public void i_click_get_pharmacy_plan_information() {
        homePage.getPharmacyPlans();
    }

    @Then("I validate Aetna Medicare is appeared properly")
    public void i_validate_aetna_medicare_is_appeared_properly() {
        homePage.validateGetPharmacyPlans("Aetna Medicare:");
    }

    //  Find A Pharmacy
    @And("I click find a pharmacy")
    public void i_click_find_a_pharmacy() {
        homePage.findAPharmacyCheck();
    }

    @Then("I validate *Required Selections is appeared properly")
    public void i_validate_required_selections_is_appeared_properly() {
        homePage.validateFindAPharmacyCheck("*Required Selections");
    }

    //  Find Medicine and Costs
    @When("I click find medicine and costs")
    public void i_click_find_medicine_and_costs() {
        homePage.findAMedicineAndCostsCheck();
    }

    @Then("I validate Already a member? is appeared properly")
    public void i_validate_already_a_member_is_appeared_properly() {
        homePage.validateFindAMedicineAndCostsCheck("Already a member?");
    }


}
