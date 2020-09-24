Feature: TD Bank Home Page functionality test


  Background:
    Given I am in TD Bank home page


   @SmokeTest
  Scenario: TD Bank Online Banking page is display
    When I mouseHover on LogIn
    And I click on online banking
    Then I validate log in page is displayed

  @SmokeTest
  Scenario: TD Bank signUp
    When I click on signUp button
    And I do necessary steps to land on User info page
    And I select account type
    And I enter user information
      | firstName | lastName | email                  | atmNumber        | SSN       | accountNumber | userName     | reEnterUserName | password  | reEnterPassword |
      | Shah      | Zakerin  | 30248ny_shah@gmail.com | 3334567890876543 | 553456789 | 3334526273848 | 30248ny_shah | 30248ny_shah    | Pnt@30248 | Pnt@30248       |
    And I click on continue button
    Then I validate signUp message

  @SmokeTest
  Scenario Outline: TD Bank login functionality check with invalid credentials
    When I click on logIn button in homePage
    And I enter "<userName>" and "<password>"
    And I click on login
    Then I validate the error message
    Examples:
      | userName | password  |
      | 30248ny_shah | Pnt@30248 |


  @SmokeTest
  Scenario: TD Bank product dropDown list check
    When I click on product
    And I click on checking
    Then I validate checking account page


  @SmokeTest
  Scenario: TD Bank Find us Box functionality check
    When I click FindUs Icon
    And I enter "11416" and click on searchIcon
    Then I validate TD bank locations appeared

  @SmokeTest
  Scenario: Get Direction Button check
    When I take necessary steps and landed on locations page
    And I click on Get Direction Button
    Then I validate google map page Title
