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