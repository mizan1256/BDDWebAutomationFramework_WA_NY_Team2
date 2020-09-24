Feature: Geico HomePage Functionality Check.

  Background:
    Given I am on Geico home page

    @SmokeTest
    Scenario: Geico Auto Butto Functionality Check
    Given I am on Geico Home Page
    When I click on Auto Button
    And I checked the Check Box
    Then I click on START QUOTE
    And I verify CONTACT US
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

    @SmokeTest
    Scenario: Gecio Career button Check
    And   I click on Career button
    When  I Click on Customer Service Button