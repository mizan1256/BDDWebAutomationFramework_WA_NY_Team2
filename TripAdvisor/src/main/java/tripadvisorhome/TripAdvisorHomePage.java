package tripadvisorhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tripadvisorhome.TripAdvisorWebElement.*;

public class TripAdvisorHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = tripAdvisorSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using =tripAdvisorSearchBoxCheckText)
    public WebElement searchBoxText;


    public void searchBoxCheck(String searchItem) throws InterruptedException {
        searchBox.sendKeys(searchItem);
        Thread.sleep(5000);
    }
    public void searchButtonClick(){
        searchBox.submit();
    }
    public void searchButtonCheckText(String expectedResult){
    String actualResult=searchBoxText.getText();
        Assert.assertEquals("Text do not match",expectedResult,actualResult);
    }

}
