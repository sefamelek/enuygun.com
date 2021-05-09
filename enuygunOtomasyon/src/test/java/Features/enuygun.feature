@RegresssionTest
Feature: EnUygun

 Scenario: Find Cheap Flights

    Given go to enuygun
    And from city or airport enter "İstanbul"
    And from city or airport select
    And to city or airport enter "Antalya"
    And to city or airport select
    And Calender select
    And Date Select
    And Find Best Deals Button Select
    And Select Flight
    And Input Email "enuyguntest@gmail.com"
    And Input Phone Number "05554443322"
    And Input First Name "Sefa"
    And Input Last Name "Melek"
    And Input Birthday Day "23"
    And Input Birthday Month "09"
    And Input Birthday Year "1998"
    And Input Public Id "31444766634"
    And Input Gender
    And Input Health Code "C4E7157316"
    And Click Proceed To Checkout Button
    And Input Credit Card Number "1234567812345678"
    And Input Credit Card Month "04"
    And Input Credit Card Year "24"
    And Input Cvc Number "333"
    When Click Book Button
    Then Please enter a valid credit card number warning is check


