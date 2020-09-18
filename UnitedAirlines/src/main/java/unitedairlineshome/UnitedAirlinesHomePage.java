package unitedairlineshome;

import common.WebAPI;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirlinesWebElement.*;

public class UnitedAirlinesHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = bookButtonWebElement)
    public WebElement bookButton;
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement)
    public WebElement hotelsButton;
    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement)
    public WebElement whereToSearch;
    @FindBy(how = How.XPATH, using = bookHotelsValidationText)
    public WebElement bookHotelsText;

    public void clickOnBookButton() throws InterruptedException {
        bookButton.click();
    }
    public void clickOnHotelButton() throws InterruptedException {
        hotelsButton.click();


    }
    public void textOnWhereToSearchBox(String searchItem) throws InterruptedException {
        driver.navigate().to("https://hotels.united.com/");
        whereToSearch.sendKeys(searchItem);
        whereToSearch.submit();
        Thread.sleep(3000);
    }
    public  void validateLandedPageText() throws InterruptedException {
        String expectedText="Miami Beach, Florida, United States of America";
        String actualText=bookHotelsText.getText();
        Assert.assertEquals("Text does not match",expectedText,actualText);
        Thread.sleep(3000);
    }


}
