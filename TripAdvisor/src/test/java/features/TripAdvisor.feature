Feature: TripAdvisor HomePage Functionality check

# @SmokeTest @Regression
  Scenario: TripAdvisor SearchBox Functionality check with valid data
    Given I am in TripAdvisor homepage
    And I enter Cox's Bazar in searchBox
    When I click searchButton
    Then I verify Cox's Bazar is appear properly
#    And I verify page title as Search results: Cox's Bazar - Tripadvisor
