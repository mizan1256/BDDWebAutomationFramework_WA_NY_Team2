package tripadvisorhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tripadvisorhome.TripAdvisorWebElements.*;

public class TripAdvisorHomePage  extends WebAPI {
    ////////////// bdd 1
    @FindBy(how = How.XPATH, using = tripAdvisorSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonText)
    public WebElement searchButton;

    public void searchBoxCheck( String searchItem) throws InterruptedException {
        searchBox.sendKeys(searchItem);
        Thread.sleep(4000);
    }
    public void searchButtonClick(){
        searchBox.submit();
    }
    public void searchButtonCheck(String expectedResult){
        String actualResult=searchButton.getText();
        Assert.assertEquals("text message- no match",expectedResult,actualResult);
    }
    ///////////////bdd 2
    @FindBy(how=How.XPATH, using=ExpectedWriteAReviewTextXp)
    WebElement expectedWriteReview;
    @FindBy(how=How.XPATH, using=writeAReviewText)
    WebElement writeReview;

    public void clickOnPost(){

        clickOnElement(postTextXp);
    }
    public void clickOnWriteAReview(){

        writeReview.click();
    }
    public void validate_ClickOnWriteAReview(){
        String actualResult= driver.getTitle();
        String expectedResult="Write a review - Tripadvisor";
        Assert.assertEquals("No match found", actualResult,expectedResult);
    }
    /////////////////bdd.3
    @FindBy(how=How.XPATH, using=alertsText)
    WebElement alerts;
    @FindBy(how=How.XPATH, using=continueWithEmailButton)
    WebElement continueWithEmail;
    @FindBy(how=How.XPATH, using=emailAddressBox)
    WebElement email;
    @FindBy(how=How.XPATH, using=emailAddressBox)
    WebElement password;
    @FindBy(how=How.XPATH, using=joinButton)
    WebElement join;
    @FindBy(how=How.XPATH, using=expectedAlertPageClass)
    WebElement expectedAlerts;


    public void clickOnAlerts(){
        alerts.click();
        continueWithEmail.click();
    }
    public void enterEmail(String email){
        this.email.sendKeys("jonhossn@gmail.com");
    }
    public void enterPassword(){
        password.sendKeys("Dhaka1219");
    }
    public void clickJoin(){
        join.click();
    }
    public void validate_ClickOnAlerts() {
        String actualResult = "inbox";
        String expectedResult = expectedAlerts.getText();
        Assert.assertEquals("No match found", actualResult, expectedResult);

    }
    /////////////////////////bddd 4
//"Either your email or password was incorrect. Please try again or click the "Forgot password?" link below.";
    @FindBy(how=How.XPATH, using=signInButton)
    WebElement signIn;
    @FindBy(how=How.XPATH, using=continueWithEml)
    WebElement continueWith;
    @FindBy(how=How.XPATH, using=emailAddressField)
    WebElement email1;
    @FindBy(how=How.XPATH, using=passwordField)
    WebElement password1;
    @FindBy(how=How.XPATH, using=joinButton1)
    WebElement join1;
    @FindBy(how=How.XPATH, using=expectedErrorMessage)
    WebElement errorMessage;

    public void clickOnSignIn(){
    signIn.click();
    }
    public void clickOnContinueWithEmail(){
        continueWith.click();
    }
    public void enterEmailAddress(String emailAddress){
        email1.clear();
        email1.sendKeys(emailAddress);
    }
    public void enterPassword(String password){
        password1.clear();
        password1.sendKeys(password);
    }
    public void clickOnJoin(){
    join1.click();
    }
    public void validate_ClickOnSignIn() {
        String actualResult = "Either your email or password was incorrect. Please try again or click the \"Forgot password?\" link below.";
        String expectedResult = errorMessage.getText();
        Assert.assertEquals("No match found", actualResult, expectedResult);

    }




}
