Feature: Atnt HomePage Functionality Check.

  Background:
    Given I am in att homepage

  @SmokeTest
  Scenario: Att deals button Functionality check with valid data
    When I click Deals Button
    Then I verify Wireless is appear properly
    And I verify page title as AT&T Deals on Phones, Wireless Plans, Internet & TV Services

  @SmokeTest
  Scenario: Att Wireless button Functionality check with valid data
    When I click Wireless Button
    Then I verify LEARN HOW TO is appear properly
    And I verify page title as AT&T Wireless – Latest Phones & Best Wireless Plans

  @SmokeTest
  Scenario: Att Internet button Functionality check with valid data
    When I click internet Button
    Then I verify AT&T INTERNET is appear properly
    And I verify page title as AT&T Internet Plans - Home Internet - AT&T® Official Site

  @SmokeTest
  Scenario: Att TV button Functionality check with valid data
    When I click TV Button
    And I click on shop now button
    Then I verify Choose a TV package is appear properly
    And I verify page title as Shop AT&T Bundles

  @SmokeTest
  Scenario: Atnt Sign Up Functionality check with invalid credentials
    And I click accountIcon
    And I click singInButton
    When I click on CreateButton
    And I click wireless radioButton and continueButton
    Then I enter phoneNumber and zipCode
    When I click continueButton
    And I should be get en error message

  @SmokeTest
  Scenario: Check signIn with invalid credentials
    And I on signIn page
    When I enter userName and passWord
    And I click on signIn button
    Then I am getting error message

  @SmokeTest
  Scenario Outline: Login into att using Data Driven
    And I on signIn page
    And I enter email as "<userName>" and password as "<Password>"
    And I click on signIn button
    Then  I am getting error message

    Examples:
      | userName            | Password |
      | admin@pnt.com       | admin    |
      | oalKarim@gmail.com  | 15021972 |
      | mikedavid@gmail.com | 01012010 |

  @SmokeTest
  Scenario: Att menu burgerButton test
    When I click on burgerButton
    And I select wireless and click on Explore Wireless
    And I verify page title

  @SmokeTest
  Scenario: Att searchBox functionality check with valid data
    And I enter Apple iPhone 11 in searchBox
    When I click searchButton
    Then I verify Apple iPhone 11 is appear properly
    And I verify page title as iphone 11

  @SmokeTest
  Scenario: Att searchBox functionality check with valid data
    And I enter "Apple iPhone 11" in searchBox
    When I click searchButton
    Then I validate "Apple iPhone 11" is appear properly
    And I validate page title as iphone 11

  @SmokeTest
  Scenario Outline:Att searchBox check with multiple value using data driven
    And I enter "<productName>" in searchBox
    When  I click searchButton
    And I validate "<validateProduct>" is appear properly
    And I validate page title as "<pageTitle>"

    Examples:
      | productName       | validateProduct                        | pageTitle                                   |
      | Apple iPhone 11   | Showing results for "Apple iPhone 11". | Results for Apple iPhones 11 - AT&T Search  |
      | Apple iPhone 10   | Showing results for "Apple iphone 10". | Results for Apple iPhones 10 - AT&T Search  |
      | Samsung Phones    | \"Samsung Phones\"                     | Results for Samsung Phones - AT&T Search    |
      | Apple Watches     | \"Apple Watches\"                      | Results for Apple Watches - AT&T Search     |
      | Apple ipads       | \"Apple ipads\"                        | Results for Apple ipads - AT&T Search       |
      | iphone 11 Pro Max | \"iphone 11 Pro Max\"                  | Results for iphone 11 Pro Max - AT&T Search |
      | Samsung Tablets   | \"Samsung Tablets\"                    | Results for Samsung Tablets - AT&T Search   |
