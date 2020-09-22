Feature: Geico Home page Functionality

  Background:
    Given I am on Geico home page

  @SmokeTest
  Scenario: Geico home page search box functionality test
    When I click on search icon
    And I enter Auto in search box
    And I click on search button
    Then I validate "Site Search" is appeared properly

  @SmokeTest
  Scenario: Geico home page search box functionality test
    When I click on search icon
    And I enter Auto in search box
    And I click on search button
    And I click on manage account
    Then I validate "Site Search" is appeared properly









