Feature: Atnt home page sign up Functionality check


  Background:
    Given I am in att homepage

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
      | userName            | Password |
      | admin@pnt.com       | admin    |
      | oalKarim@gmail.com  | 15021972 |
      | mikedavid@gmail.com | 01012010 |

  @SmokeTest
  Scenario: Att menu burgerButton test
    When I click on burgerButton
    And I select wireless and click on Explore Wireless
    And I verify page title


  