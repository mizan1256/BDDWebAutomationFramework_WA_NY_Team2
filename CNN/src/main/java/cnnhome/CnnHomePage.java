package cnnhome;

import common.WebAPI;
import io.cucumber.java.BeforeStep;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

import static cnnhome.CnnHomePageWebElements.*;

public class CnnHomePage extends WebAPI {

    //@FindBy
    @FindBy(xpath = userAccountBtn_Xp)
    WebElement userAccountBtn;

    @FindBy(xpath = signUpBtn_Xp)
    WebElement signUpBtn;

    @FindBy(xpath = emailAddressField_Xp)
    WebElement emailAddressField;

    @FindBy(xpath = passwordField_Xp)
    WebElement passwordField;

    @FindBy(xpath = zipCodeField_xp)
    WebElement zipCodeField;

    @FindBy(xpath = registerBtn_xp)
    WebElement registerBtn;

    @FindBy(xpath = invalidEmailText_xp)
    WebElement invalidEmailText;

    @FindBy(xpath = invalidPasswordText_xp)
    WebElement invalidPasswordText;

    @FindBy(xpath = invalidZipcodeText_xp)
    WebElement invalidZipcodeText;

    @FindBy(xpath = accountExistText_xp)
    WebElement accountExistText;

    @FindBy(xpath = loginEmailField_xp)
    WebElement loginEmailField;

    @FindBy(xpath = loginPasswordField_xp)
    WebElement loginPasswordField;

    @FindBy(xpath = loginBtn_xp)
    WebElement loginBtn;

    @FindBy(xpath = invalidUserNameAndPasswordText_xp)
    WebElement invalidUserNameAndPasswordText;

    @FindBy(xpath = editionBtn_xp)
    WebElement editionBtn;

    @FindBy(xpath = international_xp)
    WebElement international;

    @FindBy(xpath = arabic_xp)
    WebElement arabic;

    @FindBy(xpath = espanol_xp)
    WebElement espanol;

    @FindBy(xpath = searchBtn_xp)
    WebElement searchBtn;

    @FindBy(xpath = searchBox_xp)
    WebElement searchBox;



    //Action  & Validate Method

    //Login Methods for valid and invalid credentials
    public void clickOnUserAccountBtn() {
        clickOnElement(userAccountBtn);
    }

    public void enterEmailIntoEmailField(String email) {
        typeOnElement(loginEmailField, email);
    }

    public void enterPasswordIntoPasswordField(String password) {
        typeOnElement(loginPasswordField, password);
    }

    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
    }

    public void verifyInvalidLogin() {
        String actualText = invalidUserNameAndPasswordText.getText();
        String expectedText = "You have entered an invalid username or password.";
        Assert.assertEquals("Text doesn't match", actualText, expectedText);
    }
    public void validateLoginWithAllValidCredentials() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals("Title doesn't match", actualTitle, expectedTitle);
    }

    //Sign up Methods for valid and invalid credentials
    public void clickOnSignUpLink(){
        clickOnElement(signUpBtn);
    }
    public void typeEmailInEmailField(String email){
        typeOnElement(emailAddressField, email);
    }
    public void typePasswordInEmailField(String password){
        typeOnElement(passwordField, password);
    }
    public void typeZipcodeInZipcodeField(String zipcode){
        typeOnElement(zipCodeField, zipcode);
    }
    public void clickOnRegisterBtn(){
        clickOnElement(registerBtn);
    }
    public void verifyTheAccountIsValid(){
        String actualText = accountExistText.getText();
        String expectedText = "This account already exists. Please log in.";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }

    public void invalidEmailText(){
        String actualText = invalidEmailText.getText();
        String expectedText ="Please enter a valid email address";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }

    public void invalidPasswordText(){
        String actualText = invalidPasswordText.getText();
        String expectedText ="Please enter a valid password";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }

    public void invalidZipCodeText(){
        String actualText = invalidZipcodeText.getText();
        String expectedText ="Must only contain numbers";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }

    public void invalidSignUpText(){
        String actualText = invalidUserNameAndPasswordText.getText();
        String expectedText ="please enter valid data";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }








}
