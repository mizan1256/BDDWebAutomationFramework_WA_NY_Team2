Feature: Cnn Login Functionality

  Login with invalid credentials
  Login with valid credentials


  Background:
    Given I am on cnn home page

  @SmokeTest
  Scenario: Login with invalid credentials
    When I click on user account button
    And  I enter "test@gmail.com" into email text field
    And  I enter "123456" into password text field
    And  I click on login button
    Then I verify invalid login text

  @SmokeTest
  Scenario Outline: Login with invalid credentials for multiple users
    When I click on user account button
    And  I enter "<email>" into email text field
    And  I enter "<password>" into password text field
    And  I click on login button
    Then I verify invalid login text

    Examples:
    |email           |password  |
    |pnt123@gmail.com|test123456|
    |ant321@gmail.com|ant123456 |


  @SmokeTest
  Scenario: Login with  all valid credentials
    When I click on user account button
    And  I enter "pntp.2020@gmail.com" into email text field
    And  I enter "Test2020@" into password text field
    And  I click on login button
    Then I verify the page title





