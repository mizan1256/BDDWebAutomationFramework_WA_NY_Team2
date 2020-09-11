package SearchBox;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static SearchBox.SearchBoxWebElement.*;

public class SearchBox extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBoxWebElement)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchBtnWebElement)
    public WebElement searchBtn;

    @FindBy(how = How.XPATH, using = searchBoxTextWebElement)
    public WebElement searchBoxText;

    public void searchBoxCheck(){
        typeOnElement(searchBoxWebElement,"Apple iPhone 11");
    }
    public void setSearchBoxCheckWithParameter(String searchItem){
        searchBox.sendKeys(searchItem);
    }
    public void searchBtnCheck(){
        searchBtn.click();
    }
    public void validateSearchBoxTxt(String expectedResult){
        String actualResult=searchBoxText.getText();
        Assert.assertEquals("Search Item not match",actualResult,expectedResult);

    }
    //validate method
    public void validateSearchBoxPageTitle(){
        String expectedTitle="Results for Apple iPhone 11 - AT&T Search";
        String actualTitle=driver.getTitle().toString();
        Assert.assertEquals("Title does not match", actualTitle,expectedTitle);
    }

}
