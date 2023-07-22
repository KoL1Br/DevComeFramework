package WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebFactory {
    private static final boolean value = false;

    public static WebDriver createDriver(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                return ChromeFactory.createChromeDriver(value);
            case "firefox":
                return FireFoxFactory.createFirefoxDriver(value);
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }
    }
}
