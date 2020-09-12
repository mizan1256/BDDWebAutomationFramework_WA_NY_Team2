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
    WebElement onlineBankingBtn;

    // https://onlinebanking.tdbank.com/#/authentication/login

    @FindBy(xpath = "//h1[@class='td-ui-login-app-title ng-binding']")
    WebElement onlineBankingText;

    public void logInIcon(){
        Actions actions=new Actions(driver);
        actions.moveToElement(logInIcon).perform();
    }

    public void onlineBankingCheck(){
        onlineBankingBtn.click();
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login");
    }
    public void validateOnlineText(){
        String expectedText="TD Bank Online Banking";
        String actualText=onlineBankingText.getText();
        Assert.assertEquals("Failed",expectedText,actualText);
    }


}
