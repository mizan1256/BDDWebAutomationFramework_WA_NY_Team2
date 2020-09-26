Feature: Cnn HomePage Check


  Background:
    Given Im in Cnn HomePage

  @SmokeTest
  Scenario: Cnn SignIn Functionality Check with valid Data
    And I click on AccountIcon
    Then I enter email and Password
    And I click on SignIn button

  @SmokeTest
  Scenario: Cnn US click Check
    Given Im in Cnn HomePage
    And I click on US button
    Then I verify the page title

  @SmokeTest
  Scenario:CNN SignUp functionality check
    And I enter "Sports" in searchBox
    Then I validate Sports page appear properly

  @SmokeTest
  Scenario Outline:CNN searchBox check with multiple value using data driven
    When I enter "<SearchItem>" in searchBox
    And I validate page title as "<validatePageTitle>"

    Examples:
      | SearchItem | validatePageTitle                                 |
      | Sports     | Search CNN - Videos, Pictures, and News - CNN.com |
      | Politics   | Search CNN - Videos, Pictures, and News - CNN.com |
      | US         | Search CNN - Videos, Pictures, and News - CNN.com |

  @SmokeTest
  Scenario: CNN edition button check
    When I click on edition button
    And I click on Us International Arabic and Espanol button
    Then I validate page title

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
    When I click on live Tv button
    And I click on back to cnn.com
    Then I validate Covid-19 is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    Then I validate Login is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    And I click close button
    Then I validate News Shows is visible

  @SmokeTest
  Scenario: CNN home page Travel functionality test
    When I click on live Tv button
    And I click on Tv channel box
    And I click on cnn channel
    And I click close button
    And I click linda voice button
    And I click linda voice play button
    Then I validate US is visible

#


  @SmokeTest
  Scenario: Cnn SignUp functionality cheek
    When I do all necessary steps to land on Registration page
    And I enter user info
      |emailAddress|password  |zipcode|
      |arman.hossain496@gmail.com|Cnn1234!  |11208|
    And I click on registration button
    Then I validate welcome message

  @SmokeTest
  Scenario Outline: Cnn SignIn functionality cheek
    When I click on SingInIcon
    And I enter "<userEmail>" and "<password>"
    Then I validate landed page title
    Examples:
      |userEmail|password|
      |arman.hossain496@gmail.com|Cnn1234!|



