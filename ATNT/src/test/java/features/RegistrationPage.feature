Feature: Atnt HomePage Account functionality check

  Background:
    Given I am in at&t homepage

  @SmokeTest
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
    When I click signIn button
    Then I verified "Sign In" ia appeared properly
    And I verify page title as Login Screen

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

  @SmokeTest
  Scenario: Atnt Sign Up Functionality check with invalid credentials
    And I click accountIcon
    And I click singInButton
    When I click on CreateButton
    And I click wireless radioButton and continueButton
    Then I enter phoneNumber and zipCode
    When I click continueButton
    And I should be get en error message

  @SmokeTest
  Scenario: Check signIn with invalid credentials
    And I on signIn page
    When I enter userName and passWord
    And I click on signIn button
    Then I am getting error message

  @SmokeTest
  Scenario Outline: Login into att using Data Driven
    And I on signIn page
    And I enter email as "<userName>" and password as "<Password>"
    And I click on signIn button
    Then  I am getting error message

    Examples:
      | userName             | Password |
      | admin@yourstore.com  | admin    |
      | oalfaruque@gmail.com | 15021972 |
      | mikemiller@gmail.com | 01012010 |

  @SmokeTest
  Scenario: Att menu burgerButton test
    When I click on burgerButton
    And I select wireless and click on Explore Wireless
    And I verify page title



