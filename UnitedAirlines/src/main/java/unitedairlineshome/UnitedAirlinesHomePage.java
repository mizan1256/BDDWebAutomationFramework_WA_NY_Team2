package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirHomeWebElements.*;

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

    @FindBy(how = How.XPATH,using = bookButtonWebElements)
    public WebElement bookButton;

    @FindBy(how = How.XPATH,using = hotelsButtonWebElements)
    public WebElement hotelsButton;

    @FindBy(how = How.XPATH,using = whereToSearchBoxWebElements)
    public WebElement whereToSearchBox;

    @FindBy(how = How.XPATH,using = bookHotelsValidationText)
    public WebElement booksHotelsText;

    /**
     * Flight Status
     */

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

    /**
     * Book Hotels
     */

    public void clickBookButton(){
        bookButton.click();
    }

    public void clickHotelsButton(){
        hotelsButton.click();
    }
    public void enterWhereToSearchBox(String searchItem) throws InterruptedException {
        driver.navigate().to("https://hotels.united.com/");
        whereToSearchBox.sendKeys(searchItem);
        whereToSearchBox.submit();
        Thread.sleep(3000);
    }
    public void validateLandedPageText() throws InterruptedException {

        String expectedText="Las Vegas, Nevada, United States of America";
        String actualText=booksHotelsText.getText();
        Assert.assertEquals("Failed",expectedText,actualText);

    }
}
