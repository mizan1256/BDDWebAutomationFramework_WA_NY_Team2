package tdbankhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TDBankHome extends WebAPI {
    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']") WebElement tdLogInIcon;
    @FindBy(xpath = "//div[@class='td-col']//a[contains(text(),'Online Banking')]") WebElement onlineBankingBtn;
    @FindBy(xpath = "//h1[@class='td-ui-login-app-title ng-binding']") WebElement validateText;
    @FindBy(xpath = "//a[contains(text(),'Sign')]")WebElement signInBtn;
    @FindBy(xpath = "//label[@class='card'][contains(text(),'I am the account owner for all accounts.')]")WebElement plsConfirmCheckBtn;
    @FindBy(xpath = "//*[@id=\"labelWrap_3444\"]/div/div/label")WebElement eSignAcceptCheckBox;
    @FindBy(xpath = "//*[@id=\"eSignForm\"]/div[3]/div/button[2]")WebElement secondPopUpContinueBtn;
    @FindBy(xpath = "//input[@id='formElement_7']")WebElement firstName;
    @FindBy(xpath = "//input[@id='formElement_8']")WebElement lastName;
    @FindBy(xpath = "//input[@id='formElement_9']")WebElement email;
    @FindBy(xpath = "//select[@id='formElement_10']")WebElement actTypeDropDown;
    @FindBy(xpath = "//*[@id=\"formElement_11\"]")WebElement ssNumber;
    @FindBy(xpath = "//*[@id=\"formElement_12\"]")WebElement atmNumber;
    @FindBy(xpath = "//*[@id=\"formElement_13\"]")WebElement accountNumber;
    @FindBy(xpath = "//*[@id=\"labelWrap_3551\"]/div/div/div/ul/li[1]/a")WebElement freeBillPayYesBtn;
    @FindBy(xpath = "//span[@id='labelWrap_3556']//a[@class='ng-binding'][contains(text(),'Yes')]")WebElement goPaperLessYesBtn;
    @FindBy(xpath = "//input[@id='formElement_14']")WebElement userName;
    @FindBy(xpath = "//input[@id='formElement_15']")WebElement reEnterUserName;
    @FindBy(xpath = "//input[@id='formElement_16']")WebElement newPassword;
    @FindBy(xpath = "//input[@id='formElement_17']")WebElement reEnterPassword;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[1]/form/div[2]/div[7]/button[2]")WebElement continueBtn;
    @FindBy(xpath = "//div[@class='td-infobar-content']//div[1]") WebElement errorMessage;
    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div[1]/div/div/div[3]/div/button[2]")WebElement firstPopUpContinueBtn;
    @FindBy(xpath = "//*[@id=\"eSignForm\"]/div[3]/div/button[2]")WebElement thirdPopUpAcceptBtn;


    public void logInIcon() {
        Actions action = new Actions(driver);
        action.moveToElement(tdLogInIcon).perform();
    }

    public void onlineBanking() {
        onlineBankingBtn.click();
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login");
    }

    public void validateOnlineBankingTxt() {
        String actualResult = "Welcome to Online Banking";
        String expectedResult = validateText.getText();
        Assert.assertEquals("Text do not match", actualResult, expectedResult);
    }
    /**
     * TD Bank SignUp functionality test
     */
    public void clickOnSignInBtn(){

        signInBtn.click();
    }
    public void pleaseConfirmCheckBtn() throws InterruptedException {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();",plsConfirmCheckBtn);
//        Thread.sleep(5000);
        plsConfirmCheckBtn.click();
    }
    public void acceptPopUpUsingAlert(){
        firstPopUpContinueBtn.click();
    }
    public void eSignAcceptCheckBox(){
        eSignAcceptCheckBox.click();
    }
    public void acceptSecondPopUpUsingAlert(){
     secondPopUpContinueBtn.click();
    }
    public void insertCredentials(){
        firstName.sendKeys("Mohammd");
        lastName.sendKeys("Islam");
        email.sendKeys("pnt30242@gmail.com");
    }
    public void selectAccountType(){
        actTypeDropDown.click();
        Select select=new Select(actTypeDropDown);
        select.selectByVisibleText("Checking");
    }
    public void enterAtmCardNumber(){
        atmNumber.sendKeys("1234567809876543");
    }
    public void enterSsnNumber(){
        ssNumber.sendKeys("123345678");
    }
    public void enterAccountNumber(){
        accountNumber.sendKeys("3452349876");
    }
    public void checkYesFromBillPayOption(){
        freeBillPayYesBtn.click();
    }
    public void goPaperlessOption(){
        goPaperLessYesBtn.click();
    }
    public void acceptThirdPopUp(){
        thirdPopUpAcceptBtn.click();
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
    }
    public void enterUserName(){
        userName.sendKeys("pnt30242");
    }
    public void reEnterUserName(){
        reEnterUserName.sendKeys("pnt30242");
    }
    public void enterUserPassword(){
        newPassword.sendKeys("Pnt@30242");
    }
    public void reEnterUserPassword(){
        reEnterPassword.sendKeys("Pnt@30242");
    }
    public void clickOnContinueBtn(){
        continueBtn.click();
    }
    public void validateSignUpPageText(String expectedResult){
        String actualResult=errorMessage.getText();
        Assert.assertEquals("Search Item not match",actualResult,expectedResult);

    }
}
