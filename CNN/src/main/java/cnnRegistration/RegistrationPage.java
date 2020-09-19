package cnnRegistration;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static cnnRegistration.RegistrationWebElement.*;
import static cnnhome.CnnHomePageWebElement.*;

public class RegistrationPage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementLogInIcon)
    public WebElement cnnLogInIcon;
    @FindBy(how = How.XPATH, using = webElementSignUp)
    public WebElement cnnSignUpButton;
    @FindBy(how = How.XPATH, using = webElementSignUpEmail)
    public WebElement cnnSignUpEmail;
    @FindBy(how = How.XPATH, using = webElementSignUpPassword)
    public WebElement cnnSignUpPassword;
    @FindBy(how = How.XPATH, using = webElementSignUpZipcode)
    public WebElement cnnSignUpZipCode;
    @FindBy(how = How.XPATH, using = webElementRegistButton)
    public WebElement cnnRegistrationButton;
    @FindBy(how = How.XPATH, using = webElementLogInEmail)
    public WebElement cnnLogInEmail;
    @FindBy(how = How.XPATH, using = webElementLogInPassword)
    public WebElement cnnLogInPassword;
    @FindBy(how = How.XPATH, using = webElementLogInButton)
    public WebElement cnnLogInButton;
    @FindBy(how = How.XPATH, using = webElementSignUpZipcode)
    public WebElement cnnZipCodeBox;
    @FindBy(how = How.XPATH, using = getWebElementZipCodeButton)
    public WebElement cnnZipCodeButton;
    @FindBy(how = How.XPATH, using = registrationMsgWebElement)
    public WebElement registrationMsg;


    public void cnnZipCodeBox() {

        cnnZipCodeBox.sendKeys("11432");
        cnnZipCodeButton.submit();
    }

    /**
     * author Mizan
     *
     * @ CNN Fanctional test
     */

    public void landOnSingUpPage() throws InterruptedException {
        sleepFor(6);
        cnnLogInIcon.click();
        Thread.sleep(3000);
        cnnSignUpButton.click();
    }

    public void enterUserEmail(String emailAddress) {
        cnnSignUpEmail.sendKeys(emailAddress);
    }

    public void enterUserPassword(String password) {
        cnnSignUpPassword.sendKeys(password);
    }

    public void enterUserZipcode(String zipcode) {
        cnnSignUpZipCode.sendKeys(zipcode);
    }

    public void clickOnRegistrationBtn() throws InterruptedException {
        cnnRegistrationButton.click();
        sleepFor(5);
    }

    public void validateRegistrationMessage(String actualText) {
    String expectedText=registrationMsg.getText();
        Assert.assertEquals("Text do not match", expectedText,actualText);
    }

    public void cnnAccountLogIn() throws InterruptedException {
        cnnLogInIcon.click();
        Thread.sleep(3000);
        cnnLogInEmail.sendKeys("pnt30242@gmail.com");
        cnnLogInPassword.sendKeys("Pnt@30242");
        cnnLogInButton.click();
    }

    public void validateCnnAccountLogIn() {
        Assert.assertEquals("CNN - Breaking News, Latest News and Videos", driver.getTitle());
    }
    /**
     * Cnn logIn functionality check
     */
public void clickOnSingInBtn() throws InterruptedException {
    sleepFor(6);
    cnnLogInIcon.click();
}
public void enterLogInInfo(String userEmail, String userPassword) throws InterruptedException {
    Thread.sleep(3000);
    cnnLogInEmail.sendKeys(userEmail);
    cnnLogInPassword.sendKeys(userPassword);
    cnnLogInButton.click();
}
public void validateSingInPageTitle(){
    String expectedTitle="CNN - Breaking News, Latest News and Videos";
    String actualTitle=driver.getTitle();
    Assert.assertEquals("Title does not match", expectedTitle,actualTitle);

}
}
