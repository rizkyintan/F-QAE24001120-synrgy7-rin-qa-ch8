@checkout
Feature: Sorting Products

  Background: User successfully login using valid credentials
    Given User is on Login page
    And User input username with "standard_user"
    And User input password with "secret_sauce"
    When User click login button
    Then User redirected to Home page

    Scenario: User sort products from low to high price
      Given User already on Home page
      When User sort from low to high
      Then Product sorted from low to high