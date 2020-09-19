package atnthome;

import common.WebAPI;
import org.junit.Assert;
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
