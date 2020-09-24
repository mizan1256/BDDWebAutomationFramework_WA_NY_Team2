Feature:Geico homePage functionality check

  Background:
    Given I am on Geico home page

  @SmokeTest
  Scenario: Geico searchBox functionality Check
    And I click searchLogo
    And I enter motorcycle in searchBox
    When I click searchButton
    Then I verify siteSearchText

  @SmokeTest
  Scenario: Geico searchBox functionality Check
    And I click searchLogo
    And I enter "motorcycle" in searchBox
    When I click searchButton
    Then I verify siteSearchText

  @SmokeTest
  Scenario Outline: Geico searchBox functionality Check
    And I click searchLogo
    And I enter "<searchItem>" in searchBox
    When I click searchButton
    Then I verify siteSearchText
    Examples:
      | searchItem           |
      | Motorcycle Insurance |
      | Car Insurance        |
      | Condo Insurance      |
      | life Insurance       |
      | RV Insurance         |
      | Flood Insurance      |
      | Boat Insurance       |

  @SmokeTest
  Scenario: Geico login functionality Check
    And I choose click on the arrow to choose policy
    And I choose accessPolicy
    And I click on LoginOption
    And I enter userName and password
    When I click loginButton
    Then I verify title


  @SmokeTest
  Scenario Outline: Geico login functionality Check
    And I choose click on the arrow to choose policy
    And I choose accessPolicy
    And I click on LoginOption
    And I enter "<userName>" and "<password>"
    When I click loginButton
    Then I verify title
    Examples:
      | userName  | password    |
      | mtt1213   | abs12344556 |
      | mttt124  | abs214324   |
      | mtt124324 | 12424653    |
      | mtt12424  | 12424653    |
      | mtt1324   | Ewfg234     |
      | mtt1325   | 12424fer53  |

  @SmokeTest
  Scenario: Geico login create account check with variable
    And I click on startHere
    And I enter "policyNumber", "dateOfBirth" and "zipCode"
    When I click continue
    Then I verify errorText on screen

  @SmokeTest
  Scenario Outline: Geico login create account check with multiple variable
    And I click on startHere
    And I enter "<policyNumber>", "<dateOfBirth>" and "<zipCode>"
    When I click continue
    Then I verify policyNumber on screen
    Examples:
      | policyNumber | dateOfBirth | zipCode |
      | 1234         | 02141004    | 10045   |
      | 124355       | 0319919     | 10422   |
      | 12314        | 03191996    | 10326   |
      | 12315        | 03191296    | 10329   |
      | 12316        | 01191996    | 10328   |
      | 12317        | 05191996    | 10327   |