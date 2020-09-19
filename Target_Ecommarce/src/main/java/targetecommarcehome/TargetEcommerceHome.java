package targetecommarcehome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static targetecommarcehome.TargetEcommerceElement.*;

public class TargetEcommerceHome extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementSearchBox) public WebElement searchBox;

    @FindBy(how = How.XPATH, using = webElementSearchButton) public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSocialButton) public WebElement socialButton;
    @FindBy(how = How.XPATH, using = webElementSocialButtonText) public WebElement validateSocialButtonText;

    @FindBy(how = How.XPATH, using = webElementHelpButton) public WebElement helpButton;
    @FindBy(how = How.XPATH, using = webElementStoresButton) public WebElement storesButton;
    @FindBy(how = How.XPATH, using = webElementAppsButton) public WebElement appsButton;
    @FindBy(how = How.XPATH, using = webElementMoreButton) public WebElement moreButtonIsClickable;
    @FindBy(how = How.XPATH, using = shopAllWebElement) public WebElement shopAll;
    @FindBy(how = How.XPATH, using = featuresCategoriesWebElement) public WebElement featuresCategories;

    //Action Method
    public void searchBoxIsDisplayed() throws InterruptedException {
        searchBox.isDisplayed();
    }
    // Validation method
    public void validateSearchBoxIsDisplayed(String expectedResult){
        String actualResult = getTextByXpath(webElementMoreButton);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
