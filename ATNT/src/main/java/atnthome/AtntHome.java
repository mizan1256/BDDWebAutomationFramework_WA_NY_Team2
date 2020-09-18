package atnthome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;


import static atnthome.AtntWebElement.*;

public class AtntHome extends WebAPI {
    public void accountIconButton(){
        clickOnElement(accountIconWebElement);
    }
    public void signInButton(){
        clickOnElement(signInButtonWebElement);
    }
    public void createButton(){
        clickOnElement(createButtonWebElement);
    }
    public void radioButton() {
        clickOnElement(wirelessRadioButtonWebElement);
    }
    public void continueButton(){
        clickOnElement(continueButtonWebElement);
    }
    public void validateSignUpText(String expectedResult){
        String actualResult= driver.findElement(By.xpath("//h3[contains(text(),'Sorry we could not validate your information.')]")).getText();
        Assert.assertEquals("Text do not match",expectedResult,actualResult);
    }

    /**
     * Atnt negative signIn test
     */
    By user_id=By.xpath("//input[@id='userID']");
    By user_Password=By.xpath("//*[@id=\"password\"]");
    By checkBox=By.xpath("//div[@class='checkbox-skin ng-tns-c33-0']");
    By btn_sign_in= By.xpath("//button[@id='signin']");
    By error_Text=By.xpath("//div[@id='errorDescArea']");

    public void enterUserId(String userId){
        driver.manage().deleteAllCookies();
        driver.findElement(user_id).sendKeys(userId);
    }
    public void enterUserPassword(String userPassword) {
        driver.findElement(user_Password).sendKeys(userPassword);
    }
    public void clickSignInButton(){
        driver.findElement(btn_sign_in).click();
    }
    public void validateSignInPage(){
        Assert.assertEquals("Double check your ID and password, and try again. If you haven't set up your account, tap the 'Create one now' link.",
                driver.findElement(error_Text).getText());
    }
/**
 * Atnt BurgerButton menu test
 *
 */

    By bur_btn_menu=By.xpath("//*[@id=\"z1-pullMenu-open\"]");
    By wireless_btn=By.xpath("//a[@class='slideout-toggle']//span[@class='auth-pull-left'][contains(text(),'Wireless')]");
    By explore_wireless_btn=By.xpath("//*[@id=\"ge5p-menu-label\"]");

    public void clickBurgBtnMenu() throws InterruptedException {
        driver.findElement(bur_btn_menu).click();
    }
    public void selectWirelessAndExploreBtn(){
        driver.findElement(wireless_btn).click();
        driver.findElement(explore_wireless_btn).click();
    }
    //validate method
    public void validateExploreWirelessTitle(){
        String expectedTitle="AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle,expectedTitle);
    }
}
