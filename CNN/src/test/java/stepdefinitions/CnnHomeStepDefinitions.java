package stepdefinitions;

import cnnhome.CnnHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class CnnHomeStepDefinitions extends WebAPI {
    static CnnHomePage cnnHomePage;
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // ... and embed it in the report.
        }
        cleanUp();
    }
    @BeforeStep
    public void getInIt(){
        cnnHomePage= PageFactory.initElements(driver, CnnHomePage.class);
    }
}
