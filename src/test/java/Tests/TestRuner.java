package Tests;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/main/test/Features", glue = {"stepsDefinitions"},
        plugin = {"pretty", "html:target/HtmlReports.html"},
        tags = "@Test"
)
class TestRunner extends AbstractTestNGCucumberTests {
}
