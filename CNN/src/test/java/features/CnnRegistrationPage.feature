Feature: CNN home page functionality test

  Background:
    Given I am in CNN home page

  @SmokeTest
  Scenario: CNN home User Account functionality test
    When I do necessary steps to land on User info page
    And I enter user credentials
      | Email                 | password  | zipCode |
      | pnt30235_NY@gmail.com | Pnt@30235 | 11416   |
    Then I validate *Required message

  @SmokeTest
  Scenario: CNN home User Account functionality test
    When I do necessary steps to land on User info page
    And I enter user credentials
      | Email                 | password  | zipCode |
      | pnt30235_NY@gmail.com | Pnt@30235 | 11416   |
    And I click on register button
    Then I validate "This account already exists. Please log in." message

  @SmokeTest
  Scenario: CNN home User Account functionality test
    When I do necessary steps to land on LogIn info page
    And I enter credentials in logIn field
      | Email                 | password  |
      | pnt30235_NY@gmail.com | Pnt@30235 |
    Then I validate "Stay logged in" message is appeared

  @SmokeTest
  Scenario: CNN home User Account functionality test
    When I do necessary steps to land on LogIn info page
    And I enter credentials in logIn field
      | Email                 | password  |
      | pnt30235_NY@gmail.com | Pnt@30235 |
    And I click on logIn button
    Then I validated "Your email has not been verified" message is appeared
