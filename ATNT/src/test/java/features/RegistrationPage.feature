Feature: Atnt HomePage Account functionality check

  Background:
    Given I am in at&t homepage

  @pending
  Scenario: Atnt HomePage signUp functionality check with invalid data
    And I click the Account dropdown button
    And I click signIn
    And I enter admin1234 in user Id box
    And I enter admin1234 in password box
#    When I click signIn button
    Then I verified "Sign In" ia appeared properly
    And I verify page title as Login Screen

  @SmokeTest
  Scenario: Atnt HomePage signUp functionality check with invalid data
    And I click the Account dropdown button
    And I click Pay without signing in
    And I enter "7180000000" Active AT&T phone number box
    And I enter "10000" Billing ZIP Code
    And I click capcha box
#    When I click signIn button
#    Then I verified "Sign In" ia appeared properly
#    And I verify page title as Login Screen

  @SmokeTest
  Scenario: Atnt HomePage signUp functionality check with invalid data
    And I click the Account dropdown button
    And I click Account overview
    And I click Create one now
    And I click Wireless radio button
    And I click continue box
    And I type phone number in AT&T phone number box
    And I type 5 digit zip code in Billing zip code Box
    When I click continue button
    Then I verified "Welcome" ia appeared properly
    And I verify page title as Create or link an ID




