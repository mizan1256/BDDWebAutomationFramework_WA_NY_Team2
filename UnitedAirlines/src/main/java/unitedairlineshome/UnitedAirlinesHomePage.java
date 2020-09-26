package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static unitedairlineshome.UnitedAirlinesHomePageWebElements.*;

public class UnitedAirlinesHomePage extends WebAPI {

    @FindBy(xpath = "//span[contains(text(),'Flight status')]")
    WebElement flightStatusBtn;
    @FindBy(xpath = "//input[@id='flightStatusOriginInput']")
    WebElement fromDateField;
    @FindBy(xpath = "//input[@id='flightStatusDestinationInput']")
    WebElement toDateField;
    @FindBy(xpath = "//input[@id='flightStatusModel.flightNumber']")
    WebElement flightNumberField;
    @FindBy(xpath = "//button[@id='datesDropdown']")
    WebElement dropDownBtn;
    @FindBy(xpath = "//div[contains(text(),'Sep 12, 2020')]")
    WebElement selectedDate;
    @FindBy(xpath = "//button[@type='submit'][@aria-label='Search']")
    WebElement searchBtn;
    @FindBy(xpath = "//span[contains(text(),'Flight Status -')]")
    WebElement flightStatusTxt;
    @FindBy(how = How.XPATH, using = checkInBtnWebElement)
    public WebElement checkInBtn;
    @FindBy(how = How.XPATH, using = confirmationNumFieldWebElement)
    public WebElement confirmationNumField;
    @FindBy(how = How.XPATH, using = checkInLastNameFieldWebElement)
    public WebElement checkInLastNameField;
    @FindBy(how = How.XPATH, using = searchBtnWebElement)
    public WebElement checkInSearchBtn;
    @FindBy(how = How.XPATH, using = checkInErrTxtWebElement)
    public WebElement checkInErrTxt;

    @FindBy(how = How.XPATH, using = bookButtonWebElement)
    public WebElement bookButton;
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement)
    public WebElement hotelsButton;
    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement)
    public WebElement whereToSearch;
    @FindBy(how = How.XPATH, using = bookHotelsValidateTxtWebElement)
    public WebElement bookHotelsValidateTxt;

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
    public WebElement  departDateOctober;
    @FindBy(how = How.XPATH, using = returnDateOctoberXpathWebElement)
    public WebElement returnDateOctober;
    @FindBy(how = How.XPATH, using = findFlightsButtonXpathWebElement)
    public WebElement findFlightsButton;


    /**
     * United Air Flight Status check functionality test
     */
    public void clickOnFlightStatusBtn() {
        flightStatusBtn.click();
    }

    public void enterCityName() {
        fromDateField.sendKeys("New York");
        toDateField.sendKeys("Dhaka");
//        fromDateField.sendKeys(fromCity);
//        toDateField.sendKeys(toCity);
    }

    public void enterFlightNumber() throws InterruptedException {
        flightNumberField.sendKeys("2345");
        dropDownBtn.click();
        selectedDate.click();
        Thread.sleep(5000);
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public void validateFlightStatus() {
        String expectedResult = "Flight Status -";
        String actualResult = flightStatusTxt.getText();
        Assert.assertEquals("Text do not match", expectedResult, actualResult);
    }

    /**
     * United air check  in test
     * @throws InterruptedException
     */
    public void enterConfirmationAndLastName() throws InterruptedException {
        Thread.sleep(5000);
        typeOnElement(confirmationNumField, "B2JJWA");
        typeOnElement(checkInLastNameField, "John");
    }
    public void clickOnCheckInSearchBtn(){
        checkInSearchBtn.click();
    }
    public void validateCheckInTxt(){
        String expectedResult="We couldn't find a reservation with the provided information.";
        String actualResult=checkInErrTxt.getText();
        Assert.assertEquals("Text do not match", expectedResult,actualResult);
    }
    /**
     * United Airlines Book Button functionality test
     */
    public void clickOnBookBtn(){
        bookButton.click();
    }
    public void clickOnHotelsBtn(){
        hotelsButton.click();
    }
    public void enterSearchBoxAndSubmit(String searchItem) throws InterruptedException {
        driver.navigate().to("https://hotels.united.com/");
        sleepFor(3);
        whereToSearch.clear();
        whereToSearch.sendKeys(searchItem);
        whereToSearch.submit();
    }
    public void validateLandedPageTxt() throws InterruptedException {
        String expectedResult="Las Vegas, Nevada, United States of America";
        String actualResult=bookHotelsValidateTxt.getText();
        Assert.assertEquals("Text do not match", expectedResult,actualResult);

    }
    //static String siteSearchText="Site search Results";

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
        bookFlightRoundTripFrom.clear();
        bookFlightRoundTripFrom.sendKeys("NewYork");
    }
    public void enterFromLocationToSearchFlight(String locationFrom) {
        bookFlightRoundTripFrom.clear();
        bookFlightRoundTripFrom.sendKeys(locationFrom);


    }

    public void enterToLocationToSearchFlight() {
        bookFlightRoundTripTo.clear();
        bookFlightRoundTripTo.sendKeys("paris");

    }
    public void enterToLocationToSearchFlight(String locationTo) throws InterruptedException {
        bookFlightRoundTripTo.clear();
        sleepFor(5);
        bookFlightRoundTripTo.sendKeys(locationTo);
        bookFlightRoundTripTo.submit();

    }

    public void enterDepartDateToSearchFlight() throws InterruptedException {
        sleepFor(3);
        bookFlightRoundTripTo.clear();
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
