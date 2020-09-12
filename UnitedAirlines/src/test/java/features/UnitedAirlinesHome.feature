Feature: United Airlines home page functionality test

  Background:
    Given I am in home page

  @SmokeTest
  Scenario:United Airlines flight booking functionality test
    When I click on close button in From box
    And I type city name of departure
    And I click on close button in To box
    And I type city name of Destination
    Then I validate from* is appeared properly

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
#    Then I validate Your confirmation number, a 6 character alphanumeric code, and/or last name is not valid. is appeared properly



