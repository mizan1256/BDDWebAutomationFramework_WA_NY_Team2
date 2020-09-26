package atnthome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static atnthome.AtntWebElements.*;


public class AtntHome extends WebAPI {

    @FindBy(how = How.XPATH, using = homePageSearchBox) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homePageSearchButton) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = homePageSearchText) public WebElement searchText;
    @FindBy(how = How.XPATH, using = homePageDealsTabButton) public WebElement dealsTabButton;
    @FindBy(how = How.XPATH, using = homePageDealsButtonText) public WebElement dealsButtonText;
    @FindBy(how = How.XPATH, using = homePageWirelessTabButton) public WebElement wirelessButton;
    @FindBy(how = How.XPATH, using = homePageWirelessText) public WebElement wirelessText;
    @FindBy(how = How.XPATH, using = homePageInternetButton) public WebElement internetButton;
    @FindBy(how = How.XPATH, using = homePageInternetText) public WebElement internetText;
    @FindBy(how = How.XPATH, using = homePageTVTabButton) public WebElement tvButton;
    @FindBy(how = How.XPATH, using = homePageTVShopNowBox) public WebElement shopNow;
    @FindBy(how = How.XPATH, using = homepageTVButtonText) public WebElement tvText;
//    @FindBy(how = How.XPATH, using = homePageInternetText)
//    public WebElement internetText;
//    @FindBy(how = How.XPATH, using = homePageInternetText)
//    public WebElement internetText;
@FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]") WebElement samsung;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]") WebElement appleWatch;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]") WebElement appleIPad;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]") WebElement iPhonePro;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]") WebElement samsungTablet;
    // Table
    @FindBy(how = How.XPATH, using = homePagePrepaidValidateText) public WebElement validateText;

    @FindBy(how = How.XPATH, using = searchBoxWebElement) public WebElement searchBox1;
    @FindBy(how = How.XPATH, using = searchBtnWebElement) public WebElement searchBtn;
    @FindBy(how = How.XPATH, using = searchBoxTextWebElement) public WebElement searchText1;
    /**
     * Deals Button
     */

    public void dealsTabButton() {
        dealsTabButton.click();
    }

    public void validateDealTabButton(String expectedResult) {
        String actualResult = dealsButtonText.getText();
        Assert.assertEquals("Do not match", expectedResult, actualResult);
    }

    public void validateDealGetTitle() {
        String expectedTitle = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    public void wirelessButtonCheck() {
        wirelessButton.click();
    }

    public void validateWirelessTabButton(String expectedResult) {
        String actualResult = wirelessText.getText();
        Assert.assertEquals("Do not match", expectedResult, actualResult);
    }

    public void validateWirelessGetTitle() {
        String expectedTitle = "AT&T Wireless – Latest Phones & Best Wireless Plans";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    public void internetButtonCheck() {
        internetButton.click();
    }

    public void validateInternetTabButton(String expectedResult) {
        String actualResult = internetText.getText();
        Assert.assertEquals("Do not match", expectedResult, actualResult);
    }

    public void validateInternetGetTitle() {
        String expectedTitle = "AT&T Internet Plans - Home Internet - AT&T® Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    public void TVTabButtonCheck() {
        tvButton.click();
    }

    public void TVShopNowButton() {
        shopNow.click();
    }

    public void validateTVTabButton(String expectedResult) {
        String actualResult = tvText.getText();
        Assert.assertEquals("Do not match", expectedResult, actualResult);
    }

    public void validateTVGetTitle() {
        String expectedTitle = "Shop AT&T Bundles";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    // Prepaid Tab Button
    By prepaid = By.xpath(homePagePrepaidTabButton);
    //    By mobilePlan = By.xpath(homePagePrepaidMobilePlans);
    @FindBy(how = How.XPATH, using = homePagePrepaidText)
    public WebElement prepaidText;

    public void PrepaidTabBtnCheck() {
        clickOnElement(homePagePrepaidTabButton);
    }

    public void MobilePlanBtn() {
        clickOnElement(homePagePrepaidMobilePlans);
    }

    public void validatePrepaidBtn(String expectedResult) {
        String actualResult = prepaidText.getText();
        Assert.assertEquals("Do not match", expectedResult, actualResult);
    }

    public void validatePrepaidGetTitle() {
        String expectedTitle = "Prepaid Phone Plans, including Unlimited  I AT&T PREPAID";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    public void tableSearchItems(String productName) {
        searchBox.sendKeys(productName);
    }

    public void validateSearchProductTitle(String validateTitle){
        String expectedTitle= validateTitle;
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    public void validateSearchTxt(String actualText) {
        String expectedResult= actualText;
        System.out.println(expectedResult);
        Assert.assertTrue(expectedResult.contains(actualText));
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

    public void searchBoxCheck(){
        typeOnElement(searchBoxWebElement,"Apple iPhone 11");
    }
    public void searchBtnCheck(){
        searchBtn.click();
    }

    public void validateSearchBoxTxt(String expectedResult){
        String actualResult=searchText.getText();
        Assert.assertEquals("Search Item not match",actualResult,expectedResult);

    }
    //validate method
    public void validateSearchBoxPageTitle(){
        String actualTitle=driver.getTitle();
        //  String actualTitle="Results for Apple iPhone 11 - AT&T Search";
        String expectedTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle,expectedTitle);
    }
    public void setSearchBoxCheckWithParameter(String searchItem){
        searchBox1.sendKeys(searchItem);
    }
    public void validateSearchBoxTxt1(String verifyProduct){
        String expectedResult1="Showing results for "+verifyProduct+".";
        String actualResult=searchText1.getText();
        Assert.assertEquals("Search Item not match",actualResult,expectedResult1);

    }
    public void validateSearchBoxTxtWithMultipleParameter(String expectedResult){
        String actualResult=searchText1.getText();
        Assert.assertEquals("Search Item not match",actualResult,expectedResult);

    }

}
