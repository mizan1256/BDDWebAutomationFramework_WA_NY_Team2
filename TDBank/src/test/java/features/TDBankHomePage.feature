Feature: TD Bank HomePage Functionality Test
  Background:
    Given I am on TD Bank home page

  @SmokeTest
  Scenario: TD Bank Online Banking check
    When  I mouseHover on logIn Icon
    And   I Click Online Banking Button
   Then  I validated logIn Page is Displayed

    @SmokeTest
  Scenario: TD Bank signUp
    When I click on signUp button
    And I do necessary steps to land on User info page
    And I select account type
    And I enter user information
      | firstName | lastName | email              | atmNumber        | SSN       | accountNumber | userName   | reEnterUserName | password  | reEnterPassword |
      | Md        | Shuvo   | pnt30242@gmail.com | 144455667703217 | 44455778903 | 34526273848   | shuvo242 | shuvo242          | Srt@012542 | Srt@012542      |
    And I click on Continue Button
    Then I validate signUp message

  @SmokeTest
  Scenario Outline: TD Bank login functionality check with invalid credentials
    When I click on logIn button in homePage
    And I enter "<userName>" and "<password>"
    And I click on login
    Then I validate the error message
    Examples:
      | userName | password  |
      | shuvo242  | Srt@012542 |


  @SmokeTest
  Scenario: TD Bank product dropDown list check
    When I click on product
    And I click on checking
    Then I validate checking account page


 @SmokeTest
  Scenario: TD Bank Find us Box functionality check
    When I click FindUs Icon
    And I enter "11436" and click on searchIcon
    Then I validate TD bank locations appeared

  @SmokeTest
  Scenario: Get Direction Button check
    When I take necessary steps and landed on locations page
    And I click on Get Direction Button
    Then I validate google map page Title