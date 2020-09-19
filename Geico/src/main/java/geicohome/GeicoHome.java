package geicohome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static geicohome.GeicoHomeWebElement.*;

public class GeicoHome extends WebAPI {

    @FindBy(how = How.XPATH, using = homeSearchButton)
    public WebElement searchIcon;
    @FindBy(how = How.XPATH, using = homeSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homeSearchItemButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = homeSearchItemText)
    public WebElement searchItemText;
    @FindBy(how = How.XPATH, using = autoSearchSite)
    public WebElement manageAccount;


    /**
     * Search Button Check
     */
    public void searchIconCheck() throws InterruptedException {
        searchIcon.click();
        Thread.sleep(2000);
    }

    public void searchBoxCheck() throws InterruptedException {
        searchBox.sendKeys("Auto");
        Thread.sleep(2000);
    }

    public void searchButtonCheck() {
        searchButton.click();
    }

    public void validateSearchIconCheck(String string) {
        String expectedResult = string;
        String actualResult = searchItemText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Auto Search Site Check
     */
    public void autoSearchSite() throws InterruptedException {
        manageAccount.click();
        Thread.sleep(2000);
    }

    // Validate Method
    public void validateAutoSearchSite(String expectedResult) {
        String actualResult = searchItemText.getText();

    }



}
