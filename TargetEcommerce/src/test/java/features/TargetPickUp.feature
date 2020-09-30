Feature: TargetEcommerce PickUp And Delivery functionality check

  Background:
    When I click on pickUp and delivery button


  @SmokeTest
  Scenario: Order pickUp home page check
    Given I am on targetEcommerce home page
    And I click on Order pickUp button
    Then I validate order pickUp home page

  @SmokeTest
  Scenario: Oder pickUp searchBox functionality check
    When I do necessary steps to land on oder pickUp home page
    And I enter "655473634747" as order number in order searchBox and click searchBox Icon
    Then I validate search result message

  @SmokeTest
  Scenario: Same day delivery page check
    And I click on same day delivery button
    Then I validate "Get it as soon as 10am" as same day delivery home page

  @SmokeTest
  Scenario: Same day delivery signIn functionality check
    And I do necessary steps to land on signIn page
    And I enter "mizan_1256@yahoo.com" as email and "Tasmi1256" as password
#    Then I validate my address after successfully login

  @SmokeTest
  Scenario:Drive Up home page check
    And I click on drive up button
    Then I validate drive up home page Title