package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver webDriver;

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement txtUsername_byXpath;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txtPassword_byXpath;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement btnLogin;

    public LoginPage(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void navigateToSwagLabs() throws Exception{
        webDriver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
    }

    public void signinToSwagLabs() throws Exception{
        txtUsername_byXpath.sendKeys("standard_user");
        txtPassword_byXpath.sendKeys("secret_sauce");
        btnLogin.click();
        Thread.sleep(5000);
    }

    public void verifyThatHomepageLoaded(){
        webDriver.getTitle().contains("Swag Labs");
    }
}

