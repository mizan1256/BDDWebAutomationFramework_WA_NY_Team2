Feature: TD Bank Home Page functionality test

  @SmokeTest
  Scenario: TD Bank loginIn icon functionality test
    Given I am on TD Bank home page
    When I mouseHover on logIn
    And I click online banking
    Then i validate log in page is displayed