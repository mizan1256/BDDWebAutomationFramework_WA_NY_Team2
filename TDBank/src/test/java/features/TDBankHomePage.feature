Feature: TD Bank Home page functionality test
    Background:
        Given I am on TD bank home page.
@SmokeTest(Enable=false)

Scenario: TD Bank Online Banking page is displayed
    Given I am on TD bank home page.
    When i mouse hover on LogIn
    And i click on Online Banking
    Then i validate LogIn page is displayed

    @SmokeTest
    Scenario: TD Bank sign up functionality test
        When I click on sign up
        And I enter personal information
        And I enter personal account information
        And create User and Password name
        Then i validate Signup page is displayed