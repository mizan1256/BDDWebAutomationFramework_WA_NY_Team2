package geicohomeB;

public class GeicoHomeWebElements {

    public static final String startQuoteButton="//button[@class='submitButton btn btn--primary btn--full-mobile']";
    public static final String expectedStartQuoteButton="//*[@id=\"breakdown-layout-h2\"]";

    public static final String rentersButton="//*[@id=\"bundle-intent-selection\"]/div/div[2]/label";
    public static final String rentersCheckMark="//*[@id=\"bundle-intent-selection\"]/div/div[2]/span";

    public static final String zipCodeField="//*[@id=\"zip\"]";
    public static final String zipCodeWithText="//input[@id='zip']";
    public static final String expectedZipCodePage="//*[@id=\"breakdown-layout-h2\"]";

    public static final String geicoLocationIconSign="//*[@id=\"header-right-links\"]/ul[1]/li[1]/a/span[2]";
    public static final String locationZipCodeField="//*[@id=\"geo-box\"]/input";
    public static final String updateButton="//*[@id=\"geo-submit\"]";
    public static final String expectedLocationIconResult="//*[@id=\"header-right-links\"]/ul[1]/li[1]/a/span[1]";

    public static final String invalidZipCodeErrorMessage="//*[@id=\"aria-geo-alert\"]";

}
