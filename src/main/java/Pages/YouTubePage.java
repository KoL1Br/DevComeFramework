package Pages;

import org.openqa.selenium.WebDriver;
public class YouTubePage extends  BasePage{
    public YouTubePage(WebDriver driver) {
        super(driver);
    }
    public void getPageUrl() {

        driver.getCurrentUrl();
    }
    public String getPageTitle() {
       String str = driver.getTitle();
        return str;
    }
}
