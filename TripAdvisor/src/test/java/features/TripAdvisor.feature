Feature: Trip Advisor Home Page Functionality test

  Background:
    Given I am in Trip Advisor home page

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I type Texas i search box
    And I click search button
    And I click Hotels Button
    Then I varify "Texas" is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I type Texas i search box
    And I click search button
    And I click Hotels Button
    And I click vacation rentals tab
    Then I varify "Texas" is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I type Texas i search box
    And I click search button
    And I click Hotels Button
    And I click Restaurants tab
    And I click Texas Roadhouse
    And I navigate new windows
    And I click food picture
    And I click Gallery button
    Then I varify food image is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click TravelForum
    And I click Flights
    And I enter Where from and To field
    And I enter departure and arrival date
    And I enter person field and close person field
    And I click find flight button
    Then I varify COVID-19 Policies is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click TravelForum and click Flight
    And I click One way tab
    And I enter Where from and To field
    And I enter departure date
    And I enter person field and close person field
    And I click find flight button
    Then I varify COVID-19 Policies is appeared properly
  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click Things to Do
    And I type in searchBox and submit
    Then I varify Dhaka City is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click Things to Do
    And I type in searchBox and submit
    Then I varify Dhaka City is appeared properly

 # @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click More Box
    And I click Airlines Tab
    And I click Advanced Air
    Then I varify Advance Air is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click trip button
    And I click get start
    Then I varify reCAPCHA is appeared properly

  @SmokeTest
  Scenario: Trip Advisor Search box functionality test
    When I click Post
    And I click Post Photo
    And I click hohel radio button
    And I type hotel name and city name and click search button
    And select and click radio button
    And I click Post Photos Button and click add photo btn
    And I click select photo from your computer.
## Then I varify reCAPCHA is appeared properly