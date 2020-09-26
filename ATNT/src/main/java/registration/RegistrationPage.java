package registration;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static registration.RegistrationPageWebElement.*;

public class RegistrationPage extends WebAPI {

    @FindBy(how = How.XPATH, using = accountArrowButton)
    public WebElement arrowButton;
    @FindBy(how = How.XPATH, using = accountSignInButton)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = accountUserIdBox)
    public WebElement userIdBox;
    @FindBy(how = How.XPATH, using = accountPasswordBox)
    public WebElement passwordBox;
    @FindBy(how = How.XPATH, using = accountSignInBox)
    public WebElement signInBox;
    @FindBy(how = How.ID, using = accountSignInText)
    public WebElement signInText;


    By password = By.id("//input[@id='password']");

    public void accountArrowButtonClick() {
        arrowButton.click();
    }

    public void accountSignInButton() {
        signInButton.click();
    }

    public void userIdBox() {
        userIdBox.sendKeys("pnt123@gmail.com");
    }

    public void passwordBox() {
        passwordBox.sendKeys("pnt123");
    }

    public void signInButtonClick() {
        signInBox.click();
    }

    public void validateLoginAccount(String actualResult) {
        String expectedResult = signInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    public void ValidateLoginGetTitle() {
        String actualResult = "Login Screen";
        String expectedResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"profile-unauth\"]/div[2]/div/ul/li[7]/a/span")
    WebElement payWithoutSignIn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/input")
    WebElement phoneNumber;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[5]/div/div[2]/input")
    WebElement zipCode;
    @FindBy(how = How.XPATH, using = "//*[@id=\"recaptcha-anchor\"]/div[4]")
    WebElement capcha;
    @FindBy(how = How.XPATH, using = "//*[@id=\"profile-unauth\"]/div[2]/div/ul/li[2]/a/span")
    WebElement accountOverview;
    @FindBy(how = How.XPATH, using = "createNow")
    WebElement createAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"wirless\"]")
    WebElement wirelessBtn;

    public void payWithoutSignInBtn() {
        payWithoutSignIn.click();
    }

    public void phoneNumberBox() {
        phoneNumber.sendKeys("7180000000");
    }

    public void zipCodeBox() {
        zipCode.sendKeys("10000");
    }

    public void capChaClick() throws InterruptedException {
        capcha.click();
        Thread.sleep(3000);
    }

    // Account Overview
    public void accountOverviewBtn() {
        accountOverview.click();
    }

    public void accountIconButton(){
        clickOnElement(accountIconWebElement);
    }
    public void signInButton(){
        clickOnElement(signInButtonWebElement);
    }
    public void createButton(){
        clickOnElement(createButtonWebElement);
    }
    public void radioButton() {
        clickOnElement(wirelessRadioButtonWebElement);
    }
    public void continueButton(){
        clickOnElement(continueButtonWebElement);
    }
    public void validateSignUpText(String expectedResult){
        String actualResult= driver.findElement(By.xpath("//h3[contains(text(),'Sorry we could not validate your information.')]")).getText();
        Assert.assertEquals("Text do not match",expectedResult,actualResult);
    }

    /**
     * Atnt negative signIn test
     */
    By user_id=By.xpath("//input[@id='userID']");
    By user_Password=By.xpath("//*[@id=\"password\"]");
    By checkBox=By.xpath("//div[@class='checkbox-skin ng-tns-c33-0']");
    By btn_sign_in= By.xpath("//button[@id='signin']");
    By error_Text=By.xpath("//div[@id='errorDescArea']");

    public void enterUserId(String userId){
        driver.manage().deleteAllCookies();
        driver.findElement(user_id).sendKeys(userId);
    }
    public void enterUserPassword(String userPassword) {
        driver.findElement(user_Password).sendKeys(userPassword);
    }
    public void clickSignInButton(){
        driver.findElement(btn_sign_in).click();
    }
    public void validateSignInPage(){
        Assert.assertEquals("Double check your ID and password, and try again. If you haven't set up your account, tap the 'Create one now' link.",
                driver.findElement(error_Text).getText());
    }
    /**
     * Atnt BurgerButton menu test
     *
     */

    By bur_btn_menu=By.xpath("//*[@id=\"z1-pullMenu-open\"]");
    By wireless_btn=By.xpath("//a[@class='slideout-toggle']//span[@class='auth-pull-left'][contains(text(),'Wireless')]");
    By explore_wireless_btn=By.xpath("//*[@id=\"ge5p-menu-label\"]");

    public void clickBurgBtnMenu() throws InterruptedException {
        driver.findElement(bur_btn_menu).click();
    }
    public void selectWirelessAndExploreBtn(){
        driver.findElement(wireless_btn).click();
        driver.findElement(explore_wireless_btn).click();
    }
    //validate method
    public void validateExploreWirelessTitle(){
        String expectedTitle="AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle,expectedTitle);
    }

}
