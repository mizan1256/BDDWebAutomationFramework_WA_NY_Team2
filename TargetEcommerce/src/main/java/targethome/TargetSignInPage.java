package targethome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetSignInPage extends WebAPI {

    //@FindBy Annotations
    @FindBy(xpath = "//span[text()='Sign in']")
    WebElement signInDropdown;

    @FindBy(xpath = "//div[@class=\"Row-uds8za-0 iFzQdH\" and text()='Sign in']")
    WebElement signInLink;

    @FindBy(xpath = "//input[@id=\"username\"]")
    WebElement emailField;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement passwordField;

    @FindBy(xpath = "//button[@id=\"login\"]")
    WebElement signInBtn;

    @FindBy(xpath = "//span[@class='styles__AccountName-sc-1kk0q5l-0 gIhNhN' and text()='Pnt']")
    WebElement successfulSignInText;





    //Action and Validation
    public void clickOnSignInDropdown(){
        clickOnElement(signInDropdown);
    }
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
    public void enterEmail(String email) {
        typeOnElement(emailField, email);
    }
    public void enterPassword(String password){
        typeOnElement(passwordField,password);
    }
    public void clickOnSignInBtn(){
        clickOnElement(signInBtn);
    }

    public void verifySuccessfulSignIn(){
        String actualText = successfulSignInText.getText();
        String expectedText = "Pnt";
        System.out.println(actualText);
        //Assert.assertEquals("Text doesn't match",actualText,expectedText);
        Assert.assertTrue(actualText.contains(expectedText));
    }




//        public void signUpNecessaryStep(){
//            signInButton.click();
//            createAccountDropDownLink.click();
//        }
//        public void enterUseEmail(String email){
//            emailId.sendKeys(email);
//        }
//        public void enterUseFirstName(String fName){
//            firstName.sendKeys(fName);
//        }
//        public void enterUseLastName(String lName){
//            lastName.sendKeys(lName);
//        }
//        public void enterUsePhnNum(String pNumber){
//            mobileNumber.sendKeys(pNumber);
//        }
//        public void enterUsePassword(String passWord){
//            password.sendKeys(passWord);
//        }
//        public void enterCreateTargetAccount(){
//            createTargetAccount.click();
//        }


    }








