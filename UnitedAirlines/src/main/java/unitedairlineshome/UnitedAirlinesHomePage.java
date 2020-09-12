package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    // @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/div[6]/div")
// WebElement dropDownBtn;
    @FindBy(xpath = "//div[contains(text(),'Sep 12, 2020')]")
    WebElement selectedDate;
    @FindBy(xpath = "//button[@type='submit'][@aria-label='Search']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@id='flightStatusLabel']")
    WebElement flightStatusText;

    public void clickOnFlightStatusBtn() {
        flightStatusBtn.click();
    }

    public void enterCityName() {
        fromDateField.sendKeys("New York");
        toDateField.sendKeys("Dhaka");
// fromDateField.sendKeys(fromCity);
// toDateField.sendKeys(toCity);
    }

    public void enterFlightNumber() throws InterruptedException {
        flightNumberField.sendKeys("2345");
        dropDownBtn.click();
        selectedDate.click();
        Thread.sleep(5000);
// Select select=new Select(dropDownBtn);
// select.selectByVisibleText("Sep 13, 2020");
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }
    public void validateText(){
        String expectedText=flightStatusText.getText();
        String actualText="Flight Status - UA2345";
        Assert.assertEquals("Failed",expectedText,actualText);
    }

}
