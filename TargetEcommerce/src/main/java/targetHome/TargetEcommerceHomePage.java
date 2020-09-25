package targetHome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static targetHome.TargetEcommerceWebElement.*;

public class TargetEcommerceHomePage extends WebAPI {
    By categories_Btn=By.xpath("//span[contains(text(),'Categories')]");
    By groceries_Btn=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/li[2]");
    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSearchText)
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
    @FindBy(how = How.XPATH, using = SignInButtonWebElement)
    public WebElement signInBtn;
    @FindBy(how = How.XPATH, using = passwordErrorMessage)
    public WebElement invalidPasswordErrorMessage;

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']")
    WebElement searchFieldButton;
    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 crGulm h-margin-b-none']")
    WebElement iPhoneSearchBoxTxt;

    @FindBy(how = How.XPATH, using = shoppingCartLogo)
    public WebElement shoppInCartLogo;
    @FindBy(how = How.XPATH, using = shoppingCartLogoText)
    public WebElement shoppingCartText;

    @FindBy(how = How.XPATH, using = shoppingCartSignInButton)
    public WebElement shoppingCartSignIn;
    @FindBy(how = How.XPATH, using = finalSignInButton)
    public WebElement finalSignIn;

    public void searchBoxIsDisplayed() {
        searchField.isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
    }

    //Action Method
    public void searchBoxCheck(String searchItem) {
        searchField.clear();
        searchField.sendKeys(searchItem);
        searchField.submit();
       // searchFieldButton.click();
    }

    //Validation Method
    public void validateSearchText() throws InterruptedException {
        sleepFor(5);
        String actualResult = iPhoneSearchBoxTxt.getText();
        String expectedResult = "iPhone";
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult, "Text do not match");
    }

    //Validate searchBox page Title
    public void validateSearchBoxTitle(){
        System.out.println(driver.getTitle());
        String expectedTitle= "Target : Expect More. Pay Less.";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", expectedTitle, actualTitle);
    }

    /**
     *    Positive test Creating account
     */

    public void signUpNecessaryStep() throws InterruptedException {
        signInButton.click();
        sleepFor(2);
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

    public void validateSingUpMessage(String actulaText){
        String expectedText=invalidPasswordErrorMessage.getText();
        Assert.assertEquals("Text do not match", expectedText, actulaText);
    }

    /**
     * SignIn to target user account
     */
    public void iAmOnSignInPage() throws InterruptedException {
        signInButton.click();
        sleepFor(2);
        signInDropDownButton.click();
    }
    public void enterUserSignInInfo(String userEmail, String userPassword ) throws InterruptedException {
        signInEmailId.clear();
        signInEmailId.sendKeys(userEmail);
        signInPassword.clear();
        signInPassword.sendKeys(userPassword);
        sleepFor(3);
    }
    public void clickOnSignInBtn(){
        signInBtn.click();
    }
    public void validaUserSignIn(){
        Assert.assertEquals("Target Login",driver.getTitle());
    }
    /**
     * searchBox functionality test using
     */
    public void searchBoXCheck(String productName){
        searchBox.sendKeys(productName);
}
public void clickOnSearchBtn(){
        searchButton.click();
}
public void validateSearchProductTitle(String validateTitle){
        String expectedTitle= validateTitle;
        String actualTitle=driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);

}
    public void validateSearchTxt(String actualText) {
       String expectedResult= actualText;
        System.out.println(expectedResult);
        Assert.assertTrue(expectedResult.contains(actualText));
    }

    public void validateSearchBox(String expectedResult) throws InterruptedException {
        sleepFor(4);
        String actualResult=searchText.getText();
        Assert.assertEquals("Search Item not match",actualResult,expectedResult);

    }
    /**
     * Target shopping cart logo functionality check
     */
    public void shoppingCartLogoIsClickable() {
        shoppInCartLogo.click();
    }

    public void validateShoppingCartLogoIsClickable() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = shoppingCartText.getText();
        System.out.println(shoppingCartText.getText());
        Thread.sleep(3000);
        String expectedResult = "Your cart is empty";
        org.testng.Assert.assertEquals(actualResult, expectedResult, "Test case not match");
    }
    /**
     * Shopping Cart Functional test
     */
    public void shoppingInCartLogIn() throws InterruptedException {
        shoppingCartLogoIsClickable();
        shoppingCartSignIn.click();
        signInEmailId.sendKeys("mizan_1256@yahoo.com");
        signInPassword.sendKeys("Tasmi1256");
        finalSignIn.click();
        Thread.sleep(3000);
    }
    public void validateShoppingCartLogIn() {
        org.testng.Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
    }

}
