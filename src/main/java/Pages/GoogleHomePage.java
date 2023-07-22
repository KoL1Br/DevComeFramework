package Pages;

import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    private final String youTube = "YouTube";
    public void setTextInField() {
        waitForElementToBeClickable(searchInputXPath).sendKeys(youTube);
    }
    public void openGoogleHomePage(){
        openUrl(googleUrl);
    }
}

