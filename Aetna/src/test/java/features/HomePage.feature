Feature: Aetna home page functionality test

  Background:
    Given I am on Aetna home page

  @SmokeTest
  Scenario:Aetna Shop a plan student plans test
    When I click shop for a plan
    And I go Health coverage
    And I click Student plans
    Then I validate "Helpful links" is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan through an employer test
    When I click shop for a plan
    And I go Health coverage
    And I click Plans through an employer
    Then I validate Legal notices is appeared properly

  @SmokeTest
  Scenario:Aetna shop a plan international plans test
    When I click shop for a plan
    And I go Health coverage
    And I click International Plans
    Then I validate Aetna Well-being is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan find a doctor test
    When I click shop for a plan
    And I go Health coverage
    And I click find a doctor
    Then I validate Already a member? is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan dental plans test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click dental plans
    Then I validate Legal notices is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan dentist test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click find a dentist
    Then I validate You Can: is appeared properly

  @SmokeTest
  Scenario:Aetna Shop a plan vision plans test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click vision plans
    Then I validate Aetna Dental Direct plan is appeared properly

