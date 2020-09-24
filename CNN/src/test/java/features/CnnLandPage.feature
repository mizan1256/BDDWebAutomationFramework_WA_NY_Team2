Feature: CNN home page functionality test

  Background:
    Given I am in Cnn home page
    When I click on live Tv button

    @SmokeTest
  Scenario: CNN home page burger button functionality test
    When I click on burger button
    And I enter sports in search box
    And I click on search button
    And I click on politics radio button
    Then I validate politics page is appeared properly

  @SmokeTest
  Scenario: CNN home page Travel functionality test
    When I click on travel tab
    And I click on best beach
    And I click on Map tab
    And I click on radio button
    Then I validate View All is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
    When I click on edition dropDown button
    And I click on international
    And I click on all stories
    And I click on Covid-19 symptoms
    Then I validate By Sandee LaMotte, CNN is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
#    When I click on live Tv button
    And I click on Tv Play Button
    And I click on back to cnn.com
    Then I validate Covid-19 is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
#    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    Then I validate Login is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
#    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    And I click close button
    Then I validate News Shows is visible

   @SmokeTest
  Scenario: CNN home page Travel functionality test
    And I click on Tv channel box
    And I click on cnn channel
    And I click close button
    And I click linda voice button
    And I click linda voice play button
    Then I validate US is visible