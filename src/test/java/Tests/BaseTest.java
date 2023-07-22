package Tests;
import WebDriverFactory.WebFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;


public class BaseTest {
    static WebDriver driver;

    @AfterMethod
    @Parameters("browserName")
    public void tearDown(String browserName) {
        if (driver != null) {
            driver.quit();
        }
    }

    @Parameters("browserName")
    public void setup(String browserName) {
        driver = WebFactory.createDriver(browserName);
    }
}




