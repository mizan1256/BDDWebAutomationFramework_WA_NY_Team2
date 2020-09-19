package tripadvisorhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TripAdvisorHomePage extends WebAPI {
    @FindBy(xpath = "//span[contains(text(),'Restaurants')]")
    WebElement restaurantsButton;
    @FindBy(xpath = "//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m _3awdcWrG']//input[@placeholder='Where to?']")
    WebElement searchBox;
    @FindBy(xpath = "//a[@class='_1aRPCGmR YfjlVygM']//div[@class='_3a_rGDNB'][contains(text(),'Grass Valley')]")
    WebElement grassValley;
    @FindBy(xpath = "//a[contains(text(),'Outdoor Seating Available')]")
    WebElement outDoorSeatingAvailableText;


    public void restaurantsButton() throws InterruptedException {
        restaurantsButton.click();
        Thread.sleep(3000);
    }
    public void searchBox() throws InterruptedException {
        searchBox.sendKeys("Grass Valley");
        Thread.sleep(3000);
    }
    public void grassValley() throws InterruptedException {
        grassValley.click();
        Thread.sleep(3000);
    }
    public void outDoorSeatingAvailableText(){
        outDoorSeatingAvailableText.isDisplayed();
    }

}
