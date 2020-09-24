Feature: United Airlines home page signIn functionality test

  Background:
    Given I am in United Airlines home page
    When I click on signIn button


  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Shah      | MD         | Zakerin   | 1   | 1987 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street      | city       | state    | zipCode |
      | Pike Street | Manhattan  | New York | 10010   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 646821000   | 123        | 2120001111    | 10111              | JFK         |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email                 | reEnterEmail           |
      | 30248ny_shah@gmail.com| 30248ny_shah@gmail.com |
    And I click on check box and uncheck box
    And I entered data in password field
      | password     | reEnterPassword |
      | 30248NY      | 30248NY         |
    And I click on Show button
    Then I verify "Security questions" display properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in answer field
      | Answer       |
      | Cricket      |
      | Football     |
      | Table Tennis |
      | Swimming     |
      | Badminton    |
    And I click on accept and enroll button
#    Then I verify "Security questions" display properly