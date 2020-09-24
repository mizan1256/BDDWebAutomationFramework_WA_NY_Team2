package stepdefinitions;

import aetnahome.HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
// Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp(); }
    @BeforeStep
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }
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
    public void i_validate_covid_alert_is_appeared_properly() {
        homePage.validateFindADoctorCheck("");
    }

    // Dental plan
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

    /**
     * Aetna Request call Functionality Checking
     */

    @When("I click on Explore Aetna sites")
    public void i_click_on_explore_aetna_sites() {
       homePage.exploreAetnaSites();
    }

    @When("I click on Aetna.com")
    public void i_click_on_aetna_com() {
        homePage.aetnaCom();
    }

    @When("I click on Aetna Medicare")
    public void i_click_on_aetna_medicare() {
        homePage.aetnaMedicare();
    }

    @When("I click on Request call")
    public void i_click_on_request_call() {
        homePage.requestCall();
    }
    @Then("I validate A new plan is appeared properly")
    public void i_validate_a_new_plan_is_appeared_properly() {
        homePage.validateANewPlan();
    }

    /**
     * Aetna Plan from an employer Functionality Checking
     */
    @When("I click on Find a doctor")
    public void i_click_on_find_a_doctor() throws InterruptedException {
        homePage.findADoctor();
    }

    @When("I click on Plan from an employer")
    public void i_click_on_plan_from_an_employer() {
        homePage.planFromAnEmployer();
    }

    @Then("I validate Searching as a member is better is appeared properly")
    public void i_validate_searching_as_a_member_is_better_is_appeared_properly() {
        homePage.validateFindADoctor();
    }

    /**
     * Aetna Welcome Functionality Checking
     */
    @When("I click on For Providers")
    public void i_click_on_for_providers() throws InterruptedException {
        homePage.forProviders();
    }
    @When("I click on Join the Aetna network")
    public void i_click_on_join_the_aetna_network(){
        homePage.joinTheAetnaNetwork();
    }
    @When("I click on Welcome")
    public void i_click_on_welcome() {
        homePage.welcome();
    }
    @Then("I validate Step1 is appeared properly")
    public void i_validate_step_is_appeared_properly() {
        homePage.validateForProviders();
    }
    /**
     * Aetna Medical Functionality Checking
     */

    @When("I click on Medical")
    public void i_click_on_medical() throws InterruptedException {
        homePage.medical();
    }
    @Then("I validate Medical Request for Participation is appeared properly")
    public void i_validate_medical_request_for_participation_is_appeared_properly() {
        homePage.validateMedical();
    }

    /**
     * Aetna Dental Functionality Checking
     */
    @When("I click on Dental")
    public void i_click_on_dental() {
        homePage.dental();
    }
    @Then("I validate Dental Request for Participation is appeared properly")
    public void i_validate_dental_request_for_participation_is_appeared_properly() {
        homePage.validateDental();
    }
    /**
     * Aetna Behavioral Health Functionality Checking
     */
    @When("I click on Behavioral Health")
    public void i_click_on_behavioral_health() {
        homePage.behavioralHealth();
    }
    @Then("I validate Behavioral Health Request for Participation is appeared properly")
    public void i_validate_behavioral_health_request_for_participation_is_appeared_properly() {
        homePage.validateBehavioralHealth();
    }
    /**
     * Aetna Facility Request for Participation Functionality Checking
     */
    @When("I click on Facility")
    public void i_click_on_facility() throws InterruptedException {
        homePage.facility();
    }
    @Then("I validate Facility Request for Participation is appeared properly")
    public void i_validate_facility_request_for_participation_is_appeared_properly() {
        homePage.validateFacility();
    }
    /**
     * Aetna Others Functionality Checking
     */
    @When("I click on Others")
    public void i_click_on_others() throws InterruptedException {
        homePage.others();
    }
    @Then("I validate Other networks you can join is appeared properly")
    public void i_validate_other_networks_you_can_join_is_appeared_properly() {
        homePage.validateOthers();
    }
    /**
     * Aetna Find a doctor or hospital Functionality Checking
     */
    @When("I click on Precertification")
    public void i_click_on_precertification() {
        homePage.precertification();
    }
    @When("I click on Find a doctor or hospital")
    public void i_click_on_find_a_doctor_or_hospital() {
        homePage.findADoctorOrHospital();
    }
    @Then("I validate Directory is appeared properly")
    public void i_validate_directory_is_appeared_properly() {
        homePage.validatePrecertification();
    }
    /**
     * Aetna Disputes & Appeals Overview
     */

    @Then("I took necessary steps to land on Aetna Disputes & Appeals Overview")
    public void i_took_necessary_steps_to_land_on_aetna_disputes_appeals_overview() throws InterruptedException {
        homePage.necessaryStepsAetnaDispute();
    }
    @Then("I validate Clinical Policy Bulletins is appeared properly")
    public void i_validate_clinical_policy_bulletins_is_appeared_properly() {
        homePage.validateAetnaDisputesAppeals("Medicare Information for Health Care Providers | Aetna");

    }
    //

}