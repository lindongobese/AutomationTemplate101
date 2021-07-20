package Runner;

import TestBase.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report.json" },
        features = {"src/test/resources/features"},
        tags = {"@Test"},
        glue={"StepDef"}

)
public class JUnitTest extends BasePage {


    public JUnitTest(WebDriver webDriver) {
        super(webDriver);
    }

    @BeforeClass
    public static void start()  throws Exception{
        System.setProperty("WebDriver","chrome");
    }

    @AfterClass
    public static void tearDown() throws Exception{

    }

}
