Feature: Geico home page functionality check

  Background:
    Given I am in Geico homepage.

    @SmokeTest
    Scenario: Geico home page StartQuoteButton Check
      When I click on Start Quote
      Then I verify customer information page.

  @SmokeTest
  Scenario: Geico Renters Button Check
    When I click on Start Quote
    And I click on renters
    Then i verify check mark on renters

  @SmokeTest
  Scenario: Geico zip code field Check
    When I click on zip code
    And I type zip code
    And I hit enter on keyboard
    Then i verify zip code result page

 @SmokeTest
  Scenario: Geico location Icon Check
    When I click on Icon logo
    Then I type zip code
    And I click on Update button
    Then i verify updated location result

  @SmokeTest
  Scenario: Geico location Icon Check with invalid data
    When I click on Icon logo
    Then I type invalid zip code
    And I click on Update button
    Then i verify error message