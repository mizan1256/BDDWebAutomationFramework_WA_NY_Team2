Feature: ATnt Login functionality check

  Background:
    Given I am on atnt homepage

  @Pending
  Scenario: Atnt login functionality Check
    And I click on account button
    And  I click on Sign in option
    And i enter user ID
    And I enter password
    When I click signIn button
    Then I verify the popup Error text

  @Pending
  Scenario: Atnt login functionality Check with Variable
    And I click on account button
    And  I click on Sign in option
    And i enter user ID "mtoqwdeo234"
    And I enter password "2sasb22"
    When I click signIn button
    Then I verify the popup Error text


  @Regression

  Scenario Outline: Atnt login Functionality Check With multiple login info
    And I click on account button
    And  I click on Sign in option
    And i enter user ID "<userID>"
    And I enter password "<Password>"
    When I click signIn button
    Then I verify the popup Error text
    Examples:
      | userID | Password   |
      | mtt125 | 136frv     |
      | mtt124 | 1234rtgd   |
      | mtt123 | 1234aslkca |
