package geicohome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static geicohome.GeicoElement.*;
import static geicohome.GeicoHomeWebElement.*;

public class GeicoHome extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementAutoButton) public WebElement autoButton;
    @FindBy(how = How.XPATH, using = webElementCheckButton) public WebElement checkButton;
    @FindBy(how = How.XPATH, using = webElementAddProperty) public WebElement addProperty;
    @FindBy(how = How.XPATH, using = webElementStartQuote) public  WebElement startQuote;
    @FindBy(how = How.XPATH,using = webElementContactUsText) public WebElement contactUsText;
//
    @FindBy(how = How.XPATH, using = homeSearchButton)
    public WebElement searchIcon;
//  @FindBy(how = How.XPATH, using = homeSearchBox)
//  public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homeSearchItemButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = homeSearchItemText)
    public WebElement searchItemText;
    @FindBy(how = How.XPATH, using = autoSearchSite)
    public WebElement manageAccount;

    @FindBy(how = How.XPATH, using = searchLogoXpathWebElement)
    public WebElement searchLogo;
    @FindBy(how = How.XPATH, using = searchBoxXpathElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonBoxXpathElement)
    public WebElement searchButtonBox;
    @FindBy(how = How.XPATH, using = siteSearchTextButtonBoxXpathElement)
    public WebElement siteSearchText;
    //login
    @FindBy(how = How.XPATH, using = LoginXpathElement)
    public WebElement login;
    @FindBy(how = How.XPATH, using = accessPolicyXpathWebElement)
    public WebElement accessPolicyHomeOwner;
    @FindBy(how = How.XPATH, using = clickToLoginWebElement)
    public WebElement clickToLogin;
    @FindBy(how = How.XPATH, using = userNameXPathWebElement)
    public WebElement userName;
    @FindBy(how = How.XPATH, using = passwordXPathWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = submitButtonXPathWebElement)
    public WebElement submitButton;
    @FindBy(how = How.XPATH, using = arrowToChoosePolicyXPathWebElement)
    public WebElement arrowToChoosePolicy;
    @FindBy(how = How.XPATH, using = startHereNewCustomerXPathWebElement)
    public WebElement startHereNewCustomer;
    @FindBy(how = How.XPATH, using = policyNumberXPathWebElement)
    public WebElement policyNumber;
    @FindBy(how = How.XPATH, using = dateOfBirthXPathWebElement)
    public WebElement dateOfBirth;
    @FindBy(how = How.XPATH, using = zipcodeXPathWebElement)
    public WebElement zipcode;
    @FindBy(how = How.XPATH, using = continueXPathWebElement)
    public WebElement continueButton;

    @FindBy(how = How.XPATH, using = errorTextXPathWebElement)
    public WebElement errorText;
    @FindBy(how = How.XPATH, using = errorTextPolicyNumberXPathWebElement)
    public WebElement errorTextPolicyNumber;

    @FindBy(how = How.XPATH, using = webElementsGeicoCareerButton)
    public WebElement geicoCareerButton;

    @FindBy(id = "cookie-notice-close")
    WebElement acceptBtn;

    @FindBy(xpath = "//span[@class='font--bluejay geico-icon icon-live-chat']")
    WebElement customerServiceBtn;

    @FindBy(xpath = "//h1[contains(text(),'Customer Service Careers')]")
    WebElement customerServiceText;

    @FindBy(how = How.XPATH, using = webElementsGeicoContactUsButton)
    public WebElement geicoContactUsButton;

    @FindBy(how = How.XPATH, using = webElementsGeicoPrivacyButton)
    public WebElement geicoPrivacyButton;

    /**
     *
     * Geico AutoButton Functional Check
     */

    // Action Method
    public void autoButtonClickable() throws InterruptedException {
        autoButton.click();
        Thread.sleep(3000);
    }
    public void checkButton() throws InterruptedException {
        checkButton.click();
        Thread.sleep(3000);
    }
    public void startQuote(){
        startQuote.click();
    }

    // Validation method
    public void contactUsText(){
       String expectedTitle = "GEICO";
       String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
       Assert.assertEquals("Title doesn't match", actualTitle, expectedTitle);

    }
    //
    /**
     * Search Button Check
     */
    public void searchIconCheck() throws InterruptedException {
        searchIcon.click();
        Thread.sleep(2000);
    }

    public void searchBoxCheck() throws InterruptedException {
        searchBox.sendKeys("Auto");
        Thread.sleep(2000);
    }

    public void searchButtonCheck() {
        searchButton.click();
    }

    public void validateSearchIconCheck(String string) {
        String expectedResult = string;
        String actualResult = searchItemText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Auto Search Site Check
     */
    public void autoSearchSite() throws InterruptedException {
        manageAccount.click();
        Thread.sleep(2000);
    }

    // Validate Method
    public void validateAutoSearchSite(String expectedResult) {
        String actualResult = searchItemText.getText();

    }

    public void clickSearchLogo() {
        searchLogo.click();
    }

    public void typeOnSearchBox() {
        searchBox.sendKeys("Motorcycle Insurance");
    }

    public void typeOnSearchBox(String searchItem) {
        searchBox.sendKeys(searchItem);
    }

    public void submitSearchBox() {
        searchBox.submit();
    }

    public void verifySiteSearchText() {
        String actualText = siteSearchText.getText();
        String expectedText = "Site Search";
        Assert.assertEquals(actualText,expectedText);
    }
//login
//    public void clickOnLogin() {
//        login.click();
//    }

    public void choosePolicy() {
        policyDropDown();
        accessPolicyHomeOwner.click();
    }

    public void clickLoginToEnterUSerNameAndPassword() {
        clickToLogin.click();
    }

    public void enterUserNameAndPassword() {
        userName.sendKeys("30235com");
        password.sendKeys("pnt30235");
    }

    public void enterUserNameAndPassword(String userId, String pwd) {
        userName.sendKeys(userId);
        password.sendKeys(pwd);
    }

    public void submitLogin() {
        submitButton.click();
    }

    public void verifyTitle() {
        String actualText = driver.getTitle();
        Assert.assertEquals(title, actualText);
    }

    public void policyDropDown() {
        arrowToChoosePolicy.click();
    }

    public void startHere() {
        startHereNewCustomer.click();
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void enterPolicyNumberAndDateOfBirthAndZipCode(String pnum, String dob, String zip) {
        policyNumber.sendKeys(pnum);
        dateOfBirth.sendKeys(dob);
        zipcode.sendKeys(zip);
    }

    public void verifyErrorText() {
        String actualText = errorText.getText();
        String expectedText = "Policy Number is required.";
        Assert.assertEquals(expectedText, actualText);
    }

    public void verifyPolicyNumberErrorText() {
        String actualText = errorTextPolicyNumber.getText();
        String expectedText = "Policy Number must be at least 10 characters";
        Assert.assertEquals(expectedText, actualText);
    }

    public void clickCareerBtn() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        scrollDownByJS();
        Thread.sleep(3000);
        acceptBtn.click();
        geicoCareerButton.click();
    }

    public void clickCustomerServiceBtn() throws InterruptedException {
        Thread.sleep(3000);
        customerServiceBtn.click();
    }

    public void validateText() {
        String expectedText = customerServiceText.getText();
        String actualText = "Customer Service Careers";
        Assert.assertEquals("Test Failed", expectedText, actualText);
    }

}
