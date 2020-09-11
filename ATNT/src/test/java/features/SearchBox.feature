Feature: Att search functionality


  Background:
    Given I am in att homepage


  Scenario: Att searchBox functionality check with valid data
    And I enter Apple iPhone 11 in searchBox
    When I click searchButton
    Then I verify Apple iPhone 11 is appear properly
    And I verify page title as iphone 11


  Scenario: Att searchBox functionality check with valid data
    And I enter "Apple iPhone 11" in searchBox
    When I click searchButton
    Then I verify "Apple iPhone 11" is appear properly
    And I verify page title as iphone 11

  @SmokeTest
  Scenario Outline: Att searchBox functionality check with multiple products
    And I enter "<productName>" in searchBox
    When I click searchButton
    Then I verify "<verifyProduct>" is appear properly
     # And I verify page title as "<pageTitle>"

    Examples:
      | productName     | verifyProduct   |
      | Apple iPhone 11 | Apple iPhone 11 |
      | Apple iphone 10 | Apple iphone 10 |
      | Samsung Galaxy S20 5G | Samsung Galaxy S20 5G |