package atnthome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static atnthome.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBoxXPathWebElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchTextXPathWebElement)
    public WebElement searchText;


    // Action Method
    public void enterSearchKeyword(String searchItem) {
        searchBox.sendKeys(searchItem);

    }
    public void enterSearchKeyword1(List<String> searchItem) {
        // searchBox.sendKeys(searchItem);

    }
    public void clickOnSearchButton() {
        //searchButton.click();
        searchBox.submit();
    }
    // Validate Method
    public void validateSearchTitle(String expectedTitle) {
         String expectedTitleForIphone="Results for iphone 8 plus - AT&T Search";
        String actualTitle= driver.getTitle();
        Assert.assertEquals("Title does not match",actualTitle,expectedTitleForIphone);

    }
    public void validateSearchTitleMultiple(String expectedResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("Search Item not match",expectedResult,actualResult);

    }
//    public void validateSearchTextMultiple(String text, String productName) {
//        String actualText=searchText.getText();
//        String expectedText="Showing result for "+productName+".";
//        Assert.assertEquals("not found",expectedText,actualText);
//
//    }

}
