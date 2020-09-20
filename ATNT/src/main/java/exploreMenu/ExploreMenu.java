package exploreMenu;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static exploreMenu.ExploreMenuWebElement.*;


public class ExploreMenu extends WebAPI {
    @FindBy(how = How.XPATH, using = ExploreMenuClassNameWebElement)
    public WebElement ExploreMenu;
    @FindBy(how = How.XPATH, using = atntLogoXPathWebElement)
    public WebElement atntLogo;
    @FindBy(how = How.XPATH, using = tardeInImageXPathWebElement)
    public WebElement tradeInImage;
    @FindBy(how = How.XPATH, using = signInHeaderTextXPathWebElement)
    public WebElement signInHeaderText;
    @FindBy(how = How.XPATH, using = bringYourDeviceXPathTextWebElement)
    public WebElement bringYourDeviceText;
    @FindBy(how = How.XPATH, using = ATNTPrepaidTextXPathWebElement)
    public WebElement ATNTPrepaidText;
    @FindBy(how = How.XPATH, using = bundlesTextXPathWebElement)
    public WebElement bundlesText;
    @FindBy(how = How.XPATH, using = internationalPackagesTextXPathWebElement)
    public WebElement internationalPackagesText;

//action method
    public void exploreWireless() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(ExploreWirelessXPathWebElement);
    }
//validate method
    public void validateExploreWireless(){
        String actualTitle=driver.getTitle();
        String expectedTitle="AT&T Wireless – Latest Phones & Best Wireless Plans";
        Assert.assertEquals(actualTitle,expectedTitle);
    }



//action method
    public void exploreWirelessPhonesAndDevices() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(phonesAndDevicesXPathWebElement);
    }

//validate method
    public void validateExploreWirelessPhonesAndDevices(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Phones, Cell Phones, & Smartphones from AT&T";
        Assert.assertEquals(actualTitle,expectedTitle);
    }


//action method
    public void exploreWirelessPlanesAndPrices() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(planesAndPricesXPathWebElement);
    }

//validate method
    public void validateExploreWirelessPlanesAndPrices(){
        String actualTitle=driver.getTitle();
        String expectedTitle="AT&T Wireless Plans - Explore Our Best Cell Phone Plans";
        Assert.assertEquals(actualTitle,expectedTitle);
    }


    //action method
    public void exploreWirelessPlanDiscounts() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(planDiscountsXPathWebElement);
    }

//validate method
    public void validateExploreWirelessPlanDiscounts(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Discounts for First Responders, Teachers, Healthcare - AT&T";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

//action method
    public void exploreWirelessInternationalOption() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(internationalOptionXPathWebElement);
    }

//validate method
    public void validateExploreWirelessInternationalOption(){
        String actualTitle=driver.getTitle();
        String expectedTitle="International Calling and Data Plans - AT&T";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

//action method
    public void exploreWirelessFiveGX() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(fiveGXPathWebElement);
    }

//validate method
    public void validateExploreWirelessFiveG(){
        String actualTitle=driver.getTitle();
        String expectedTitle="5G & You - The AT&T Story";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

//action method
    public void exploreWirelessUpgradeYourDevice() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(upgradeYourDeviceXPathWebElement);
    }

//validate method
    public void validateExploreWirelessUpgradeYourDevice(){
        boolean actualTitle=atntLogo.isDisplayed();
        boolean expectedTitle=true;
        Assert.assertEquals(actualTitle,expectedTitle);
    }

//action method
    public void exploreWirelessBringYourDevice() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(bringYourDeviceXPathWebElement);
    }

//validate method
    public void validateExploreWirelessBringYourDevice(){
        String actualText=bringYourDeviceText.getText();
        String expectedText="$250 REWARD CARD OFFER";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void exploreWirelessTradeInYourDevice() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(tradeInYourDeviceXPathTextWebElement);
    }

//validate method
    public void validateExploreWirelessTradeInYourDevice(){
        boolean actualText=tradeInImage.isDisplayed();
        boolean expectedText=true;
        Assert.assertEquals(actualText,expectedText);
    }

    //action method
    public void exploreWirelessAddADevice() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(ExploreMenuWirelessXPathWebElement);
        sleepFor(5);
        clickOnElement(addADeviceXPathTextWebElement);
    }

