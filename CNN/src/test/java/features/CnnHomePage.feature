
Feature: CNN Home Page Functionality Check

  Background:
    Given I am in Cnn home page
  @SmokeTest
  Scenario:CNN SignUp  check
    And I enter "Sports" in searchBox
    Then I validate Sports page appear properly

  @SmokeTest
  Scenario Outline:CNN searchBox check with multiple value using data driven
    When I enter "<SearchItem>" in searchBox
    And I validate page title as "<validatePageTitle>"

    Examples:
      | SearchItem    | validatePageTitle                                 |
      | Politics      | Search CNN - Videos, Pictures, and News - CNN.com |
      | World         | Search CNN - Videos, Pictures, and News - CNN.com |
      | Entertainment | Search CNN - Videos, Pictures, and News - CNN.com |
      | Health        | Search CNN - Videos, Pictures, and News - CNN.com |
      | Travel        | Search CNN - Videos, Pictures, and News - CNN.com |
      | Style         | Search CNN - Videos, Pictures, and News - CNN.com |
      | Sports        | Search CNN - Videos, Pictures, and News - CNN.com |
      | Business      | Search CNN - Videos, Pictures, and News - CNN.com |

  @SmokeTest
  Scenario: CNN edition button check
    When I click on edition button
    And I click on Us International Arabic and Espanol button
    Then I validate page title

  @SmokeTest
  Scenario: CNN home page burger button check
    When I click on burger button
    And I enter sports in search box
    And I click on search button
    And I click on politics radio button
    Then I validate politics page is appeared properly

  @SmokeTest
  Scenario: CNN home page Travel check
    When I click on travel tab
    And I click on best beach
    And I click on Map tab
    And I click on radio button
    Then I validate View All is visible

  @SmokeTest
  Scenario: CNN home page Travel check
    When I click on edition dropDown button
    And I click on international
    And I click on all stories
    And I click on Covid-19 symptoms
    Then I validate By Sandee LaMotte, CNN is visible

  @SmokeTest
  Scenario: CNN home page Travel check
    When I click on live Tv button
#    And I click on Tv Play Button
    And I click on back to cnn.com
    Then I validate Covid-19 is visible

  @SmokeTest
  Scenario: CNN home page Travel check
    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    Then I validate Login is visible

  @SmokeTest
  Scenario: CNN home page Travel check
    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    And I click close button
    Then I validate News Shows is visible

  @SmokeTest
  Scenario: CNN home page Travel check
    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    And I click close button
    And I click linda voice button
    And I click linda voice play button
    Then I validate US is visible

