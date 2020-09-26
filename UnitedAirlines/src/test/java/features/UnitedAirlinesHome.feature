Feature: United Airlines home page signIn functionality test

  Background:
    Given I am in United Airlines home page

  @SmokeTest
  Scenario: United Airlines SignIn functionality test
    When I click on signIn button
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Arman     | N/M        | Hossain  | 24   | 1996 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly

  @SmokeTest
  Scenario: United Airlines contact information test
    When I click on signIn button
    And I click on join now and use title
    When I entered data in Contact Information field
      | street      | city       | state    | zipCode |
      | 428 street  | Brooklyn   | New York | 11218   |
    Then I validate "Phone number" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    When I click on signIn button
    And I click on join now and use title
    And I entered data in phone number field
      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName                       |
      | 9113114111  | 69         | 9876543123    | 911                | JFK International Airport         |
    And I click on check box field
    Then I verify "Email information" appear properly

  @SmokeTest
  Scenario: United Airlines contact information test
    When I click on signIn button
    And I click on join now and use title
    And I entered data in email field
      | email                      | reEnterEmail               |
      | Arman.hossain496@gmail.com | Arman.hossain496@gmail.com |
    And I click on check box and uncheck box
    And I entered data in password field
      | password     | reEnterPassword |
      | JustChill    | JustChill       |
    And I click on Show button
    And I click on accept and enroll button
    Then I verify "Security questions" display properly



  @SmokeTest
  Scenario:United Airlines flight status functionality test
    When I click on flight status tab
    And I enter city name in from field and To field
    And I enter flight number and date
    And I click search button
    Then I validate DEPARTURE is appeared properly

  @SmokeTest
  Scenario:United Airlines flight status functionality test
    When I click on CheckIn tab
    And I enter ticket number in confirmation field
    And I enter last name in Last name field
    And I click search box
    Then I validate We couldn't find a reservation with the provided information. is appeared properly

  @SmokeTest
  Scenario:United Airlines flight status functionality test
    When I click on My trips tab
    And I enter confirmation number in confirmation field
    And I type last name in Last name field
    And I click search box tab

  @SmokeTest
  Scenario:United Airlines search button functionality test
    When I click on search button
    And I click on covid-19 update
    And I click on request a refund
    Then I validate Refund policies is appeared properly

  @SmokeTest
  Scenario:United Airlines search button functionality test
    When I click on search button
    And I click on get a flight receipt
    And I click searchButton box
    Then I validate We couldn't find your receipt is appeared properly


  @SmokeTest
  Scenario: United Airlines Book Button Check
    When I click on Book Button
    And I click on Hotels Button
    And I enter "Miami Beach" in where to search box and submit
    Then I validate Miami Beach landing properly
