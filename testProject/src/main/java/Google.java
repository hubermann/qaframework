import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Google extends BasePage {

    @FindBy(css = "#lst-ib")
    public static WebElement botonBusqueda;

    public static void clickInBotonBusqueda() {
        Wait.until(ExpectedConditions.elementToBeClickable(botonBusqueda));
        botonBusqueda.click();
    }

}