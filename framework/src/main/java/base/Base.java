package base;

import org.openqa.selenium.support.PageFactory;

public class Base {

    public static BasePage CurrentPage;

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page) {
        Object obj = PageFactory.initElements(driverContext.getDriver(), page);
        return page.cast(obj);
    }
}