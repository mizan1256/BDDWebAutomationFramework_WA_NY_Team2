package atnthome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static atnthome.AtntHomePageWebElement.*;

public class AtntHome extends WebAPI {

    @FindBy(how = How.XPATH, using = homePageSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homePageSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = homePageSearchText)
    public WebElement searchText;

    public void enterSearchKeyWord(String searchItem){
        searchBox.sendKeys(searchItem);
    }
    public void clickOnSearchButton(){
        searchButton.submit();
    }
    public void validateSearchText(String expectedResult){
        String actualResult = searchText.getText();
        Assert.assertEquals("Search item not match",expectedResult,actualResult);
    }

}
