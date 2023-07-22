package Pages;

import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends BasePage{
    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }
    public void openYouTube(){
        openUrl(youtubeUrl);
    }
}
