package aetnahome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static aetnahome.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH,using =shopForPlanWebElements)
    public WebElement shopForPlan;
    @FindBy(how=How.XPATH, using = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[1]/button")
    WebElement healthCoverage;
//    By findADoctor= By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[1]/div[2]/ul/li[2]/a");
    @FindBy(how = How.XPATH,using = "//ul[@class='megamenu__tertiary--main']//a[@class='megamenu__tertiary--link link__text--inline--tertiary'][contains(text(),'Find a doctor')]")
    public WebElement findDoctor;

    public void clickShopForPlan() {
        shopForPlan.click();
    }
    public void checkHealthCoverageButton() throws InterruptedException {
    healthCoverage.click();
    }

    public void clickFindADoctor(){
       findDoctor.click();
    }
    public void checkVerifyTitle(){
        String expectedTitle=driver.getTitle();
        String actualTitle="Find a Doctor, Dentist or Hospital | Aetna";
        Assert.assertEquals("Test Failed",expectedTitle,actualTitle);
    }

}
