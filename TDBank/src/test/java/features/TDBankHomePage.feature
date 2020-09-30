Feature: TD Bank Home page functionality test
    Background:
        Given I am on TD bank home page.
@SmokeTest

Scenario: TD Bank Online Banking page is displayed
    When i mouse hover on LogIn
    And i click on Online Banking
    Then i validate LogIn page is displayed

    @SmokeTest
    Scenario: TD Bank sign up functionality test with invalid info
        When I click on sign up
        And I enter personal information
        And I enter personal account information
        And create User and Password name
        Then i validate Signup page is displayed

#

  @SmokeTest
    Scenario: TD Bank signUp
        When I click on signUp button
        And I do necessary steps to land on User info page
        And I select account type
        And I enter user information
            | firstName | lastName | email              | atmNumber        | SSN       | accountNumber | userName   | reEnterUserName | password  | reEnterPassword |
            | jony     | hossan    | jonhossn@gmail.com | 11234546464455 | 123456789 | 343434343434   | jonh112 | jonh112      | dhaka1219 | dhaka1219     |

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
            | jonhossn | dhaka1219|


  @SmokeTest
    Scenario: TD Bank product dropDown list check
        When I click on product
        And I click on checking
        Then I validate checking account page


  @SmokeTest
    Scenario: TD Bank Find us Box functionality check
        When I click FindUs Icon
        And I enter "11435" and click on searchIcon
        Then I validate TD bank locations appeared

    @SmokeTest
    Scenario: Get Direction Button check
        When I take necessary steps and landed on locations page
        And I click on Get Direction Button
        Then I validate google map page Title