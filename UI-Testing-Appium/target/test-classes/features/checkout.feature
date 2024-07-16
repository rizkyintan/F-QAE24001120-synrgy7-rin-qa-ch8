@checkout
  Feature: Checkout Items

    Background: User successfully login using valid credentials
      Given User is on Login page
      And User input username with "standard_user"
      And User input password with "secret_sauce"
      When User click login button
      Then User redirected to Home page

    Scenario: User checkout product from cart
      Given User already on Home page
      And User add product to cart
      And User checkout product
      And User fill their name with "Intan" "Nurlita" and zip code with "12345"
      When User click finish
      Then User redirected to complete page
