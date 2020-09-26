Feature: Feature: Att HomePage Functionality check

  Background:
    Given I am in at&t homepage

  @SmokeTest
  Scenario: Att SearchBox Functionality check with valid data
    And I enter Samsung Phones in searchBox
    When I click searchButton
    Then I verify Samsung Phones is appear properly
    And I verify page title as Samsung Phones

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


  @SmokeTest
  Scenario Outline:Atnt SearchBox Functionality check with multiple products
    And I enter "<searchItems>" in searchBox
    When I click searchButton

    Examples:
      | searchItems           |
      | AT&T PREPAID          |
      | AT&T Deals            |
      | TV & internet bundles |
      | Upgrade a device      |

  @SmokeTest
  Scenario Outline:Atnt SearchBox Functionality check with multiple products
    And I enter "<productName>" in searchBox
    When I click searchButton
    Then I verify "<validateProduct>" and "<validateTitle>"
#    And I verify page title as "<pageTitle>"
    Examples:
      | productName       | validateProduct       | validateTitle                               |
      | Samsung Phones    | \"Samsung Phones\"    | Results for Samsung Phones - AT&T Search    |
      | Apple Watches     | \"Apple Watches\"     | Results for Apple Watches - AT&T Search     |
      | Apple ipads       | \"Apple ipads\"       | Results for Apple ipads - AT&T Search       |
      | iphone 11 Pro Max | \"iphone 11 Pro Max\" | Results for iphone 11 Pro Max - AT&T Search |
      | Samsung Tablets   | \"Samsung Tablets\"   | Results for Samsung Tablets - AT&T Search   |
