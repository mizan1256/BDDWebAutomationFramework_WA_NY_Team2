Feature: TargetEcommerce Home page Functionality test


  Background:
    Given I am on targetEcommerce home page

 # @Regression
  Scenario: TargetEcommerce SearchBox check
    And I validate searchBox is displayed

  @Regression
  Scenario: TargetEcommerce SearchBox functionality test with validate
    And I enter iPhone in searchBox
    Then I verify iPhone is appear properly
#     And I verify p age title as iPhone
