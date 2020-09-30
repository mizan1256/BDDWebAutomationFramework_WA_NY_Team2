Feature: UnitedAirlines home page functionality test
  Background:
    Given I am on United Airlines home page
   @SmokeTest
   Scenario: UnitedAirlines Book a hotel functionality check
     When I click on Book button
     And I click on Hotels button
     And I entered "Miami Beach" on searchBox & submit.
     Then I verify  Miami Beach landing page


      Given I am on United homepage

  @SmokeTest
  Scenario: United login functionality Check
    And I click on signInOption
    And I enter userName and password
    When I click loginButton
    Then I verify image


  @SmokeTest
  Scenario: United login functionality Check with variable
    And I click on signInOption
    And I enter "userName" and "password"
    When I click loginButton
    Then I verify image


  @SmokeTest
  Scenario Outline: United login functionality Check with multiple variable
    And I click on signInOption
    And I enter "<userName>" and "<password>"
    When I click loginButton
    Then I verify image
    Examples:
      | userName | password |
      | jhosn01   | abc123   |
      | jhosn12   | def124   |
      | jhosn03   | ght125   |
      | jhosn04  | fjk126   |
      | jhosn05  | dac127   |
      | jhosn07  | ert123   |

  @SmokeTest
  Scenario: United search functionality Check with variable
    And i click on the searchLogo
    And I enter "airlines" in the searchBox
    When I click searchButton
    Then I verify searchText


  @SmokeTest
  Scenario Outline: United search functionality Check with variable
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
  @SmokeTest
  Scenario: United round trip flights functionality Check
#    And I enter location From*
    And I enter location To*
    And I clear enter departDate
    And I clear enter returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle


  @Regression
  Scenario: United round trip flights functionality Check with multiple flights
    And I enter destination location "Rome"*
    And I clear enter depart Date departDate
    And I clear enter return date returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle

  @Regression
  Scenario Outline: United round trip flights functionality Check with variable
    And I enter destination location "<location>"*
    And I clear enter depart Date departDate
    And I clear enter return date returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle
    Examples:
      | location |
      | Dhaka    |
      | Pakistan  |
      | India    |
      | Rome |
      | London   |
