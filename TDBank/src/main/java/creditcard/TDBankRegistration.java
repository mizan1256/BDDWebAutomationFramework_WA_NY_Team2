package creditcard;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static creditcard.TDBankWebElement.*;


public class TDBankRegistration extends WebAPI {

    @FindBy(how = How.XPATH, using = creditCardIconWebElement)
    public WebElement creditCardIcon;

    @FindBy(how = How.XPATH, using = tdCashCreditCardBtnWebElement)
    public WebElement tdCashCreditCardBtn;

    @FindBy(how = How.XPATH, using = cashCardImageWebElement)
    public WebElement cashCardImage;

    @FindBy(how = How.XPATH, using = tdFirstClassCardWebElement)
    public WebElement tdFirstClassCard;

    @FindBy(how = How.XPATH, using = firstClassImageWebElement)
    public WebElement firstClassImage;

    @FindBy(how = How.XPATH, using = helpMeChooseBtnWebElement)
    public WebElement helpMeChooseBtn;

    @FindBy(how = How.XPATH, using = cashBtnWebElement)
    public WebElement cashBtn;

    @FindBy(how = How.XPATH, using = nextBtnWebElement)
    public WebElement nextBtn;

    @FindBy(how = How.XPATH, using = helpValidateTextWebElement)
    public WebElement helpValidateText;

    /**
     * TD bank Credit Card home page display check
     */
    public void clickOnCreditIcon() throws InterruptedException {
        creditCardIcon.click();
        sleepFor(3);
    }

    public void validateCredCardHome() {
        String expectedTitle = "Apply for a Credit Card Online | TD Bank Rewards Credit Cards";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle, expectedTitle);
    }

    /**
     * TD bank Credit Card home page display check
     */
    public void clickOnTdCashCreditCard() {
        tdCashCreditCardBtn.click();
    }

    public void validateCashCreditCardImage() {
        cashCardImage.isDisplayed();
    }

    public void validateCashCreditCardTitle() {
        String expectedTitle = "TD Cash Credit Card | Dining and Grocery Rewards Card";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle, expectedTitle);
    }

    /**
     * Td First Class Credit Card page display check
     */
    public void clickOnTdFirstClassCreditCard() {
        tdFirstClassCard.click();
    }

    public void validateTdFirstClassCreditCardImage() {
        firstClassImage.isDisplayed();
    }

    public void validateTdFirstClassCreditCardTitle() {
        String expectedTitle = "Airline Miles Rewards Card | TD First Class Visa Signature Credit Card";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle, expectedTitle);
    }

    /**
     * Help me choose button check
     */
    public void clickOnHelpMeBtn() {
        helpMeChooseBtn.click();
    }

    public void clickOnCashAndNextBtn() {
        cashBtn.click();
        nextBtn.click();
    }

    public void validateHelpValidateTextText(String expectedResult) {
        String actualResult = helpValidateText.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);

    }
}
