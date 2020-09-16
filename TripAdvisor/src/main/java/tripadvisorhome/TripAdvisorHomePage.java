package tripadvisorhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tripadvisorhome.TripAdvisorWebElements.*;

public class TripAdvisorHomePage  extends WebAPI {
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
    //bdd 3
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
    //bdd.4
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
    public void enterEmail(){
        email.sendKeys("jonhossn@gmail.com");
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

}
