package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver webDriver;

    public BasePage(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void createDriver(String driver){
        if(driver.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
//            options.setExperimentalOption("useAuthenticationExtention",false);
            webDriver = new ChromeDriver(options);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

}
