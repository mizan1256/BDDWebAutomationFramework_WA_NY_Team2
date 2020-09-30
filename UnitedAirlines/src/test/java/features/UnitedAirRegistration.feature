Feature: United Airlines home page signIn functionality test

  Background:
    Given I am on United Airlines home page
    When I click on signIn button


  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | jony  | n.a  | hossain    | 22   | 1983 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street      | city       | state    | zipCode |
      | 8915 street | queens  | New York | 11435   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 7182334455  | 123        | 2122122121  | 11435              | DAC        |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email                 | reEnterEmail          |
      | jonhossn@gmail.com | jonhossn@gmail.com |
    And I click on check box and uncheck box
    And I entered data in password field
      | password     | reEnterPassword |
      | dhaka1219 | dhaka1219    |
    And I click on Show button
    Then I verify "Security questions" display properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in answer field
      | Answer       |
      | Rugby      |
      | Football     |
      | Ping Pong |
      | Swimming     |
      | Badminton    |
    And I click on accept and enroll button
#    Then I verify "Security questions" display properly


