package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UnitedAirHomePage extends WebAPI {

    @FindBy(xpath = "//*[@id=\"statusTab\"]/h2/span")
    WebElement flightStatus;
    @FindBy(xpath = "//input[@id='flightStatusOriginInput']")
    WebElement fromField;
    @FindBy(xpath = "//input[@id='flightStatusDestinationInput']")
    WebElement toField;
    @FindBy(xpath = "//input[@id='flightStatusModel.flightNumber']")
    WebElement flightNumber;
    //    @FindBy(xpath = "//*[@id=\"datesDropdown\"]/span")
//    WebElement dateDropDownBtn;
    @FindBy(xpath = "//button[@id='datesDropdown']")
    WebElement dropDownBtn;
    //    @FindBy(xpath = "//div[contains(text(),'Sep 11, 2020')]")
//    WebElement selectDate;
    @FindBy(xpath = "//div[contains(text(),'Sep 12, 2020')]")
    WebElement selectedDate;
    @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/button/span")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"departureLabel\"]/span")
    WebElement validateText;
    @FindBy(xpath = "//div[contains(text(),'Check-in')]")
    WebElement checkIn;
    @FindBy(xpath = "//input[@id='flightCheckInConfNumber']")
    WebElement ticketNumber;
    @FindBy(xpath = "//input[@id='flightCheckInLastName']")
    WebElement lastName;//
    @FindBy(xpath = "//button[@id='formSubmitBtn']")
    WebElement searchBtn; //
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/main/div[1]/div/div/div/span")
    WebElement checkInText;
    @FindBy(xpath = "//div[contains(text(),'My trips')]")
    WebElement myTrips;
    @FindBy(xpath = "//*[@id=\"myTripsConfirmationNumber\"]")
    WebElement myTripConfirmation;
    @FindBy(xpath = "//*[@id=\"myTripsLastName\"]")
    WebElement myTripLastName;
    @FindBy(xpath = "//*[@id=\"myTripsSubmitBtn\"]")
    WebElement myTripSearchBox;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/main/div/div[2]/div/div/div/div/p")
    WebElement myTripValidate;


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
        ticketNumber.sendKeys("01624136331031");
    }

    public void lastNameField() {
        lastName.sendKeys("Mujahid");
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
        myTripLastName.sendKeys("Mujahid");
    }

    public void myTripSearchButtonClick() {
        myTripSearchBox.submit();
    }

    public void validateMyTripfield() {
        String actualResult = "Your confirmation number, a 6 character alphanumeric code, and/or last name is not valid.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }


}
