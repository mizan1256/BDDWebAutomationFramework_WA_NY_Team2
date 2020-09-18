Feature: United Airlines Homepage Functionality Check

@SmokeTest
  Scenario: United Airlines Book Button Check
    Given I am in United Airlines Homepage
    When I click on Book Button
    And I click on Hotels Button
    And I enter "Miami Beach" in where to search box and submit
    Then I validate Miami Beach landing properly