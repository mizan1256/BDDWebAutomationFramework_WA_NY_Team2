package unitedAirfunction;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitedAirFunctionPage extends WebAPI {

    @FindBy(xpath = "//*[@id=\"loginButton\"]/span") WebElement signUpBtn;
    @FindBy(xpath = "//a[contains(text(),'Join now')]") WebElement joinNowBtn;
    @FindBy(xpath = "//select[@id='Title']") WebElement titleArrow;
    @FindBy(xpath = "//input[@id='FirstName']") WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='MiddleName']") WebElement middleNameBox;
    @FindBy(xpath = "//input[@id='LastName']") WebElement lastNameBox;
    @FindBy(xpath = "//*[@id=\"DOB_BirthMonth\"]") WebElement monthBox;
    @FindBy(xpath = "//*[@id=\"DOB_BirthDay\"]") WebElement dateBox;
    @FindBy(xpath = "//*[@id=\"DOB_BirthYear\"]") WebElement yearBox;
    @FindBy(xpath = "//*[@id=\"Gender2\"]") WebElement selectGenderBox;
    @FindBy(xpath = "//*[@id=\"divEnroll\"]/h2[2]") WebElement validateSignUpText;


    /**
     * SignIn button functionality test
     */
    public void signInButton() throws InterruptedException {
        signUpBtn.click();
        sleepFor(3);
    }
    public void joinNowButton() throws InterruptedException {
        joinNowBtn.click();
        selectOptionByVisibleText(titleArrow,"Mr.");
        sleepFor(5);
    }
    public void typeFirstName(String firstName) {
        firstNameBox.sendKeys(firstName);
    }
    public void typeMiddleName(String middleName) {
        middleNameBox.sendKeys(middleName);
    }
    public void typeLastName(String lastName) {
        lastNameBox.sendKeys(lastName);
    }
    public void typeDate(String date) throws InterruptedException {
        dateBox.sendKeys(date);
        sleepFor(4);
    }
    public void typeYear(String year) throws InterruptedException {
        yearBox.sendKeys(year);
        sleepFor(5);
    }
    public void monthAndGender() throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(monthBox,"01 - January");
        sleepFor(5);
        selectOptionByVisibleText(selectGenderBox,"Male (M)");
        sleepFor(4);
    }

    public void setValidateSignUp(){
        String expectedResult="Contact information";
        String actualResult=validateSignUpText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

}
