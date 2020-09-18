package geicoHome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static geicoHome.GeicoWebElement.*;

public class GeicoHome extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementSearchIcon) public WebElement searchIcon;
    @FindBy(how = How.XPATH,using = webElementSearchBox) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = webElementSearchButton) public WebElement searchButton;


//    Action
    public void searchIconCheck(){
        searchIcon.click();
    }
    public void searchBoxText(){
        searchBox.sendKeys("Auto");
    }
    public void searchButtonClickable(){
        searchButton.click();
    }
// Validation
    public void validatePageTitle(){
        String expectedTile="Site Search | GEICO";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTile,actualTitle);
    }

}
