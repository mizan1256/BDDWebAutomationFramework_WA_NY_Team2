package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomeWebElement.*;

public class CnnHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = openBurgarButton)
    public WebElement burgarButton;
    @FindBy(how = How.XPATH, using = searchBox)
    public WebElement search;
    @FindBy(how = How.XPATH, using = searchArrowButton)
    public WebElement arrowButton;
    @FindBy(how = How.XPATH, using = politicsRadioButton)
    public WebElement radioButton;
    @FindBy(how = How.XPATH, using = politicsTextDisplayed)
    public WebElement politicsText;

    @FindBy(how = How.XPATH, using = homeTravelTab)
    public WebElement travelTab;
    @FindBy(how = How.XPATH, using = homeGoToBestBeach)
    public WebElement bestBeach;
    @FindBy(xpath = "//a[@class='desk ln_map']")
    WebElement mapTab;
    @FindBy(xpath = "//div[38]")
    WebElement beachRadioButton;
    @FindBy(xpath = "//span[@class='sel']")
    WebElement viewAll;

    @FindBy(how = How.XPATH, using = dropDownEdition)
    public WebElement edition;
    @FindBy(how = How.XPATH, using = dropDownInternational)
    public WebElement international;
    @FindBy(xpath = "//span[contains(text(),'All stories')]")
    WebElement allStories;
    @FindBy(xpath = "//span[contains(text(),'Covid-19 symptoms')]")
    WebElement covidSymptom;
    @FindBy(xpath = "//span[@class='metadata__byline__author']")
    WebElement cnnText;

    @FindBy(how = How.XPATH, using = liveTvTabButton)
    public WebElement liveTv;
    @FindBy(how = How.XPATH, using = liveTvChannelButton)
    public WebElement tvChannelButton;
    @FindBy(how = How.XPATH, using = liveTvBackHome)
    public WebElement backHome;
    @FindBy(how = How.CLASS_NAME, using = liveTvPlayButton)
    public WebElement tvPlayButton;
    @FindBy(how = How.XPATH, using = homePageText)
    public WebElement homeText;

    @FindBy(how = How.XPATH, using = liveTvChannelCnn)
    public WebElement tvChannelCnn;
    @FindBy(how = How.XPATH, using = liveTvLoginText)
    public WebElement loginText;

    @FindBy(how = How.XPATH, using = liveTvChannelClose)
    public WebElement channelClose;
    @FindBy(how = How.XPATH, using = liveTvCloseText)
    public WebElement closeText;

    @FindBy(how = How.XPATH, using = liveTvLindaVoice)
    public WebElement lindaVoice;
    @FindBy(how = How.XPATH, using = liveTvLindaVoicePlay)
    public WebElement lindaVoicePlay;
    @FindBy(how = How.XPATH, using = liveTvLindaVoiceText)
    public WebElement lindaVoiceText;

    @FindBy(how = How.XPATH, using = userAccountButton)
    public WebElement userAccount;
    @FindBy(how = How.XPATH, using = userSignUp)
    public WebElement signUp;
    @FindBy(how = How.XPATH, using = userEmailAddress)
    public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = userPassword)
    public WebElement password;
    @FindBy(how = How.XPATH, using = userZipCode)
    public WebElement zipCode;
    @FindBy(how = How.XPATH, using = userRegisterButton)
    public WebElement register;
    @FindBy(how = How.XPATH, using = validateUserAccountText)
    public WebElement accountText;

    @FindBy(how = How.XPATH, using = validateNegativeText)
    public WebElement negativeText;

    @FindBy(how = How.XPATH, using = logInBoxField)
    public WebElement logInBtn;
    @FindBy(how = How.XPATH, using = logInEmailField)
    public WebElement logInEmail;
    @FindBy(how = How.XPATH, using = logInPasswordField)
    public WebElement logInPassword;
    @FindBy(how = How.XPATH, using = logInButton)
    public WebElement logInBox;
    @FindBy(how = How.XPATH, using = logHeaderText)
    public WebElement headerText;
    @FindBy(how = How.XPATH, using = logInPositiveText)
    public WebElement positiveText;


    /**
     * Burger botton test
     */
    public void burgerButtonCheck() {
        burgarButton.click();
    }

    public void typeInSearchBox() {
        search.sendKeys("sprots");
    }

    public void searchArrowButton() {
        arrowButton.submit();
    }

    public void politicsRadioButton() throws InterruptedException {
        radioButton.click();
        Thread.sleep(3000);
    }

    public void validateSearchText() {
        String expectedResult = "";
        String actualResult = politicsText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Travel Tab
     */
    public void travelTabCheck() throws InterruptedException {
        travelTab.click();
        Thread.sleep(3000);
    }

    public void bestBeachTab() throws InterruptedException {
        bestBeach.click();
        Thread.sleep(3000);
    }

    public void mapTab() {
        mapTab.click();
    }

    public void clickMapRadioButton() {
        beachRadioButton.click();
    }

    public void validateTravelTabCheck() {
        String expectedResult = "View All";
        String actualResult = viewAll.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Edition dropdown button
     */
    public void dropDownEditionButton() {
        edition.click();
    }

    public void internationalButton() {
        international.click();
    }

    public void covid19AllStories() {
        allStories.click();
    }

    public void covidSymptoms() {
        covidSymptom.click();
    }

    public void validateDropDownEditionButton() {
        String actualResult = "By Sandee LaMotte, CNN";
        String expectedResult = cnnText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Live Tv
     */
    public void liveTvButton() throws InterruptedException {
        liveTv.click();
        Thread.sleep(5000);
    }

    public void liveTvPlayButton() throws InterruptedException {
        tvPlayButton.click();
        Thread.sleep(5000);
    }

    public void liveTvBackHome() throws InterruptedException {
        backHome.click();
    }

    public void validateLiveTvButtonCheck() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "Covid-19";
        String actualResult = homeText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Tv Channel Box
     */
    public void tvChannelBoxCheck() throws InterruptedException {
        tvChannelButton.click();
        Thread.sleep(3000);
    }

    public void clickTvChannelBox() throws InterruptedException {
        tvChannelCnn.click();
        Thread.sleep(3000);
    }

    public void validateTvChannelBoxCheck() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "Login";
        String actualResult = loginText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Close Tv Channel Box
     */
    public void channelCloseOption() throws InterruptedException {
        channelClose.click();
        Thread.sleep(5000);
    }

    public void validateChannelCloseOption() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "News Shows";
        String actualResult = closeText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Tv channel linda voice check
     */
    public void lindaVoiceCheck() throws InterruptedException {
        Thread.sleep(3000);
        lindaVoice.click();
        Thread.sleep(3000);
    }

    public void lindaVideoPlay() throws InterruptedException {
        lindaVoicePlay.click();
        Thread.sleep(7000);
    }

    public void validateLindaVoiceCheck() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "US";
        String actualResult = lindaVoiceText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * User Account positive test
     */
    public void userAccountCheck() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        signUp.click();
        Thread.sleep(2000);
    }

    public void userCredentialEmail(String email) {
        emailAddress.sendKeys(email);
    }

    public void userCredentialPassword(String Password) {
        password.sendKeys(Password);
    }

    public void userCredentialZipCode(String zipcode) throws InterruptedException {
        zipCode.sendKeys(zipcode);
//        register.click();
        Thread.sleep(7000);
    }

    //    Validation
    public void validateUserAccountCheck() {
        String actualResult = "";
        String expectedResult = accountText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * User Account negative test
     */
    public void userCredentialRegisterBox() throws InterruptedException {
        register.click();
        Thread.sleep(7000);
    }

    public void validateUserAccountNegativeTest(String string) {
        String actualResult = string;
        String expectedResult = negativeText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Log in positive Test
     */
    public void logInPositiveCheck() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        logInBtn.click();
    }

    public void logInEmail(String email) {
        logInEmail.sendKeys(email);
    }

    public void logInPassword(String password) {
        logInPassword.sendKeys(password);
    }

    public void validateLogInPositiveCheck(String string) {
        String actualResult = string;
        String expectedResult = positiveText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Log in negative test
     */
    public void logInBoxClick() {
        logInBox.click();
    }

    public void validateLogInNegativeCheck(String string) {
        String actualResult = string;
        String expectedResult = headerText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
