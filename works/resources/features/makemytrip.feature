Feature: User need to book ticket thru bus

  Scenario: Book a Bus ticket in Make My Trip
    Given The user should be on Makemytrip
    When The user closes the pop_up window
    And click the Buses tab
    And the user select friom location as Chennai,Tamil Nadu and To location as Bangalore,Karnataka
    And The user choose travel date as next date and click the search button
    And Choose Filters ac and Sleeper
    And Choose Single checkbox
    And Choose pickup point -Sholinganallur
    And Choose pickup time as 6pm t0 11pm
    And Choose TravelOperators- Intr SmartBus and Parveen Travels
    And Choose drop point - Lal Bagh
    Then Get all Bus prices and print them in console
    Then Choose the Cheapest bus and select any number of seats
    And The user Enter travbellers deatails as "Ashraff" ,"25" and Gender
    And Enter contact details as "shuailashuail@gmail.com" and "8098826646"
    And Select state as Tamil Nadu
    Then User clicks continue button, which will direct to payment page
