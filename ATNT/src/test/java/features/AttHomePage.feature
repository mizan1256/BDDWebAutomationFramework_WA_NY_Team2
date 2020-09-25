Feature: Feature: Att HomePage Functionality check

  Background:
    Given I am in att homepage

  @SmokeTest
  Scenario: Att deals button Functionality check with valid data
    When I click Deals Button
    Then I verify Wireless is appear properly
    And I verify page title as AT&T Deals on Phones, Wireless Plans, Internet & TV Services

  @SmokeTest
  Scenario: Att Wireless button Functionality check with valid data
    When I click Wireless Button
    Then I verify LEARN HOW TO is appear properly
    And I verify page title as AT&T Wireless – Latest Phones & Best Wireless Plans

  @SmokeTest
  Scenario: Att Internet button Functionality check with valid data
    When I click internet Button
    Then I verify AT&T INTERNET is appear properly
    And I verify page title as AT&T Internet Plans - Home Internet - AT&T® Official Site

  @SmokeTest
  Scenario: Att TV button Functionality check with valid data
    When I click TV Button
    And I click on shop now button
    Then I verify Choose a TV package is appear properly
    And I verify page title as Shop AT&T Bundles

