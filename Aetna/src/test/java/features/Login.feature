Feature:Aethna Login functionality check


  Scenario Outline: Aethna login functionality Check with Multiple variable
    Given I am on Aethna loginPage
    And I click on login
    And  I click on loginTab option
    And i enter user ID "<userID>" and  password "<Password>"
    When I click login button
    Then I verify the popup Error text
    Examples:
      | userID | Password   |
      | mtt125 | 136frv     |
      | mtt124 | 1234rtgd   |
      | mtt123 | 1234aslkca |


