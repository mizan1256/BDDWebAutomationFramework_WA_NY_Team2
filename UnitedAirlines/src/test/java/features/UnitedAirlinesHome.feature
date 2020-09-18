Feature: United Airlines home page functionality test

  Background:
    Given I am in home page

  @pending @SmokeTest
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