package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
    public void validateFlightStatus(){
        String expectedResult="Flight Status -";
        String actualResult=flightStatusTxt.getText();
        Assert.assertEquals("Text do not match", expectedResult,actualResult);
    }

}
