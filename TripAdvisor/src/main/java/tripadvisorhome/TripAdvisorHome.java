package tripadvisorhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripAdvisorHome extends WebAPI {

    @FindBy(xpath = "//input[@placeholder='Where to?']")
     WebElement searchBox;
    @FindBy(xpath = "//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m']//span[@class='_2LyoLJ4U _2HBN-k68 _3LkX-HIr']")
     WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"search-filters\"]/ul/li[2]/a")
    WebElement hotelBtn;
    @FindBy(xpath = "//span[@class='title-query']")
     WebElement texasText;
    @FindBy(xpath = "//*[@id=\"search-filters\"]/ul/li[3]/a")
    WebElement vacationBtn;
    @FindBy(xpath = "//*[@id=\"search-filters\"]/ul/li[4]/a")
    WebElement restaurantBtn;
    @FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div[1]/span")
    WebElement restaurantTexasRoad;
    @FindBy(xpath = "//*[@id=\"taplc_resp_rr_photo_mosaic_0\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/img")
    WebElement foodImage;
    @FindBy(xpath = "//*[@id=\"taplc_pv_resp_content_hero_0\"]/div/div[1]/div[4]/div")
    WebElement restaurantGallery;
    @FindBy(xpath = "//*[@id=\"taplc_pv_resp_content_grid_0\"]/div[2]/div/div[2]/div")
    WebElement image;
    @FindBy(xpath = "//*[@id=\"lithium-root\"]/main/div[1]/div[1]/div/div/div[6]/a")
    WebElement travelForum;
    @FindBy(xpath = "//span[contains(text(),'Flights')]")
    WebElement flight;
    @FindBy(xpath = "//*[@id=\"taplc_trip_search_home_flights_0\"]/div[2]/div/span/div[1]/div[2]/div[1]/div/div[1]/input[2]")
    WebElement fromField;
    @FindBy(xpath = "//*[@id=\"taplc_trip_search_home_flights_0\"]/div[2]/div/span/div[1]/div[2]/div[1]/div/div[2]/input[2]")
    WebElement toField;
    @FindBy(xpath = "//*[@id=\"rt_ui_picker\"]/span[1]/span[2]")
    WebElement calender;
    @FindBy(xpath = "//*[@id=\"cos_ui_picker\"]/div/span[3]")
    WebElement person;
    @FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/span/div[3]/div/div/div[1]/div[1]/span[2]")
    WebElement selectClass;
    @FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/span/div[3]/div/div/div[3]/div[2]/span[2]")
    WebElement addPerson;
    @FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/span/div[3]/div/div/div[10]/span")
    WebElement closeBtn;
    @FindBy(xpath = "//div[@class='ui_column submit_wrap']")
    WebElement findFlight;
    @FindBy(xpath = "//*[@id=\"leftRailFilter\"]/div/div/div/div/div[4]")
    WebElement travelForumText;
    @FindBy(xpath = "//*[@id=\"taplc_trip_search_home_flights_0\"]/div[2]/div/div[1]/ul/li[2]/div/a/text()")
    WebElement oneWay;
    @FindBy(xpath = "//*[@id=\"ow_ui_picker\"]/span[2]")
    WebElement departureDate;
    @FindBy(xpath = "//*[@id=\"lithium-root\"]/main/div[1]/div[1]/div/div/div[3]/a")
    WebElement thingsTo;
    @FindBy(xpath = "/html/body/div[2]/div/form/input[1]")
    WebElement searchBox1;
    @FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[1]/div/div/div/span/span")
    WebElement dhakaCityText;
    @FindBy(xpath = "//*[@id=\"lithium-root\"]/main/div[1]/div[1]/div/div/div[18]/div/button/span/span[2]/span")
    WebElement moreButton;
    @FindBy(xpath = "//*[@id=\"taplc_airlines_lander_main_0\"]/div/div[3]/div/div[1]/div[1]/a[1]/div")
    WebElement advanceAir;
    @FindBy(xpath = "//*[@id=\"component_1\"]/div/div[3]/div[1]/div[1]/div/h1")
    WebElement advanceAirText;
    @FindBy(xpath = "//*[@id=\"lithium-root\"]/header/div/nav/div[5]/a")
    WebElement tripBtn;
    @FindBy(xpath = "//button[@class='ui_button primary']")
    WebElement getStart;
    @FindBy(xpath = "//iframe[@id='overlayRegFrame']")
    WebElement reCapcha;
    @FindBy(xpath = "//span[contains(text(),'Post')]")
    WebElement postBtn;
    @FindBy(xpath = "//a[contains(text(),'Post photos')]")
    WebElement postPhoto;
    @FindBy(xpath = "//input[@id='type_hotel']")
    WebElement hotelRadioBtn;
    @FindBy(xpath = "//input[@id='query']")
    WebElement enterHotelAndCity;
    @FindBy(xpath = "//span[@class='ui_icon search searchButtonIcon']")
    WebElement clickSearchBtn;
    @FindBy(xpath = "//*[@id=\"detail_4116156\"]")
    WebElement hotel71RadioBtn;
    @FindBy(xpath = "//span[contains(text(),'Post photos')]")
    WebElement postPhotoBtn;
    @FindBy(xpath = "//span[contains(text(),'Add photos')]")
    WebElement addPhoto;
    @FindBy(xpath = "//div[@class='ui_button primary addPhotoBtn']")
    WebElement selectComputerPhoto;
    /**
     * Where to search box check
     */
    public void WhereToSearchBox() {
        searchBox.sendKeys("Texas");
    }

    public void searchButtonClick() throws InterruptedException {
        searchButton.click();
        sleepFor(2);
    }

    public void hotelButtonClick() throws InterruptedException {
        sleepFor(5);
        hotelBtn.click();
    }

    public void validateWhereToSearchBox() {
        String actualResult = "Texas";
        String expectedResult = texasText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Vacation Rentals
     */
    public void vacationRentalsTabCheck() {
        vacationBtn.click();
    }

    /**
     * Restaurant
     */
    public void restaurantTabCheck() {
        restaurantBtn.click();
    }

    public void texasRoadHouse() {
        restaurantTexasRoad.click();
    }

    public void navigateTexasRoadHouse() {
        driver.navigate().to("https://www.tripadvisor.com/Restaurant_Review-g34352-d3163403-Reviews-Texas_Roadhouse-Kissimmee_Florida.html#photos;aggregationId=101&albumid=101&filter=7&ff=329087348");
    }

    public void foodImageClick() {
        foodImage.click();
    }

    public void restaurantGallery() {
        restaurantGallery.click();
    }

    public void validateRestaurant() {
        image.isDisplayed();
    }

// public void tripAdvisorHotelTabButton() throws InterruptedException {
// clickByXpath(tripAdvisorHotelTab);
// Thread.sleep(3000);
// typeOnElementNEnter(tripAdvisorWhereToSearchBox, "Texas");
// Thread.sleep(3000);
// clickByXpath(tripAdvisorHotelButton);
// Thread.sleep(3000);
// }
    /**
     * Travel Forum
     */
    public void travelForumCheck() throws InterruptedException {
        travelForum.click();
        sleepFor(3);
    }

    public void flightTab() throws InterruptedException {
        flight.click();
        sleepFor(3);
    }

    public void whereFromToField() throws InterruptedException {
        fromField.sendKeys("New York");
        sleepFor(3);
        toField.sendKeys("Dhaka");
        sleepFor(3);
    }

    String dateValue = "Sep 20,2020";
    String returnDate = "10/25/2020";

    public void calenderCheckIn() throws InterruptedException {
        calender.click();
        sleepFor(3);
        selectDateByJSWithTwoValue(driver, calender, dateValue, returnDate);
        Thread.sleep(4000);
    }

    public void personField() throws InterruptedException {
        person.click();
        addPerson.click();
        closeBtn.click();
        sleepFor(2);
    }

    public void findFlightBox() throws InterruptedException {
        findFlight.click();
    }

    public void validateTravelForum() {
        String expectedResult = "COVID-19 Policies";
        String actualResult = travelForumText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * One Way Trip
     */
    public void travelForumAndFlightClick() throws InterruptedException {
        travelForum.click();
        sleepFor(2);
        flight.click();
        sleepFor(2);
    }

    public void oneWayTab() {
        oneWay.click();
    }

    String departureValue = "Sep 20,2020";

    public void calenderOneWay() throws InterruptedException {
        departureDate.click();
        sleepFor(3);
        selectDateByJS(driver, departureDate, departureValue);
        Thread.sleep(4000);
    }

    /**
     * Things To Do
     */
    public void thingsToDoCheck() {
        thingsTo.click();
    }

    public void dhakaCity() {
        typeOnElementAndEnter(searchBox, "Dhaka City");
    }

    public void validateThingsToDo() {
        String expectedResult = "Dhaka City";
        String actualResult = dhakaCityText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    /**
     * Trip Tab
     */
    public void tripTabBtn() {
        tripBtn.click();
    }

    public void getStartBtn() {
        getStart.click();
    }

    public void validateTripBtn() {
        reCapcha.isDisplayed();
    }

    /**
     * Post Tab Button
     */
    public void postTabButton() {
        postBtn.click();
    }

    public void postPhotoDropDownBtn() throws InterruptedException {
        postPhoto.click();
        sleepFor(3);
    }

    public void hotelRadioButton() {
        hotelRadioBtn.click();
    }

    public void enterHotelAndCityName() throws InterruptedException {
        enterHotelAndCity.sendKeys("Hotel71, Dhaka City, Bangladesh");
        clickSearchBtn.click();
        sleepFor(3);
    }

    public void hotel71RadioButton() throws InterruptedException {
        hotel71RadioBtn.click();
        sleepFor(3);
    }

    public void postPhotoButton() {
        postPhotoBtn.click();
        addPhoto.click();
    }

    public void selectPhotoFromComputer() throws InterruptedException {
        selectComputerPhoto.click();
        sleepFor(3);
    }

}
