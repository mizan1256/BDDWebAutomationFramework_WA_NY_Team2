package tdbankhome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TDBankHome extends WebAPI {

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']")
    WebElement logInIcon;
    @FindBy(xpath = "//div[@class='td-col']//a[contains(text(),'Online Banking')]")
    WebElement onlineBanking;
    @FindBy(xpath = "//h1[@class='td-ui-login-app-title ng-binding']")
    WebElement validateText;


    public void logInIcon() {
        Actions action = new Actions(driver);
        action.moveToElement(logInIcon).perform();
    }

    public void onlineBanking() {
        onlineBanking.click();
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login");
    }

    public void validateLogInIcon() {
        String actualResult = "Welcome to Online Banking";
        String expectedResult = validateText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
