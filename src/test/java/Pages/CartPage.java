package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public WebDriver webDriver;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    public WebElement catalogueItem_byXpath;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addBackpackToCart_byXpath;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    public WebElement addTshirtToCart_byXpath;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    public WebElement navigateToCart_byXpath;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    public WebElement verifyThatTshirtIsAddedSuccessfully;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    public WebElement verifyThatBackpackIsAddedSuccessfully;

    public CartPage(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void verifyThatCatalogueIsDisplated() throws Exception{
        catalogueItem_byXpath.isDisplayed();
    }

    public void addItemsToCart() throws Exception{
        addBackpackToCart_byXpath.click();
        addTshirtToCart_byXpath.click();

        Thread.sleep(2000);
    }

    public void navigateToCart() throws Exception{
        navigateToCart_byXpath.click();
        Thread.sleep(2000);
    }

    public void verifyThatTwoItemsAreListedOnCart(){
        verifyThatBackpackIsAddedSuccessfully.isDisplayed();
        verifyThatTshirtIsAddedSuccessfully.isDisplayed();
    }
}
