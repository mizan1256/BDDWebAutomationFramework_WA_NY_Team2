package cnnhome;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomeWebElements.*;


public class CnnHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementCnnLogo)
    public WebElement cnnLogo;
    @FindBy(how = How.XPATH, using = webElementLogInIcon)
    public WebElement cnnLogInIcon;
    @FindBy(how = How.XPATH, using = webElementCnnSearchIcon)
    public WebElement cnnSearchIcon;
    @FindBy(how = How.XPATH, using = webElementCnnSearchBox)
    public WebElement cnnSearchBox;
    @FindBy(how = How.XPATH, using = webElementSearchTextIcon)
    public WebElement cnnSearchBoxTextIcon;
    @FindBy(how = How.XPATH, using = editionIconWebElement)
    public WebElement editionIcon;
    @FindBy(how = How.XPATH, using = usBtnWebElement)
    public WebElement usBtn;
    @FindBy(how = How.XPATH, using = internationalBtnWebElement)
    public WebElement internationalBtn;
    @FindBy(how = How.XPATH, using = arabicBtnWebElement)
    public WebElement arabicBtn;
    @FindBy(how = How.XPATH, using = spanishBtnWebElement)
    public WebElement spanishBtn;

    /**
     * Cnn SearchBox functionality check
     * @param searchItem
     * @throws InterruptedException
     */
    public void cnnSearchBoxCheck(String searchItem) throws InterruptedException {
        cnnSearchIcon.click();
        cnnSearchBox.clear();
        cnnSearchBox.sendKeys(searchItem);
        cnnSearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    public void validateCNNSearchBoxTypeAble(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com",driver.getTitle());
    }
    /**
     * Cnn search box check using data table
     */
    public void validateDataTablePageTitle(String actualTitle){
        System.out.println(driver.getTitle());
        Assert.assertEquals(actualTitle,driver.getTitle());
    }
    /**
     * Cnn edition button check
     */
    public void clickOnEditionBtn() throws InterruptedException {
        sleepFor(6);
        editionIcon.click();
        sleepFor(2);
    }
    public void selectFromEditionDropDown() throws InterruptedException {
        usBtn.click();
        sleepFor(6);
        editionIcon.click();
        sleepFor(2);
        internationalBtn.click();
        sleepFor(6);
        editionIcon.click();
        sleepFor(2);
//        arabicBtn.click();
//        sleepFor(4);
//        goBackToHomeWindow();
//        editionIcon.click();
//        sleepFor(2);
        spanishBtn.click();
    }
    public void validateEditionBtn(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNN en Español | Últimas noticias en español de Latinoamérica, Estados Unidos y el mundo",driver.getTitle());
    }
}
