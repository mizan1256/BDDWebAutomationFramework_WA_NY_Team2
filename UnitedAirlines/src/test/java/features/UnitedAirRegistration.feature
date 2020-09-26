Feature: United Airlines Sign Up  functionality

  Background:
    Given I am in United Air home page
    When I click on signIn button

  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Mike      | Henry      | Carole   | 31   | 1988 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street        | city    | state    | zipCode |
      | 110-10 street | Jamaica | New York | 11435   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 3471114321  | 123        | 7180001111    | 564                | JFK         |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email             | reEnterEmail      |
      | pnt2020@gmail.com | pnt2020@gmail.com |
    And I click on check box and uncheck box
    And I entered data in password field
      | password | reEnterPassword |
      | Test1234 | Test1234        |
    And I click on Show button
    And I click on accept and enroll button
    Then I verify "Security questions" display properly

