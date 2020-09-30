Feature: TripAdvisor HomePage Functionality check
  Background:
    Given I am in TripAdvisor homepage

 @SmokeTest
  Scenario: TripAdvisor SearchBox Functionality check with valid data
    And I enter Cox's Bazar in searchBox
    When I click searchButton
    Then I verify Cox's Bazar is appear properly
    And I verify page title as Search results: Cox's Bazar - Tripadvisor
@SmokeTest

  Scenario: TripAdvisor Post Functionality check
    When I click on Post
    And I click Write a Review
    Then I verify Review page

  @SmokeTest
  Scenario: TripAdvisor Alerts Functionality check
    When I click on Alerts
    And I enter email address
    And I enter password
    Then i click on join
    Then i verify alerts page

 @SmokeTest
  Scenario: TripAdvisor SignIn Functionality check with invalid information
    When I click on SignIn
    Then I click on continue with email
    And I enter email address
    And i enter password
    And i click on join
    Then i verify error message
