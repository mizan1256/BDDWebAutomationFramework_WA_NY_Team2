Feature: TargetEcommerce Home page Functionality

  Background:
    Given I am on targetEcommerce home page

  @SmokeTest
  Scenario: Target home page search box functionality test
    When I enter Samsung Phones
    And I click on search button
    Then I validate “Samsung Phone” is appeared properly

  @SmokeTest
  Scenario: Target home page Clearance Tab functionality test
    When I click on clearance tab
    And I click on Furniture clearance
    Then I validate “Filter results” is appeared properly

  @SmokeTest
  Scenario: Target home page Registry Tab functionality test
    When I click on registry tab
    And I click on Create a Baby box
    Then I validate EASY FOR EVERYONE is appeared properly

  @SmokeTest
  Scenario: TargetEcommerce Shopping Cart functionality test with valid data
    When I do necessary steps to Target create Account page
    And I enter invalid credentials
      | Email             | firstName | lastName | phoneNumber | password |
      | test123@gmail.com | Tom       | Hanks    | 3471114321  | tom1234  |
    And I Click on create account
    Then I validate Keep me signed in message

  @SmokeTest
  Scenario: TargetEcommerce Shopping Cart functionality test with invalid data
    When I do necessary steps to land sign In page
    And I enter invalid email in email field
    And I enter invalid password in email field
    And I Click on sign In Button
    Then I validate show message

  @SmokeTest
  Scenario: TargetEcommerce Create Account functionality test with valid data
    When I do necessary steps to land on User info page
    And I enter user credentials
      | Email             | firstName | lastName | phoneNumber | password |
      | pnt2020@gmail.com | Mike      | Carole   | 3471114321  | pnt12345 |
    And I Click on create account
    Then I validate signUp message

  @SmokeTest
  Scenario Outline: TargetEcommerce signIn functionality test with validate
    When I do necessary steps to land on User info page
    And I enter use email "<Email>"
    And I enter user password  "<Password>"
    Examples:
      | Email             | Password |
      | pnt12@gmail.com   | pnt12345 |
      | pnt123@gmail.com  | pnt12345 |
      | pnt1234@gmail.com | pnt12345 |
      | pnt321@gmail.com  | pnt12345 |


  @SmokeTest
  Scenario Outline: TargetEcommerce SearchBox functionality test with validate using data table
    And I enter "<productName>" in searchBox
    When I click searchButton
    And I validate "<validateProduct>" is appear properly
    And I validate page title as "<validateTitle>"

    Examples:
      | productName | validateProduct | validateTitle                   |
      | Mask        | \"Mask\"        | Target : Expect More. Pay Less. |
      | Soap        | \"Soap\"        | Target : Expect More. Pay Less. |
      | Bike        | \"Bike\"        | Target : Expect More. Pay Less. |
      | Shirt       | \"Shirt\"       | Target : Expect More. Pay Less. |

