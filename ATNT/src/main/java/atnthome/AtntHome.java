package atnthome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static atnthome.AtntHomePageWebElement.*;

public class AtntHome extends WebAPI {

    @FindBy(how = How.XPATH, using = homePageSearchBox)
    public WebElement searchBox;
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
    @FindBy(how = How.XPATH, using = homePageInternetText)
    public WebElement internetText;
    @FindBy(how = How.XPATH, using = homePageTVTabButton)
    public WebElement tvButton;
    @FindBy(how = How.XPATH, using = homePageTVShopNowBox)
    public WebElement shopNow;
    @FindBy(how = How.XPATH, using = homepageTVButtonText)
    public WebElement tvText;
//    @FindBy(how = How.XPATH, using = homePageInternetText)
//    public WebElement internetText;
//    @FindBy(how = How.XPATH, using = homePageInternetText)
//    public WebElement internetText;


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


}
