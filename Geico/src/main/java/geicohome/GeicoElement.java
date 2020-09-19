package geicohome;

import common.WebAPI;

public class GeicoElement extends WebAPI {

    public static final String webElementAutoButton = "//div[@class='column1']//div[@class='auto card']//p[contains(text(),'Auto')]";
    public static final String webElementCheckButton = "//div[@class='label--description']//label[@class='checkbox']";
    public static final String webElementAddProperty ="//span[contains(text(),'+ Add property')]";
    public static final String webElementStartQuote = "//button[@class='submitButton btn btn--primary btn--full-mobile']";
    public static final String webElementContactUsText = "//div[@id='footer-links-secondary']//a[contains(text(),'Contact Us')]";

}
