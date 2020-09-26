package geicohome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static geicohome.GeicoWebElements.*;

public class GeicoHome extends WebAPI {

        @FindBy(how = How.XPATH, using = searchLogoXpathWebElement) public WebElement searchLogo;
        @FindBy(how = How.XPATH, using = searchBoxXpathElement) public WebElement searchBox;
        @FindBy(how = How.XPATH, using = searchButtonBoxXpathElement) public WebElement searchButtonBox;
        @FindBy(how = How.XPATH, using = siteSearchTextButtonBoxXpathElement) public WebElement siteSearchText;

        @FindBy(how = How.XPATH, using = LoginXpathElement) public WebElement login;
        @FindBy(how = How.XPATH, using = accessPolicyXpathWebElement) public WebElement accessPolicyHomeOwner;
        @FindBy(how = How.XPATH, using = clickToLoginWebElement) public WebElement clickToLogin;
        @FindBy(how = How.XPATH, using = userNameXPathWebElement) public WebElement userName;
        @FindBy(how = How.XPATH, using = passwordXPathWebElement) public WebElement password;
        @FindBy(how = How.XPATH, using = submitButtonXPathWebElement) public WebElement submitButton;
        @FindBy(how = How.XPATH, using = arrowToChoosePolicyXPathWebElement) public WebElement arrowToChoosePolicy;
        @FindBy(how = How.XPATH, using = startHereNewCustomerXPathWebElement) public WebElement startHereNewCustomer;
        @FindBy(how = How.XPATH, using = policyNumberXPathWebElement) public WebElement policyNumber;
        @FindBy(how = How.XPATH, using = dateOfBirthXPathWebElement) public WebElement dateOfBirth;
        @FindBy(how = How.XPATH, using = zipcodeXPathWebElement) public WebElement zipcode;
        @FindBy(how = How.XPATH, using = continueXPathWebElement) public WebElement continueButton;

        @FindBy(how = How.XPATH, using = errorTextXPathWebElement) public WebElement errorText;
        @FindBy(how = How.XPATH, using = errorTextPolicyNumberXPathWebElement) public WebElement errorTextPolicyNumber;


        @FindBy(how = How.XPATH,using = webElementsGeicoCareerButton) public WebElement geicoCareerButton;
        @FindBy(id = "cookie-notice-close") WebElement acceptBtn;
        @FindBy(xpath = "//span[@class='font--bluejay geico-icon icon-live-chat']") WebElement customerServiceBtn;
        @FindBy(xpath = "//h1[contains(text(),'Customer Service Careers')]") WebElement customerServiceText;
        @FindBy(how = How.XPATH,using = webElementsGeicoContactUsButton) public WebElement geicoContactUsButton;
        @FindBy(how = How.XPATH,using = webElementsGeicoPrivacyButton) public WebElement geicoPrivacyButton;



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
        }

//     login
        public void choosePolicy() {
            policyDropDown();
            accessPolicyHomeOwner.click();
        }

        public void clickLoginToEnterUSerNameAndPassword() {
            clickToLogin.click();
        }

        public void enterUserNameAndPassword() {
            userName.sendKeys("12432com");
            password.sendKeys("Abbc114");
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

        public void startHere(){
            startHereNewCustomer.click();
        }
        public void clickContinue(){
            continueButton.click();
        }
        public void enterPolicyNumberAndDateOfBirthAndZipCode(String pnum, String dob, String zip){
            policyNumber.sendKeys(pnum);
            dateOfBirth.sendKeys(dob);
            zipcode.sendKeys(zip);
        }

        public void verifyErrorText(){
            String actualText=errorText.getText();
            String expectedText="Policy Number is required.";
            Assert.assertEquals(expectedText,actualText);
        }
        public void verifyPolicyNumberErrorText(){
            String actualText=errorTextPolicyNumber.getText();
            String expectedText="Policy Number must be at least 10 characters";
            Assert.assertEquals(expectedText,actualText);
        }

//           Geico Career Button
        public void clickCareerBtn() throws InterruptedException {
            scrollDown();
            acceptBtn.click();
            geicoCareerButton.click();

        }

    private void scrollDown() {

    }

    public void clickCustomerServiceBtn() throws InterruptedException {
            Thread.sleep(3000);
            customerServiceBtn.click();
        }

        public void validateText(){
            String expectedText=customerServiceText.getText();
            String actualText="Customer Service Careers";
            Assert.assertEquals("Test Failed",expectedText,actualText);
        }
}
