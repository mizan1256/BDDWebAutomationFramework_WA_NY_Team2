Feature: United Airlines home page signIn functionality test

  Background:
    Given I am in United Airlines home page
    When I click on signIn button


  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Mohammad  | Ehsan  | Kabir    | 6   | 1987 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street      | city       | state    | zipCode |
      | 75 street | Ozone Park | New York | 11417   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 01677364404  | 123        | 2120000000    | 10111              | JFK         |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email                 | reEnterEmail          |
      | esajib87@gmail.com | eajib87@gmail.com|
    And I click on check box and uncheck box
    And I entered data in password field
      | password     | reEnterPassword |
      | pnt@30235_NY | pnt@30235_NY    |
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
