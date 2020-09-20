Feature:TargetECommerce homePage functionality check


  Background:
    Given I am on TargetECommerce homepage
    And I click on signIn

  @Pending
  Scenario: TargetECommerce login functionality Check
    And I click on signInOption to sign in
    And I enter emailAddress and password
    When I click keepMeSignIn
    Then I verify text sign into your target account


  @Pending
  Scenario Outline: TargetECommerce login functionality Check
    And I click on signInOption to sign in
    And I enter "<emailAddress>" and "<password>"
    When I click keepMeSignIn
    Then I verify text sign into your target account
    Examples:
      | emailAddress     |  | password |
      | mtt123@gmail.com |  | abc123   |
      | mtt124@gmail.com |  | abc124   |
      | mtt125@gmail.com |  | abc125   |
      | mtt126@gmail.com |  | abc127   |
      | mtt127@gmail.com |  | abc128   |


#(doesnt work at firstname)
#  @Regression
#  Scenario: TargetECommerce login functionality Check
#    And I click accountOption
#    And I enter  information to login
##    |email ||firstName||lastName||password|
#    |mtt124@gmail.com ||Tasmi||Tasmi||abc1234567|
#    And I click keepMeSignIn
#    When I click create account button
#    Then I verify text sign into your target account
