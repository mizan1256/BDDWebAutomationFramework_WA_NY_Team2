Feature: Geico Home page Functionality

  Background:
    Given I am on Geico home page

#  @SmokeTest
  Scenario: Geico home page search box functionality test
    When I click on search icon
    And I enter Auto in search box
    And I click on search button
    Then I validate "Site Search" is appeared properly

#  @SmokeTest
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
    Then  I validate Customer Service Careers text appear Properly









