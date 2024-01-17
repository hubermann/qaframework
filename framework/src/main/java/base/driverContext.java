package base;

import org.openqa.selenium.WebDriver;

public class driverContext {

    public static WebDriver Driver;
    public static Browser Browser;

    public static WebDriver getDriver(){
        return Driver;
    }

    public static void setDriver(WebDriver Driver){
        driverContext.Driver = Driver;
    }

    public static Browser getBrowser(){
        return Browser;
    }

    public static void setBrowser(Browser browser) {
        driverContext.Browser = browser;
    }

}
