package tripadvisorhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tripadvisorhome.TripAdvisorWebElements.*;

public class TripAdvisorHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsTASearchBox)
    public WebElement searchBox;

    @FindBy(how = How.XPATH,using = webElementsTASearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH,using = webElementsTASearchButtonText)
    public WebElement searchButtonText;

    By hotelButton=By.xpath("//div[@class='_1ZteHrEy']//div[1]//a[1]");
    By hotel_SearchBox=By.xpath("//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m _3awdcWrG']//input[@placeholder='Where to?']");
    By getHotel_SearchBox_Click=By.xpath("//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m _3awdcWrG']//span[@class='_2LyoLJ4U _2HBN-k68 _3LkX-HIr']");
    By hotel_Page_ValidateText=By.xpath("//body[@id='BODY_BLOCK_JQUERY_REFLOW']/div[contains(@class,'page')]/div[@class='delineation']/div[@class='ui_container main_wrap']/div[@class='ui_columns is-gapless']/div[@class='ui_column is-12']/div[@class='relWrap']/div[@class='column_wrap ui_columns is-multiline']/div[@class='content_column ui_column is-9-desktop is-12-tablet is-12-mobile']/div[@class='prw_rup prw_search_search_results_lazy']/div[@class='ui_columns sections_wrapper']/div[@class='ui_column is-12 srp_result_sections']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]");

    public void searchBoxCheck(String searchItem) throws InterruptedException {
        searchBox.sendKeys(searchItem);
    }
    public void searchButtonCheck(){
        searchBox.submit();
    }
    public void searchButtonTextCheck(String expectedResult){
     String actualResult=searchButtonText.getText();
     Assert.assertEquals("Text don't Match",actualResult,expectedResult);
    }

    // Paris hotel
    public void hotelButtonCheck(){
        driver.findElement(hotelButton).click();
    }
    public void enterSearchItem(String searchItem){
        driver.findElement(hotel_SearchBox).sendKeys(searchItem);
        driver.findElement(getHotel_SearchBox_Click).click();
    }
    public void hotelValidateText(){
        driver.findElement(hotel_Page_ValidateText);
    }

}
