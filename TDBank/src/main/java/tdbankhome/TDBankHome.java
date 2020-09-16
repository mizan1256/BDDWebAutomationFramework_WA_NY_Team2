package tdbankhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tdbankhome.TDBankHomeWebElements.*;

public class TDBankHome extends WebAPI {
    @FindBy(xpath="//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']")
    WebElement logInIconArrow;
    @FindBy(xpath="//div[@class='td-col']//a[contains(text(),'Online Banking')]")
    WebElement onLineBanking;
    @FindBy(xpath="//h1[@class='td-ui-login-app-title ng-binding']")
    WebElement validateText;

    public void logInIcon(){
        Actions action= new Actions(driver);
        action.moveToElement(logInIconArrow).perform();
    }
    public void onlineBanking(){
        onLineBanking.click();
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login)");
    }
    public void validateOnlineBanking(){
       String actualResult="TD Bank Online Banking";
        String expectedResult=validateText.getText();
        Assert.assertEquals("Text do not match",actualResult,expectedResult);

    }

    @FindBy(how= How.XPATH, using =signUpText )
    WebElement signUp;
    @FindBy(how= How.XPATH, using =personalAccountRadioButton )
    WebElement personalAccount;
    @FindBy(how= How.XPATH, using =iAmCheckBox )
    WebElement checkBox;
    @FindBy(how= How.XPATH, using =continueButtonOnPopUp )
    WebElement continue1;
    @FindBy(how= How.XPATH, using =acceptCheckBox )
    WebElement acceptCheck;
    @FindBy(how= How.XPATH, using =acceptButtonXp )
    WebElement acceptButton;
    @FindBy(how= How.XPATH, using =firstNameBox )
    WebElement firstName;
    @FindBy(how= How.XPATH, using =lastNameBox )
    WebElement lastName;
    @FindBy(how= How.XPATH, using =EmailAddressBox )
    WebElement emailAddress;
    @FindBy(how= How.XPATH, using =accountTypeList )
    WebElement actType;
    @FindBy(how= How.XPATH, using =ssNumberXp )
    WebElement ssn;
    @FindBy(how= How.XPATH, using =atmCardNumber )
    WebElement atmCard;
    @FindBy(how= How.XPATH, using =accountNumber )
    WebElement actNumber;
    @FindBy(how= How.XPATH, using =createUserNameField )
    WebElement userName;
    @FindBy(how= How.XPATH, using =reenterUserNameField )
    WebElement reenterUserName;
    @FindBy(how= How.XPATH, using =passwordField )
    WebElement password;
    @FindBy(how= How.XPATH, using =reenterPasswordField )
    WebElement reenterPassword;
    @FindBy(how= How.XPATH, using =finalContinueButton )
    WebElement continueButton;

    public void clickOnSignUp() throws InterruptedException {
    signUp.click();
    personalAccount.click();
    checkBox.click();
    continue1.click();
    wait(3000);
    acceptCheck.click();
    acceptButton.click();
    }
    public void enterPersonalInformation() throws InterruptedException {
        firstName.sendKeys("jony");
        lastName.sendKeys("hossain");
       emailAddress.sendKeys("jonhossn@gmail.com");
        wait(3000);
    }
    public void enterPersonalAccountInformation() throws InterruptedException {
        actType.click();

        ssn.sendKeys("123-12-1234");
        atmCard.sendKeys("1234123412341234");
        actNumber.sendKeys("123456789");
        wait(3000);
    }
    public void createUserName_Password() throws InterruptedException {
        userName.sendKeys("jony");
        reenterUserName.sendKeys("jony");
        wait(3000);
        password.sendKeys("Dhaka1219");
        reenterPassword.sendKeys("Dhaka1219");
        continueButton.click();
        wait(3000);
    }
    public void validateSignUp(){
        String actualResult="TD Bank Online Banking";
        String expectedResult=validateText.getText();
        Assert.assertEquals("Text do not match",actualResult,expectedResult);

    }
}

