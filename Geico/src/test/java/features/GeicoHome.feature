Feature: Geico Search Box

@SmokeTest
  Scenario: search box functionality check
    Given I am on Geico HopePage
    And I click SearchBox
    Then I Enter Auto in SearchBox
    When I clik search Button
    Then I verify the page title
