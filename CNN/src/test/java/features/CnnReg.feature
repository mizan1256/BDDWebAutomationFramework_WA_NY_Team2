Feature: CNN Home Page Functionality Check

  Background:
    Given I am in Cnn home page
#  @SmokeTest
  Scenario: Cnn SignUp functionality cheek
    When I do all necessary steps to land on Registration page
    And I enter user info
      |emailAddress|password  |zipcode|
      |pntitny@gmail.com|Sqd@55242  |11436|
    And I click on registration button
    Then I validate welcome message

#  @SmokeTest
  Scenario Outline: Cnn SignIn functionality cheek
    When I click on SingInIcon
    And I enter "<userEmail>" and "<password>"
    Then I validate landed page title
    Examples:
      |userEmail|password|
      |pntitny@gmail.com|Sqd@55242|

