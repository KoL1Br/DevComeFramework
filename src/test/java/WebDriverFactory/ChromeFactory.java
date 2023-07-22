package WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeFactory {
    public static WebDriver createChromeDriver(Boolean value) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(value);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        if (!value) {
            driver.manage().window().maximize();
        }
        return driver;
    }
}
