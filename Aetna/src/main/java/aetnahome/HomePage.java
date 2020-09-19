package aetnahome;

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
