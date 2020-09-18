package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static unitedairlineshome.UnitedAirlinesHopeWebElement.*;

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
    public WebElement searchButton;
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
        typeOnElementWithWebElement(confirmationNumField, "B2JJWA");
        typeOnElementWithWebElement(checkInLastNameField, "John");
    }
    public void clickOnCheckInSearchBtn(){
        searchButton.click();
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

}
