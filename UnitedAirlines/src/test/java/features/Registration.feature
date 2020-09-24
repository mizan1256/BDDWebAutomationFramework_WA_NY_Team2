Feature: United Airlines home page signIn functionality test

  Background:
    Given I am in home page
    When I click on signIn button


  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Md        | Khairul    | Shuvo    | 3    | 1988 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street      | city       | state    | zipCode |
      | 146 street  | Jamaica     | New York     | 11436   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 7773331234  | 111         | 2123336663    | 10011             | JFK         |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email                 | reEnterEmail      |
      | pntitny@gmail.com     | pntitny@gmail.com |
    And I click on check box and uncheck box
    And I entered data in password field
      | password     | reEnterPassword |
      | asr@20325_NY | asr@20325_NY    |
    And I click on Show button
    And I click on accept and enroll button
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
#    Then I verify "Security questions" display properly
