package Pages;

import Utilities.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    private final Duration defaultTimeToWait = Duration.ofSeconds(10);
    protected PropertyReader propertyReader = new PropertyReader("url.properties");
    protected String googleUrl = propertyReader.getProperty("google.url");
    protected String youtubeUrl = propertyReader.getProperty("youtube.url");
    protected PropertyReader propertyReaderXpath = new PropertyReader("searchFieldXpath");
    protected String searchInputXPath = propertyReaderXpath.getProperty("search.input.xpath");
    public BasePage(WebDriver webDriver) {
        driver = webDriver;
    }
    public WebElement waitForElementToBeClickable(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeToWait);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
    public WebElement waitForElementToBeClickable(String xpath, Duration timeToWait) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public WebElement waitForElementToBeVisible(String xpath, Duration timeToWait) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public WebElement waitForElementToBeVisible(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeToWait);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public void openUrl(String url) {
        driver.get(url);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}

