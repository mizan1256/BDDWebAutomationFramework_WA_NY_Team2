package tdbankhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TDBankHome extends WebAPI {

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']")
    WebElement logInIcon;
    @FindBy(xpath = "//div[@class='td-col']//a[contains(text(),'Online Banking')]")
    WebElement onlineBanking;
    @FindBy(xpath = "//h1[@class='td-ui-login-app-title ng-binding']")
    WebElement validateText;
    @FindBy(xpath = "//a[contains(text(),'Sign')]")
    WebElement signUpBtn;
    @FindBy(xpath = "//label[@class='card'][contains(text(),'I am the account owner for all accounts.')]")
    WebElement plsConfirmCheckBtn;
    @FindBy(xpath = "//label[@class='card']")
    WebElement eSignAcceptCheckBox;
    @FindBy(xpath = "//*[@id=\"eSignForm\"]/div[3]/div/button[2]")
    WebElement secondPopUpContinueBtn;
    @FindBy(xpath = "//input[@id='formElement_7']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='formElement_8']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='formElement_9']")
    WebElement email;
    @FindBy(xpath = "//select[@id=\"formElement_10\"]")
    WebElement actTypeDropDown;
    @FindBy(xpath = "//*[@id=\"formElement_11\"]")
    WebElement ssNumber;
    @FindBy(xpath = "//*[@id=\"formElement_12\"]")
    WebElement userAtmNumber;
    @FindBy(xpath = "//*[@id=\"formElement_13\"]")
    WebElement accountNumber;
    @FindBy(xpath = "//*[@id=\"labelWrap_3551\"]/div/div/div/ul/li[1]/a")
    WebElement freeBillPayYesBtn;
    @FindBy(xpath = "//span[@id='labelWrap_3556']//a[@class='ng-binding'][contains(text(),'Yes')]")
    WebElement goPaperLessYesBtn;
    @FindBy(xpath = "//input[@id='formElement_14']")
    WebElement enterUserName;
    @FindBy(xpath = "//input[@id='formElement_15']")
    WebElement reEnterUserName;
    @FindBy(xpath = "//input[@id='formElement_16']")
    WebElement newPassword;
    @FindBy(xpath = "//input[@id='formElement_17']")
    WebElement reEnterPassword;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[1]/form/div[2]/div[7]/button[2]")
    WebElement continueBtn;
    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div[1]/div/div/div[3]/div/button[2]")
    WebElement firstPopUpContinueBtn;
    @FindBy(xpath = "//*[@id=\"eSignForm\"]/div[3]/div/button[2]")
    WebElement thirdPopUpAcceptBtn;
    @FindBy(xpath = "//div[@class='td-infobar-content']//div[1]")
    WebElement errorMessage;
    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-2']//span[@class='td-icon expand']")
    WebElement productDropDownIcon;
    @FindBy(xpath = "//li[@class='td-dropdown td-dropdown-active']//ul[@class='td-dropdown-content']//li//a[contains(text(),'Checking')]")
    WebElement checkingBtn;
    @FindBy(xpath = "//h1[contains(text(),'TD Bank Checking Accounts')]")
    WebElement checkingBtnTxt;
    @FindBy(xpath = "//button[@class='td-button td-button-secondary td-button-large td-copy-nowrap loginout']")
    WebElement tdHomePageLogInBtn;
    @FindBy(xpath = "//input[@id='formElement_0']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='formElement_1']")
    WebElement userPasswordField;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/button")
    WebElement logInBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div[2]")
    WebElement loginErrorMsg;
    @FindBy(xpath = "//li[@class='find-us']//span[@class='td-icon']")
    WebElement findUsIcon;
    @FindBy(xpath = "//input[@id='q']")
    WebElement locatorSearchBox;
    @FindBy(xpath = "//img[@class='Locator-searchIcon']")
    WebElement locatorSearchIcon;
    @FindBy(xpath = "//div[@class='ResultSummary']")
    WebElement findUsValidationText;
    @FindBy(xpath = "//*[@id=\"js-yl-USBRANCH40244\"]/article/div[11]/div/div/div/a")
    WebElement getDirectionBtn;


    /**
     * TD Bank Online Banking page is display using navigate().to()  method
     */
    public void logInIcon() {
        Actions action = new Actions(driver);
        action.moveToElement(logInIcon).perform();
    }

    public void onlineBanking() {
        onlineBanking.click();
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login");
    }

    public void validateOnlineBankingTxt() {
        String actualResult = "Welcome to Online Banking";
        String expectedResult = validateText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * TD Bank SignUp functionality test
     */
    public void clickOnSignInBtn() {

        signUpBtn.click();
    }

    public void pleaseConfirmCheckBtn() throws InterruptedException {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();",plsConfirmCheckBtn);
//        Thread.sleep(5000);
        plsConfirmCheckBtn.click();
    }

    public void acceptPopUpUsingAlert() {
        firstPopUpContinueBtn.click();
    }

    public void eSignAcceptCheckBox() throws InterruptedException {
        sleepFor(5);
        eSignAcceptCheckBox.click();
    }

    public void acceptSecondPopUpUsingAlert() {
        secondPopUpContinueBtn.click();
    }

    public void enterFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void enterEmail(String userEmail) {
        email.sendKeys(userEmail);
    }

    public void selectAccountType() {
        actTypeDropDown.click();
        Select select = new Select(actTypeDropDown);
        select.selectByVisibleText("Checking");
    }

    public void enterAtmCardNumber(String atmNumber) {
        userAtmNumber.sendKeys(atmNumber);
    }

    public void enterSsnNumber(String ssNum) {
        ssNumber.sendKeys(ssNum);
    }

    public void enterAccountNumber(String userAccNum) {
        accountNumber.sendKeys(userAccNum);
    }

    public void checkYesFromBillPayOption() {
        freeBillPayYesBtn.click();
    }

    public void goPaperlessOption() {
        goPaperLessYesBtn.click();
    }

    public void acceptThirdPopUp() {
        thirdPopUpAcceptBtn.click();
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
    }

    public void enterUserName(String userName) {
        enterUserName.sendKeys(userName);
    }

    public void reEnterUserName(String reEnterName) {
        reEnterUserName.sendKeys(reEnterName);
    }

    public void enterUserPassword(String password) {
        newPassword.sendKeys(password);
    }

    public void reEnterUserPassword(String reEntPassword) {

        reEnterPassword.sendKeys(reEntPassword);
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void validateSignUpPageText(String expectedResult) {
        String actualResult = errorMessage.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);
    }

    /**
     * Td bank Login functionality test with invalid credentials
     */
    public void clickOnTdLogInBtn() {
        tdHomePageLogInBtn.click();
    }

    public void enterUserInfo(String userName, String password) {
        userNameField.sendKeys(userName);
        userPasswordField.sendKeys(password);
    }

    public void clickOnLogInBtn() {
        logInBtn.click();
    }

    public void validateLogInText(String expectedResult) throws InterruptedException {
        String actualResult = loginErrorMsg.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);
        sleepFor(3);
    }

    /**
     * TD Bank product dropDown list check
     */
    public void clickOnProductBtn() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(productDropDownIcon).perform();
    }

    public void clickOnCheckingBtn() throws InterruptedException {
        sleepFor(3);
        checkingBtn.click();
        sleepFor(3);
    }

    public void validateProductText(String expectedResult) {
        String actualResult = checkingBtnTxt.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);
    }

    /**
     * TD Bank Find us Box functionality check
     */
    public void clickOnFindUsIcon() {
        findUsIcon.click();
    }

    public void enterLocationAndClickOnSearchIcon(String zipCode) throws InterruptedException {
        sleepFor(3);
        locatorSearchBox.sendKeys(zipCode);
        sleepFor(3);
        locatorSearchIcon.submit();
    }

    public void validateFindUsValidationText(String expectedResult) throws InterruptedException {
        String actualResult = findUsValidationText.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);
    }
    public void landingOnLocationsPage() throws InterruptedException {
        clickOnFindUsIcon();
        locatorSearchBox.sendKeys("11416");
        sleepFor(3);
        locatorSearchIcon.submit();
        sleepFor(3);
    }
    public void clickOnGetDirection(){
        getDirectionBtn.click();
        driver.navigate().to("https://www.google.com/maps/place/TD+Bank/@40.721376,-73.8062462,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x5d1f3147c537fd18!8m2!3d40.721376!4d-73.8040575");
    }
    public void validateGetDirection(){
        String expectedTitle="TD Bank - Google Maps";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle,expectedTitle);
    }

}
