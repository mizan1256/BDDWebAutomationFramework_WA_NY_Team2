package targetregistration;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static targetregistration.TargetWebElement.*;

public class TargetHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = signInXPathWebElement)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = clickCreateAccountXPathWebElement)
    public WebElement ClickCreateAccount;
    @FindBy(how = How.CSS, using = EmailAddressCssSWebElement)
    public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = firstNameXpathSWebElement)
    public WebElement firstName;
    @FindBy(how = How.CSS, using = lastNameCssSWebElement)
    public WebElement lastName;
    @FindBy(how = How.CSS, using = passwordCssSWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = createAccountXpathSWebElement1)
    public WebElement createAccountOption;
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
     @FindBy(how = How.XPATH, using = searchBoxXPathWebElement)
    public WebElement searchBox;
  @FindBy(how = How.XPATH, using = searchItemValidateXPathWebElement)
    public WebElement searchItemValidate;
  @FindBy(how = How.XPATH, using = createAccountXPathWebElement)
    public WebElement createAccountButton;



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

    public void enterEmailAddressAndPassword(String uid, String pwd) {
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

    public void enterSearchKeyword(String searchItem){
        searchBox.sendKeys(searchItem);

    }
    public void clickSearch(){
        searchBox.submit();

    }
    public void validateSearchItemText(String value){
        String actualText=searchItemValidate.getText();
        String expectText=value;
    }

    public void SearchMultipleItems(String searchItem){
        searchBox.sendKeys(searchItem);

    }
    public void validateSearchProducts(String value){
        String actualText=searchItemValidate.getText();
        String expectText=value;
    }

    public void clickCreateAccount() throws InterruptedException {
        sleepFor(10);
        createAccountOption.click();
    }

    public void setClickCreateAccountButton(){
        createAccountButton.click();
    }
    public void enterEmailAddressForRegistration(String email){
        emailAddress.sendKeys(email);
    }
    public void enterPasswordForRegistration(String pwd){
        password.sendKeys(pwd);
    }

    public void enterFirstName(String fName){
        emailAddress.sendKeys(Keys.TAB);

        firstName.sendKeys(fName);
    }
    public void enterLastName(String lName){
        firstName.sendKeys(lName);
    }



}
