package StepDef;

import TestBase.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends BasePage {

    public Hooks() {
        super(BasePage.webDriver);
    }

    @Before
    public void setup() {
        createDriver(System.getProperty("WebDriver"));
    }

    @After
    public void exitBrowser() {
        webDriver.quit();
    }
}
