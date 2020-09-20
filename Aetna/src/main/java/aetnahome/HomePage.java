package aetnahome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static aetnahome.HomePageWebElement.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using =searchXpathElement)
    public WebElement search;
    @FindBy(how = How.XPATH, using =searchBoxXpathElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using =searchTextXpathElement)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using =aethnaLogoXpathElement)
    public WebElement aethnaLogo;
    //login
     @FindBy(how = How.XPATH, using =tologinXpathElement)
    public WebElement login;
     @FindBy(how = How.XPATH, using =ClickTologinXpathElement)
    public WebElement ClickTologin;
     @FindBy(how = How.XPATH, using =userNameXpathElement)
    public WebElement userName;
     @FindBy(how = How.XPATH, using =passwordXpathElement)
    public WebElement password;
   @FindBy(how = How.XPATH, using =secureLoginButtonXpathElement)
    public WebElement secureLoginButton;
   @FindBy(how = How.XPATH, using =loginErrorMessageXpathElement)
    public WebElement loginErrorMessage;




    public void clickSearchLogo(){
        clickByXpath(searchXpathElement);
    }

    public void typeOnSearchBox(){
        searchBox.sendKeys("medicate");
    }


    public void verifySearchText(){
        String actualtext=searchText.getText();
        String expectedText="Showing results for \"medicate\"";
        Assert.assertEquals(actualtext,expectedText);

    }
    public void verifyAethnaLogo() {
        boolean actualText = aethnaLogo.isDisplayed();
        Assert.assertEquals("not found", true, actualText);
    }
    public void clickToLogin(){
        clickByXpath(tologinXpathElement);

    }
  public void clickLoginOption(){
        clickByXpath(ClickTologinXpathElement);

    }
    public void enterUserNameAndPassword(String userid, String pwd){
        userName.sendKeys(userid);
        password.sendKeys(pwd);
    }

    public void clickLoginButton(){
        secureLoginButton.click();
    }
    public void verifyErrorTextLogin(){
String actualtext=loginErrorMessage.getText();
String expectedText="Invalid username or password. Please try again.";
Assert.assertEquals("error",expectedText,actualtext);

    }
}
