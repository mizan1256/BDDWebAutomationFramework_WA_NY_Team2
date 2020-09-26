package tdbankhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class TDBankHome extends WebAPI {



    //@Find By Annotations with Locators

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-0']")
    WebElement countrySelectBtn;

    @FindBy(xpath = "//ul[@class='td-dropdown-content']//a[contains(text(),'Canada')]")
    WebElement selectCanada;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-2']//span[@class='td-icon expand']")
    WebElement productsDropdownBtn;

    @FindBy(xpath = "//ul[@class='td-dropdown-content']//a[contains(text(),'Credit Cards')]")
    WebElement creditCards;

    @FindBy(xpath = "//ul[@class='td-dropdown-content']//a[contains(text(),'Savings')]")
    WebElement savings;

    @FindBy(xpath = "//select[@id='state']")
    WebElement selectState;

    @FindBy(xpath = "//select[@id='city']")
    WebElement selectCity;

    @FindBy(xpath = "//button[@class='td-button td-button-block td-button-secondary' and @type='button']")
    WebElement setMyLocation;

    @FindBy(xpath = "//div[@class='td-col td-col-xs-12 td-col-sm-10 td-col-sm-offset-1']")
    WebElement savingsPageText;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']")
    WebElement loginDropdownBtn;

    @FindBy(xpath = "//div[@class='td-col']//a[contains(text(),'Online Banking')]")
    WebElement onlineBanking;

    @FindBy(xpath = "//input[@id='formElement_0']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@id='formElement_1']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit' and text()='Log in']")
    WebElement loginBtn;

    @FindBy(xpath = "//span[@class='error-message ng-binding']")
    WebElement errorLoginMsg;

    @FindBy(xpath = "//div[@class='ng-scope td-iconWrapper']//div[@class='td-icon td-icon-error']")
    WebElement iconError;





    //BDD TD Bank Home Action Methods
    public void clickOnFlagBtn(){
        clickOnElement(countrySelectBtn);
    }
    public void changeCountry(){
        clickOnElement(selectCanada);
    }
    public void verifyCountryChanged(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "TD Canada Trust - Personal, Small Business Banking & Investing";
        Assert.assertEquals("Title doesn't match",actualTitle,expectedTitle);
    }

    /**
     * Credit card page Steps:
     * In this steps I've used mouse hover functionality.
     */
    public void mouseHoverOnProductsDropdown(){
        Actions actions = new Actions(driver);
        actions.moveToElement(productsDropdownBtn).perform();
    }
    public void clickOnCreditCardLink(){
        clickOnElement(creditCards);
    }
    public void validateCreditCardPage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Apply for a Credit Card Online | TD Bank Rewards Credit Cards";
        Assert.assertEquals("Title doesn't match",actualTitle,expectedTitle);
    }

    /**
     * Savings Account page Steps
     * In these steps I've used Select from dropDown  by Visible Text
     */
    public void clickOnSavingsLink(){
        clickOnElement(savings);
    }
    public void selectState(String state){
        selectFromDropdownByVisibleText(selectState,state);
    }
    public void selectCity(String city){
        selectFromDropdownByVisibleText(selectCity,city);
    }
    public void clickOnSetMyLocation(){
        clickOnElement(setMyLocation);
    }
    public void validateSavingsAccount(){
        String actualText = savingsPageText.getText();
        String expectedText = "TD Bank Savings & Money Market Accounts";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }

    /**
     * Verify Login with invalid Credentials:
     * using Scenario Table
     */
    public void mouseHoverOnLoginLink(){
        mouseHover(loginDropdownBtn);
    }
    public void clickOnOnlineBanking(){
        clickOnElement(onlineBanking);
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login");
    }
    public void enterUsername(String username){
        typeOnElement(usernameField,username);
    }
    public void enterPassword(String password){
        typeOnElement(passwordField,password);
    }
    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);
    }
    public void validateLoginWithInvalidCredentials(){
        String actualText = errorLoginMsg.getText();
        String expectedText = "Something doesn't match. Please try again. You can also retrieve your user name or reset your password via the \"Forgot user name and/or password?\" link.";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);

    }






}
