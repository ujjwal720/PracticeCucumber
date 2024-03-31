Feature: To Test the functionality of reveiws and discription pages in the scenarios tab.

  Scenario: Verify that the review and description tabs are displayed for products
    Given the user clicks on one of the products
    When the user is redirected to the product description page
    Then the product description should be displayed
    
    
    
    
   Scenario: To test the Add to cart scenario and verify the price
  Given the user should click on add to basket and add two items
  Then user should verify the prices of it
  
  
