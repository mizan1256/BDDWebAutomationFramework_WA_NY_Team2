package cnnhome;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnWebElements.*;


public class CnnHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementsAccountIcon) public WebElement AccountIcon;

    @FindBy(how = How.XPATH, using = webElementsValidateCnnUsText) public WebElement CnnUsText;

    @FindBy(how = How.XPATH, using = webElementCnnSearchIcon)public WebElement cnnSearchIcon;
    @FindBy(how = How.XPATH, using = webElementCnnSearchBox)public WebElement cnnSearchBox;
    @FindBy(how = How.XPATH, using = editionIconWebElement)public WebElement editionIcon;
    @FindBy(how = How.XPATH, using = usBtnWebElement)public WebElement usBtn;
    @FindBy(how = How.XPATH, using = internationalBtnWebElement)public WebElement internationalBtn;
    @FindBy(how = How.XPATH, using = spanishBtnWebElement)public WebElement spanishBtn;


    @FindBy(how = How.XPATH, using = openBurgarButton) public WebElement burgarButton;
    @FindBy(how = How.XPATH, using = searchBox) public WebElement search;
    @FindBy(how = How.XPATH, using = searchArrowButton) public WebElement arrowButton;
    @FindBy(how = How.XPATH, using = politicsRadioButton) public WebElement radioButton;
    @FindBy(how = How.XPATH, using = politicsTextDisplayed) public WebElement politicsText;

    @FindBy(how = How.XPATH, using = homeTravelTab) public WebElement travelTab;
    @FindBy(how = How.XPATH, using = homeGoToBestBeach) public WebElement bestBeach;
    @FindBy(xpath = "//a[@class='desk ln_map']") WebElement mapTab;
    @FindBy(xpath = "//div[38]") WebElement beachRadioButton;
    @FindBy(xpath = "//span[@class='sel']") WebElement viewAll;

    @FindBy(how = How.XPATH, using = dropDownEdition) public WebElement edition;
    @FindBy(how = How.XPATH, using = dropDownInternational) public WebElement international;
    @FindBy(xpath = "//span[contains(text(),'All stories')]") WebElement allStories;
    @FindBy(xpath = "//span[contains(text(),'Covid-19 symptoms')]")WebElement covidSymptom;
    @FindBy(xpath = "//span[@class='metadata__byline__author']") WebElement cnnText;

    @FindBy(how = How.XPATH,using = liveTvTabButton) public WebElement liveTv;
    @FindBy(how = How.XPATH, using = liveTvChannelButton) public WebElement tvChannelButton;
    @FindBy(how = How.XPATH, using = liveTvBackHome) public WebElement backHome;
    @FindBy(how = How.CLASS_NAME, using = liveTvPlayButton) public WebElement tvPlayButton;
    @FindBy(how = How.XPATH, using = homePageText) public WebElement homeText;

    @FindBy(how = How.XPATH, using = liveTvChannelCnn) public WebElement tvChannelCnn;
    @FindBy(how = How.XPATH, using = liveTvLoginText) public WebElement loginText;

    @FindBy(how = How.XPATH, using = liveTvChannelClose) public WebElement channelClose;
    @FindBy(how = How.XPATH, using = liveTvCloseText) public WebElement closeText;

    @FindBy(how = How.XPATH, using = liveTvLindaVoice) public WebElement lindaVoice;
    @FindBy(how = How.XPATH, using = liveTvLindaVoicePlay) public WebElement lindaVoicePlay;
    @FindBy(how = How.XPATH, using = liveTvLindaVoiceText) public WebElement lindaVoiceText;

    @FindBy(how = How.XPATH, using = userAccountButton) public WebElement userAccount;
    @FindBy(how = How.XPATH, using = userSignUp) public WebElement signUp;
    @FindBy(how = How.XPATH, using = userEmailAddress) public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = userPassword) public WebElement password;
    @FindBy(how = How.XPATH, using = userZipCode) public WebElement zipCode;
    @FindBy(how = How.XPATH, using = userRegisterButton) public WebElement register;
    @FindBy(how = How.XPATH, using = validateUserAccountText) public WebElement accountText;

    @FindBy(how = How.XPATH, using = validateNegativeText) public WebElement negativeText;

    @FindBy(how = How.XPATH, using = logInBoxField) public WebElement logInBtn;
    @FindBy(how = How.XPATH, using = logInEmailField) public WebElement logInEmail;
    @FindBy(how = How.XPATH, using = logInPasswordField) public WebElement logInPassword;
    @FindBy(how = How.XPATH, using = logInButton) public WebElement logInBox;
    @FindBy(how = How.XPATH, using = logHeaderText) public WebElement headerText;
    @FindBy(how = How.XPATH, using = logInPositiveText) public WebElement positiveText;


    @FindBy(how = How.XPATH, using = webElementLogInIcon) public WebElement cnnLogInIcon;
    @FindBy(how = How.XPATH, using = webElementSignUp) public WebElement cnnSignUpButton;
    @FindBy(how = How.XPATH, using = webElementSignUpEmail) public WebElement cnnSignUpEmail;
    @FindBy(how = How.XPATH, using = webElementSignUpPassword) public WebElement cnnSignUpPassword;
    @FindBy(how = How.XPATH, using = webElementSignUpZipcode) public WebElement cnnSignUpZipCode;
    @FindBy(how = How.XPATH, using = webElementRegistButton) public WebElement cnnRegistrationButton;
    @FindBy(how = How.XPATH, using = webElementLogInEmail) public WebElement cnnLogInEmail;
    @FindBy(how = How.XPATH, using = webElementLogInPassword) public WebElement cnnLogInPassword;
    @FindBy(how = How.XPATH, using = webElementLogInButton) public WebElement cnnLogInButton;
    @FindBy(how = How.XPATH, using = registrationMsgWebElement) public WebElement registrationMsg;


    public void cnnAccountIcon(){
    AccountIcon.click();
}
public void enterEmail(){
    typeOnElement(webElementsEmail, "arman.hossain496@gmail.com");
}
public void enterPassword(){
    typeOnElement(webElementsPassword, "Cnn1234!");
}
public void clickSignIn(){
    clickOnElement(webElementsLogIn);
}


