  Feature: TripAdvisor HomePage Functionality check
  Background:
    Given I am in TripAdvisor homepage
    When I click searchButton
  @Shuvo
  Scenario: TripAdvisor SearchBox Functionality check with valid data
    And I enter Cox's Bazar in searchBox
    When I click searchButton
    Then I verify Cox's Bazar is appear properly
    And I verify page title as Search results: Cox's Bazar - Tripadvisor

  @Shuvo
  Scenario: TripAdvisor Hotel SearchBox Functionality check with valid data
    And   I click Hotels Button in homepage
    When  I enter on Paris in searchBox
    And   I verify Paris hotels is appear properly
    When  I verify page title







