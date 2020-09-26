Feature: Cnn Sign up
  Check sign up with Invalid credentials(Negative Test)
  Check sign up with valid credentials


  Background:
    Given I am on cnn home page

  @SmokeTest
  Scenario: Sign up  with invalid email address
    When I click on user account button
    And  I click on sign up link
    And  I enter "abcd" into email text field
    And  I enter "Test2020@" into password text field
    And  I enter "11435" into the zipcode text field
    And  I click on register button
    Then I verify invalid email address text

  @SmokeTest
  Scenario: Sign up  with invalid password
    When I click on user account button
    And  I click on sign up link
    And  I enter "pntp.2020@gmail.com" into email text field
    And  I enter "asdfghj" into password text field
    And  I enter "11435" into the zipcode text field
    And  I click on register button
    Then I verify invalid password text

  @SmokeTest
  Scenario: Sign up  with invalid zipcode
    When I click on user account button
    And  I click on sign up link
    And  I enter "pntp.2020@gmail.com" into email text field
    And  I enter "asdfghj" into password text field
    And  I enter "11435" into the zipcode text field
    And  I click on register button
    Then I verify invalid zipcode message

  @SmokeTest
  Scenario Outline: : Sign up with valid credentials
    When I click on user account button
    And  I click on sign up link
    And  I enter "<email>" into the eamil text field
    And  I enter "<password>" into the password text field
    And  I enter "<zipcode>" into the zipcode text field
    And  I click on register button
    Then I verify that account is valid

    Examples:
      | email               | password  | zipcode |
      | pntp.2020@gmail.com | Test2020@ | 11435   |

 @SmokeTest
  Scenario Outline: : Sign up with Invalid credentials
    When I click on user account button
    And  I click on sign up link
    And  I enter "<email>" into the eamil text field
    And  I enter "<password>" into the password text field
    And  I enter "<zipcode>" into the zipcode text field
    And  I click on register button
    Then I verify the "<errorMsg>" for invalid sign up

    Examples:
      | email          | password  | zipcode |
      | asdf           | Test1234@ | 11435   |
      | test@Gmail.com | 12345678  | 11435   |
      | test@Gmail.com | Test1234@ | abcde   |





