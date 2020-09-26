Feature: Aetna HomePage Check


  Background:
    Given I am in Aetna home page

  @SmokeTest
  Scenario:Aetna Student plans button check
    When I click shop for a plan
    And I go Health coverage
    And I click Student plans
    Then I validate "Helpful links" is appeared properly

  @SmokeTest
  Scenario:Aetna Plans through an employer  check
    When I click shop for a plan
    And I go Health coverage
    And I click Plans through an employer
    Then I validate Legal notices is appeared properly

  @SmokeTest
  Scenario:Aetna International Plans check
    When I click shop for a plan
    And I go Health coverage
    And I click International Plans
    Then I validate Aetna Well-being is appeared properly

  @SmokeTest
  Scenario:Aetna find a doctor check
    When I click shop for a plan
    And I go Health coverage
    And I click find a doctor
    Then I validate COVID-19 Alert is appeared properly

  @SmokeTest
  Scenario:Aetna dental plans check
    When I click shop for a plan
    And I click on dental, vision and supplemental
    And I click dental plans
    Then I validate Legal notices is appeared properly

  @SmokeTest
  Scenario:Aetna find a dentist button check
    When I click shop for a plan
    And I click on dental, vision and supplemental
    And I click find a dentist
    Then I validate You Can: is appeared properly

  @SmokeTest
  Scenario:Aetna vision plans button check
    When I click shop for a plan
    And I click on dental, vision and supplemental
    And I click vision plans
    Then I validate Aetna Dental Direct plan is appeared properly

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