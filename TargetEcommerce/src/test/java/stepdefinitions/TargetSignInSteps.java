package stepdefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import targethome.TargetSignInPage;

import java.io.IOException;
import java.util.List;

public class TargetSignInSteps extends WebAPI {

    TargetSignInPage targetSignInPage;

    @BeforeStep
    public void getInit(){
        targetSignInPage = PageFactory.initElements(driver,TargetSignInPage.class);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            //Take a screenshot
        final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","Demo");
        }
        driver.quit();
    }





    //Target SignIn Steps

    @When("I click on sign in drop down")
    public void i_click_on_sign_in_drop_down() {
        targetSignInPage.clickOnSignInDropdown();
        sleepFor(3);

    }

    @When("I click on sign in link")
    public void i_click_on_sign_in_link() {
        targetSignInPage.clickOnSignInLink();


    }

    @When("I enter email and password into respective fields")
    public void i_enter_email_and_password_into_respective_fields(DataTable table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

        List<List<String>> data = table.asLists(String.class);
        targetSignInPage.enterEmail(data.get(1).get(0));
        targetSignInPage.enterPassword(data.get(1).get(1));
        sleepFor(2);




    }

    @When("I click on sign in button")
    public void i_click_on_sign_in_button() {
        targetSignInPage.clickOnSignInBtn();
        sleepFor(3);

    }

    @Then("I verify that it signed in properly")
    public void i_verify_that_it_signed_in_properly() {
        targetSignInPage.verifySuccessfulSignIn();

    }


}
