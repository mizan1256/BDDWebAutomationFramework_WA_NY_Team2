Feature:Aethna homePage functionality check

#  Background:

  @pending
  Scenario: Aethna searchBox functionality Check
    Given I am on Aethna homepage
    And I click search
    And I enter medicate in searchBox
    When I click searchButton
    Then I verify searchText

  @Regression
  Scenario: Aethna searchBox functionality Check
    Given I am on Aethna homepage
    And I click search
    And I enter "medicate" in searchBox
    When I click searchButton
    Then I verify driver title

@Regression
  Scenario Outline: Aethna searchBox functionality Check with Multiple variable
    Given I am on Aethna homepage
    And I click search
    And I enter "<searchItem>" in searchBox
    When I click searchButton
    Then I verify aethna logo

    Examples:

      | searchItem  |
      | medicate    |
      | services    |
      | health care |
      | community   |

