package cnnregistration;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static cnnhome.CnnHomeWebElements.*;


public class CnnRegistration extends WebAPI {
    @FindBy(how = How.XPATH, using = userAccountButton) public WebElement userAccount;
    @FindBy(how = How.XPATH, using = userSignUp) public WebElement signUp;
    @FindBy(how = How.XPATH, using = userEmailAddress) public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = userPassword) public WebElement password;
    @FindBy(how = How.XPATH, using = userZipCode) public WebElement zipCode;
    @FindBy(how = How.XPATH, using = userRegisterButton) public WebElement register;
    @FindBy(how = How.XPATH, using = validateUserAccountText) public WebElement accountText;

    @FindBy(how = How.XPATH, using = validateNegativeText) public WebElement negativeText;

    @FindBy(how = How.XPATH, using = logInBoxField) public WebElement logInBtn;
    @FindBy(how = How.XPATH, using = logInEmailField) public WebElement logInEmail;
    @FindBy(how = How.XPATH, using = logInPasswordField) public WebElement logInPassword;
    @FindBy(how = How.XPATH, using = logInButton) public WebElement logInBox;
    @FindBy(how = How.XPATH, using = logHeaderText) public WebElement headerText;
    @FindBy(how = How.XPATH, using = logInPositiveText) public WebElement positiveText;


    /**
     *  User Account positive test
     */
    public void userAccountCheck() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        signUp.click();
        Thread.sleep(2000);
    }
    public void userCredentialEmail(String email) {
        emailAddress.sendKeys(email);
    }
    public void userCredentialPassword(String Password) {
        password.sendKeys(Password);
    }
    public void userCredentialZipCode(String zipcode) throws InterruptedException {
        zipCode.sendKeys(zipcode);
//        register.click();
        Thread.sleep(7000);
    }
    //    Validation
    public void validateUserAccountCheck(){
        String actualResult = "";
        String expectedResult = accountText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * User Account negative test
     */
    public void userCredentialRegisterBox() throws InterruptedException {
        register.click();
        Thread.sleep(7000);
    }

    public void validateUserAccountNegativeTest(String string) {
        String actualResult = string;
        String expectedResult = negativeText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Log in positive Test
     */
    public void logInPositiveCheck() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        logInBtn.click();
    }
    public void logInEmail(String email) {
        logInEmail.sendKeys(email);
    }
    public void logInPassword(String password){
        logInPassword.sendKeys(password);
    }

    public void validateLogInPositiveCheck(String string){
        String actualResult = string;
        String expectedResult = positiveText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     *  Log in negative test
     */
    public void logInBoxClick(){
        logInBox.click();
    }

    public void validateLogInNegativeCheck(String string){
        String actualResult = string;
        String expectedResult = headerText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


}
