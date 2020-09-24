Feature: TargetEcommerce Home page Functionality test


  Background:
    Given I am on targetEcommerce home page

  @Regression
  Scenario: TargetEcommerce SearchBox check
    And I validate searchBox is displayed

  @Regression
  Scenario: TargetEcommerce SearchBox functionality test with validate
    And I enter iPhone in searchBox
    Then I verify iPhone is appear properly
    And I verify p age title as iPhone

  @SmokeTest
  Scenario: TargetEcommerce signUp functionality test with validate
    And I do necessary steps to land on User info page
    And I enter user credentials
      | email              | firstName | lastName | phoneNumber | password  |
      |pntitny@gmail.com | Md   | Shuvo    | 7186901258  | Pnt@30242 |
    When I click on create account
    Then I validate signUp message