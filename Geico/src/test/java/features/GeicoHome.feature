Feature: Geico HomePage Functionality Check.


  @SmokeTest
  Scenario: Geico Auto Butto Functionality Check
    Given I am on Geico Home Page
    When I click on Auto Button
    And I checked the Check Box
    Then I click on START QUOTE
    And I verify CONTACT US