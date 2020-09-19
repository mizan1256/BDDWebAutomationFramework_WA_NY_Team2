package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import targetecommarcehome.TargetEcommerceHome;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static TargetEcommerceHome targetEcommerceHome;
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
// Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp(); }
    @BeforeStep
    public void getInit(){
        targetEcommerceHome= PageFactory.initElements(driver,TargetEcommerceHome.class);
    }
    @Given("I am on Target home page")
    public void i_am_on_target_home_page() throws IOException {
        openBrowser("https://www.target.com/");
    }

    @Given("I validate search box displays")
    public void i_validate_search_box_displays() throws InterruptedException {
        targetEcommerceHome.searchBoxIsDisplayed();
    }
}















