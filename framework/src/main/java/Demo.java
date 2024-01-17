import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

    private static final String CHROME_DRIVER_PATH = "../Frameworksolution/framework/src/driver/chromedriver";

    public static void test() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        // Agregar esperas explícitas si es necesario
    }

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            test(); // Realizar acciones en la página
            // Agregar esperas explícitas o cualquier otra lógica aquí si es necesario

            // Puedes cerrar el WebDriver después de realizar las acciones necesarias
            driver = new ChromeDriver();
            // Realizar más acciones si es necesario
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el WebDriver adecuadamente
            if (driver != null) {
                driver.close();
                // driver.quit();
            }
        }
    }

}
