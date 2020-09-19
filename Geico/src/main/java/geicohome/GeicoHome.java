package geicohome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static geicohome.GeicoElement.*;

public class GeicoHome extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementAutoButton) public WebElement autoButton;
    @FindBy(how = How.XPATH, using = webElementCheckButton) public WebElement checkButton;
    @FindBy(how = How.XPATH, using = webElementAddProperty) public WebElement addProperty;
    @FindBy(how = How.XPATH, using = webElementStartQuote) public  WebElement startQuote;
    @FindBy(how = How.XPATH,using = webElementContactUsText) public WebElement contactUsText;

    /**
     *
     * Geico AutoButton Functional Check
     */

    // Action Method
    public void autoButtonClickable() throws InterruptedException {
        autoButton.click();
        Thread.sleep(3000);
    }
    public void checkButton() throws InterruptedException {
        checkButton.click();
        Thread.sleep(3000);
    }
    public void startQuote(){
        startQuote.click();
    }

    // Validation method
    public void contactUsText(){
       String expectedTitle = "GEICO";
       String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
       Assert.assertEquals("Title doesn't match", actualTitle, expectedTitle);

    }

}
