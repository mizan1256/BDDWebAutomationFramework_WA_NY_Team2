package geicohomeB;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static geicohomeB.GeicoHomeWebElements.*;

public class GeicoHome extends WebAPI {
    ///// bdd 1

    @FindBy(how= How.XPATH, using=startQuoteButton)
    WebElement startQuote;
    @FindBy(how= How.XPATH, using=expectedStartQuoteButton)
    WebElement expectedQuote;

    public void clickOnStartQuote()
    {
        startQuote.click();
    }
    public void validate_clickOnStartQuote(){
       String actualResult="What would you like to protect?";
       String expectedResult=expectedQuote.getText();
        Assert.assertEquals("no match found",actualResult,expectedResult);
    }
////////////////// bdd@ 2
    @FindBy(how= How.XPATH, using=rentersButton)
    WebElement renters;
    @FindBy(how= How.XPATH, using=rentersCheckMark)
    WebElement checkMark;

    public void clickOnRenters(){
        renters.click();
    }
    public void validate_ClickOnRenters(){
     Assert.assertTrue(checkMark.isDisplayed());
    }
/////////////////////// bdd 3
    @FindBy(how= How.XPATH, using=zipCodeField)
    WebElement zipCode;
    @FindBy(how= How.XPATH, using=zipCodeWithText)
    WebElement zipWithText;
    @FindBy(how= How.XPATH, using=expectedZipCodePage)
    WebElement expectedZipCode;

    public void clickOnZipCode(){
        zipCode.clear();
        zipCode.click();
    }
    public void enterZipCode(){
    clickOnZipCode();
        zipCode.sendKeys("11435");
    }
    public void hitEnterKeyboard(){
       enterZipCode();
        zipWithText.submit();
    }
    public void validate_ClickOnZipCode(){
        String actualResult="What would you like to protect?";
        String expectedResult=expectedZipCode.getText();
        Assert.assertEquals("no match found",actualResult,expectedResult);
    }
    ////////// bdd 4
    @FindBy(how= How.XPATH, using=geicoLocationIconSign)
    WebElement locationIcon;
    @FindBy(how= How.XPATH, using=locationZipCodeField)
    WebElement ziCo;
    @FindBy(how= How.XPATH, using=updateButton)
    WebElement update;
    @FindBy(how= How.XPATH, using=expectedLocationIconResult)
    WebElement expectedIconResult;

    public void clickOnIcon(){
        locationIcon.click();
    }
    public void enterZipCode(String zipcode){
        ziCo.clear();
        ziCo.sendKeys(zipcode);
    }
    public void clickOnUpdate(){
        update.click();
    }
    public void validate_ClickOnIcon(){
        String actualResult=expectedIconResult.getText();
        String expectedResult=expectedIconResult.getText();
        Assert.assertEquals("no match found",actualResult,expectedResult);
    }
    ///////////

    @FindBy(how= How.XPATH, using=invalidZipCodeErrorMessage)
    WebElement errorMessage;
    public void validate_ClickOnIconInvalid(){
        String actualResult="Sorry, we couldn't find that ZIP code. Please try again.";
        String expectedResult=errorMessage.getText();
        Assert.assertEquals("no match found",actualResult,expectedResult);
    }


}
