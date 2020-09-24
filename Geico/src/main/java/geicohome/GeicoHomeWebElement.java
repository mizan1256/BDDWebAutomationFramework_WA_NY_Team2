package geicohome;

import common.WebAPI;

public class GeicoHomeWebElement extends WebAPI {
    public static final String homeSearchButton = "//span[@class='icon-search right-icons-separator']";
    public static final String homeSearchBox = "//div[@class='panel-wrapper right search no-mobile open']//input[@name='term']";
    public static final String homeSearchItemButton = "//form[@class='search-box']//button[@class='btn btn--secondary']";
    public static final String homeSearchItemText = "//h1[contains(text(),'Site Search')]";
    public static final String autoSearchSite = "//div[@class='coveo-facet-wrap']//div[2]//ul[1]//li[1]//label[1]";

    public static final String searchLogoXpathWebElement="//span[@class='icon-search right-icons-separator']";
    public static final String searchBoxXpathElement = "//div[6]//form[1]//input[1]";
    public static final String searchButtonBoxXpathElement = "//div[6]//form[1]//button[1]";
    public static final String siteSearchTextButtonBoxXpathElement = "//h1[contains(text(),'Site Search')]";

    //login
    public static final String LoginXpathElement = "//a[@class='login header-right-label small']";
    public static final String accessPolicyXpathWebElement = "//*[@id=\"homepage_manage_select\"]/option[4]";
    public static final String clickToLoginWebElement = "//div[@id='homepage_manage_ecams_form']//div";
    public static final String userNameXPathWebElement = "//input[@id='TextInputComponent-1']";
    public static final String passwordXPathWebElement = "//input[@id='TextInputComponent-2']";
    public static final String submitButtonXPathWebElement = "//button[@name='SubmitButtonComponent-1']";
    public static final String title = "Online Service Center | GEICO";
    public static final String arrowToChoosePolicyXPathWebElement = "//*[@id=\"homepage_manage_select\"]";
    public static final String startHereNewCustomerXPathWebElement = "//*[@id=\"sidebar\"]/div[2]/div/ul/li/a";
    public static final String policyNumberXPathWebElement = "//input[@id='TextInputComponent-1']";
    public static final String dateOfBirthXPathWebElement = "//input[@id='TextInputDateComponent-2']";
    public static final String zipcodeXPathWebElement = "//input[@id='TextInputZipComponent-1']";
    public static final String continueXPathWebElement = "//button[contains(text(),'Continue')]";
    public static final String errorTextXPathWebElement = "//span[contains(text(),'Policy Number is required.')]";
    public static final String errorTextPolicyNumberXPathWebElement = "//span[contains(text(),'Policy Number must be at least 10 characters')]";

    public static final String webElementsGeicoCareerButton="//a[contains(text(),'Careers')]";
    public static final String webElementsGeicoContactUsButton="//div[@id='footer-links-secondary']//a[contains(text(),'Contact Us')]";
    public static final String webElementsGeicoPrivacyButton="//div[@id='footer-links-secondary']//a[contains(text(),'Privacy')]";
    public static final String webElementsGeicoLogo="//a[@class='icon-geico']";
    public static final String webElementsGeicoLogoText="//a[contains(text(),'COVID-19 Updates')]";
    public static final String webElementsGeicoMakePaymentButton="//ul[@class='list']//a[contains(text(),'Make a payment')]";
    public static final String webElementsGeicoSelectFieldBox="//select[@id='SelectComponent-1']";
    public static final String webElementsGeicoPhoneNumberButton="//input[@id='TextInputTelComponent-1']";
    public static final String webElementsGeicoZipCodeBox="//input[@id='TextInputZipComponent-1']";
    public static final String webElementsGeicoMakePaymentContinueButton="//button[@name='SubmitButtonComponent-1']";

}
