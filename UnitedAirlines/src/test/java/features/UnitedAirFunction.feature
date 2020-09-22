Feature: I check United Airlines signIn functionality test

  @SmokeTest
  Scenario:
    Given I am in United Airlines home page
    When I click on signIn button
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date | year |
      | Mohammad  | Mujahidul  | Islam    | 1   | 1980 |
    And month and gender field is selected
    Then I validate Contact Information is appeared properly