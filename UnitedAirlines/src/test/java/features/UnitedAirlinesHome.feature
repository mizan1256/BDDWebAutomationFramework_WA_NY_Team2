Feature: United Airlines home page functionality test

  Background:
    Given I am in home page

  @SmokeTest
  Scenario: United Airlines Flight Status functionality test
    When I click Flight status
    And I enter City in From field and To field
    And I enter Flight number and Date
    And I click Search Button
    Then I validate  flight status is appeared properly

  @SmokeTest
  Scenario: United Airlines Book Hotels test
    When I click on book button
    And I click on Hotels button
    And I enter "Las Vegas" in where to searchBox and submit
    Then I validate Las Vegas landed page properly

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
#    Then I validate Your confirmation number, a 6 character alphanumeric code, and/or last name is not valid. is appeared properly

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
#    And I enter traveler first name
#    And I enter traveler last name
#    And I enter Last 4 digits of card
    And I click searchButton box
    Then I validate We couldn't find your receipt is appeared properly


  @SmokeTest
  Scenario: United Airlines Book Button Check
    When I click on Book Button Tab
    And I click on Hotels Button Tab
    And I enter "Miami Beach" in where to search box and enter submit
    Then I validate Miami Beach landing properly

