package geico;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static geico.GeicoWebElements.*;

public class Geico extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementsGeicoCareerButton)
    public WebElement geicoCareerButton;

    @FindBy(id = "cookie-notice-close")
    WebElement acceptBtn;

    @FindBy(xpath = "//span[@class='font--bluejay geico-icon icon-live-chat']")
    WebElement customerServiceBtn;

    @FindBy(xpath = "//h1[contains(text(),'Customer Service Careers')]")
    WebElement customerServiceText;

    @FindBy(how = How.XPATH,using = webElementsGeicoContactUsButton)
    public WebElement geicoContactUsButton;

    @FindBy(how = How.XPATH,using = webElementsGeicoPrivacyButton)
    public WebElement geicoPrivacyButton;



    public void clickCareerBtn() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        acceptBtn.click();
        geicoCareerButton.click();

    }

    public void clickCustomerServiceBtn() throws InterruptedException {
        Thread.sleep(3000);
        customerServiceBtn.click();
    }

    public void validateText(){
        String expectedText=customerServiceText.getText();
        String actualText="Customer Service Careers";
        Assert.assertEquals("Test Failed",expectedText,actualText);
    }
}
