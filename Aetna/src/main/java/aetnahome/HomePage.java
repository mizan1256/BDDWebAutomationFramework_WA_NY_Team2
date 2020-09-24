package aetnahome;

import com.aventstack.extentreports.reporter.configuration.Theme;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[1]/button")
    WebElement shopPlan;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[1]/button")
    WebElement healthCoverage;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[2]/ul/li[2]/a")
    WebElement studentPlans;
    @FindBy(xpath = "//*[@id=\"main\"]/div[6]/div[1]/div/h2")
    WebElement validateHCText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[2]/ul/li[1]/a")
    WebElement plansEmployer;
    @FindBy(xpath = "//h3[contains(text(),'Legal notices')]")
    WebElement plansEmployerText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[2]/ul/li[3]/a")
    WebElement internationalPlans;
    @FindBy(xpath = "//*[@id=\"main\"]/div[6]/div/div/div[1]/div[1]/div/h2")
    WebElement internationalPlansText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[2]/ul/li[4]/a")
    WebElement findDoctor;
    @FindBy(xpath = "//*[@id=\"content__main\"]/div[2]/div/div/div/div/div/div/div[2]/h2")
    WebElement findDoctorText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[1]/button")
    WebElement dentalAndVision;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[2]/ul/li[1]/a")
    WebElement dentalPlans;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[2]/ul/li[2]/a")
    WebElement findADentist;
    @FindBy(xpath = "//*[@id=\"textParagraph_191\"]")
    WebElement dentistText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[2]/ul/li[3]/a")
    WebElement visionPlans;
    @FindBy(xpath = "//*[@id=\"content__main\"]/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div/p[1]/strong")
    WebElement visionPlanText;


    @FindBy(xpath = "//button[@class='lang-selected-option dropdown-toggle']")
    WebElement exploreAetnaSites;
    @FindBy(xpath = "/html/body/div[2]/div/header/div[2]/nav/div[2]/div/div[3]/ul/li[1]/a/span")
    WebElement aetnaCom;
    @FindBy(xpath = "//span[contains(text(),'Aetna Medicare')]")
    WebElement aetnaMedicare;
    @FindBy(xpath = "//a[@class='link__text'][contains(text(),'Request a call')]")
    WebElement requestCall;
    @FindBy(xpath = "//label[contains(text(),'A new plan')]")
    WebElement aNewPlan;

    /**
     * Explore Aetna sites
     */
    public void exploreAetnaSites() {
        exploreAetnaSites.click();
    }
    public void aetnaCom(){
        aetnaCom.click();
    }
    public void aetnaMedicare(){
        aetnaMedicare.click();
    }
    public void requestCall(){
        requestCall.click();
    }
    public void validateANewPlan(){
        String expectedResult = "A new plan";
        String actualResult = aNewPlan.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @FindBy(xpath = "//span[contains(text(),'Find a doctor')]")
    WebElement findADoctor;
    @FindBy(xpath = "//a[contains(text(),'Plan from an employer')]")
    WebElement planFromAnEmployer;
    @FindBy(xpath = "//h2[@id='texth2_190']")
    WebElement searchingAMemberText;
    /**
     * Find a doctor
     */
    public void findADoctor() throws InterruptedException {
        Thread.sleep(3000);
        findADoctor.click();
    }
    public void planFromAnEmployer(){
        planFromAnEmployer.click();
    }
    public void validateFindADoctor(){
        String expectedResult = "Searching as a member is better";
        String actualResult = searchingAMemberText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @FindBy(xpath = "//span[contains(text(),'For Providers')]")
    WebElement forProviders;
    @FindBy(xpath = "//*[@id=\"content__main\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/ul/li[1]/div/a/span")
    WebElement joinTheAetnaNetwork;
    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    WebElement welcome;
    @FindBy(xpath = "//b[contains(text(),'Step 1')]")
    WebElement step1;
    /**
     * For Providers
     */
    public void forProviders() throws InterruptedException {
        Thread.sleep(5000);
        forProviders.click();
        Thread.sleep(5000);
    }
    public void joinTheAetnaNetwork(){
        joinTheAetnaNetwork.click();
    }
    public void welcome(){
        welcome.click();
    }
    public void validateForProviders(){
        String expectedResult = "Step 1";
        String actualResult = step1.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Medical')]")
    WebElement medical;
    @FindBy(xpath = "//span[contains(text(),'Medical Request for Participation')]")
    WebElement medicalRequestForParticipationText;
    /**
     * Medical
     */
    public void medical() throws InterruptedException {
        Thread.sleep(3000);
        medical.click();
    }
    public void validateMedical(){
        String expectedResult = "Medical Request for Participation";
        String actualResult = medicalRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Dental')]")
    WebElement dental;
    @FindBy(xpath = "//span[contains(text(),'Dental Request for Participation')]")
    WebElement dentalRequestForParticipationText;
    /**
     * Dental
     */
    public void dental(){
        dental.click();
    }
    public void validateDental(){
        String expectedResult = "Dental Request for Participation";
        String actualResult = dentalRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Behavioral Health')]")
    WebElement behavioralHealth;
    @FindBy(xpath = "//span[contains(text(),'Behavioral Health Request')]")
    WebElement behavioralHealthRequestForParticipationText;
    /**
     * BehavioralHealth
     */
    public void behavioralHealth(){
         behavioralHealth.click();
    }
    public void validateBehavioralHealth(){
        String expectedResult = "Behavioral Health Request";
        String actualResult = behavioralHealthRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Facility')]")
    WebElement facility;
    @FindBy(xpath = "//span[contains(text(),'Facility Request for Participation')]")
    WebElement facilityRequestForParticipationText;
    /**
     * Facility
     */
    public void facility() throws InterruptedException {
        facility.click();
        Thread.sleep(3000);
    }
    public void validateFacility(){
        String expectedResult = "Facility Request for Participation";
        String actualResult = facilityRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Other')]")
    WebElement others;
    @FindBy(xpath = "//span[contains(text(),'Other networks you can join')]")
    WebElement otherNetworksYouCanJoinText;
    /**
     * Others
     */
    public void others() throws InterruptedException {
        Thread.sleep(3000);
        others.click();
    }
    public void validateOthers(){
        String expectedResult = "      Other networks you can join";
        String actualResult = otherNetworksYouCanJoinText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @FindBy(xpath = "//span[contains(text(),'Precertification')]")
    WebElement precertification;
    @FindBy(xpath = "//h3[@class='heading']")
    WebElement findADoctorOrHospital;
    @FindBy(xpath = "//h1[@class='ng-scope aet-cont-hdrtxt txtAlgnCntrTitle']")
    WebElement directoryText;
    /**
     * Precertification
     */
    public void precertification(){
        precertification.click();
    }
    public void findADoctorOrHospital(){
        findADoctorOrHospital.click();
    }
    public void validatePrecertification(){
        String expectedResult = "Provider Referral Directory";
        String actualResult = directoryText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @FindBy(xpath = "//span[contains(text(),'Medicare information')]")
    WebElement medicareInformation;
    @FindBy(xpath = "//span[contains(text(),'Learn about the dispute process')]")
    WebElement learnAboutTheDisputeProcess;
    @FindBy(xpath = "//span[contains(text(),'Clinical Policy Bulletins')]")
    WebElement clinicalPolicyBulletinsText;

    /**
     * Aetna Disputes & Appeals Overview
     */
    public void necessaryStepsAetnaDispute() throws InterruptedException {
        Thread.sleep(3000);
        medicareInformation.click();
        learnAboutTheDisputeProcess.click();
    }
    public void validateAetnaDisputesAppeals(String actualTitle){
        String expectedTitle = driver.getTitle();
        Assert.assertEquals("Title doesn't match", expectedTitle,actualTitle);
    }

//    And I click on Medicare information
//    And I click on Learn about the dispute process


    public void shopPlanCheck() {
        shopPlan.click();
    }

    public void healthCoverageBtn() {
        healthCoverage.click();
    }

    public void studentPlansBtn() {
        studentPlans.click();
    }

    public void validateHealthCoverage(String actualResult) {
        String expectedResult = validateHCText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // Plans though an Employer
    public void plansThroughEmployer() {
        plansEmployer.click();
    }

    public void validatePlansThroughEmployer(String actualResult) {
        String expectedResult = plansEmployerText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // International Plan
    public void internationalPlansCheck() {
        internationalPlans.click();
    }

    public void validateInternationalPlans(String actualResult) {
        String expectedResult = internationalPlansText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // Find a doctor
    public void findADoctorCheck() {
        findDoctor.click();
    }

    public void validateFindADoctorCheck(String actualResult) {
        String expectedResult = findDoctorText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
    // Dental Plan
    public void dentalAndVisionCheck() {
        dentalAndVision.click();
    }

    public void dentalPlanCheck() {
        dentalPlans.click();
    }

    // Find a Dentist
    public void findADentistCheck() {
        findADentist.click();
    }

    public void validateFindADentistCheck(String actualResult) {
        String expectedResult = dentistText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // Vision Plans
    public void visionPlansCheck() {
        visionPlans.click();
    }

    public void validateVisionPlansCheck(String actualResult) {
        String expectedResult = visionPlanText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
