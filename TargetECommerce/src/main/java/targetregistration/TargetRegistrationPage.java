package targetregistration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static targetregistration.TargetRegistrationWebElement.*;

public class TargetRegistrationPage extends WebAPI {
    @FindBy(how = How.XPATH, using = signInXPathWebElement)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = clickCreateAccountXPathWebElement)
    public WebElement ClickCreateAccount;
    @FindBy(how = How.CSS, using = EmailAddressCssSWebElement)
    public WebElement emailAddress;
    @FindBy(how = How.CSS, using = firstNameCssSWebElement)
    public WebElement firstName;
    @FindBy(how = How.CSS, using = lastNameCssSWebElement)
    public WebElement lastName;
    @FindBy(how = How.CSS, using = passwordCssSWebElement)
    public WebElement password;
    @FindBy(how = How.CSS, using = createAccountCssSWebElement)
    public WebElement createAccount;
    @FindBy(how = How.CSS, using = SignInOptionCssSWebElement)
    public WebElement signInOption;
    @FindBy(how = How.XPATH, using = keepMeSignInXPathWebElement)
    public WebElement keepMeSignIn;
    @FindBy(how = How.XPATH, using = loginTextCssSWebElement)
    public WebElement loginText;
    @FindBy(how = How.XPATH, using = buyItAgainXpathSWebElement)
    public WebElement buyItAgain;
    @FindBy(how = How.XPATH, using = replenishXpathSWebElement)
    public WebElement replenish;
    @FindBy(how = How.XPATH, using = buyItAgainSignInButtonXpathSWebElement)
    public WebElement buyItAgainSignInButton;
    @FindBy(how = How.XPATH, using = targetLogoXpathSWebElement)
    public WebElement targetLogo;
    @FindBy(how = How.XPATH, using = signInButtonSWebElement)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = inCorrectPasswordXPathWebElement)
    public WebElement inCorrectPassword;
    @FindBy(how = How.XPATH, using = myStoreXpathWebElement)
    public WebElement myStore;
    @FindBy(how = How.XPATH, using = searchOptionByZipOrCityXpathWebElement)
    public WebElement myStoreZipcode;
    @FindBy(how = How.XPATH, using = myStoreCityXpathWebElement)
    public WebElement myStoreCity;

    public void timeToBeClickable(int timeInSec, WebElement webElementVariable) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(webElementVariable));

    }

    public void clickSignIn() {
        signIn.click();
    }

    public void enterEmailAddressAndPassword() {
        emailAddress.sendKeys("mtt@gmail.com");
        password.sendKeys("23422235454@xyz");
    }

    public void enterEmailAddressAndPassword1(String uid, String pwd) {
        emailAddress.sendKeys(uid);
        password.sendKeys(pwd);
    }

    public void enterEmailAddress(String uid) {
        emailAddress.sendKeys(uid);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void keepMeSignIn() {
        keepMeSignIn.click();
    }

    public void signIn() {
        timeToBeClickable(5, signInOption);
        signInOption.click();
    }

    public void validateSignInToYourTargetAccount() {
        String actualText = loginText.getText();
        Assert.assertEquals(actualText, expectedTextValidateSignIn);
    }


}
