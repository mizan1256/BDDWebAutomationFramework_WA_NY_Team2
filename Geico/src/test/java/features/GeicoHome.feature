Feature:Geico homePage functionality check

  Background:I am on Geico homepage
    Given I am on Geico homepage

  @SmokeTest
  Scenario: Geico searchBox functionality Check
    And I click searchlogo
    And I enter motorcycle in searchBox
    When I click searchButton
    Then I verify siteSearchText
  @SmokeTest
  Scenario: Geico searchBox functionality Check
    And I click searchlogo
    And I enter "motorcycle" in searchBox
    When I click searchButton
    Then I verify siteSearchText

  @SmokeTest
  Scenario Outline: Geico searchBox functionality Check
    And I click searchlogo
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
      | jfk11   | 1212 |
      | dac22    | 1313   |
      | lga33 | 1414    |
      | dxb44  | 1515    |
      | mxp55   | 1616     |
      | tlp66   | 1717  |

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
      | 11111        | 02141989   | 10021   |
      | 22222        | 02141981     | 13422   |
      | 33333        | 02141933    | 10656   |
      | 44444        | 045641989    | 14429   |
      | 55555        | 12941989    | 10568   |
      | 123666      | 200041989    | 10237   |