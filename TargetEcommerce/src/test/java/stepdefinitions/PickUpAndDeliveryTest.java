package stepdefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import pickupanddelivery.PickUpAndDeliveryHome;


public class PickUpAndDeliveryTest extends WebAPI {
    static PickUpAndDeliveryHome pickUpAndDeliveryHome;
    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public void getInIt() {
        pickUpAndDeliveryHome = PageFactory.initElements(driver, PickUpAndDeliveryHome.class);
    }
    /**
     *Target order pick up button check
     */

    @When("I click on pickUp and delivery button")
    public void i_click_on_pick_up_and_delivery_button() {
        pickUpAndDeliveryHome.clickOnPickUpAndDeliveryBtn();
    }

    @When("I click on Order pickUp button")
    public void i_click_on_order_pick_up_button() {
        pickUpAndDeliveryHome.clickOnOrderPickUpBtnBtn();
    }

    @Then("I validate order pickUp home page")
    public void i_validate_order_pick_up_home_page() {
        pickUpAndDeliveryHome.validateOrderPickUpPageTitle("Target : Expect More. Pay Less.");
    }
    /**
     * Oder pickUp searchBox functionality check
     */

    @When("I do necessary steps to land on oder pickUp home page")
    public void i_do_necessary_steps_to_land_on_oder_pick_up_home_page() throws InterruptedException {
        pickUpAndDeliveryHome.necessaryStepForOderPickUp();
    }

    @When("I enter {string} as order number in order searchBox and click searchBox Icon")
    public void i_enter_as_order_number_in_order_search_box_and_click_search_box_icon(String searchItem) throws InterruptedException {
        pickUpAndDeliveryHome.orderPickUpSearchBox(searchItem);
    }

    @Then("I validate search result message")
    public void i_validate_search_result_message() throws InterruptedException {
        pickUpAndDeliveryHome.validateOrderPickUp("Sorry, we couldn't find any results for \"655473634747\"");
    }
    /**
     *Same day delivery page check
     */
    @When("I click on same day delivery button")
    public void i_click_on_same_day_delivery_button() throws InterruptedException {
        pickUpAndDeliveryHome.sameDayDeliveryCheck();
    }

    @Then("I validate {string} as same day delivery home page")
    public void i_validate_as_same_day_delivery_home_page(String validationText) throws InterruptedException {
        pickUpAndDeliveryHome.validateSameDayDeliveryCheck(validationText);
    }
/**
 *
 */
@When("I do necessary steps to land on signIn page")
public void i_do_necessary_steps_to_land_on_sign_in_page() throws InterruptedException {
    pickUpAndDeliveryHome.necessaryStepsToSameDayDeliveryLogIn();
}

    @When("I enter {string} as email and {string} as password")
    public void i_enter_as_email_and_as_password(String email, String password) throws InterruptedException {
        pickUpAndDeliveryHome.enterUserInfoSameDayDeliverySignIn(email,password);
    }

    @Then("I validate my address after successfully login")
    public void i_validate_my_address_after_successfully_login() {
        pickUpAndDeliveryHome.validateSameDaySignIn("Delivery is available");
    }
    /**
     *Drive Up home page check
     */

    @When("I click on drive up button")
    public void i_click_on_drive_up_button() {
        pickUpAndDeliveryHome.clickOnDriveUpBtn();
    }

    @Then("I validate drive up home page Title")
    public void i_validate_drive_up_home_page_title() {
        pickUpAndDeliveryHome.validateClickOnDriveUpBtnTitle("Target : Expect More. Pay Less.");
    }
}
