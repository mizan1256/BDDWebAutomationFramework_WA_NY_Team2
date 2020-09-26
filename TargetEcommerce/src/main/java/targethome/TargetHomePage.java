package targethome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static targethome.TargetHomePageElement.*;

public class TargetHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementCart) public WebElement cartButton;
    @FindBy(how = How.XPATH, using = webElementSignIn) public WebElement signInButton;
    @FindBy(how = How.XPATH, using = createYourTargetAccount) public WebElement createTargetAccount;
    @FindBy(xpath = "/html/body/div[9]/div/div/div/div[2]/div/div/form/div[6]/div[2]/button")WebElement validateShoppingCartText;

    @FindBy(how = How.XPATH, using = userNameBox) public WebElement userName;
    @FindBy(how = How.XPATH, using = userPasswordBox) public WebElement userPassword;
    @FindBy(xpath = "//*[@id=\"login\"]") WebElement signIn;
//    @FindBy(how = How.XPATH, using = userSignBox) public WebElement userSign;

    @FindBy(how = How.XPATH, using = dropDownSignInButton) public WebElement dropDownSignIn;
    @FindBy(xpath = "//div[contains(text(),'Sign in')]") WebElement signInBtn;
    @FindBy(xpath = "//input[@id='username']") WebElement emailField;
    @FindBy(xpath = "//input[@id='password']") WebElement passwordField;
    @FindBy(how = How.XPATH, using = createAcccountTab) public WebElement createAcc;
    @FindBy(how = How.XPATH, using = emailAddressBox) public WebElement emailAdd;
    @FindBy(how = How.XPATH, using = useFirstNameBox) public WebElement useFirstName;
    @FindBy(how = How.XPATH, using = useLastNameBox) public WebElement useLastName;
    @FindBy(how = How.XPATH, using = useMobileNumber) public WebElement useMobile;
    @FindBy(how = How.XPATH, using = usePasswordBox) public WebElement usePassword;
    @FindBy(how = How.XPATH, using = useSignInCreateAccount) public WebElement useCreateAnAccount;
    @FindBy(how = How.XPATH, using = useLogInButton) public WebElement useLogIn;
    @FindBy(how = How.XPATH, using = useSignInButton) public WebElement useSignIn;
    @FindBy(xpath = "//button[@class='sc-bxivhb sjTNF']")
    WebElement validateSignUp;
    @FindBy(how = How.XPATH, using = webElementSearchBox) public WebElement searchBox;
    @FindBy(how = How.CSS, using = webElementSearchButton) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = webElementSearchText) public WebElement searchText;
    @FindBy(how = How.XPATH, using = webElementTargetLogo) public WebElement targetLogo;
    @FindBy(how = How.XPATH, using = disposableMaskText) public WebElement faceMask;
    @FindBy(how =How.XPATH, using = clothMasks) public WebElement clothMask;
    @FindBy(how = How.XPATH, using = clearanceImg) public WebElement clearance;
    @FindBy(how = How.XPATH, using = webElementFurnitureClerance)public WebElement furnitureClearance;
    @FindBy(how = How.XPATH, using = webElementFilterResultText) public WebElement filterText;
    @FindBy(how = How.XPATH, using = weeklyAdTab) public WebElement weeklyAd;
    @FindBy(how = How.XPATH, using = showTargetLogo) public WebElement showLogo;
    @FindBy(how = How.XPATH, using = landGiftCard) public WebElement giftCard;
    @FindBy(how = How.XPATH, using = giftCatdText) public WebElement cardText;
    @FindBy(how = How.XPATH, using = checkYourBalance) public WebElement checkBalance;
    @FindBy(how = How.XPATH, using = cardBalanceText) public WebElement balanceText;
    @FindBy(how = How.XPATH, using = checkEmailButton) public WebElement checkEmail;
    @FindBy(how = How.XPATH,using = checkMailButton) public WebElement checkMail;
    @FindBy(xpath ="//a[@class='Link-sc-1khjl8b-0 kPdxNk'][contains(text(),'Registry')]") public WebElement registryButton;
    @FindBy(xpath = "//button[contains(text(),'create a baby registry')]") public WebElement createBabyField;
    @FindBy(xpath = "//div[@class='styles__ContentWrapper-vnn8rt-1 iacQrW']//div[2]//a[1]//img[1]") public WebElement appStoreLogo;
    @FindBy(xpath = "//span[contains(text(),'easy for everyone')]") public WebElement easyText;


    /**
     * Search Box
     */
    public void searchBoxCheck() {
        searchBox.sendKeys("Samsung Phone");
    }
    public void searchButtonClick(){
        searchButton.click();
    }

    public void validateSearchText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=searchText.getText();
        String expectedResult= "“Samsung Phone”";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }

    /**
     * Clearance Field
     */
    public void clearanceImage() throws InterruptedException {
        Thread.sleep(3000);
        clearance.click();
    }
    public void furnitureClearance() throws InterruptedException {
        Thread.sleep(3000);
        furnitureClearance.click();
    }

    public void validateClearanceImage(){
        String expectedResult = "Filter results";
        String actualResult = filterText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Reagistry Tab
     */
    public void appsRegistryTab() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
    }
    public void clickBabyField() throws InterruptedException {
        createBabyField.click();
        Thread.sleep(3000);
        appStoreLogo.isDisplayed();
    }

    public void validateAppsStoreLogo(){
        String actualResult = easyText.getText();
        String expectedResult= "EASY FOR EVERYONE";
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Shopping Cart test with invalid data
     */
    public void shoppingCart() throws InterruptedException {
        Thread.sleep(3000);
        cartButton.click();
        Thread.sleep(2000);
        signInButton.click();
        createTargetAccount.click();
    }
    public void enterEmailId(String Email) {
        emailAdd.sendKeys(Email);
    }
    public void enterFirstName(String firstName) {
        useFirstName.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        useLastName.sendKeys(lastName);
    }
    public void enterPhoneNumber(String phoneNumber) {
        useMobile.sendKeys(phoneNumber);
    }
    public void enterPassword(String password) throws InterruptedException {
        usePassword.sendKeys(password);
        sleepFor(5);
    }
    public void validateShoppingCart(){
        String actualResult = "show";
        String expectedResult = validateShoppingCartText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Shopping cart SignIn test with invalid data
     */
    public void cartSignInNegative() throws InterruptedException {
        cartButton.click();
        signInButton.click();
        Thread.sleep(3000);
    }
    public void emailField() {
        userName.sendKeys("pnt30235_NY@gmail.com");
    }
    public void passwordField() throws InterruptedException {
        userPassword.sendKeys("pnt30235ny");
        Thread.sleep(3000);
    }
    public void clickSignInBox(){
        signIn.click();
    }

    public void validateShoppingCartSignIn(){
        String actualResult = "show";
        String expectedResult = validateShoppingCartText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    /**
     * Create Account
     */
    public void dropDownSignInButton() throws InterruptedException {
        dropDownSignIn.click();
        Thread.sleep(2000);
        createAcc.click();
        Thread.sleep(2000);
    }
    public void typeEmailId(String Email) {
        emailAdd.sendKeys(Email);
    }
    public void typeFirstName(String firstName) {
        useFirstName.sendKeys(firstName);
    }
    public void typeLastName(String lastName) {
        useLastName.sendKeys(lastName);
    }
    public void typePhoneNumber(String phoneNumber) {
        useMobile.sendKeys(phoneNumber);
    }
    public void typePassword(String password) throws InterruptedException {
        usePassword.sendKeys(password);
        sleepFor(5);
    }
    public void clickCreateAccountButton() throws InterruptedException {
        useCreateAnAccount.click();
        sleepFor(5);
    }
    public void validateSignUpAccount(){
        String actualResult = "show";
        String expectedResult = validateSignUp.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Sign In Field Test
     */
    public void signInButton() throws InterruptedException {
        dropDownSignIn.click();
        Thread.sleep(2000);
        signInBtn.click();
        Thread.sleep(2000);
    }

    public void emailBox(String Email){
        emailField.sendKeys(Email);
    }

    public void passwordBox(String Password){
        passwordField.sendKeys(Password);
    }

    /**
     * searchBox Table
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


}