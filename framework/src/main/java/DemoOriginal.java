import log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoOriginal {

    private static final String CHROME_DRIVER_PATH = "../Frameworksolution/framework/src/driver/chromedriver";

    public static void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        log.Log.initializedLogger();
        WebDriver driver = new ChromeDriver();
        log.Log.startTestCase("Comenzamos primer prueba");
        driver.navigate().to("https://www.google.com");
        Thread.sleep(10000);
        driver.close();
        //driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {
        test();
    }

}
