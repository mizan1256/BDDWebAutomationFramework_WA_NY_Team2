package login;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static login.LoginWebelement.*;

public class Login extends WebAPI {

    @FindBy(how = How.XPATH, using = signInXpathWebElement)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = accountXpathWebElement)
    public WebElement account;
    @FindBy(how = How.XPATH, using = userIdXpathWebElement)
    public WebElement userId;
    @FindBy(how = How.CSS, using = signInButtonCSSWebElement)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = passwordXpathWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = doubleCheckMessageForSignInXpathWebElement)
    public WebElement doubleCheckMessageForSignIn;
    @FindBy(how = How.XPATH, using = verifyTextXpathWebElement)
    public WebElement verifyText;

    //actionmethod
    public void signIn(){
        clickOnElement(accountXpathWebElement);
        clickOnElement(signInXpathWebElement);

        typeOnElement(userIdXpathWebElement,"mtt123124@gmail.com");
        typeOnElementNEnter(passwordXpathWebElement,"Acdse123@");
        //clickOnElement(signInButtonCSSWebElement);
    }
    //validate method
    public void validateSignIn() throws InterruptedException {
        sleepFor(5);

        boolean  actual=doubleCheckMessageForSignIn.isDisplayed();
        Assert.assertEquals(actual,true);
    }
    public void clickOnAccount(){
        account.click();
//        clickOnElement(accountXpathWebElement);


    }
    public void clickOnSignInOption(){
        signIn.click();
//        clickOnElement(signInXpathWebElement);

    }
    public void typeOnUserID(){

        typeOnElement(userIdXpathWebElement,"mtt123124@gmail.com");

    }
    public void typeOnPassword(){
        typeOnElement(passwordXpathWebElement,"Acdse123@");

    }

    public void clickSignInButton() {
        signInButton.click();
    }


}
