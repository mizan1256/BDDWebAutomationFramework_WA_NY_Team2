Feature: Att HomePage Functionality check
  Att search functionality
  Att login functionality

  @SmokeTest @Regression
  Scenario: Att SearchBox Functionality check with valid data
    Given I am in at&t homepage
    And I enter Samsung Phones in searchBox
    When I click searchButton
    Then I verify Samsung Phones is appear properly
    And I verify page title as Samsung Phones

    # Given User launches Chrome browser
# When User opens URL "https://admin-demo.nopcommerce.com/login"
# And User enters email as "admin@yourstore.com" and password as "admin"
# Then Click on LOG IN
# Then User landed on Dashboard page

