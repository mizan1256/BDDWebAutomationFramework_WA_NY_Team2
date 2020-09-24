Feature: United Airlines SignUp functionality test

  Background:
    Given I am in United Air home page

 #@SmokeTest
  Scenario: United Airlines Flight Status functionality test
    When I click Flight status
    And I enter City in From field and To field
    And I enter Flight number and  Date
    Then I click Search Button


 # @SmokeTest
  Scenario: United Airlines Check In functionality test
    When I click Check In
    And I enter ticket Number and Last Name
    Then I click checkIn Search Button
    And I validate Check In page message

   # @SmokeTest
    Scenario: United Airlines Book Button functionality test
      When I click on Book Button
      And I click on Hotels Button
      And I enter "Las Vegas, Nevada, United States of America" in searchBox and submit
      Then I validate Landed page properly

  #@SmokeTest
  Scenario: United login functionality Check
    And I click on signInOption
    And I enter userName and password
    When I click loginButton
    Then I verify image


 # @SmokeTest
  Scenario: United login functionality Check with variable
    And I click on signInOption
    And I enter "mizan1256" and "Pnt@30242"
    When I click loginButton
    Then I verify image


 # @SmokeTest
  Scenario Outline: United login functionality Check with multiple variable
    And I click on signInOption
    And I enter "<userName>" and "<password>"
    When I click loginButton
    Then I verify image
    Examples:
      | userName | password |
      | mtt123   | abs123   |
      | mtt124   | abs124   |
      | mtt125   | abs125   |
      | mtt126   | abs126   |
      | mtt126   | abs127   |
      | mtt126   | abs128   |

  #@SmokeTest
  Scenario: United search functionality Check with variable
    And i click on the searchLogo
    And I enter "deals and offers" in the searchBox
    When I click searchButton
    Then I verify searchText


  #@SmokeTest
  Scenario Outline: United search functionality Check with variable
    And i click on the searchLogo
    And I enter "<searchItem>" in the searchBox
   When I click searchButton
    Then I verify searchText
    Examples:
      | searchItem      |
      | airlines        |
      | flights         |
      | airline partner |
      | flight delays   |


#flight search
 # @SmokeTest
  Scenario: United round trip flights functionality Check
#    And I enter location From*
    And I enter location To
    And I clear enter departDate
    And I clear enter returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle


  #@SmokeTest
  Scenario: United round trip flights functionality Check with multiple flights
    And I enter destination location "London"*
    And I clear enter depart Date departDate
    And I clear enter return date returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle

  #@SmokeTest
  Scenario Outline: United round trip flights functionality Check with variable
    And I enter destination location "<location>"*
    And I clear enter depart Date departDate
    And I clear enter return date returnDate
    When I click findFlights
    Then I verify SearchFlightsTitle
    Examples:
      | location |
      | Paris    |
      | Tokyo    |
      | India    |
      | Pakistan |
      | London   |


