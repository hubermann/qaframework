package base;

import org.openqa.selenium.WebDriver;

public class Browser {

    private WebDriver _driver;

    public Browser(WebDriver driver){
        _driver = driver;
    }

    public enum BrowserType{
        Chrome,
        Firefox,
        InternetExplorer,
        Safari
    }

}
