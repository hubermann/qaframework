package base;

public class BaseStep extends Base {

    public static void NavigateToSite() {
        driverContext.Driver.navigate().to("http://www.google.com");
    }
}

