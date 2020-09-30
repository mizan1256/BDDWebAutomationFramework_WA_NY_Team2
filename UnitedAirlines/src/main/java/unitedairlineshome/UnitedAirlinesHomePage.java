package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirlinesHomeWebElement.*;

public class UnitedAirlinesHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = bookText)
    WebElement book;
    @FindBy(how = How.XPATH, using = hotelText)
    WebElement hotel;
    @FindBy(how = How.XPATH, using = whereToSearchBox)
    WebElement searchBox1;
    @FindBy(how = How.XPATH, using = expectedBookHotelResult)
    WebElement expectedResult;

    public void clickOnBook(){
        book.click();
    }
    public void clickOnHotel(){
        hotel.click();
        driver.navigate().to("https://hotels.united.com/");
    }
    public void enterTxtToSearchBox(String searchItem) throws InterruptedException {
        searchBox1.clear();
        searchBox1.sendKeys(searchItem);
        Thread.sleep(3000);
        searchBox1.submit();
        //Thread.sleep(3000);
        //driver.navigate().to("https://hotels.united.com/");

    }
    public void validateTxtToSearchBox() {
    String actualResult="Miami Beach, Florida, United States of America";
    String expecResult=expectedResult.getText();
        Assert.assertEquals("no match found",actualResult,expecResult);

    }
    @FindBy(how = How.XPATH, using = signInButtonXPathWebElement)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = loginLogoXpathWebElement)
    public WebElement loginLogo;
    @FindBy(how = How.XPATH, using = userNameXpathWebElement)
    public WebElement userName;
    @FindBy(how = How.XPATH, using = passwordXpathWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = errorTextXpathWebElement)
    public WebElement errorText;
    @FindBy(how = How.XPATH, using = signInVerifyXpathWebElement)
    public WebElement signInVerify;
    @FindBy(how = How.XPATH, using = searchLogoXpathWebElement)
    public WebElement searchLogo;
    @FindBy(how = How.XPATH, using = searchBoxXpathWebElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonXpathWebElement)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchTextXpathWebElement)
    public WebElement searchText;

    @FindBy(how = How.XPATH, using = bookFlightRoundTripFromXpathWebElement)
    public WebElement bookFlightRoundTripFrom;
    @FindBy(how = How.XPATH, using = bookFlightRoundTripToXpathWebElement)
    public WebElement bookFlightRoundTripTo;
    @FindBy(how = How.XPATH, using = bookFlightDepartXpathWebElement)
    public WebElement bookFlightDepart;
    @FindBy(how = How.XPATH, using = bookFlightReturnXpathWebElement)
    public WebElement bookFlightReturn;

    @FindBy(how = How.XPATH, using = departDateOctoberXpathWebElement)
    public WebElement departDateOctober;
    @FindBy(how = How.XPATH, using = returnDateOctoberXpathWebElement)
    public WebElement returnDateOctober;
    @FindBy(how = How.XPATH, using = findFlightsButtonXpathWebElement)
    public WebElement findFlightsButton;

    public void clickSignInOption() {
        loginLogo.click();
    }

    public void enterUserNameAndPassword(String usId, String pwd) {
        userName.sendKeys(usId);
        password.sendKeys(pwd);
    }

    public void clickLoginButton() {
        signInButton.click();
    }

    public void verifyText() {
        String actualText = errorText.getText();
        String expectedText = "Please enter a valid MileagePlus number.";
        Assert.assertEquals(expectedText, actualText);
    }

    public void verifyImage() {
        boolean actual = signInVerify.isDisplayed();
        Assert.assertEquals(true, actual);
    }

    public void clickSearchLogo() {
        searchLogo.click();
    }

    public void searchItemInSearchBox(String searchItem) {
        searchBox.sendKeys(searchItem);

    }

    public void clickSearch() {
        searchButton.click();
    }

    public void verifySearchText() throws InterruptedException {
        sleepFor(5);
        String actualText = searchText.getText();
        String expectedText = "Site search Results";
        Assert.assertEquals(expectedText, actualText);
    }

    public void enterFromLocationToSearchFlight() {

        clearField(bookFlightRoundTripFromXpathWebElement);
        bookFlightRoundTripFrom.sendKeys("NewYork");


    }
    public void enterFromLocationToSearchFlight(String locationFrom) {

        clearField(bookFlightRoundTripFromXpathWebElement);
        bookFlightRoundTripFrom.sendKeys(locationFrom);


    }

    public void enterToLocationToSearchFlight() {
        clearField(bookFlightRoundTripToXpathWebElement);

        bookFlightRoundTripTo.sendKeys("paris");

    }
    public void enterToLocationToSearchFlight(String locationTo) throws InterruptedException {
        clearField(bookFlightRoundTripToXpathWebElement);
        sleepFor(5);

        bookFlightRoundTripTo.sendKeys(locationTo);

    }

    public void enterDepartDateToSearchFlight() {
        clearField(bookFlightDepartXpathWebElement);
        departDateOctober.click();
    }


    public void enterReturnDateToSearchFlight() {
        clearField(bookFlightReturnXpathWebElement);
        returnDateOctober.click();
    }

    public void clickFindFlightsSearchFlight() {
        findFlightsButton.click();
    }
    public void validateSearchFlightTitle() {
        String expectedTitle=flightTile;
        String actualTitle=driver.getTitle();
    }


}
