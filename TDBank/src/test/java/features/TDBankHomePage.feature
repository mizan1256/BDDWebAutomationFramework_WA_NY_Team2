Feature: TD Bank Home Page functionality test


  Background:
    Given I am on TD Bank home page


 # @SmokeTest
  Scenario: TD Bank Online Banking page is display
    When I mouseHover on LogIn
    And I click on online banking
    Then I validate log in page is displayed

  @SmokeTest
  Scenario: TD Bank signUp
    When I click on signUp button
    And I select Personal Accounts Radio button from PopUp
    And I checked Please Confirm checkBox from PopUp
    Then I click continue in PopUp
    And I check Accept button from second PopUp
    And I Accept second PopUp
    And I enter FirstName LastName and Email
    And I select Checking From Account Type
    And I enter ATM card Number
    And I enter SSN number
    And I enter Account Number
    And I check Yes from Bill Pay Option
    And I select Yes from go paperless option
    And I Accept the third popUp
    Then I enter user name in Create your UserName field
    And I re enter user name In Re enter your user name field
    And I enter password in Your new password field
    And I re enter password in Re enter password field
    Then I click on continue
    And I validate error message






