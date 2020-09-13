Feature: United Airlines home page functionality test

  Background:
    Given I am in home page

 @pending
  Scenario: United Airlines Flight Status functionality test
    When I click Flight status
    And I enter City in From field and To field
    And I enter Flight number and  Date
    Then I click Search Button


  @SmokeTest
  Scenario: United Airlines Check In functionality test
    When I click Check In
    And I enter ticket Number and Last Name
    Then I click checkIn Search Button
    And I validate Check In page message



  Scenario:United Airlines flight booking functionality test
    When I click on close button in From box
    And I type city name of departure
    And I click on close button in To box
    And I type city name of Destination
    Then I validate from* is appeared properly