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
  Scenario Outline:Att searchBox check with multiple value using data driven
    And I enter "<productName>" in searchBox
    When  I click searchButton
    And I validate "<validateProduct>" is appear properly
    And I validate page title as "<pageTitle>"

    Examples:
      | productName       | validateProduct                        | pageTitle                                   |
      | Apple iPhone 11   | Showing results for "Apple iPhone 11". | Results for Apple iPhones 11 - AT&T Search  |
      | Apple iPhone 10   | Showing results for "Apple iphone 10". | Results for Apple iPhones 10 - AT&T Search  |
      | Samsung Phones    | \"Samsung Phones\"                     | Results for Samsung Phones - AT&T Search    |
      | Apple Watches     | \"Apple Watches\"                      | Results for Apple Watches - AT&T Search     |
      | Apple ipads       | \"Apple ipads\"                        | Results for Apple ipads - AT&T Search       |
      | iphone 11 Pro Max | \"iphone 11 Pro Max\"                  | Results for iphone 11 Pro Max - AT&T Search |
      | Samsung Tablets   | \"Samsung Tablets\"                    | Results for Samsung Tablets - AT&T Search   |


