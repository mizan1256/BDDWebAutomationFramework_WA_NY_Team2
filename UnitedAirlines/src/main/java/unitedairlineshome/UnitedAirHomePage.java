package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirlinesHomeWebElement.*;

public class UnitedAirHomePage extends WebAPI {
    @FindBy(xpath = "//*[@id=\"statusTab\"]/h2/span") WebElement flightStatus;
    @FindBy(xpath = "//input[@id='flightStatusOriginInput']") WebElement fromField;
    @FindBy(xpath = "//input[@id='flightStatusDestinationInput']") WebElement toField;
    @FindBy(xpath = "//input[@id='flightStatusModel.flightNumber']") WebElement flightNumber;
    @FindBy(xpath = "//button[@id='datesDropdown']") WebElement dropDownBtn;
    //    @FindBy(xpath = "//div[contains(text(),'Sep 11, 2020')]") WebElement selectDate;
    @FindBy(xpath = "//div[contains(text(),'Sep 12, 2020')]") WebElement selectedDate;
    @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/button/span") WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"departureLabel\"]/span") WebElement validateText;
    @FindBy(xpath = "//div[contains(text(),'Check-in')]") WebElement checkIn;
    @FindBy(xpath = "//input[@id='flightCheckInConfNumber']") WebElement ticketNumber;
    @FindBy(xpath = "//input[@id='flightCheckInLastName']") WebElement lastName;//
    @FindBy(xpath = "//button[@id='formSubmitBtn']") WebElement searchBtn; //
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/main/div[1]/div/div/div/span") WebElement checkInText;
    @FindBy(xpath = "//div[contains(text(),'My trips')]") WebElement myTrips;
    @FindBy(xpath = "//*[@id=\"myTripsConfirmationNumber\"]") WebElement myTripConfirmation;
    @FindBy(xpath = "//*[@id=\"myTripsLastName\"]") WebElement myTripLastName;
    @FindBy(xpath = "//*[@id=\"myTripsSubmitBtn\"]") WebElement myTripSearchBox;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/main/div/div[2]/div/div/div/div/p") WebElement myTripValidate;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[4]/header/div/div/div[2]/nav/ul/li[3]/a/span") WebElement searchIcon;
    @FindBy(xpath = "//div[contains(text(),'Coronavirus (COVID-19) updates')]") WebElement coronavirusUpdateClick;
    @FindBy(xpath = "//a[contains(text(),'request a refund')]") WebElement requestRefundClick;
    @FindBy(xpath = "//h1[contains(text(),'Refund policies')]") WebElement searchBtnText;
    @FindBy(xpath = "//div[contains(text(),'Visit My Trips, select the flight, and choose \"Vie')]") WebElement flightReceipt;
    @FindBy(xpath = "//*[@id=\"radiofield-item-id-search-receipt-by-0\"]") WebElement radioBtn;
    @FindBy(xpath = "//*[@id=\"LzgSY0S7xD\"]") WebElement travelerFistName;
    @FindBy(xpath = "//*[@id=\"71CwUpUPAm\"]") WebElement travelerLastName;
    @FindBy(xpath = "//*[@id=\"LS4AOK13Jh\"]") WebElement cardNumber;
    @FindBy(xpath = "//span[@class='atm-c-btn__text']") WebElement travelerSearchBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/main/div/section[1]/div/div/div[1]") WebElement validateTravelerText;

    @FindBy(how = How.XPATH, using = bookButtonWebElement) public WebElement bookButton;
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement) public WebElement hotelsButton;
    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement) public WebElement whereToSearch1;
    @FindBy(how = How.XPATH, using = bookHotelsValidationText) public WebElement bookHotelsText;


    public void flightStatusTab() {
        flightStatus.click();
    }

    public void fromAndToField() throws InterruptedException {
        fromField.sendKeys("New York");
        toField.sendKeys("Dhaka");
        sleepFor(3);
    }

    public void flightNumberAndDateField() {
        flightNumber.sendKeys("2797");
        dropDownBtn.click();
        selectedDate.click();

//        Select select=new Select(dateDropDownBtn);
//        select.deselectByVisibleText("Sep 13,2020");
    }

    public void searchBtnCheck() {
        searchButton.click();
    }

    public void validateFlightStatus() {
        String actualResult = "DEPARTURE";
        String expectedResult = validateText.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    public void checkInTab() {
        checkIn.click();
    }

    public void ticketNumberField() {
        ticketNumber.sendKeys("37474747474");
    }

    public void lastNameField() {
        lastName.sendKeys("Zakerin");
    }

    public void searchButtonClick() {
        searchBtn.submit();
    }

    public void validateCheckInfield() {
        String actualResult = "We couldn't find a reservation with the provided information.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // My Trip
    public void myTripTab() {
        myTrips.click();
    }

    public void confirmationNumberField() {
        myTripConfirmation.sendKeys("B2JUWE");
    }

    public void myTripLastNameField() {
        myTripLastName.sendKeys("Zakerin");
    }

    public void myTripSearchButtonClick() {
        myTripSearchBox.submit();
    }

    public void validateMyTripfield() {
        String actualResult = "Your confirmation number, a 6 character alphanumeric code, and/or last name is not valid.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    //    SearchIcon
    public void searchIconCheck(){
        searchIcon.click();
    }

    public void coronavirusUpdate() throws InterruptedException {
        coronavirusUpdateClick.click();
        sleepFor(2);
    }

    public void requestRefundClick() throws InterruptedException {
        requestRefundClick.click();
        sleepFor(2);
    }

    public void validateSearchIcon(){
        String actualResult = "Refund policies";
        String expectedResult = searchBtnText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    // Flight Receipt
    public void flightReceiptCheck() throws InterruptedException {
        flightReceipt.click();
        sleepFor(7);
        radioBtn.click();
    }

//    public void enterFirstName(){
//        travelerFistName.sendKeys("Selim");
//    }

    public void enterLastName(){
        travelerLastName.sendKeys("Zakerin");
    }

    public void enterCardNumber(){
        cardNumber.sendKeys("1234");
    }

    public void searchButtonCheck(){
        travelerSearchBtn.click();
    }

    public void validateFlightReceipt(){
        String actualResult = "We couldn't find your receipt";
        String expectedResult = validateTravelerText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     *  Book button Check
     */

    public void clickOnBookButton() throws InterruptedException {
        bookButton.click();
    }
    public void clickOnHotelButton() throws InterruptedException {
        hotelsButton.click();
    }
    public void textOnWhereToSearchBox(String searchItem) throws InterruptedException {
        driver.navigate().to("https://hotels.united.com/");
        whereToSearch1.sendKeys(searchItem);
        whereToSearch1.submit();
        Thread.sleep(3000);
    }
    public  void validateLandedPageText() throws InterruptedException {
        String expectedText="Miami Beach, Florida, United States of America";
        String actualText=bookHotelsText.getText();
        Assert.assertEquals("Text does not match",expectedText,actualText);
        Thread.sleep(3000);
    }
}
