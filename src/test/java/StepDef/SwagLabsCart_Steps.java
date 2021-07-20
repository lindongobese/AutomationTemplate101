package StepDef;


import Pages.CartPage;
import Pages.LoginPage;
import TestBase.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class SwagLabsCart_Steps {

    private WebDriver webDriver;
    private CartPage cartPage;
    private LoginPage loginPage;


    public SwagLabsCart_Steps(){
        this.webDriver= BasePage.webDriver;
        cartPage = new CartPage(webDriver);
        loginPage = new LoginPage(webDriver);
    }

    @Given("^that i have navigated SwagLabs$")
    public void that_i_have_navigated_SwagLabs() throws Throwable {
        loginPage.navigateToSwagLabs();
    }

    @When("^i enter login details and click the login button$")
    public void i_enter_login_details_and_click_the_login_button() throws Throwable {
        loginPage.signinToSwagLabs();
    }

    @Then("^i must be redirected to home page$")
    public void i_must_be_redirected_to_home_page() throws Throwable {
        loginPage.verifyThatHomepageLoaded();
    }



    @Given("^that i have landed on the Swag Labs home page$")
    public void that_i_have_landed_on_the_Swag_Labs_home_page() throws Throwable {
        cartPage.verifyThatCatalogueIsDisplated();
    }

    @Then("^i select a tshirt and backpack from catalogue$")
    public void i_select_a_tshirt_and_backpack_from_catalogue() throws Throwable {
        cartPage.addItemsToCart();
    }

    @Then("^i proceed to cart$")
    public void i_proceed_to_cart() throws Throwable {
        cartPage.navigateToCart();
    }

    @Then("^the two items must be listed on my cart$")
    public void the_two_items_must_be_listed_on_my_cart() throws Throwable {
        cartPage.verifyThatTwoItemsAreListedOnCart();
    }



}