public void cnnUsClick(){
    clickOnElement(webElementsCnnUS);
}
public void ValidateCnnUsText(String expectedResult){
    String actualResult = CnnUsText.getText();
    Assert.assertEquals(actualResult,expectedResult,"Didn't pass");
}


     // Cnn SearchBox functionality check
    public void cnnSearchBoxCheck(String searchItem) throws InterruptedException {
        cnnSearchIcon.click();
        cnnSearchBox.clear();
        cnnSearchBox.sendKeys(searchItem);
        cnnSearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    public void validateCNNSearchBoxTypeAble(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com",driver.getTitle());
    }

//     Cnn search box check
    public void validateDataTablePageTitle(String actualTitle){
        System.out.println(driver.getTitle());
        Assert.assertEquals(actualTitle,driver.getTitle());
    }
    //Cnn edition button check
    public void clickOnEditionBtn() throws InterruptedException {
        sleepFor(6);
        editionIcon.click();
        sleepFor(2);
    }
    public void selectFromEditionDropDown() throws InterruptedException {
        usBtn.click();
        sleepFor(6);
        editionIcon.click();
        sleepFor(2);
        internationalBtn.click();
        sleepFor(6);
        editionIcon.click();
        sleepFor(2);
        spanishBtn.click();
    }
    public void validateEditionBtn(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNN en Español | Últimas noticias en español de Latinoamérica, Estados Unidos y el mundo",driver.getTitle());
    }

//      Burger botton test
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
    public void validateSearchText(){
        String expectedResult="";
        String actualResult=politicsText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//     Travel Tab
    public void travelTabCheck() throws InterruptedException {
        travelTab.click();
        Thread.sleep(3000);
    }
    public void bestBeachTab() throws InterruptedException {
        bestBeach.click();
        Thread.sleep(3000);
    }
    public void mapTab(){
        mapTab.click();
    }
    public void clickMapRadioButton(){
        beachRadioButton.click();
    }
    public void validateTravelTabCheck(){
        String expectedResult="View All";
        String actualResult=viewAll.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


//      Edition dropdown button
    public void dropDownEditionButton() {
        edition.click();
    }
    public void internationalButton(){
        international.click();
    }
    public void covid19AllStories(){
        allStories.click();
    }
    public void covidSymptoms(){
        covidSymptom.click();
    }
    public void validateDropDownEditionButton(){
        String actualResult = "By Sandee LaMotte, CNN";
        String expectedResult = cnnText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Live Tv
    public void liveTvButton() throws InterruptedException {
        liveTv.click();
        Thread.sleep(4000);
    }
    public void liveTvPlayButton() throws InterruptedException {
        tvPlayButton.click();
        Thread.sleep(4000);
    }
    public void liveTvBackHome() throws InterruptedException {
        backHome.click();
    }
    public void validateLiveTvButtonCheck() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult="Covid-19";
        String actualResult=homeText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Tv Channel Box
    public void tvChannelBoxCheck() throws InterruptedException {
        tvChannelButton.click();
        Thread.sleep(4000);
    }
    public void clickTvChannelBox() throws InterruptedException {
        tvChannelCnn.click();
        Thread.sleep(4000);
    }
    public void validateTvChannelBoxCheck() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult="Login";
        String actualResult=loginText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


//      Close Tv Channel Box
    public void channelCloseOption() throws InterruptedException {
        channelClose.click();
        Thread.sleep(4000);
    }
    public void validateChannelCloseOption() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult="News Shows";
        String actualResult=closeText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Tv channel linda voice check
    public void lindaVoiceCheck() throws InterruptedException {
        Thread.sleep(4000);
        lindaVoice.click();
        Thread.sleep(4000);
    }
    public void lindaVideoPlay() throws InterruptedException {
        lindaVoicePlay.click();
        Thread.sleep(8000);
    }
    public void validateLindaVoiceCheck() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult="US";
        String actualResult=lindaVoiceText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//       User Account positive test
    public void userAccountCheck() throws InterruptedException {
        Thread.sleep(6000);
        userAccount.click();
        signUp.click();
        Thread.sleep(3000);
    }
    public void userCredentialEmail(String email) {
        emailAddress.sendKeys(email);
    }
    public void userCredentialPassword(String Password) {
        password.sendKeys(Password);
    }
    public void userCredentialZipCode(String zipcode) throws InterruptedException {
        zipCode.sendKeys(zipcode);
        Thread.sleep(8000);
    }
    //    Validation
    public void validateUserAccountCheck(){
        String actualResult = "";
        String expectedResult = accountText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      User Account negative test
    public void userCredentialRegisterBox() throws InterruptedException {
        register.click();
        Thread.sleep(8000);
    }

    public void validateUserAccountNegativeTest(String string) {
        String actualResult = string;
        String expectedResult = negativeText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Log in positive Test
    public void logInPositiveCheck() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        logInBtn.click();
    }
    public void logInEmail(String email) {
        logInEmail.sendKeys(email);
    }
    public void logInPassword(String password){
        logInPassword.sendKeys(password);
    }

    public void validateLogInPositiveCheck(String string){
        String actualResult = string;
        String expectedResult = positiveText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//       Log in negative test
    public void logInBoxClick(){
        logInBox.click();
    }

    public void validateLogInNegativeCheck(String string){
        String actualResult = string;
        String expectedResult = headerText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }



    public void landOnSingUpPage() throws InterruptedException {
        sleepFor(6);
        cnnLogInIcon.click();
        Thread.sleep(3000);
        cnnSignUpButton.click();
    }

    public void enterUserEmail(String emailAddress) {
        cnnSignUpEmail.sendKeys(emailAddress);
    }

    public void enterUserPassword(String password) {
        cnnSignUpPassword.sendKeys(password);
    }

    public void enterUserZipcode(String zipcode) {
        cnnSignUpZipCode.sendKeys(zipcode);
    }

    public void clickOnRegistrationBtn() throws InterruptedException {
        cnnRegistrationButton.click();
        sleepFor(5);
    }

    public void validateRegistrationMessage(String actualText) {
        String expectedText=registrationMsg.getText();
        Assert.assertEquals("Text do not match", expectedText,actualText);
    }

    public void cnnAccountLogIn() throws InterruptedException {
        cnnLogInIcon.click();
        Thread.sleep(3000);
        cnnLogInEmail.sendKeys("arman.hossain496@gmail.com");
        cnnLogInPassword.sendKeys("Cnn1234!");
        cnnLogInButton.click();
    }

    public void validateCnnAccountLogIn() {
        Assert.assertEquals("CNN - Breaking News, Latest News and Videos", driver.getTitle());
    }

//      Cnn logIn functionality check
    public void clickOnSingInBtn() throws InterruptedException {
        sleepFor(6);
        cnnLogInIcon.click();
    }
    public void enterLogInInfo(String userEmail, String userPassword) throws InterruptedException {
        Thread.sleep(3000);
        cnnLogInEmail.sendKeys(userEmail);
        cnnLogInPassword.sendKeys(userPassword);
        cnnLogInButton.click();
    }
    public void validateSingInPageTitle(){
        String expectedTitle="CNN - Breaking News, Latest News and Videos";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle,actualTitle);

    }
}


