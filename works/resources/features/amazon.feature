Feature: Verify if an user can able to add a product variants to cart

  Background: 
    Given I open the chrome browser
    And I navigate to amazon page "https://www.amazon.in/"

  Scenario: Check whether the user can able to order a mobile
    When Search for "Mobile" in search box and press enter
    And Select Brand:
    |Iqoo|
    |Samsung|
    |Realme|
    |Oneplus|
    And Select a variant "8+256"
    And Click Add to cart
    Then Check the product has been added in cart
