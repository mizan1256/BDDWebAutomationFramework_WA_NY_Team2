Feature:United homePage functionality check

#  Background:I am on United homepage

  @Pending
  Scenario: United login functionality Check
    Given I am on United homepage
    And I click on signInOption
    And I enter userName and password
    When I click loginButton
    Then I verify image


  @Pending
  Scenario: United login functionality Check with variable
    Given I am on United homepage
    And I click on signInOption
    And I enter "userName" and "password"
    When I click loginButton
    Then I verify image


  @Pending
  Scenario Outline: United login functionality Check with multiple variable
    Given I am on United homepage
    And I click on signInOption
    And I enter "<userName>" and "<password>"
    When I click loginButton
    Then I verify image
    Examples:
      | userName | password |
      | mtt123   | abs123   |
      | mtt124   | abs124   |
      | mtt125   | abs125   |
      | mtt126   | abs126   |
      | mtt126   | abs127   |
      | mtt126   | abs128   |

  @Pending
  Scenario: United search functionality Check with variable
    Given I am on United homepage
    And i click on the searchLogo
    And I enter "airlines" in the searchBox
    When I click searchButton
    Then I verify searchText


  @Pending
  Scenario Outline: United search functionality Check with variable
    Given I am on United homepage
    And i click on the searchLogo
    And I enter "<searchItem>" in the searchBox
    When I click searchButton
    Then I verify searchText
    Examples:
      | searchItem      |
      | airlines        |
      | flights         |
      | airline partner |
      | flight delays   |


#flight search
  @Pending
  Scenario: United round trip flights functionality Check
    Given I am on United homepage
#    And I enter location From*
    And I enter location To*
    And I clear enter departDate
    And I clear enter returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle


  @Regression
  Scenario: United round trip flights functionality Check with multiple flights
    Given I am on United homepage
    And I enter destination location "Paris"*
    And I clear enter depart Date departDate
    And I clear enter return date returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle

  @Regression
  Scenario Outline: United round trip flights functionality Check with variable
    Given I am on United homepage
    And I enter destination location "<location>"*
    And I clear enter depart Date departDate
    And I clear enter return date returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle
    Examples:
      | location |
      | Paris    |
      | Tokyo    |
      | India    |
      | Pakistan |
      | London   |















