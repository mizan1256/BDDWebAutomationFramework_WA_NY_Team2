Feature: United Airlines home page signIn functionality test

  Background:
    Given I am in United Air home page
    When I click on signIn button

  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Mohammad  | Khairul    | Islam    | 15   | 1981 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street      | city       | state    | zipCode |
      | 8218 street | Ozone Park | New York | 10111   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 7186901256  | 123        | 2123421234    | 564                | LGA         |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email              | reEnterEmail       |
      | pnt30242@gmail.com | pnt30242@gmail.com |
    And I click on check box and uncheck box
    And I entered data in password field
      | password  | reEnterPassword |
      | Pnt@30242 | Pnt@30242       |
    And I click on Show button
    And I click on accept and enroll button
    Then I verify "Security questions" display properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in answer field
      | Answer       |
      | Soccer      |
      | Football     |
      | Table Tennis |
      | Swimming     |
      | Badminton    |
    And I click on accept and enroll button
#    Then I verify "Security questions" display properly
