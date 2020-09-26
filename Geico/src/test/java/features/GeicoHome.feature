Feature:Geico homePage functionality check

  Background:I am on Geico homepage
    Given I am on Geico homepage

  @Regression
  Scenario: Geico searchBox functionality Check
    And I click searchlogo
    And I enter motorcycle in searchBox
    When I click searchButton
    Then I verify siteSearchText

  @Regression
  Scenario: Geico searchBox functionality Check
    And I click searchlogo
    And I enter "motorcycle" in searchBox
    When I click searchButton
    Then I verify siteSearchText

  @Regression
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

  @Regression
  Scenario: Geico login functionality Check
    And I choose click on the arrow to choose policy
    And I choose accessPolicy
    And I click on LoginOption
    And I enter userName and password
    When I click loginButton
    Then I verify title


  @Regression
  Scenario Outline: Geico login functionality Check
    And I choose click on the arrow to choose policy
    And I choose accessPolicy
    And I click on LoginOption
    And I enter "<userName>" and "<password>"
    When I click loginButton
    Then I verify title
    Examples:
      | userName  | password |
      | akm3434   | wew9rd   |
      | akm3345   | 4329hh   |
      | akm4567   | 73464jjj |
      | akm3987   | 3i290o   |
      | akm3456   | ew6253   |
      | akm0987   | jh6353   |

  @Regression
  Scenario: Geico login create account check with variable
    And I click on startHere
    And I enter "policyNumber", "dateOfBirth" and "zipCode"
    When I click continue
    Then I verify errorText on screen

  @Regression
  Scenario Outline: Geico login create account check with multiple variable
    And I click on startHere
    And I enter "<policyNumber>", "<dateOfBirth>" and "<zipCode>"
    When I click continue
    Then I verify policyNumber on screen
    Examples:
      | policyNumber | dateOfBirth | zipCode |
      | 23454        | 05131996    | 15763   |
      | 35667        | 02171956    | 24678   |
      | 38249        | 03192020    | 11226   |
      | 43848        | 01151990    | 11696   |
      | 43949        | 01291991    | 11218   |
      | 43290        | 09131999    | 11208   |

  @SmokeTest
  Scenario: Gecio Career button Check
    Given I am on Geico Homepage
    And   I click on Career button
    When  I Click on Customer Service Button
    Then  I validate Customer Service Careers text appear Properly