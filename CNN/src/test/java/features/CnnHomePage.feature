
Feature: CNN Home Page Functionality Check

  Background:
    Given I am in Cnn home page
#  @SmokeTest
  Scenario:CNN SignUp functionality check
    And I enter "Sports" in searchBox
    Then I validate Sports page appear properly

#  @SmokeTest
  Scenario Outline:CNN searchBox check with multiple value using data driven
    When I enter "<SearchItem>" in searchBox
    And I validate page title as "<validatePageTitle>"

    Examples:
      | SearchItem          | validatePageTitle                                 |
      | Politics            | Search CNN - Videos, Pictures, and News - CNN.com |
      | World               | Search CNN - Videos, Pictures, and News - CNN.com |
      | Entertainment       | Search CNN - Videos, Pictures, and News - CNN.com |

#  @SmokeTest
  Scenario: CNN edition button check
    When I click on edition button
    And I click on Us International Arabic and Espanol button
    Then I validate page title

