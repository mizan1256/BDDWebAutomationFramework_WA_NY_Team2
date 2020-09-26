Feature: Target Search Box Functionality Check

  Background:
    Given I am on Target Home Page

  @SmokeTest
  Scenario: Verify Target search box functionality for single item
    When I enter "iphone11" in search box
    And  I click on searrch button
    Then I verify the item is appeared properly

  @SmokeTest
  Scenario Outline:  Verify Target search box functionality for multiple items
    When I enter "<items>" in serach box fields
    And  I click on search button
    Then I verify "<itemsText>" are appeared properly

    Examples:
      | items | itemsText |
      | watch | “watch”   |
      | mask  | “mask”    |
      | soap  | “soap”    |
      | fan   | “fan”     |

