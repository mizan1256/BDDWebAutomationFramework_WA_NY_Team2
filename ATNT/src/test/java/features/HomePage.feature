Feature: ATnt homePage functionality check

  Background:
    Given I am on atnt homepage

  @pending
  Scenario: Atnt searchBox functionality Check
    And I enter iphone in searchBox
    When I click searchButton
    Then I verify iphone page title

  @pending
  Scenario: Atnt SearchBox Functionality with variable searchItem
    And I enter "iphone 8 plus" in searchBox
    When I click enter
    Then I verify "iphone 8 plus" page title

  @pending
  Scenario Outline: Atnt SearchBox Functionality Check With multiple SearchItem
    And  I enter "<productName>" in searchBox
    When I click searchButton
    Then I verify "<verifyTitle>" is appear properly
    Examples:
      | productName   | verifyTitle                             |
      | iphone 8 plus | Results for iphone 8 plus - AT&T Search |
      | iphone 8      | Results for iphone 8 - AT&T Search      |
      | iphone 6s     | Results for iphone 6s - AT&T Search     |
      | iphone 11 pro | Results for iphone 11 pro - AT&T Search |

#  @Regression
#  Scenario Outline: Atnt SearchBox1 Functionality Check With multiple SearchItem
#    And  I enter "<productName>" in searchBox
#    When I click searchButton
#    Then I verify showing results for "<text>"
#    Examples:
#      | productName   | text                                 |
#      | iphone 8 plus | Showing results for "iphone 8 plus". |
#      | iphone 8      | Showing results for "iphone 8".      |
#      | iphone 6s     | Showing results for "iphone 6s".     |
#      | iphone 11 pro | Showing results for "iphone 11 pro". |



