Feature: CNN home page functionality test

  Background:
    Given I am in Cnn home page
    When I do necessary steps to land on User info page

  @SmokeTest
  Scenario: CNN home User Account functionality test

    And I enter user credentials
      | Email             | password  | zipCode |
      | pntitny@gmail.com | Srn@20235 | 11436   |
      | shuvo234@gmail.com | Trn@20235 | 11437   |
    Then I validate *Required message

  @SmokeTest
  Scenario: CNN home User Account functionality test
#    When I do necessary steps to land on User info page
    And I enter user credentials
      | Email             | password  | zipCode |
      | pntitny@gmail.com | Srn@20235 | 11436   |
      | shuvo234@gmail.com | Trn@20235 | 11437   |
    And I click on register button
    Then I validate "This account already exists. Please log in." message

  @SmokeTest
  Scenario: CNN home User Account functionality test
#    When I do necessary steps to land on LogIn info page
    And I enter credentials in logIn field
      | Email             | password  |
      | pntitny@gmail.com | Srn@20235 |
      | shuvo234@gmail.com | Trn@20235 |

    Then I validate "Stay logged in" message is appeared

  @SmokeTest
  Scenario: CNN home User Account functionality test
#    When I do necessary steps to land on LogIn info page
    And I enter credentials in logIn field
      | Email             | password  |
      | pntitny@gmail.com | Srn@20235 |
      | shuvo234@gmail.com | Trn@20235 |
    And I click on logIn button
    Then I validated "Your email has not been verified" message is appeared