Feature: Aetna HomePage Functionality Test

  @SmokeTest
  Scenario: Aetna Shop For a Plan Button functionality Test
    Given  I am in Aetna HomePage
    When   I Click ShopForAPLan Button
    And    I Click on HealthCoverage Button
    And   I click FindADoctor Button
    Then    I Verify page Title


