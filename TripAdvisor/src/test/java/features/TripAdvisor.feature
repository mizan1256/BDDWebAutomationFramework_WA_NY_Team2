Feature: Trip Advisor Home Page Functionality test

  Background:
    Given I am in Trip Advisor home page

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I enter Texas in search box
    And I click on search button
    And I click on Hotels Button
    Then I verify "Texas" is appeared properly

  @SmokeTest
  Scenario: Trip Advisor vacation test
    When I enter Texas in search box
    And I click on search button
    And I click on Hotels Button
    And I click vacation rentals tab
    Then I verify "Texas" is appeared properly

  @SmokeTest
  Scenario: Trip Advisor restaurants test
    When I enter Texas in search box
    And I click on search button
    And I click on Hotels Button
    And I click Restaurants tab
    And I click Texas Roadhouse
    And I navigate new windows
    And I click food picture
    And I click Gallery button
    Then I verify food image is appeared properly

  @SmokeTest
  Scenario: Trip Advisor flight status functionality test
    When I click on TravelForum
    And I click on Flights
    And I enter Where from and To field
    And I enter departure and arrival date
    And I enter person field and close person field
    And I click on find flight button
    Then I verify COVID-19 Policies is appeared properly

  @SmokeTest
  Scenario: Trip Advisor find flight functionality test
    When I click on TravelForum and click on Flight
    And I click on One way tab
    And I enter Where from and To field
    And I enter departure date
    And I enter person field and close person field
    And I click on find flight button
    Then I verify COVID-19 Policies is appeared properly

  @SmokeTest
  Scenario: Trip Advisor things to do functionality test
    When I click on Things to Do
    And I type in searchBox and submit
    Then I verify Dhaka City is appeared properly

  @SmokeTest
  Scenario: Trip Advisor things to do search box functionality test
    When I click on Things to Do
    And I type in searchBox and submit
    Then I verify Dhaka City is appeared properly

#  @SmokeTest
#  Scenario: Trip Advisor Search box functionality test
#    When I click More Box
#    And I click Airlines Tab
#    And I click Advanced Air
#    Then I varify Advance Air is appeared properly

  @SmokeTest
  Scenario: Trip Advisor trip button functionality test
    When I click on trip button
    And I click on get start
    Then I verify reCAPCHA is appeared properly

  @SmokeTest
  Scenario: Trip Advisor post tab functionality test
    When I click on Post tab
    And I click on Post Photo
    And I click on hotel radio button
    And I type hotel name and city name and click search button
    And select and click radio button
    And I click on Post Photos Button and click add photo btn
    And I click on select photo from your computer.

  @SmokeTest
  Scenario: HomePage Restaurant Button Functionality Check
    Given  I am on TripAdvisor HomePage
    When I click on Restaurant Button
    And I wrote Grass Valley on the search box
    Then I click on Grass Valley
    And I verify Valley is appeared properly
    And I verify page title





