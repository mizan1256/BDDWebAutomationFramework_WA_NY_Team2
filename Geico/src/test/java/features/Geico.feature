Feature: Gecico LandPage Functionality Check

#  Background:


  @SmokeTest
  Scenario: Gecio Career button Check
    Given I am on Geico Homepage
    And   I click on Career button
    When  I Click on Customer Service Button
    Then  I validate Customer Service Careers text appear Properly



