package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class BasePage extends Base{
    public static BasePage CurrentPage;
    public static WebDriverWait Wait = new WebDriverWait(driverContext.getDriver(),Duration.ofSeconds(20));
    public static Actions Actions = new Actions(driverContext.getDriver());
    public static WebDriver Driver = driverContext.Driver;
    public static Select select;

    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance) {
        try {
            return (TPage) this;
        } catch (Exception ex) {
            ex.getStackTrace();
        }

        return null;
    }

}
