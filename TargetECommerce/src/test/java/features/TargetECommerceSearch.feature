Feature:TargetECommerce homePage functionality check


  @Regression
  Scenario:Target SearchBox Functionality check with multiple products from data table
    Given I am on TargetECommerce homepage
    And I enter productName in searchBox
      | Frozen Pizza |
    When I click searchButton
    Then I verify SearchedProduct is appear properly
      | frozen pizza |

  @Regression
  Scenario Outline:Target SearchBox Functionality check with multiple products
    Given I am on TargetECommerce homepage
    And I enter "<productName>" in searchBox
    When I click searchButton
    Then I verify "<SearchedProductCheck>" is appear properly
    Examples:
      | productName | SearchedProductCheck |
      | hand cream  | hand cream           |
      | pizza       | pizza                |
      | boots       | boots                |
      | boots       | boots                |
      | shampoo     | shampoo              |




