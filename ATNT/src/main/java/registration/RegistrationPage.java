package registration;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static registration.RegistrationPageWebElement.*;

public class RegistrationPage extends WebAPI {

    @FindBy(how = How.XPATH, using = accountArrowButton)
    public WebElement arrowButton;
    @FindBy(how = How.XPATH, using = accountSignInButton)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = accountUserIdBox)
    public WebElement userIdBox;
    @FindBy(how = How.XPATH, using = accountPasswordBox)
    public WebElement passwordBox;
    @FindBy(how = How.XPATH, using = accountSignInBox)
    public WebElement signInBox;
    @FindBy(how = How.ID, using = accountSignInText)
    public WebElement signInText;


    By password = By.id("//input[@id='password']");

    public void accountArrowButtonClick() {
        arrowButton.click();
    }

    public void accountSignInButton() {
        signInButton.click();
    }

    public void userIdBox() {
        userIdBox.sendKeys("pnt123@gmail.com");
    }

    public void passwordBox() {
        passwordBox.sendKeys("pnt123");
    }

    public void signInButtonClick() {
        signInBox.click();
    }

    public void validateLoginAccount(String actualResult) {
        String expectedResult = signInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    public void ValidateLoginGetTitle() {
        String actualResult = "Login Screen";
        String expectedResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"profile-unauth\"]/div[2]/div/ul/li[7]/a/span")
    WebElement payWithoutSignIn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/input")
    WebElement phoneNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[5]/div/div[2]/input")
    WebElement zipCode;
    @FindBy(how = How.XPATH, using = "//*[@id=\"recaptcha-anchor\"]/div[4]")
    WebElement capcha;
    @FindBy(how = How.XPATH, using = "//*[@id=\"profile-unauth\"]/div[2]/div/ul/li[2]/a/span")
    WebElement accountOverview;
    @FindBy(how = How.XPATH, using = "createNow")
    WebElement createAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wirless\"]")
    WebElement wirelessBtn;

    public void payWithoutSignInBtn() {
        payWithoutSignIn.click();
    }

    public void phoneNumberBox() {
        phoneNumber.sendKeys("7180000000");
    }

    public void zipCodeBox() {
        zipCode.sendKeys("10000");
    }

    public void capChaClick() throws InterruptedException {
        capcha.click();
        Thread.sleep(3000);
    }

    // Account Overview
    public void accountOverviewBtn() {
        accountOverview.click();
    }
}
