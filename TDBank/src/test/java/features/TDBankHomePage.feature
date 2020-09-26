Feature: TD Bank Home Page Functionality Check

  Background:
    Given  I am on TD Bank home page

  @SmokeTest
  Scenario: Change country from home page
    When  I click on flag button
    And   I change the country from US to Canada
    Then  I verify Canada Td Bank website is appeared properly

  @SmokeTest
  Scenario: Verify credit card page using mouse hover
    When  I mouse hover over products drop down  button
    And   I click on credit card link
    Then  I verify credit card page title in different tab

  @SmokeTest
  Scenario: Set location for saving account from drop down using Select functionality
    When I mouse hover over products drop down  button
    And  I click on savings link
    And  I select "New York" as a state
    And  I select "Astoria" as a city
    And  I set my location
    Then I verify savings account page

  @SmokeTest
  Scenario:  Verify Login with invalid credentials
    When I mouse hover over login link
    And  I click on online banking
    And  I enter username and password into respective fields
      | test1234 | 12345678 |
    And  I click on login button
    Then I verify invalid login text

  @SmokeTest
  Scenario Outline:  Verify Login with invalid credentials for multiple users
    When I mouse hover over login link
    And  I click on online banking
    And  I enter data "<username>" and "<password>" into  fields
    And  I click on login button
    Then I verify invalid login text
    Examples:
      | username | password |
      | test1234 | 123456   |
      | pnt5678  | 654321   |
      | ntp9876  | 567890   |