//validate method
    public void validateExploreWirelessAddADevice(){
        boolean actualText=signInHeaderText.isDisplayed();
        boolean expectedText=true;
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void explorePrepaid() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(prepaidXPathWebElement);
        sleepFor(5);
        clickOnElement(ATNTPrepaidXPathWebElement);
    }

//validate method
    public void validateExplorePrepaid() throws InterruptedException {
        sleepFor(5);
        String actualText=ATNTPrepaidText.getText();
        String expectedText="$25/mo. with AT&T PREPAIDSM";
        Assert.assertEquals(actualText,expectedText);
    }
//action method
    public void explorePrepaidMobilePlans() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(prepaidXPathWebElement);
        sleepFor(5);
        clickOnElement(mobilePlansXPathWebElement);
    }

//validate method
    public void validateExplorePrepaidMobilePlans() throws InterruptedException {
        sleepFor(5);
        String actualText=driver.getTitle();
        String expectedText="Prepaid Phone Plans, including Unlimited  I AT&T PREPAID";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void explorePrepaidPhones() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(prepaidXPathWebElement);
        sleepFor(5);
        clickOnElement(phonesXPathWebElement);
    }

//validate method
    public void validateExplorePrepaidPhones() throws InterruptedException {
        sleepFor(5);
        String actualText=driver.getTitle();
        String expectedText="Prepaid Phones, No Contract Phones | AT&T Prepaid";
        Assert.assertEquals(actualText,expectedText);
    }
//action method
    public void exploreTvAndEntertainment() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(tvAndEntertainmentXPathWebElement);
        sleepFor(5);
        clickOnElement(atntAndTVXPathWebElement);
    }

//validate method
    public void validateExploreTvAndEntertainment() throws InterruptedException {
        sleepFor(5);
        String actualText=driver.getTitle();
        String expectedText="AT&T TV - Live Streaming TV + Apps, Voice Controlled";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void exploreTvAndEntertainmentDirectTV() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(tvAndEntertainmentXPathWebElement);
        sleepFor(5);
        clickOnElement(directTVXPathWebElement);
    }

//validate method
    public void validateExploreTvAndEntertainmentDirectTV() throws InterruptedException {
        sleepFor(5);
        String actualText=driver.getTitle();
        String expectedText="DIRECTV Official Site - Great Deals on DIRECTV Packages";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void exploreTvAndEntertainmentUVerseTV() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(tvAndEntertainmentXPathWebElement);
        sleepFor(5);
        clickOnElement(uVerseTVXPathWebElement);
    }

//validate method
    public void validateExploreTvAndEntertainmentUVerseTV() throws InterruptedException {
        sleepFor(5);
        String actualText=driver.getTitle();
        String expectedText="AT&T U-verse Official Site";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void exploreTvAndEntertainmentBundles() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(tvAndEntertainmentXPathWebElement);
        sleepFor(5);
        clickOnElement(bundlesXPathWebElement);
    }

//validate method
    public void validateExploreTvAndEntertainmentBundles() throws InterruptedException {
        sleepFor(5);
        String actualText=bundlesText.getText();
        String expectedText="Our most entertaining bundle ever!";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void exploreTvAndEntertainmentInternationalPackages() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(tvAndEntertainmentXPathWebElement);
        sleepFor(5);
        clickOnElement(internationalPackagesXPathWebElement);
    }

//validate method
    public void validateExploreTvAndEntertainmentInternationalPackages() throws InterruptedException {
        sleepFor(5);
        String actualText=internationalPackagesText.getText();
        String expectedText="INTERNATIONAL TV";
        Assert.assertEquals(actualText,expectedText);
    }

//action method
    public void exploreTvAndEntertainmentTvAccessories() throws InterruptedException {
        ExploreMenu.click();
        sleepFor(5);
        clickOnElement(tvAndEntertainmentXPathWebElement);
        sleepFor(5);
        clickOnElement(tvAccessoriesXPathWebElement);
    }

//validate method
    public void validateExploreTvAndEntertainmentTvAccessories() throws InterruptedException {
        sleepFor(5);
        String actualText=driver.getTitle();
        String expectedText="TV Accessories - AT&T";
        Assert.assertEquals(actualText,expectedText);
    }










}
