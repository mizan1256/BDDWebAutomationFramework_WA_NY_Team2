Feature: Atnt HomePage Functionality Check.

Background:
  Given I am on Atnt HomePage

    @pending
    Scenario: HomePage Prepaid Button Functionality Check
      When I click on Prepaid Button
      And I click on Mobile Plans
      Then I verify SM is appeared properly
      And I verify page title

  @pending
  Scenario: HomePage Bundles Button Functionality Check
    When I click on Bundles Button
    And I click on Check availability Button
    Then I verify Your address is appeared properly
    And I verify page title

  @pending
  Scenario: HomePage TV Button Check
    When I click on TV Button
    And I click on Sports Button
    When I click on Shop now Button
    Then I verify Internet is appeared properly

  @SmokeTest
  Scenario: Atnt SignUp Functionality Check With Valid Data.
    And I click on Account Icon
    And I click on SignIn Button
    Then I click on Create one now Button





















