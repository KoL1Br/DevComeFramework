package Tests;

import Pages.GoogleHomePage;
import Pages.GoogleSearchPage;
import Pages.YouTubePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;




public class TestOpenYouTube extends BaseTest {
    GoogleHomePage googleHomePage = new GoogleHomePage(driver);
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    YouTubePage youTubePage = new YouTubePage(driver);


    @Given("Open GoogleHomePage")
    public void openGoogleHomePage() {
       googleHomePage.openGoogleHomePage();
    }

    @When("Add YouTube in field")
    public void addYouTubeInFild() {
        googleHomePage.setTextInField();

    }

    @And("Check on YouTube")
    public void userClicksOnTheYouTubeLink() {
        googleSearchPage.openYouTube();
    }

    @Then("User should be redirected to the YouTube page")
    public void userShouldBeRedirectedToTheYouTubePage() {
 //       Assert.assertEquals(youTubePage.getPageUrl(), youtubeUrl);
        Assert.assertTrue(youTubePage.getPageTitle() == "YouTube");

    }
}

