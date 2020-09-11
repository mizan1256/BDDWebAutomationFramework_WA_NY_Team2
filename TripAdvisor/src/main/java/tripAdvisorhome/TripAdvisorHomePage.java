package tripAdvisorhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static tripAdvisorhome.TripAdvHomeWebElement.*;

public class TripAdvisorHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement)
    public WebElement whereToSearchBox;

    @FindBy(how = How.XPATH, using = whereToSearchButtonWebElement)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = whereToSearchButtonTextWebElement)
    public WebElement whereToSearchButtonText;

    @FindBy(how = How.XPATH, using = tripAdvisorSignInButtonWebElement)
    public WebElement tripAdvisorSignInButton;

    @FindBy(how = How.XPATH, using = imNotARobotButtonWebElement)
    public WebElement imNotARobotButton;

    @FindBy(how = How.XPATH, using = continueWithEmailButton)
    public WebElement continueWithEmail;

    //Action Method
    public void searchBoxCheck(String searchItem){
        whereToSearchBox.sendKeys(searchItem);
    }
    public void searchButton(){
        whereToSearchBox.submit();
    }
    //Validate Method
    public void validateSearchBox(String expectedResult) {
        String actualResult = whereToSearchButtonText.getText();
        Assert.assertEquals("Search text not found", expectedResult,actualResult);
    }
    public void signInButtonCheck(){
     tripAdvisorSignInButton.click();
     imNotARobotButton.click();
     continueWithEmail.click();


    }
}
