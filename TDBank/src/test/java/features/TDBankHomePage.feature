Feature: TD Bank HomePage Functionality Test

  @SmokeTest
  Scenario: TD Bank Online Banking Functionality check
    Given I am In TD Bank HomePage
    When  I mouseHover on logIn Icon
    And   I Click Online Banking Button
#    Then  I validated logIn Page is Displayed