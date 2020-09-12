package tdbankhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TDBankHome extends WebAPI {
    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']")
    WebElement tdLogInIcon;
    @FindBy(xpath = "//div[@class='td-col']//a[contains(text(),'Online Banking')]")
    WebElement onlineBankingBtn;
    @FindBy(xpath = "//h1[@class='td-ui-login-app-title ng-binding']")
    WebElement validateText;
    @FindBy(xpath = "//a[contains(text(),'Sign')]")WebElement signInBtn;
    @FindBy(xpath = "//input[@id='formElement_5']")WebElement plsConfirmCheckBtn;
    @FindBy(xpath = "//*[@id=\"formElement_6\"]")WebElement eSignAcceptCheckBox;
    @FindBy(xpath = "//input[@id='formElement_7']")WebElement firstName;
    @FindBy(xpath = "//input[@id='formElement_8']")WebElement lastName;
    @FindBy(xpath = "//input[@id='formElement_9']")WebElement email;
    @FindBy(xpath = "//div[@class='td-select']")WebElement actTypeDropDown;
    @FindBy(xpath = "//input[@id='formElement_36']")WebElement ssNumber;
    @FindBy(xpath = "//input[@id='formElement_37']")WebElement atmNumber;
    @FindBy(xpath = "//input[@id='formElement_38']")WebElement accountNumber;
    @FindBy(xpath = "//span[@id='labelWrap_3754']//a[@class='ng-binding'][contains(text(),'Yes')]")WebElement freeBillPayYesBtn;
    @FindBy(xpath = "//span[@id='labelWrap_3556']//a[@class='ng-binding'][contains(text(),'Yes')]")WebElement goPaperLessYesBtn;
    @FindBy(xpath = "//input[@id='formElement_39']")WebElement userName;
    @FindBy(xpath = "//input[@id='formElement_40']")WebElement reEnterUserName;
    @FindBy(xpath = "//input[@id='formElement_66']")WebElement newPassword;
    @FindBy(xpath = "//input[@id='formElement_67']")WebElement reEnterPassword;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[1]/form/div[2]/div[7]/button[2]")WebElement continueBtn;
    @FindBy(xpath = "//div[@class='td-infobar-content']//div[1]") WebElement errorMessage;


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
    public void pleaseConfirmCheckBtn(){
        plsConfirmCheckBtn.isSelected();
    }
    public void acceptPopUpUsingAlert(){
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    public void eSignAcceptCheckBox(){
        eSignAcceptCheckBox.click();
    }
    public void acceptSecondPopUpUsingAlert(){
        Alert alert=driver.switchTo().alert();
        alert.accept();
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
        Alert alert=driver.switchTo().alert();
        alert.accept();
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
