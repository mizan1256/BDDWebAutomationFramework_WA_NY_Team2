Feature:TargetECommerce homePage functionality check

#  @Pending
#  Scenario: TargetECommerce login functionality Check
#    Given I am on TargetECommerce homepage
#    And I click on signIn
#    And I click on signInOption to sign in
#    And I enter emailAddress and password
#    When I click keepMeSignIn
#    Then I verify text sign into your target account

  @Regression
  Scenario: TargetECommerce login functionality Check
    Given I am on TargetECommerce homepage
    And I click on signIn
    And I click on signInOption to sign in
    And I input email and password
    |mtt123@gmail.com||abc123|
    When I click keepMeSignIn
    Then I verify text sign into your target account

