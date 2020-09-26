package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirlinesWebElements.*;

public class UnitedAirlinesHomePage extends WebAPI {


    @FindBy(xpath = "//*[@id=\"loginButton\"]/span") WebElement signUpBtn;
    @FindBy(xpath = "//a[contains(text(),'Join now')]") WebElement joinNowBtn;
    @FindBy(xpath = "//select[@id='Title']") WebElement titleArrow;
    @FindBy(xpath = "//input[@id='FirstName']") WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='MiddleName']") WebElement middleNameBox;
    @FindBy(xpath = "//input[@id='LastName']") WebElement lastNameBox;
    @FindBy(xpath = "//*[@id=\"DOB_BirthMonth\"]") WebElement monthBox;
    @FindBy(xpath = "//*[@id=\"DOB_BirthDay\"]") WebElement dateBox;
    @FindBy(xpath = "//*[@id=\"DOB_BirthYear\"]") WebElement yearBox;
    @FindBy(xpath = "//*[@id=\"Gender2\"]") WebElement selectGenderBox;
    @FindBy(xpath = "//*[@id=\"divEnroll\"]/h2[2]") WebElement validateSignUpText;

    @FindBy(xpath = "//*[@id=\"AddressLine1\"]") WebElement streetField;
    @FindBy(xpath = "//*[@id=\"City\"]") WebElement cityField;
    @FindBy(xpath = "//*[@id=\"StateCodeRequired\"]") WebElement stateField;
    @FindBy(xpath = "//*[@id=\"PostalCodeRequired\"]") WebElement zipCodeField;
    @FindBy(xpath = "//*[@id=\"divEnroll\"]/h3[1]") WebElement validateContactText;

    @FindBy(xpath = "//*[@id=\"PhoneNumber_Input\"]") WebElement mobileNumber;
    @FindBy(xpath = "//*[@id=\"ExtensionNumber\"]") WebElement extensionNum;
    @FindBy(xpath = "//*[@id=\"IsSavePhoneDayOfTravelContact\"]") WebElement checkBox;
    @FindBy(xpath = "//*[@id=\"BusinessPhoneNumber_Input\"]") WebElement businessPhone;
    @FindBy(xpath = "//*[@id=\"BusinessExtensionNumber\"]") WebElement extensionBusiness;
    @FindBy(xpath = "//*[@id=\"HomeAirport\"]") WebElement airportName;
    @FindBy(xpath = "//*[@id=\"divEnroll\"]/h3[2]") WebElement validatePhoneText;

    @FindBy(xpath = "//*[@id=\"EmailAddress\"]") WebElement emailAddressField;
    @FindBy(xpath = "//*[@id=\"EmailAddressConfirm\"]") WebElement verifyEmailId;
    @FindBy(xpath = "//*[@id=\"IsSaveEmailDayOfTravelContact\"]") WebElement notifyCheckBox;
    @FindBy(xpath = "//*[@id=\"IsSaveMarketingEmails\"]") WebElement boxUnCheck;
    @FindBy(xpath = "//*[@id=\"NewPassword\"]") WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"NewPasswordConfirm\"]") WebElement reEnterPassword;
    @FindBy(xpath = "//*[@id=\"NewPasswordConfirmShowHideLink\"]") WebElement clickShowButton;
    @FindBy(xpath = "//*[@id=\"enrollProfileForm\"]/h3[2]") WebElement validateEmailField;

    @FindBy(xpath = "//*[@id=\"Questions_0__QuestionKey\"]") WebElement question1;
    @FindBy(xpath = "//*[@id=\"Questions_0__AnswerKey\"]") WebElement answer1;
    @FindBy(xpath = "//*[@id=\"Questions_1__QuestionKey\"]")WebElement question2;
    @FindBy(xpath = "//*[@id=\"Questions_1__AnswerKey\"]") WebElement answer2;
    @FindBy(xpath = "//*[@id=\"Questions_2__QuestionKey\"]")WebElement question3;
    @FindBy(xpath = "//*[@id=\"Questions_2__AnswerKey\"]") WebElement answer3;
    @FindBy(xpath = "//*[@id=\"Questions_3__QuestionKey\"]")WebElement question4;
    @FindBy(xpath = "//*[@id=\"Questions_3__AnswerKey\"]") WebElement answer4;
    @FindBy(xpath = "//*[@id=\"Questions_4__QuestionKey\"]")WebElement question5;
    @FindBy(xpath = "//*[@id=\"Questions_4__AnswerKey\"]") WebElement answer5;
    @FindBy(xpath = "//*[@id=\"btnEnroll\"]")WebElement acceptAndEnrollButton;


    @FindBy(xpath = "//*[@id=\"statusTab\"]/h2/span") WebElement flightStatus;
    @FindBy(xpath = "//input[@id='flightStatusOriginInput']") WebElement fromField;
    @FindBy(xpath = "//input[@id='flightStatusDestinationInput']") WebElement toField;
    @FindBy(xpath = "//input[@id='flightStatusModel.flightNumber']") WebElement flightNumber;
    @FindBy(xpath = "//button[@id='datesDropdown']") WebElement dropDownBtn;
    @FindBy(xpath = "//div[contains(text(),'Sep 12, 2020')]") WebElement selectedDate;
    @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/button/span") WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"departureLabel\"]/span") WebElement validateText;
    @FindBy(xpath = "//div[contains(text(),'Check-in')]") WebElement checkIn;
    @FindBy(xpath = "//input[@id='flightCheckInConfNumber']") WebElement ticketNumber;
    @FindBy(xpath = "//input[@id='flightCheckInLastName']") WebElement lastName;//
    @FindBy(xpath = "//button[@id='formSubmitBtn']") WebElement searchBtn; //
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/main/div[1]/div/div/div/span") WebElement checkInText;
    @FindBy(xpath = "//div[contains(text(),'My trips')]") WebElement myTrips;
    @FindBy(xpath = "//*[@id=\"myTripsConfirmationNumber\"]") WebElement myTripConfirmation;
    @FindBy(xpath = "//*[@id=\"myTripsLastName\"]") WebElement myTripLastName;
    @FindBy(xpath = "//*[@id=\"myTripsSubmitBtn\"]") WebElement myTripSearchBox;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/main/div/div[2]/div/div/div/div/p") WebElement myTripValidate;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[4]/header/div/div/div[2]/nav/ul/li[3]/a/span") WebElement searchIcon;
    @FindBy(xpath = "//div[contains(text(),'Coronavirus (COVID-19) updates')]") WebElement coronavirusUpdateClick;
    @FindBy(xpath = "//a[contains(text(),'request a refund')]") WebElement requestRefundClick;
    @FindBy(xpath = "//h1[contains(text(),'Refund policies')]") WebElement searchBtnText;
    @FindBy(xpath = "//div[contains(text(),'Visit My Trips, select the flight, and choose \"Vie')]") WebElement flightReceipt;
    @FindBy(xpath = "//*[@id=\"radiofield-item-id-search-receipt-by-0\"]") WebElement radioBtn;
    @FindBy(xpath = "//*[@id=\"LzgSY0S7xD\"]") WebElement travelerFistName;
    @FindBy(xpath = "//*[@id=\"71CwUpUPAm\"]") WebElement travelerLastName;
    @FindBy(xpath = "//*[@id=\"LS4AOK13Jh\"]") WebElement cardNumber;
    @FindBy(xpath = "//span[@class='atm-c-btn__text']") WebElement travelerSearchBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/main/div/section[1]/div/div/div[1]") WebElement validateTravelerText;

    @FindBy(how = How.XPATH, using = bookButtonWebElement) public WebElement bookButton;
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement) public WebElement hotelsButton;
    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement) public WebElement whereToSearch1;
    @FindBy(how = How.XPATH, using = bookHotelsValidationText) public WebElement bookHotelsText;


