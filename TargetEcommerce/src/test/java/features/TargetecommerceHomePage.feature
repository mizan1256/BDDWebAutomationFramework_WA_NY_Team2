Feature: TargetEcommerce Home page Functionality test


  Background:
    Given I am on targetEcommerce home page

# @Regression
  Scenario: TargetEcommerce SearchBox check
    And I validate searchBox is displayed

 #@Regression
  Scenario: TargetEcommerce SearchBox functionality test with validate
    And I enter iPhone in searchBox
    Then I verify iPhone is appear properly
    And I verify page title as iPhone

  #@Regression
  Scenario: TargetEcommerce SearchBox functionality getting value from Scenario
    And I enter "iPhone" in searchBox
    Then I verify "iPhone" is appear properly
    And I verify page title as iPhone

  @Regression
  Scenario Outline: TargetEcommerce SearchBox functionality test with validate using data table
    And I enter "<productName>" in searchBox
    When  I click searchButton
    And I validate "<validateProduct>" is appear properly
    And I validate page title as "<validateTitle>"

    Examples:
      | productName     | validateProduct   | validateTitle                   |
      | iPhone          | iPhone            | Target : Expect More. Pay Less. |
      | T-shirt for men | “T-shirt for men” | Target : Expect More. Pay Less. |
      | mens jeans      | “mens jeans”      | Target : Expect More. Pay Less. |
      | mens watches    | “mens watches”    | Target : Expect More. Pay Less. |

 @Regression
  Scenario: TargetEcommerce signUp functionality test with validate
    And I do necessary steps to land on User info page
    And I enter user credentials
      | email              | firstName | lastName | phoneNumber | password  |
      | pnt30242@gmail.com | Mohammd   | Islam    | 7186901256  | Pnt@30242 |
    When I click on create account
    Then I validate signUp message

 @SmokeTest
  Scenario Outline: Login into att using Data Driven
    And I am on signIn page
    And I enter email as "<userEmail>" and password as "<Password>"
    And I click on signIn button
    Then  I should be getting a message

    Examples:
      | userEmail           | Password |
      | admin@yourstore.com | admin    |
      | mizan@gmail.com     | 15021972 |
      | mohammd@gmail.com   | 01012010 |

   @SmokeTest
  Scenario: Target shoppingCart logo functionality check
    And I click on shopping cart Icon
    Then I validate shopping cart page

  @SmokeTest
  Scenario: Target Shopping Cart log in functionality check
    When I click on shopping cart Icon
    And I click on shopping cart signIn button
    And I enter email as "mizan_1256@yahoo.com" and password as "Tasmi@1256"
    Then I validate shopping cart log in page
