@Test

Feature: Add items to cart

    Scenario: Select 2 items from catalogue and add them to cart
        Given that i have navigated SwagLabs
        When i enter login details and click the login button
        Then i must be redirected to home page

        Given that i have landed on the Swag Labs home page
        Then i select a tshirt and backpack from catalogue
        And i proceed to cart
        Then the two items must be listed on my cart
