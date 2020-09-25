package targepickup;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import targetHome.TargetHome;

import static targepickup.TargetPickUpWebElements.*;

public class TargetPickUp extends WebAPI {
    static TargetHome targetHome;
    @FindBy(how = How.XPATH, using = pickUpAndDeliveryBtnWebElement) public WebElement pickUpAndDeliveryBtn;
    @FindBy(how = How.XPATH, using = orderPickUpBtnWebElement) public WebElement orderPickUpBtn;
    @FindBy(how = How.XPATH, using = orderPickUpSearchBoxWebElement) public WebElement orderPickUpSearchBox;
    @FindBy(how = How.XPATH, using = orderPickUpSearchIconWebElement) public WebElement orderPickUpSearchIcon;
    @FindBy(how = How.XPATH, using = orderPickUpSearchValidateTxtWebElement) public WebElement orderPickUpSearchValidateTxt;
    @FindBy(how = How.XPATH, using = sameDayDeliveryBtnWebElement) public WebElement sameDayDeliveryBtn;
    @FindBy(how = How.XPATH, using = sameDayDeliveryValidateTxtWebElement) public WebElement sameDayDeliveryValidateTxt;
    @FindBy(how = How.XPATH, using = sameDayDeliverySignInBtnWebElement) public WebElement sameDayDeliverySignInBtn;
    @FindBy(how = How.XPATH, using = userEmailFieldWebElement) public WebElement userEmailField;
    @FindBy(how = How.XPATH, using = userPasswordFieldWebElement) public WebElement userPasswordField;
    @FindBy(how = How.XPATH, using = signInBtnWebElement) public WebElement signInBtn;
    @FindBy(how = How.XPATH, using = sameDayDeliverySignInAddressValidateWebElement) public WebElement sameDayDeliverySignInAddressValidate;
    @FindBy(how = How.XPATH, using = signInToMyAccountWebElement) public WebElement signInToMyAccount;
    @FindBy(how = How.XPATH, using = driveUpBtnWebElement) public WebElement driveUpBtn;

    /**
     *Order pickUp home page check
     */
    public void clickOnPickUpAndDeliveryBtn(){
        pickUpAndDeliveryBtn.click();
    } public void clickOnOrderPickUpBtnBtn(){
        orderPickUpBtn.click();
    }public void validateOrderPickUpPageTitle(String actualTitle){
        String expectedTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle,actualTitle);
    }

    /**
     *Oder pickUp searchBox functionality check
     * @throws InterruptedException
     */
    public void necessaryStepForOderPickUp() throws InterruptedException {
        pickUpAndDeliveryBtn.click();
        sleepFor(3);
        orderPickUpBtn.click();
    }
    public void orderPickUpSearchBox(String searchItem) throws InterruptedException {
        orderPickUpSearchBox.sendKeys(searchItem);
        sleepFor(3);
        orderPickUpSearchIcon.click();
    }
    public void validateOrderPickUp(String actualText) throws InterruptedException {
        sleepFor(3);
        String expectedText=orderPickUpSearchValidateTxt.getText();
        Assert.assertEquals("Text does not match",expectedText, actualText);
    }
    /**
     *Same day delivery page check
     */
    public void sameDayDeliveryCheck() throws InterruptedException {
        sameDayDeliveryBtn.click();
        sleepFor(3);
    }
    public void validateSameDayDeliveryCheck(String actualText) throws InterruptedException {
        sleepFor(4);
        String expectedText=sameDayDeliveryValidateTxt.getText();
        Assert.assertEquals("Text does not match",expectedText, actualText);
    }
    /**
     *Same day delivery signIn functionality check
     */
    public void necessaryStepsToSameDayDeliveryLogIn() throws InterruptedException {
        sleepFor(5);
        sameDayDeliveryBtn.click();
        sleepFor(5);
        sameDayDeliverySignInBtn.click();
    }


    public void enterUserInfoSameDayDeliverySignIn(String userEmail, String userPassword) throws InterruptedException {
        sleepFor(3);
        userEmailField.clear();
        userEmailField.sendKeys(userEmail);
        userPasswordField.clear();
        userPasswordField.sendKeys(userPassword);
        sleepFor(3);
        signInBtn.click();
    }
    public void validateSameDaySignIn(String actualText){
        String expectedText=sameDayDeliverySignInAddressValidate.getText();
        Assert.assertEquals("Text does not match",expectedText, actualText);
    }
    /**
     * Drive Up home page check
     */
    public void clickOnDriveUpBtn(){
        pickUpAndDeliveryBtn.click();
        driveUpBtn.click();
    }
    public void validateClickOnDriveUpBtnTitle(String actualTitle){
        String expectedTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle,actualTitle);

    }

}
