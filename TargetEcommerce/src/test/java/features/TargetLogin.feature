Feature: Target Login Functionality Check

  Background:
    Given  I am on Target Home Page

  @SmokeTest
  Scenario: Login with valid credentials
    When I click on sign in drop down
    And  I click on sign in link
    And  I enter email and password into respective fields
      | email               | password |
      | pntp.2020@gmail.com | Test2020 |
    And  I click on sign in button
    Then I verify that it signed in properly