//      SignIn button functionality test
    public void signInButton() throws InterruptedException {
        signUpBtn.click();
        sleepFor(3);
    }
    public void joinNowButton() throws InterruptedException {
        joinNowBtn.click();
        selectOptionByVisibleText(titleArrow,"Mr.");
        sleepFor(5);
    }
    public void typeFirstName(String firstName) {
        firstNameBox.sendKeys(firstName);
    }
    public void typeMiddleName(String middleName) {
        middleNameBox.sendKeys(middleName);
    }
    public void typeLastName(String lastName) {
        lastNameBox.sendKeys(lastName);
    }
    public void typeDate(String date) throws InterruptedException {
        dateBox.sendKeys(date);
        sleepFor(4);
    }
    public void typeYear(String year) throws InterruptedException {
        yearBox.sendKeys(year);
        sleepFor(5);
    }
    public void monthAndGender() throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(monthBox,"01 - January");
        sleepFor(5);
        selectOptionByVisibleText(selectGenderBox,"Male (M)");
        sleepFor(4);
    }
    public void setValidateSignUp(){
        String expectedResult="Contact information";
        String actualResult=validateSignUpText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//       Contact information field test
    public void typeStreetName(String streetName) throws InterruptedException {
        streetField.sendKeys(streetName);
        sleepFor(3);
    }
    public void typeCityName(String cityName) throws InterruptedException {
        cityField.sendKeys(cityName);
        sleepFor(3);
    }
    public void typeStateName(String StateName) throws InterruptedException {
        stateField.sendKeys(StateName);
        sleepFor(3);
    }
    public void typeZipCode(String zipCode) throws InterruptedException {
        zipCodeField.sendKeys(zipCode);
        sleepFor(4);
    }
    public void ValidateContactInformation(String phone){
        String expectedResult=phone;
        String actualResult=validateContactText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Phone number field check
    public void typePhoneNumber(String phoneNum){
        mobileNumber.sendKeys(phoneNum);
    }
    public void typeExtensionPhone(String extension){
        extensionNum.sendKeys(extension);
    }
    public void typeBusinessPhone(String businessPhn){
        businessPhone.sendKeys(businessPhn);
    }
    public void typeExtensionBusinessPhn(String exBusiPhn){
        extensionBusiness.sendKeys(exBusiPhn);
    }
    public void typeAirportName(String airport) throws InterruptedException {
        airportName.sendKeys(airport);
        sleepFor(4);
    }
    public void checkBoxClick(){
        checkBox.click();
    }
    public void ValidatePhoneNumber(String email){
        String expectedResult=email;
        String actualResult=validatePhoneText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Email field test
    public void typeEmailAddressField(String email){
        emailAddressField.sendKeys(email);
    }
    public void typeVerifyEmailId(String verifyEmail) throws InterruptedException {
        verifyEmailId.sendKeys(verifyEmail);
        sleepFor(3);
    }
    public void checkAndUnCheckBox() throws InterruptedException {
        notifyCheckBox.click();
        sleepFor(3);
        boxUnCheck.click();
    }
    public void typePasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void typeReEnterPassword(String reEntPassword){
        reEnterPassword.sendKeys(reEntPassword);
    }
    public void showButton() throws InterruptedException {
        clickShowButton.click();
        sleepFor(3);
    }
    public void ValidateEmailField(String text){
        String expectedResult=text;
        String actualResult=validateEmailField.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

//      Security questions check
    public void questionAndAnswer1(String ans1) throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(question1,"What is your favorite sport?");
        sleepFor(5);
        answer1.sendKeys(ans1);
        sleepFor(4);
    }
    public void questionAndAnswer2(String ans2) throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(question2,"What is your favorite type of reading?");
        sleepFor(5);
        answer2.sendKeys(ans2);
        sleepFor(4);
    }
    public void questionAndAnswer3(String ans3) throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(question3,"What is your favorite type of movie?");
        sleepFor(5);
        answer3.sendKeys(ans3);
        sleepFor(4);
    }
    public void questionAndAnswer4(String ans4) throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(question4,"What is your favorite type of vacation?");
        sleepFor(5);
        answer4.sendKeys(ans4);
        sleepFor(4);
    }
    public void questionAndAnswer5(String ans5) throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(question5,"What is your favorite pizza topping?");
        sleepFor(5);
        answer5.sendKeys(ans5);
        sleepFor(4);
    }
    public void acceptAndEnrollBtn(){
        acceptAndEnrollButton.click();
    }




    public void flightStatusTab() {
        flightStatus.click();
    }

    public void fromAndToField() throws InterruptedException {
        fromField.sendKeys("New York");
        toField.sendKeys("Dhaka");
        sleepFor(3);
    }

    public void flightNumberAndDateField() {
        flightNumber.sendKeys("0987");
        dropDownBtn.click();
        selectedDate.click();
    }

    public void searchBtnCheck() {
        searchButton.click();
    }

    public void validateFlightStatus() {
        String actualResult = "DEPARTURE";
        String expectedResult = validateText.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    public void checkInTab() {
        checkIn.click();
    }

    public void ticketNumberField() {
        ticketNumber.sendKeys("87651234098715");
    }

    public void lastNameField() {
        lastName.sendKeys("Arman");
    }

    public void searchButtonClick() {
        searchBtn.submit();
    }

    public void validateCheckInfield() {
        String actualResult = "We couldn't find a reservation with the provided information.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // My Trip
    public void myTripTab() {
        myTrips.click();
    }

    public void confirmationNumberField() {
        myTripConfirmation.sendKeys("Ar21KL");
    }

    public void myTripLastNameField() {
        myTripLastName.sendKeys("Arman");
    }

    public void myTripSearchButtonClick() {
        myTripSearchBox.submit();
    }

    public void validateMyTripfield() {
        String actualResult = "Your confirmation number, a 6 character alphanumeric code, and/or last name is not valid.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    //    SearchIcon
    public void searchIconCheck(){
        searchIcon.click();
    }

    public void coronavirusUpdate() throws InterruptedException {
        coronavirusUpdateClick.click();
        sleepFor(2);
    }

    public void requestRefundClick() throws InterruptedException {
        requestRefundClick.click();
        sleepFor(2);
    }

    public void validateSearchIcon(){
        String actualResult = "Refund policies";
        String expectedResult = searchBtnText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    // Flight Receipt
    public void flightReceiptCheck() throws InterruptedException {
        flightReceipt.click();
        sleepFor(7);
        radioBtn.click();
    }


    public void enterLastName(){
        travelerLastName.sendKeys("Antor");
    }

    public void enterCardNumber(){
        cardNumber.sendKeys("3214");
    }

    public void searchButtonCheck(){
        travelerSearchBtn.click();
    }

    public void validateFlightReceipt(){
        String actualResult = "We couldn't find your receipt";
        String expectedResult = validateTravelerText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


//       Book button Check
    public void clickOnBookButton() throws InterruptedException {
        bookButton.click();
    }
    public void clickOnHotelButton() throws InterruptedException {
        hotelsButton.click();
    }
    public void textOnWhereToSearchBox(String searchItem) throws InterruptedException {
        driver.navigate().to("https://hotels.united.com/");
        whereToSearch1.sendKeys(searchItem);
        whereToSearch1.submit();
        Thread.sleep(3000);
    }
    public  void validateLandedPageText() throws InterruptedException {
        String expectedText="Miami Beach, Florida, United States of America";
        String actualText=bookHotelsText.getText();
        Assert.assertEquals("Text does not match",expectedText,actualText);
        Thread.sleep(3000);
    }
}
