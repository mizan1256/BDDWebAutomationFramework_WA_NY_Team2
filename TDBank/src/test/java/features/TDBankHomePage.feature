Feature: TD Bank Credit Card Home Page feature check

  Background:
    Given I am on TD Bank home page

  @SmokeTest
  Scenario: TD bank Credit Card home page display check
    And I click on CreditCard icon
    Then I validate Credit Card Home page Title

  @SmokeTest
  Scenario: Td Cash Credit Card home page check
    And I click on CreditCard icon
    And I click on Td Cash Credit Card
    Then I validate Td Cash Credit Card is display
    And I validate Td Cash Credit Card page Title

  @SmokeTest
  Scenario:TD First Class Credit Card page check
    And I click on CreditCard icon
    And I click on TD First Class Credit Card Button
    Then I validate TD First Class Credit Card Image is display
    And I validate TD First Class Credit Card page Title


  @SmokeTest
  Scenario:Help me choose button check
    And I click on CreditCard icon
    When I click on Help me Choose Button
    And I click on Cash and Next button
    Then I validate welcome message








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
      | firstName | lastName   | email                      | atmNumber        | SSN       | accountNumber | userName   | reEnterUserName | password  | reEnterPassword |
      | Arman     | Hossain    | Arman.hossain496@gmail.com | 1765498765416789 | 086648764 | 87652456780   | Arman430   | Arman430        | JustChill | JustChill       |
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
      | Arman430 | JustChill |


  @SmokeTest
  Scenario: TD Bank product dropDown list check
    When I click on product
    And I click on checking
    Then I validate checking account page


  @SmokeTest
  Scenario: TD Bank Find us Box functionality check
    When I click FindUs Icon
    And I enter "11208" and click on searchIcon
    Then I validate TD bank locations appeared

  @SmokeTest
  Scenario: Get Direction Button check
    When I take necessary steps and landed on locations page
    And I click on Get Direction Button
    Then I validate google map page Title