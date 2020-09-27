package tripadvisorregistration;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static tripadvisorregistration.TripAdvRegistrationWebElement.*;

public class TripAdvisorRegistration extends WebAPI {


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

    @FindBy(how = How.XPATH, using = iFrameTripAvdWebElement)
    public WebElement iFrameTripAvd;

    @FindBy(xpath = "//input[@id='regSignIn.email']")WebElement userEmail;
    @FindBy(xpath = "//input[@id='regSignIn.password']")WebElement userPassword;
    @FindBy(xpath = "//div[contains(text(),'Log in')]")WebElement logInBtn;
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
        driver.switchTo().frame(iFrameTripAvd);
        continueWithEmail.click();
    }
    public void enterEmailAndPassword(String email, String password){
        driver.switchTo().frame(iFrameTripAvd);
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
    }
    public void clickOnLogInBtn(){
        logInBtn.click();
    }

}
