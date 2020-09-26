package tripadvisorhome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HotelBookPage extends WebAPI {

    //WebElements:
    @FindBy(xpath = "//span[contains(text(),'Hotels')]")
    WebElement hotelsBtn;

    @FindBy(xpath = "//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m _3awdcWrG']//input[@placeholder='Where to?']")
    WebElement wheretoTextField;

    @FindBy(xpath = "//a[@class='_1dvyiAq4 _3_eHAvcJ']//div[@class='HLvj7Lh5 nlBtua89'][contains(text(),'Niagara Falls')]")
    WebElement NiagaraFallsCanada;

    @FindBy(xpath = "//span[contains(text(),'Check In')]")
    WebElement checkInBox;
    @FindBy(xpath = "//div[@class='_1VNxysVD']//div[1]//div[3]//div[1]//div[5]")
    WebElement checkInDate;

    @FindBy(xpath = "//span[contains(text(),'Check Out')]")
    WebElement checkOutBox;
    @FindBy(xpath = "//div[@class='isgB-Yem low'][contains(text(),'4')]")
    WebElement checkOutDate;


    @FindBy(xpath = "//button[@class='ui_button primary fullwidth' and text()='Update']")
    WebElement updateGuestBtn;

    @FindBy(xpath = "//div[contains(@class,'listing collapsed recently_viewed')]//div[contains(@class,'comm-col display-so')]//div[contains(@class,'ui_button original view_deal __resizeWatch')][contains(text(),'View Deal')]")
    WebElement crownPlazaViewDealBtn;

    @FindBy(xpath = "//select[@class='pTwo ng-pristine ng-valid ng-scope ng-empty ng-touched']")
    WebElement crownPlazaCurrencyDropdown;

    @FindBy(xpath = "//div[contains(text(),'One Bed')]")
    WebElement oneBedIcon;

    @FindBy(xpath = "//div[@class='tab-pane ng-scope active']//div[@class='roomContainer first']//span[@class='ng-binding'][contains(text(),'SELECT ROOM')]")
    WebElement queenBedSelectRoomBtn;

    @FindBy(xpath = "//div[@id='IDAFS']//div//span[@class='fa-update defaultCheckbox ng-scope']//*[local-name()='svg']")
    WebElement standardRateBtn;

    @FindBy(xpath = "//div[contains(@class,'hidden-sm hidden-xs')]//rate-upsells[contains(@class,'rate-upsells-component ng-isolate-scope')]//div//div[contains(@class,'selectRateCTAText sized-text hidden-xs hidden-sm hThree ng-binding')][contains(text(),'Select Rate')]")
    WebElement selectRateBtn;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//select[@id='country/region']")
    WebElement countryDropdown;

    @FindBy(xpath = "//select[@id='sel1']")
    WebElement stateDropdown;

    @FindBy(xpath = "//input[@id='address']")
    WebElement addressField;

    @FindBy(xpath = "//input[@id='city/town']")
    WebElement cityField;

    @FindBy(xpath = "//input[@id='postalcode']")
    WebElement postalCodeField;

    @FindBy(xpath = "//select[@id='country/regionCode']")
    WebElement countryCodeDropdown;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement phoneNumberField;

    @FindBy(xpath = "//input[@id='cardNumberElement']")
    WebElement cardNumberField;

    @FindBy(xpath = "//select[@id='cardExpirationMonthElement']")
    WebElement cardExpMonthDropdown;

    @FindBy(xpath = "//select[@id='cardExpirationYearElement']")
    WebElement cardExpYearDropdown;

    @FindBy(xpath = "//span[@class='checkmark']")
    WebElement certifyCheckMark;

    @FindBy(xpath = "//span[contains(text(),'BOOK RESERVATION')]")
    WebElement bookReservationBtn;



    /**
     * All the Actions Methods for TripAdvisor Hotels Booking From Start to End
     */

    public void clickOnHotelsBtn(){
        clickOnElement(hotelsBtn);
    }
    public void enterDestination(String destinationName){
       typeOnElement(wheretoTextField,destinationName);
       clickOnElement(NiagaraFallsCanada);
    }


    public void enterCheckInDate(String checkInDate){
        checkInBox.click();
        sleepFor(2);
        //clickOnElement(checkInDate);

        selectDateByJS(driver, checkInBox,checkInDate);
    }
    public void enterCheckOutDate(String checkOutDate ) {
        checkOutBox.click();
        sleepFor(2);
        //clickOnElement(checkOutDate);

        selectDateByJS(driver, checkOutBox, checkOutDate);
        sleepFor(2);
    }
    public void clickOnUpdateGuestBtn(){
        clickOnElement(updateGuestBtn);
    }
    public void clickOnViewDealBtn(){
        clickOnElement(crownPlazaViewDealBtn);
    }
    public void navigateToCrownPlaza(){
        driver.navigate().to("https://www.crowneplaza.com/hotels/us/en/find-hotels/hotel/rooms?qDest=5685%20Falls%20Avenue,%20Niagara%20Falls,%20ON,%20CA&qCiMy=92020&qCiD=1&qCoMy=92020&qCoD=4&qAdlt=2&qChld=0&qRms=1&qRtP=6CBARC&qIta=99636810&qSlH=IAGFA&qAkamaiCC=US&qSrt=sBR&qBrs=re.ic.in.vn.cp.vx.hi.ex.rs.cv.sb.cw.ma.ul.ki.va.ii.sp.nd.ct.sx&qAAR=6CBARC&qWch=0&qSmP=1&cm_mmc=mdpr-_-SPON-_-tripadvisorUS-_-dm-_-cp_iagfa-_-X2zppQokHnAAAB3phAUAAABb-_-US-SPDesktop-_-2020-10-01-_-3-_-2-_-FALSE&setPMCookies=true&glat=META_mdpr-_-SPON-_-tripadvisorUS-_-dm-_-cp_iagfa-_-X2zppQokHnAAAB3phAUAAABb-_-US-SPDesktop-_-2020-10-01-_-3-_-2-_-FALSE&qRad=30&qRdU=mi&srb_u=1&qSHBrC=CP&icdv=99636810");
    }
    public void changeCurrency(){
        selectFromDropdownByVisibleText(crownPlazaCurrencyDropdown,"USD");
    }
    public void clickOnOneBed(){
        clickOnElement(oneBedIcon);
    }
    public void clickSelectRoomBtn(){
        clickOnElement(queenBedSelectRoomBtn);
    }
    public void clickOnStandardRate(){
        clickOnElement(standardRateBtn);
    }
    public void clickOnSelectRateBtn(){
        clickOnElement(selectRateBtn);
    }
    public void enterFirstName(String firstName){
        typeOnElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName){
        typeOnElement(lastNameField,lastName);
    }
    public void enterEmail(String email){
        typeOnElement(emailField,email);
    }
    public void enterAddress(String address){
        typeOnElement(addressField,address);
    }
    public void enterCity(String city){
        typeOnElement(cityField,city);
    }
    public void enterPostalCode(String postalCode){
        typeOnElement(postalCodeField,postalCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        typeOnElement(phoneNumberField,phoneNumber);
    }
    public void enterCardNumber(String cardNumber){
        typeOnElement(cardNumberField,cardNumber);
    }

    public void selectCountryFromDropdown(String country){
        selectFromDropdownByVisibleText(countryDropdown,country);
    }
    public void selectStateFromDropdown(String state){
        selectFromDropdownByVisibleText(stateDropdown,state);
    }
    public void selectCountryCodeFromDropdown(String countryCode){
        selectFromDropdownByVisibleText(countryCodeDropdown,countryCode);
    }
    public void selectCardExpMonth(String monthExp){
        selectFromDropdownByVisibleText(cardExpMonthDropdown,monthExp);
    }
    public void selectCardExpYear(String yearExp){
        selectFromDropdownByVisibleText(cardExpYearDropdown,yearExp);
    }
    public void clickCheckMark(){
        clickOnElement(certifyCheckMark);
    }
    public void clickReservationBtn(){
        clickOnElement(bookReservationBtn);
    }













}
