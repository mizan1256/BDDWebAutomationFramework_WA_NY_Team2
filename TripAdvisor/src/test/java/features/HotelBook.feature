Feature: Trip Advisor Hotel Book From End to End

  Background:
    Given  I am on Trip advisor home page

  @SmokeTest
  Scenario: Book Hotel for a couple filling up all required data
    When I click on Hotels button
    And  I type "Niagara Falls" in where to field and enter
    And  I input "10/01/20" into checkIn Field
    And  I input "10/04/20" into checkOutField
    And  I click on update guest button
    And  I click on crown plaza view deal button
    And  I navigate to crown plaza page and change currency from dropdown
    And  I select one bed and click on queen bed select room button
    And  I select standard rate and click on select rate button
    And  I enter required data into respective fields
      | firstName | lastName | email           | address | city    | postalCode | phoneNumber | cardNumber       |
      | Mike      | Carole   | pnt20@gmail.com | 110-10  | Jamaica | 11435      | 3471114321  | 4321123456788765 |

    And  I select appropriate data from drop down
      | country       | state    | countryCode      | cardExpireMonth | cardExpireYear |
      | United States | New York | United States +1 | 05 (May)        | 2022           |
    And  I select certify check mark button
    And  I click on book reservation button




