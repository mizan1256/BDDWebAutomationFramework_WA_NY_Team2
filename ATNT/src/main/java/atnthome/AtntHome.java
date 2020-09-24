package atnthome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static atnthome.AtntWebElement.*;
public class AtntHome extends WebAPI {
    public void accountIconButton(){
        clickOnElement(accountIconWebElement);
    }
    public void signInButtoon(){
        clickOnElement(signInWebElement);
    }
    public void createOneNowButton(){
        clickOnElement(createOneNowButtonWebElement);
    }

    public void dealsButton(){
        clickOnElement(dealsWebElement);
    }
    public void wirelessButtonButton(){
        clickOnElement(wirelessButtonWebElement);
    }
    @FindBy(how = How.XPATH, using = "//span[@class='z1-tier1-text'][contains(text(),'Prepaid')]")
    WebElement prepaid;
    @FindBy(how = How.XPATH, using = "//li[@id='HEADBAND01']//img[contains(@class,'_32CgZ')]")
    WebElement mobilePlans;
    @FindBy(how = How.XPATH, using = "//sup[contains(text(),'SM')]")
    WebElement smText;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Bundles')]")
    WebElement bundleButton;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'btn-arrow on-dark btn-large btn btn-primary-2 _2NV38')]")
    WebElement checkAvailabilityButton;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'CheckAvailability__pt10')]//div//span[contains(@class,'Label__hidden-spoken')][contains(text(),'Enter your address to see if we offer services in')]")
    WebElement yourAddressText;

    @FindBy(how = How.XPATH, using = webElementTVButton) public WebElement tvButton;
    @FindBy(how = How.XPATH, using = webElementSportsButton) public WebElement sportsButton;
    @FindBy(how = How.XPATH, using = webElementShopNowButton) public WebElement shopNowButton;
    @FindBy(how = How.XPATH, using = webElementInternetText) public WebElement internetText;

    @FindBy(how = How.XPATH, using = webElementSearchBox) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = webElementSearchIcon) public WebElement searchIcon;
    @FindBy(how = How.XPATH, using = webElementText) public WebElement showingResultText;
//    @FindBy(how = How.XPATH, using = homePageSearchBox)
//    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homePageSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = homePageSearchText)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = homePageDealsTabButton)
    public WebElement dealsTabButton;
    @FindBy(how = How.XPATH, using = homePageDealsButtonText)
    public WebElement dealsButtonText;
    @FindBy(how = How.XPATH, using = homePageWirelessTabButton)
    public WebElement wirelessButton;
    @FindBy(how = How.XPATH, using = homePageWirelessText)
    public WebElement wirelessText;
    @FindBy(how = How.XPATH, using = homePageInternetButton)
    public WebElement internetButton;
//    @FindBy(how = How.XPATH, using = homePageInternetText)
//    public WebElement internetText;
//    @FindBy(how = How.XPATH, using = homePageTVTabButton)
//    public WebElement tvButton;
    @FindBy(how = How.XPATH, using = homePageTVShopNowBox)
    public WebElement shopNow;
    @FindBy(how = How.XPATH, using = homepageTVButtonText)
    public WebElement tvText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]")
    WebElement samsung;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]")
    WebElement appleWatch;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]")
    WebElement appleIPad;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]")
    WebElement iPhonePro;
    @FindBy(how = How.XPATH, using = "//*[@id=\"testData\"]/div/section/div[1]/div/h1[1]")
    WebElement samsungTablet;
    // Table
    @FindBy(how = How.XPATH, using = homePagePrepaidValidateText)
    public WebElement validateText;

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

    public void enterSearchKeyWord(String searchItem) {
        searchBox.sendKeys(searchItem);
    }

    public void clickOnSearchButton() {
        searchBox.submit();
    }

    public void validateSearchText(String expectedResult) {
        String actualResult = searchText.getText();
        Assert.assertEquals("Search item not match", expectedResult, actualResult);
    }

    public void enterSearchKeyWord1(String searchItem) {
        searchBox.sendKeys(searchItem);
    }

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
    By prepaid1 = By.xpath(homePagePrepaidTabButton);
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
    /**
     * Atnt Search Box Check
     */
    public void searchBox(String searchItem){
        searchBox.clear();
        searchBox.sendKeys(searchItem);
    }
    public void searchIcon(){
        searchIcon.click();
    }
    public void validateSearchItemText(){
        String expectedText = "Showing results for \"Samsung Note10\".";
        String actualText = showingResultText.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    public void prepaidButtonCheck(){
        prepaid.click();
    }
    public void mobilePlansButtonCheck(){
        mobilePlans.click();
    }
    public void validatePrepaidButton(String expectedResult){
       String actualResult = smText.getText();
        Assert.assertEquals(expectedResult,actualResult); }
    public void validatePrepaidTitlePage(){
        String expectedTittle = "Prepaid Phone Plans, including Unlimited  I AT&T PREPAID";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTittle,actualTitle); }
    public void bundleButtonCheck(){
        bundleButton.click(); }
    public void checkAvailabilityButtonCheck(){
        checkAvailabilityButton.click();
    }
    public void validateBundleButton(String expectedResult){
        String actualResult = yourAddressText.getText();
        Assert.assertEquals(expectedResult,actualResult); }
    public void validateBundleTitleCheck(){
        String expectedTitle = "AT&T Bundles - Deals on TV & Internet - Check Availability";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle); }
    /**
     * TV Button Check
     */

    public void tvButtonCheck(){
        tvButton.click();
    }
    public void sportsButton(){
        sportsButton.click();
    }
    public void shopNowButton() throws InterruptedException {
        Thread.sleep(3000);
        shopNowButton.click();
        Thread.sleep(3000);
    }
    public void internetText(){
        String expectedResult = "Internet";
        String actualResult = internetText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


}
