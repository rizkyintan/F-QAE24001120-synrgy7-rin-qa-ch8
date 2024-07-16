  @login @regression
  Feature: Login

    @positive-test @smoke
    Scenario: User successfully login using valid credentials
      Given User is on Login page
      And User input username with "standard_user"
      And User input password with "secret_sauce"
      When User click login button
      Then User redirected to Home page

    @negative-test @smoke
    Scenario: User failed login using invalid credentials
      Given User is on Login page
      And User input username with "wrong_user"
      And User input password with "wrong_password"
      When User click login button
      Then Login page display error message