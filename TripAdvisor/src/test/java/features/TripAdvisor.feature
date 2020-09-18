Feature: TripAdvisor HomePage Functionality check


Background:
  Given I am in TripAdvisor homepage



  Scenario: TripAdvisor SearchBox Functionality check with valid data
    And I enter Mexico City in searchBox
    When I click searchButton
    Then I verify Mexico City is appear properly
    And I verify page title as Mexico City

  @Regression
  Scenario: TripAdvisor sign in Functionality check with valid credentials
    And I click on signIn Button adn continue button
    And I enter email as "pnt30242@gmail.com" and password as "Pnt@1256"
    When I click on LOG IN
#    Then I landed on home page


