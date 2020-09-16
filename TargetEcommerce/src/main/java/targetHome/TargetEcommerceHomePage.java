package targetHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static targetHome.TargetEcommerceWebElement.*;

public class TargetEcommerceHomePage extends WebAPI {
    By categories_Btn=By.xpath("//span[contains(text(),'Categories')]");
    By groceries_Btn=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/li[2]");
    @FindBy(how = How.ID, using = webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = signInTarget)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = createAccountDropDown)
    public WebElement createAccountDropDownLink;
    @FindBy(how = How.XPATH, using = emailIdForTarget)
    public WebElement emailId;
    @FindBy(how = How.XPATH, using = firstNameForTarget)
    public WebElement firstName;
    @FindBy(how = How.XPATH, using = lastNameForTarget)
    public WebElement lastName;
    @FindBy(how = How.XPATH, using = mobileNumberForTarget)
    public WebElement mobileNumber;
    @FindBy(how = How.XPATH, using = passwordForTarget)
    public WebElement password;
    @FindBy(how = How.XPATH, using = createAccountButton)
    public WebElement createTargetAccount;
    @FindBy(how = How.XPATH, using = errorMessageCreateAccount)
    public WebElement errorMessage;
    @FindBy(how = How.XPATH, using = signInDropDownMenu)
    public WebElement signInDropDownButton;
    @FindBy(how = How.XPATH, using = signInEmailIdBox)
    public WebElement signInEmailId;
    @FindBy(how = How.XPATH, using = signInPasswordBox)
    public WebElement signInPassword;
    @FindBy(how = How.XPATH, using = finalSignInButton)
    public WebElement finalSignIn;
    @FindBy(how = How.XPATH, using = passwordErrorMessage)
    public WebElement invalidPasswordErrorMessage;

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']")
    WebElement searchFieldButton;
    @FindBy(xpath = "//h2[contains(text(),'Compare iPhone models')]")
    WebElement iPhoneSearchBoxTxt;

    public void searchBoxIsDisplayed() {
        searchField.isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
    }

    //Action Method
    public void searchBoxCheck(String searchItem) {
        searchField.clear();
        searchField.sendKeys(searchItem);
        searchFieldButton.click();
    }

    //Validation Method
    public void validateSearchText() throws InterruptedException {
        sleepFor(5);
        String actualResult = iPhoneSearchBoxTxt.getText();
        String expectedResult = "Compare iPhone models";
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult, "Text do not match");
    }

    //Validate searchBox page Title
    public void validateSearchBoxTitle(){
        System.out.println(driver.getTitle());
        String expectedTitle= "\"iPhone : Target\"";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    /**
     *    Positive test Creating account
     */

    public void signUpNecessaryStep(){
        signInButton.click();
        createAccountDropDownLink.click();
    }
    public void enterUseEmail(String email){
        emailId.sendKeys(email);
    }
    public void enterUseFirstName(String fName){
        firstName.sendKeys(fName);
    }
    public void enterUseLastName(String lName){
        lastName.sendKeys(lName);
    }
    public void enterUsePhnNum(String pNumber){
        mobileNumber.sendKeys(pNumber);
    }
    public void enterUsePassword(String passWord){
        password.sendKeys(passWord);
    }
    public void enterCreateTargetAccount(){
        createTargetAccount.click();
    }

}
