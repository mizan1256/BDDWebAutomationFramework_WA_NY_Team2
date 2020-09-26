package targethome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHomePage extends WebAPI {

    //@FindBy Annotations

    @FindBy(xpath = "//input[@id='search' and @name='searchTerm']")
    WebElement searchBox;

    @FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt' and @type='submit']")
    WebElement searchBtn;

    @FindBy(xpath = "//h2[@class='Heading__StyledHeading-sc-1m9kw5a-0 hdEoFP h-display-block h-margin-b-tiny']")
    WebElement iphone11ExpectedText;

    @FindBy(xpath = "//h2[@class='Heading__StyledHeading-sc-1m9kw5a-0 hdEoFP h-display-block h-margin-b-tiny']")
    WebElement searchedText;






    //Action and Validate Methods
    public void enterItemInSearchBox(String item){
        typeOnElement(searchBox,item);
    }
    public void clickOnSearchBtn(){
        clickOnElement(searchBtn);
    }
    public void verifyItem(){
        String actualText =iphone11ExpectedText.getText();
        String expectedText ="results for “iphone 11”";
        Assert.assertEquals("Text doesn't match",actualText,expectedText);
    }


    public void enterItemsInSearchBoxFields(String items){
        typeOnElement(searchBox,items);
    }

    public void verifySearchedItemsText(String items){
        String actualText = searchedText.getText();
        String expectedText = items;
        Assert.assertEquals(expectedText,actualText);

    }



}
