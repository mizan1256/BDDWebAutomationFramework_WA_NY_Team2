Feature: Aetna HomePage Functionality Test

  Background:
    Given i am in Aetna home page

  @SmokeTest
  Scenario:Aetna Shop a plan test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click find an eye doctor
    Then I validate You Can: is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan  test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click supplemental plans
    Then I validate You Can: is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan  test
    When I click shop for a plan
    And I go pharmacy element
    And I click Get pharmacy plan information
    Then I validate Aetna Medicare is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan  test
    When I click shop for a plan
    And I go pharmacy element
    And I click find a pharmacy
    Then I validate *Required Selections is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan test
    When I click shop for a plan
    And I go pharmacy element
    And I click find medicine and costs
    Then I validate Already a member? is appeared properly

