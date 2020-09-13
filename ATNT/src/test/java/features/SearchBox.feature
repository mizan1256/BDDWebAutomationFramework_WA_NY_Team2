Feature: Att search functionality


  Background:
    Given I am in att homepage

  @SmokeTest
  Scenario: Att searchBox functionality check with valid data
    And I enter Apple iPhone 11 in searchBox
    When I click searchButton
    Then I verify Apple iPhone 11 is appear properly
    And I verify page title as iphone 11

  @SmokeTest
  Scenario: Att searchBox functionality check with valid data
    And I enter "Apple iPhone 11" in searchBox
    When I click searchButton
    Then I validate "Apple iPhone 11" is appear properly
    And I validate page title as iphone 11

  @SmokeTest
# Att searchBox check with multiple value using data driven
  Scenario Outline:
    And I enter "<productName>" in searchBox
    When  I click searchButton
    And I validate "<validateProduct>" is appear properly
    And I validate page title as "<pageTitle>"

    Examples:
      | productName     | validateProduct                         | pageTitle                                  |
      | Apple iPhone 11 | Showing results for "Apple iPhone 11". | Results for Apple iPhones 11 - AT&T Search |
      | Apple iPhone 10 | Showing results for "Apple iphone 10". | Results for Apple iPhones 10 - AT&T Search |


