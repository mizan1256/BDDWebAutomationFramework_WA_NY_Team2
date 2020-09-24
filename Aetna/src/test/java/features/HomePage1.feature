Feature: Aetna home page functionality test

  Background:
    Given i am in home page
    When I click on Explore Aetna sites
    And I click on For Providers


    @SmokeTest
  Scenario:Aetna Request call Functionality Checking
    And I click on Aetna.com
    And I click on Aetna Medicare
    And I click on Request call
    Then I validate A new plan is appeared properly

  @SmokeTest
  Scenario: Aetna Plan from an employer Functionality Checking
    And I click on Aetna.com
    And I click on Find a doctor
    And I click on Plan from an employer
    Then I validate Searching as a member is better is appeared properly

  @SmokeTest
  Scenario:Aetna Welcome Functionality Checking
    And I click on Join the Aetna network
    And I click on Welcome
    Then I validate Step1 is appeared properly

  @SmokeTest
  Scenario: Aetna Medical Functionality Checking
    And I click on Join the Aetna network
    And I click on Medical
    Then I validate Medical Request for Participation is appeared properly

  @SmokeTest
  Scenario: Aetna Dental Functionality Checking
    And I click on Join the Aetna network
    And I click on Dental
    Then I validate Dental Request for Participation is appeared properly

  @SmokeTest
  Scenario:Aetna Behavioral Health Functionality Checking
    And I click on Join the Aetna network
    And I click on Behavioral Health
    Then I validate Behavioral Health Request for Participation is appeared properly

  @SmokeTest
  Scenario:Aetna Facility Request for Participation Functionality Checking
    And I click on Join the Aetna network
    And I click on Facility
    Then I validate Facility Request for Participation is appeared properly

  @SmokeTest
  Scenario:Aetna Others Functionality Checking
    And I click on Join the Aetna network
    And I click on Others
    Then I validate Other networks you can join is appeared properly

  @SmokeTest
  Scenario:Aetna Find a doctor or hospital Functionality Checking
    And I click on Precertification
    And I click on Find a doctor or hospital
    Then I validate Directory is appeared properly

  @SmokeTest
  Scenario:Aetna Disputes & Appeals Overview
    Then I took necessary steps to land on Aetna Disputes & Appeals Overview
    Then I validate Clinical Policy Bulletins is appeared properly